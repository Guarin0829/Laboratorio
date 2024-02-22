package com.example.laboratorio;

public class Venta {

    String fecha;
    String codigo;
    Integer total;
    String cantidad;

    public Venta() {

    }

    public Venta(String fecha, String codigo, Integer total, String cantidad) {
        this.fecha = fecha;
        this.codigo = codigo;
        this.total = total;
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
