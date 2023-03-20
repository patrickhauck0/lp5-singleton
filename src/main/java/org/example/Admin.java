package org.example;

public class Admin {
    private String userAdmin;
    private String passAdmin;
    private Admin() {};
    private static Admin instancia = new Admin();

    public static Admin getInstancia() {
        return instancia;
    }

    public String getUserAdmin() {
        return userAdmin;
    }

    public String getPassAdmin() {
        return passAdmin;
    }

    public void setUserAdmin(String userAdmin) {
        this.userAdmin = userAdmin;
    }

    public void setPassAdmin(String passAdmin) {
        this.passAdmin = passAdmin;
    }
}
