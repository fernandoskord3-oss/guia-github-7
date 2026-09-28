package com.uped.proyecto;

import com.uped.proyecto.modelo.Cliente;
import com.uped.proyecto.modelo.Docente;
import com.uped.proyecto.modelo.DocenteInvestigador;
import com.uped.proyecto.modelo.Empleado;
import com.uped.proyecto.modelo.Estudiante;
import com.uped.proyecto.modelo.Gerente;
import com.uped.proyecto.modelo.Persona;
import com.uped.proyecto.modelo.Proveedor;
import com.uped.proyecto.modelo.Voluntario;

public class Main {
    public static void main(String[] args) {
        // Apartados 5.4 y 7: Gerente extends Empleado
        Gerente g = new Gerente(
                "Marta Díaz", "05123456-7", 1200.0, 5);
        System.out.println(g);
        System.out.println("Beneficio: "
                + g.calcularBeneficioAnual());

        // Ejercicio 8.2: DocenteInvestigador extends Docente
        DocenteInvestigador di = new DocenteInvestigador(
                "Dr. Iván Reyes", "07321456-9",
                "Ingeniería de Software", 8, 4);
        System.out.println(di);
        System.out.println("Beneficio: "
                + di.calcularBeneficioAnual());

        // Apartado 5.6: protected a través de varios niveles
        g.promoverA("Marta Díaz Ruiz");
        System.out.println(g);

        // Apartado 5.7 y ejercicio 8.3: downcasting seguro con instanceof
        Persona[] personas = {
                new Cliente("Ana", "0451...", "7777-1", 4000.0),
                new Empleado("Luis", "0622...", 850.0),
                new Estudiante("Kevin", "0399...", "UPED-045",
                        "Ing. Sistemas", 9.1),
                new Docente("María Hernández", "05987654-3",
                        "Ingeniería de Software", 8),
                new Voluntario("Sara Gómez", "07456123-2", 120.0),
                new Proveedor("Comercial Ríos", "06554321-8", 8000.0),
                g,
                di
        };
        for (Persona p : personas) {
            if (p instanceof Gerente) {
                Gerente gerente = (Gerente) p;
                System.out.println(p.presentarse()
                        + " -> Gerente, equipo de "
                        + gerente.getTamanoEquipo());
            } else if (p instanceof DocenteInvestigador) {
                DocenteInvestigador inv = (DocenteInvestigador) p;
                System.out.println(p.presentarse()
                        + " -> Investigador, publicaciones: "
                        + inv.getNumeroPublicaciones());
            } else {
                System.out.println(p.presentarse()
                        + " -> sin downcasting");
            }
        }
    }
}
