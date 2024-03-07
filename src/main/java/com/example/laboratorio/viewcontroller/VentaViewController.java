package com.example.laboratorio.viewcontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class VentaViewController {

    @FXML
    private Button btnActualizarVenta;

    @FXML
    private Button btnAgregarVenta;

    @FXML
    private Button btnEliminarVentra;

    @FXML
    private Button btnLimpiarCamposVenta;

    @FXML
    private TableColumn<?, ?> colCantidad;

    @FXML
    private TableColumn<?, ?> colDescripcion;

    @FXML
    private TableColumn<?, ?> colSubtotal;

    @FXML
    private TableColumn<?, ?> colTotal;

    @FXML
    private TableView<?> tableVentas;

    @FXML
    private TextField txfCantidad;

    @FXML
    private TextField txfCodigo;

    @FXML
    private TextField txfCodigoVenta;

    @FXML
    private TextField txfNumeroIdentificacionCliente;

    @FXML
    void actualizarAnunciante(ActionEvent event) {

    }

    @FXML
    void agregarAnunciante(ActionEvent event) {

    }

    @FXML
    void eliminarAnunciante(ActionEvent event) {

    }

    @FXML
    void limpiarBusqueda(ActionEvent event) {

    }

}


