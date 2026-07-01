package com.mycompany.geareagle.domain;

import java.time.ZonedDateTime;

public class Factura {

    private int idFactura;
    private String numeroFactura;
    private ZonedDateTime fechaEmision;
    private double subTotal;
    private double iva;
    private double total;

    private OrdenTrabajo ordenTrabajo;// relacion de uno a uno con OrdenTrabajo

    private String estado;

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public ZonedDateTime getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(ZonedDateTime fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public OrdenTrabajo getOrdenTrabajo() {
        return ordenTrabajo;
    }

    public void setOrdenTrabajo(OrdenTrabajo ordenTrabajo) {
        this.ordenTrabajo = ordenTrabajo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
