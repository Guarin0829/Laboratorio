package com.example.laboratorio;

public class DetalleVenta {

    Integer cantidad;
    String subTotal;

    public DetalleVenta() {

    }

    public DetalleVenta(Integer cantidad, String subTotal) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }
}
