package notas;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
       
        ArrayList<Alumno.Registro> registrosAlumno1 = new ArrayList<>();
        registrosAlumno1.add(new Alumno.Registro("Matemáticas", 8.5));
        registrosAlumno1.add(new Alumno.Registro("Física", 7.0));
        registrosAlumno1.add(new Alumno.Registro("Química", 9.0));
        Alumno alumno1 = new Alumno("Juan", "Pérez", "12345678A", registrosAlumno1);


        ArrayList<Alumno.Registro> registrosAlumno2 = new ArrayList<>();
        registrosAlumno2.add(new Alumno.Registro("Matemáticas", 6.0));
        registrosAlumno2.add(new Alumno.Registro("Física", 5.5));
        registrosAlumno2.add(new Alumno.Registro("Química", 7.5));
        Alumno alumno2 = new Alumno("María", "Gómez", "87654321B", registrosAlumno2);


        mostrarDatosAlumno(alumno1);
        mostrarDatosAlumno(alumno2);
    }

    public static void mostrarDatosAlumno(Alumno alumno) {
        System.out.println("Datos del alumno:");
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Apellidos: " + alumno.getApellidos());
        System.out.println("DNI: " + alumno.getDni());
        System.out.println("Registros: ");
        for (Alumno.Registro registro : alumno.getRegistros()) {
            System.out.println("  Asignatura: " + registro.getNombreAsignatura() + ", Nota: " + registro.getNota());
        }
        System.out.println("Media de notas: " + alumno.calcularMedia());
        System.out.println();
    }
}

