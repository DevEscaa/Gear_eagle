package com.mycompany.geareagle.domain;

import java.util.Set;


public class Rol {
    private int id;
    private String nombre;

    private Set<UserAuthority> userAuthorities;// relacion de uno a muchos con UserAuthority

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<UserAuthority> getUserAuthorities() {
        return userAuthorities;
    }

    public void setUserAuthorities(Set<UserAuthority> userAuthorities) {

        this.userAuthorities = userAuthorities;
    }
}
