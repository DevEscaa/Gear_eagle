package com.mycompany.geareagle.domain;

import java.math.BigDecimal;

public class OrdenTrabajoProducto {

    private OrdenTrabajo ordenTrabajo;
    private Producto producto;

    private int cantidad;
    private BigDecimal precioUnitario;

    public OrdenTrabajo getOrdenTrabajo() {
        return ordenTrabajo;
    }// Relación con la clase OrdenTrabajo

    public void setOrdenTrabajo(OrdenTrabajo ordenTrabajo) {
        this.ordenTrabajo = ordenTrabajo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
