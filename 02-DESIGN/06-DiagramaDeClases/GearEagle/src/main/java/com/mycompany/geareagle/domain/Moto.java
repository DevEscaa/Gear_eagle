package com.mycompany.geareagle.domain;

import java.util.Set;

public class Moto {

    private int idMoto;
    private String placa;
    private String marca;
    private String modelo;

    private Set<ClienteMoto> clienteMotos; // relacion de uno a muchos con ClienteMoto
    private Set<OrdenTrabajo> ordenTrabajos; // relacion de uno a muchos con OrdenTrabajo.

    public int getIdMoto(){
        return idMoto;

    }

    public void setIdMoto(int idMoto){
        this.idMoto = idMoto;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Set<ClienteMoto> getClienteMotos() {
        return clienteMotos;
    }

    public void setClienteMotos(Set<ClienteMoto> clienteMotos) {
        this.clienteMotos = clienteMotos;
    }


}
