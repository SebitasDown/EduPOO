package app.model;

public class Asignatura {
    private String nombre;
    private double nota;

    public Asignatura(String nombre, double nota) {
        setNombre(nombre);
        setNota(nota);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if(nombre == null || nombre.trim().isEmpty())
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        this.nombre = nombre;
    }

    public double getNota() { return nota; }
    public void setNota(double nota) {
        if(nota < 0 || nota > 5)
            throw new IllegalArgumentException("La nota debe estar entre 0 y 5");
        this.nota = nota;
    }

    public boolean estaAprobada() { return nota >= 3.5; }
}
