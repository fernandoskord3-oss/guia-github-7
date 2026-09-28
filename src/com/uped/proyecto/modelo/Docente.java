package com.uped.proyecto.modelo;

public class Docente extends Persona {
    private String especialidad;
    private int aniosExperiencia;

    public Docente(String nombre, String dui,
                   String especialidad, int aniosExperiencia) {
        super(nombre, dui);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void impartirClase(String materia) {
        System.out.println(nombre + " imparte: " + materia);
    }

    @Override
    public double calcularBeneficioAnual() {
        return aniosExperiencia * 45.0; // bono de antigüedad
    }

    @Override
    public String toString() {
        return presentarse() + " | " + especialidad
                + " (" + aniosExperiencia + " años)";
    }
    @Override
    public String describirActividad() {
        return nombre + " imparte " + especialidad + " con " + aniosExperiencia + " años de experiencia";
    }
}

