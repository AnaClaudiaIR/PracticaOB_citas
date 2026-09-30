package org.example.practicaob_citas.Model;

public class Cita {

    private String EspecialidadMedica;
    private String TipoCita;
    private String FechaCita;
    private String ServicioAdicional;
    private String DNI;

    public Cita() {
    }

    public Cita(String especialidadMedica, String tipoCita, String fechaCita, String servicioAdicional, String DNI) {
        EspecialidadMedica = especialidadMedica;
        TipoCita = tipoCita;
        FechaCita = fechaCita;
        ServicioAdicional = servicioAdicional;
        this.DNI = DNI;
    }

    public String getEspecialidadMedica() {
        return EspecialidadMedica;
    }

    public void setEspecialidadMedica(String especialidadMedica) {
        EspecialidadMedica = especialidadMedica;
    }

    public String getTipoCita() {
        return TipoCita;
    }

    public void setTipoCita(String tipoCita) {
        TipoCita = tipoCita;
    }

    public String getFechaCita() {
        return FechaCita;
    }

    public void setFechaCita(String fechaCita) {
        FechaCita = fechaCita;
    }

    public String getServicioAdicional() {
        return ServicioAdicional;
    }

    public void setServicioAdicional(String servicioAdicional) {
        ServicioAdicional = servicioAdicional;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
