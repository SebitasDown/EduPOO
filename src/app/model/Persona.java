package app.model;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if(nombre == null || nombre.trim().isEmpty())
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        this.nombre = nombre;
    }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if(edad < 0) throw new IllegalArgumentException("La edad no puede ser negativa");
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad;
    }

    public void mostrarInformacion() {
        System.out.println(toString());
    }
}
