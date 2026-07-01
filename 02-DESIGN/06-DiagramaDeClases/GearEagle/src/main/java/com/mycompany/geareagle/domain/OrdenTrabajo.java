package com.mycompany.geareagle.domain;

import java.time.ZonedDateTime;
import java.util.Set;

public class OrdenTrabajo {

    private int idOrdenTrabajo;
    private ZonedDateTime fecha;
    private String estado;

    private Cliente cliente;// Relación de muchos a uno con Cliente
    private Moto moto;
    private Factura factura;

    private Set<OrdenTrabajoServicio> ordenTrabajoServicios;
    private Set<OrdenTrabajoProducto> ordenTrabajoProductos;
    private Set<OrdenTrabajoMecanico> ordenTrabajoMecanicos;


    public int getIdOrdenTrabajo() {
        return idOrdenTrabajo;
    }

    public void setIdOrdenTrabajo(int idOrdenTrabajo) {
        this.idOrdenTrabajo = idOrdenTrabajo;
    }

    public ZonedDateTime getFecha() {
        return fecha;
    }

    public void setFecha(ZonedDateTime fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public Set<OrdenTrabajoServicio> getOrdenTrabajoServicios() {
        return ordenTrabajoServicios;
    }

    public void setOrdenTrabajoServicios(Set<OrdenTrabajoServicio> ordenTrabajoServicios) {
        this.ordenTrabajoServicios = ordenTrabajoServicios;
    }

    public Set<OrdenTrabajoProducto> getOrdenTrabajoProductos() {
        return ordenTrabajoProductos;
    }

    public void setOrdenTrabajoProductos(Set<OrdenTrabajoProducto> ordenTrabajoProductos) {
        this.ordenTrabajoProductos = ordenTrabajoProductos;
    }

    public Set<OrdenTrabajoMecanico> getOrdenTrabajoMecanicos() {
        return ordenTrabajoMecanicos;
    }

    public void setOrdenTrabajoMecanicos(Set<OrdenTrabajoMecanico> ordenTrabajoMecanicos) {
        this.ordenTrabajoMecanicos = ordenTrabajoMecanicos;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
}
