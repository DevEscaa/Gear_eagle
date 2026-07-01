package com.mycompany.geareagle.domain;

import java.math.BigDecimal;
import java.util.Set;

public class Servicio {

    private int idServicio;
    private String nombreServicio;
    private String descripcionServicio;
    private BigDecimal precioBase;
    private int duracionServicio; // en minutos

    private Set<ServicioMecanico> servicioMecanicos;
    private Set<OrdenTrabajoServicio> ordenTrabajoServicios;//

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public BigDecimal getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(BigDecimal precioBase) {
        this.precioBase = precioBase;
    }

    public int getDuracionServicio() {
        return duracionServicio;
    }

    public void setDuracionServicio(int duracionServicio) {
        this.duracionServicio = duracionServicio;
    }

    public Set<ServicioMecanico> getServicioMecanicos() {
        return servicioMecanicos;
    }

    public void setServicioMecanicos(Set<ServicioMecanico> servicioMecanicos) {
        this.servicioMecanicos = servicioMecanicos;
    }

    public Set<OrdenTrabajoServicio> getOrdenTrabajoServicios() {
        return ordenTrabajoServicios;
    }

    public void setOrdenTrabajoServicios(Set<OrdenTrabajoServicio> ordenTrabajoServicios) {
        this.ordenTrabajoServicios = ordenTrabajoServicios;
    }
}
