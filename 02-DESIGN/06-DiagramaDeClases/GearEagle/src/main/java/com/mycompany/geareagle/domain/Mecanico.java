package com.mycompany.geareagle.domain;

import java.util.Set;

public class Mecanico {

    private int idMecanico;

    private String estado;

    private Cuenta cuenta;

    private Set<OrdenTrabajoMecanico> ordenTrabajoMecanicos; // relacion de uno a muchos con OrdenTrabajoMecanico

    private Set<ServicioMecanico> servicioMecanicos;//

    public int getIdMecanico() {
        return idMecanico;
    }

    public void setIdMecanico(int idMecanico) {
        this.idMecanico = idMecanico;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
