package app;

import app.model.Alumno;
import app.service.PersonaService;

public class Main {
    public static void main(String[] args) {
        PersonaService service = new PersonaService();

        Alumno a1 = service.crearAlumno("Ana", 20);
        service.agregarAsignatura(a1, "Matemáticas", 4.0);
        service.agregarAsignatura(a1, "Física", 3.0);

        Alumno a2 = service.crearAlumno("Luis", 22);
        service.agregarAsignatura(a2, "Historia", 4.5);
        service.agregarAsignatura(a2, "Química", 3.5);

        Alumno a3 = service.crearAlumno("María", 19);
        service.agregarAsignatura(a3, "Arte", 4.2);
        service.agregarAsignatura(a3, "Música", 3.7);


        a1.mostrarInformacion();
        a2.mostrarInformacion();
        a3.mostrarInformacion();


    }
}
