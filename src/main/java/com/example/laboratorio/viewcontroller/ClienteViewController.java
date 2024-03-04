package com.example.laboratorio.viewcontroller;

import com.example.laboratorio.Cliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ClienteViewController {

    ObservableList<Cliente> listaClientes = FXCollections.observableArrayList();

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

}
