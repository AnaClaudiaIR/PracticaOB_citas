package org.example.practicaob_citas.Model;

public class Paciente {
    private String Nombre;
    private String DNI;
    private String CodigoE;

    public Paciente() {
    }

    public Paciente(String nombre, String DNI, String codigoE) {
        Nombre = nombre;
        this.DNI = DNI;
        CodigoE = codigoE;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCodigoE() {
        return CodigoE;
    }

    public void setCodigoE(String codigoE) {
        CodigoE = codigoE;
    }
}
