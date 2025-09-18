package app.service;

import app.model.Alumno;
import app.model.Asignatura;

public class PersonaService {

    public Alumno crearAlumno(String nombre, int edad){
        return new Alumno(nombre, edad);
    }

    public boolean agregarAsignatura(Alumno alumno, String nombreAsignatura, double nota){
        Asignatura a = new Asignatura(nombreAsignatura, nota);
        return alumno.agregarAsignatura(a);
    }
}
