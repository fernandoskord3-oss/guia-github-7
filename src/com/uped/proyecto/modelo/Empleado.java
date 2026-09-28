package com.uped.proyecto.modelo;

public class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, String dui, double salario) {
        super(nombre, dui);
        this.salario = salario;
    }

    @Override
    public double calcularBeneficioAnual() {
        return salario * 0.10; // 10% de bono
    }

    @Override
    public String describirActividad() {
        return nombre + " trabaja con un salario de $" + salario;
    }
}

