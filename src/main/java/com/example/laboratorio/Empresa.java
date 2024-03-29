package com.example.laboratorio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

public class Empresa extends Application {

    public static boolean obtenerClientes(String numeroIdentificacion, Cliente cliente) {
        return true;
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Empresa.class.getResource("InicioView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 454, 612);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    private Map<String, Producto> productos;
    private static HashMap<String, Cliente> clientes;
    private List<Venta> ventas;
    private Set<String> carritoCompras;
    private LinkedList<Venta> historicoVentas;
    private TreeSet<Producto> inventarioBajo;

    public void SistemaGestionInventario() {
        this.productos = new HashMap<>();
        this.clientes = new HashMap<>();
        this.ventas = new ArrayList<>();
        this.carritoCompras = new HashSet<>();
        this.historicoVentas = new LinkedList<>();
        this.inventarioBajo = new TreeSet<>(Comparator.comparingInt(Producto::getCantidadInventario));
    }

    public static HashMap<String, Cliente> obtenerClientes() {
        return clientes;
    }

    public static void main(String[] args) {
        launch();
    }


}
