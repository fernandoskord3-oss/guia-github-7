# Diagrama de clases del proyecto (Semana 7)

Notación UML: `#` = protected, `-` = private, `+` = public. El triángulo vacío (`<|--`) representa la relación "es un".

Elementos abstractos: la clase *Persona* lleva la etiqueta `<<abstract>>` y sus métodos abstractos (*calcularBeneficioAnual()* y *describirActividad()*) se dibujan en cursiva. Las clases `Gerente` y `DocenteInvestigador` llevan la etiqueta `<<final>>`: no admiten subclases. Además, `presentarse()` está declarado `final` en `Persona`: ninguna subclase puede reemplazarlo.

Novedad de esta semana: aparecen dos clases de **tercer nivel**, `Gerente` (que extiende de `Empleado`) y `DocenteInvestigador` (que extiende de `Docente`).

```mermaid
classDiagram
    class Persona {
        <<abstract>>
        #String nombre
        #String dui
        +presentarse() String
        +calcularBeneficioAnual()* double
        +describirActividad()* String
    }
    class Cliente {
        -String telefono
        -double comprasAnuales
        +calcularBeneficioAnual() double
        +describirActividad() String
    }
    class Empleado {
        -double salario
        +calcularBeneficioAnual() double
        +describirActividad() String
    }
    class Estudiante {
        -String carnet
        -String carrera
        -double promedio
        +calcularBeneficioAnual() double
        +describirActividad() String
    }
    class Docente {
        -String especialidad
        -int aniosExperiencia
        +impartirClase(String materia) void
        +calcularBeneficioAnual() double
        +describirActividad() String
        +toString() String
    }
    class Voluntario {
        -double horasServicio
        +calcularBeneficioAnual() double
        +describirActividad() String
        +toString() String
    }
    class Proveedor {
        -double montoFacturado
        +calcularBeneficioAnual() double
        +describirActividad() String
        +toString() String
    }
    class Gerente {
        <<final>>
        -int tamanoEquipo
        +getTamanoEquipo() int
        +promoverA(String nuevoNombre) void
        +calcularBeneficioAnual() double
        +toString() String
    }
    class DocenteInvestigador {
        <<final>>
        -int numeroPublicaciones
        +getNumeroPublicaciones() int
        +calcularBeneficioAnual() double
        +toString() String
    }

    Persona <|-- Cliente
    Persona <|-- Empleado
    Persona <|-- Estudiante
    Persona <|-- Docente
    Persona <|-- Voluntario
    Persona <|-- Proveedor
    Empleado <|-- Gerente
    Docente <|-- DocenteInvestigador
```

## Resumen de la jerarquía

| Nivel | Clase | Es un... | Atributos propios |
|---|---|---|---|
| 1 | *Persona* (abstracta) | (raíz) | `#nombre`, `#dui` |
| 2 | `Cliente` | `Persona` | `telefono`, `comprasAnuales` |
| 2 | `Empleado` | `Persona` | `salario` |
| 2 | `Estudiante` | `Persona` | `carnet`, `carrera`, `promedio` |
| 2 | `Docente` | `Persona` | `especialidad`, `aniosExperiencia` |
| 2 | `Voluntario` | `Persona` | `horasServicio` |
| 2 | `Proveedor` | `Persona` | `montoFacturado` |
| 3 | `Gerente` (final) | `Empleado` | `tamanoEquipo` |
| 3 | `DocenteInvestigador` (final) | `Docente` | `numeroPublicaciones` |

