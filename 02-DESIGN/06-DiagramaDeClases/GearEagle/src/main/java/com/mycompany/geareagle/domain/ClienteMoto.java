package com.mycompany.geareagle.domain;

import java.util.Set;

public class ClienteMoto {

    private Moto moto; //relacion
    private Cliente cliente;
    private Set<OrdenTrabajo> ordenTrabajos;


    private String estado;//

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto){
        this.moto = moto;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

}
