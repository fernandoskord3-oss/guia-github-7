package com.uped.proyecto.modelo;

public class Gerente extends Empleado {
    private int tamanoEquipo;

    public Gerente(String nombre, String dui,
                   double salario, int tamanoEquipo) {
        super(nombre, dui, salario);
        this.tamanoEquipo = tamanoEquipo;
    }

    public int getTamanoEquipo() {
        return tamanoEquipo;
    }

    // Apartado 5.6: acceso directo a un atributo protected
    // que vive dos niveles arriba, en Persona
    public void promoverA(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    @Override
    public double calcularBeneficioAnual() {
        double base = super.calcularBeneficioAnual();
        return base + (tamanoEquipo * 25.0);
    }

    @Override
    public String toString() {
        return presentarse() + " | Equipo: " + tamanoEquipo;
    }
}

