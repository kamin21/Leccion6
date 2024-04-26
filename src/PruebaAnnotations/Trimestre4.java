package PruebaAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component("InstitutoTrimestre4")
public class Trimestre4 implements Instituto {

    @Value("${alumno1.notaMedia}")
    private String notaMediaAlumno1;

    @Value("${alumno2.notaMedia}")
    private String notaMediaAlumno2;

    @Value("${alumno3.notaMedia}")
    private String notaMediaAlumno3;


    @Override
    public void mostrarNotasMedias() {
        System.out.println("Alumno 1: " + notaMediaAlumno1);
        System.out.println("Alumno 2: " + notaMediaAlumno2);
        System.out.println("Alumno 3: " + notaMediaAlumno3);
    }

     
    @PreDestroy
    public void destroy() {
        System.out.println("Cerrando las notas del Instituto en cada Trimestre");
    }
}
