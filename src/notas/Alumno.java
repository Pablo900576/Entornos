package notas;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String dni;
    private ArrayList<Registro> registros;


    public Alumno(String nombre, String apellidos, String dni, ArrayList<Registro> registros) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.registros = registros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList<Registro> registros) {
        this.registros = registros;
    }


    public double calcularMedia() {
        if (registros.isEmpty()) {
            return 0.0;
        }
        double suma = 0.0;
        for (Registro registro : registros) {
            suma += registro.getNota();
        }
        return suma / registros.size();
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", registros=" + registros + "]";
    }


    public static class Registro {
        private String nombreAsignatura;
        private double nota;

        public Registro(String nombreAsignatura, double nota) {
            this.nombreAsignatura = nombreAsignatura;
            this.nota = nota;
        }

        public String getNombreAsignatura() {
            return nombreAsignatura;
        }

        public void setNombreAsignatura(String nombreAsignatura) {
            this.nombreAsignatura = nombreAsignatura;
        }

        public double getNota() {
            return nota;
        }

        public void setNota(double nota) {
            this.nota = nota;
        }

        @Override
        public String toString() {
            return "Registro [nombreAsignatura=" + nombreAsignatura + ", nota=" + nota + "]";
        }
    }
}

