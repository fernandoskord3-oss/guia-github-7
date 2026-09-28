package com.uped.proyecto.demo;

import com.uped.proyecto.modelo.Empleado;
import com.uped.proyecto.modelo.Gerente;

// Apartado 5.7: downcasting SIN instanceof (falla al ejecutar)
public class DemoClassCast {
    public static void main(String[] args) {
        Empleado e = new Empleado("Ana", "04...", 800.0);
        Gerente ge = (Gerente) e; // compila, pero lanza ClassCastException
    }
}

