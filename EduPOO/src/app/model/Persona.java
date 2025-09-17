package app.model;

public class Persona {
    private String nombre;
    private int edad;

    // geter y seter de nombre
    private String getNombre(){return nombre;}
    private void setNombre(String nombre){
        if(nombre == null || nombre.trim().isEmpty()) throw new IllegalArgumentException("vacio no");
        this.nombre = nombre;
    }

    // geter y seter de edad
    private int getEdad(){return edad;}
    private void setEdad(int edad){
        if (edad <= 0) throw new IllegalArgumentException("No puede ser menor a 0");
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre" + nombre +
                "edad"+ edad;
    }
}