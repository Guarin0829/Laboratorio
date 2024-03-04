package com.example.laboratorio.viewcontroller;

import com.example.laboratorio.Cliente;
import com.example.laboratorio.Empresa;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.HashMap;

public class ClienteViewController {

    ObservableList<Cliente> listaClientes = FXCollections.observableArrayList();
    Empresa empresa;
    Cliente clienteSeleccionado;


    @FXML
    private Button btnActualizarCliente;

    @FXML
    private Button btnAgregarCliente;

    @FXML
    private Button btnBuscarCliente;

    @FXML
    private Button btnEliminarCliente;

    @FXML
    private Button btnLimpiarCamposCliente;

    @FXML
    private TableColumn<Cliente, String> colDireccionCliente;

    @FXML
    private TableColumn<Cliente, String> colNombreCliente;

    @FXML
    private TableView<Cliente> tableAnunciantes;

    @FXML
    private TextField txfDireccionCliente;

    @FXML
    private TextField txfNombreCliente;

    @FXML
    private TextField txfNumeroIdentificacionCliente;

    @FXML
    void actualizarAnunciante(ActionEvent event) {

    }

    @FXML
    void agregarAnunciante(ActionEvent event) {

        String nombre = txfNombreCliente.getText();
        String numeroIdeficacion = txfNumeroIdentificacionCliente.getText();
        String direccion = txfDireccionCliente.getText();

        Cliente cliente = new Cliente(nombre, numeroIdeficacion, direccion);
        listaClientes.add(cliente);

        Limpiar();

    }

    @FXML
    void busquedaAnunciante(ActionEvent event) {

    }

    @FXML
    void eliminarAnunciante(ActionEvent event) {

        int selectedRow = tableAnunciantes.getSelectionModel().getSelectedIndex();
        if (selectedRow >= 0) {
            tableAnunciantes.getItems().remove(selectedRow);
        }
        Limpiar();

    }

    @FXML
    void limpiarBusqueda(ActionEvent event) {

    }

    public void Limpiar(){

        txfNombreCliente.setText("");
        txfNumeroIdentificacionCliente.setText("");
        txfDireccionCliente.setText("");



    }

    @FXML
    void initialize() {
        empresa = new Empresa();
        clienteSeleccionado = new Cliente();
        initView();

    }

    private void initView() {
        initDataBinding();
        obtenerCliente();
        listaClientes.clear();
        tableAnunciantes.setItems(listaClientes);
        listenerSelection();
    }
    private void initDataBinding() {

        colNombreCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        colDireccionCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDireccion()));
    }

    private void listenerSelection() {
        tableAnunciantes.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            clienteSeleccionado = newSelection;
            mostrarInformacionCliente(clienteSeleccionado);
        });
    }

    private void obtenerCliente() {
        HashMap<String, Cliente> clientes = Empresa.obtenerClientes();
        Cliente cliente = new Cliente("","","");
        listaClientes.clear();
        listaClientes.add(cliente);
    }

    private void mostrarInformacionCliente(Cliente clienteSeleccionado) {
        if(clienteSeleccionado != null){
            txfNumeroIdentificacionCliente.setText(clienteSeleccionado.getNumeroIdentificacion());
            txfNombreCliente.setText(clienteSeleccionado.getNombre());
            txfDireccionCliente.setText(clienteSeleccionado.getDireccion());

        }
    }

}
