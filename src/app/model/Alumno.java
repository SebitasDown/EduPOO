package app.model;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {
    private List<Asignatura> asignaturas;

    public Alumno(String nombre, int edad) {
        super(nombre, edad);
        this.asignaturas = new ArrayList<>();
    }

    public List<Asignatura> getAsignaturas() { return asignaturas; }
    public void setAsignaturas(List<Asignatura> asignaturas) {
        if(asignaturas.size() > 4)
            throw new IllegalArgumentException("Máximo 4 asignaturas");
        this.asignaturas = asignaturas;
    }

    public boolean agregarAsignatura(Asignatura a) {
        if (asignaturas.size() >= 4) {
            System.out.println("❌ No se pueden agregar más de 4 asignaturas.");
            return false;
        }
        for (Asignatura asig : asignaturas) {
            if (asig.getNombre().equalsIgnoreCase(a.getNombre())) {
                System.out.println(" La asignatura " + a.getNombre() + " ya existe.");
                return false;
            }
        }
        asignaturas.add(a);
        return true;
    }

    public double calcularPromedio() {
        if (asignaturas.isEmpty()) return 0;
        double suma = 0;
        for (Asignatura a : asignaturas) suma += a.getNota();
        return suma / asignaturas.size();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(super.toString());
        System.out.println("Asignaturas:");
        for (Asignatura a : asignaturas) {
            String estado = a.estaAprobada() ? "Aprobada " : "Reprobada ";
            System.out.println("- " + a.getNombre() + " | Nota: " + a.getNota() + " | " + estado);
        }
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("-------------------------");
    }
}
