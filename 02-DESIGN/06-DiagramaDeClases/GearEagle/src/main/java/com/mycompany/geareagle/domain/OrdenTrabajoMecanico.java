package com.mycompany.geareagle.domain;

public class OrdenTrabajoMecanico {

    private OrdenTrabajo ordenTrabajo;// Relación con la clase OrdenTrabajo
    private Mecanico mecanico;

    public OrdenTrabajo getOrdenTrabajo() {
        return ordenTrabajo;
    }

    public void setOrdenTrabajo(OrdenTrabajo ordenTrabajo) {
        this.ordenTrabajo = ordenTrabajo;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
}
