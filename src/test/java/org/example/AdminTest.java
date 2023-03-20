package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {
    @Test

    public void deveRetornarUserAdmin() {
        Admin.getInstancia().setUserAdmin("admin123");
        assertEquals("admin123", Admin.getInstancia().getUserAdmin());
    }

    @Test
    public void deveRetornarPassAdmin() {
        Admin.getInstancia().setPassAdmin("pass123");
        assertEquals("pass123", Admin.getInstancia().getPassAdmin());
    }
}