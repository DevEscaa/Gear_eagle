package com.mycompany.geareagle.domain;

import java.util.Set;

public class Cliente {

    private int idCliente;
    private String estado;
    private String direccion;
    private int totalPuntos;

    private Cuenta cuenta; // relacion de uno a uno con Cuenta.

    private Set<ClienteMoto> clienteMotos; // relacion de uno a muchos con ClienteMoto
    private Set<OrdenTrabajo> ordenTrabajos; // relacion de uno a muchos con OrdenTrabajo

    public int getIdCliente(){
        return idCliente;
    }

    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public int getTotalPuntos(){
        return totalPuntos;
    }

    public void setTotalPuntos(int totalPuntos){
        this.totalPuntos = totalPuntos;
    }

    public Cuenta getCuenta(){
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta){
        this.cuenta = cuenta;
    }

    public Set<ClienteMoto> getClienteMotos() {
        return clienteMotos;
    }

    public void setClienteMotos(Set<ClienteMoto> clienteMotos){
        this.clienteMotos = clienteMotos;
    }
}
