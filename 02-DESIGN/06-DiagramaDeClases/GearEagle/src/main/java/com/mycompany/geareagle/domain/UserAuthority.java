package com.mycompany.geareagle.domain;

public class UserAuthority {
    private Rol rol;
    private User user;

    private User users;

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
