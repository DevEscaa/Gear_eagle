package com.mycompany.geareagle.domain;

import java.math.BigDecimal;
import java.util.Set;

public class Producto {

    private int idProducto;
    private String nombreProducto;
    private BigDecimal precioBase;
    private int stock;

    private Set<OrdenTrabajoProducto> ordenTrabajoProdutos;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public BigDecimal getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(BigDecimal precioBase) {
        this.precioBase = precioBase;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Set<OrdenTrabajoProducto> getOrdenTrabajoProdutos() {
        return ordenTrabajoProdutos;
    }

    public void setOrdenTrabajoProdutos(Set<OrdenTrabajoProducto> ordenTrabajoProdutos) {
        this.ordenTrabajoProdutos = ordenTrabajoProdutos;
    }
}
