package com.mycompany.geareagle.domain;

import java.util.Set;

public class TipoDocumento {

    private int idTipoDocumento;
    private String estado;
    private String nombreDocumento;
    private String sigla;

    private Set<Cuenta> cuentas; // relacion de uno a muchos con Cuenta

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getNombreDocumento(){
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento){
        this.nombreDocumento = nombreDocumento;
    }

    public String getSigla(){
        return sigla;
    }

    public void setSigla(String sigla){
        this.sigla = sigla;
    }

    public Set<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(Set<Cuenta> cuentas){
        this.cuentas = cuentas;
    }
}

