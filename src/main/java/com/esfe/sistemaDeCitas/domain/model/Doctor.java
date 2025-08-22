package com.esfe.sistemaDeCitas.domain.model;


import java.time.LocalDateTime;

public class Doctor {


    private Long idDoctor;
    private Long idUsuario;
    private String nombreCompleto;
    private String apellido;
    private String cedulaProfesional;
    private String telefono;
    private LocalDateTime horario;
    private int estado;

    public Doctor() {
    }

    public Doctor(Long idDoctor, Long idUsuario, String nombreCompleto, String apellido, String cedulaProfesional, String telefono, LocalDateTime horario, int estado) {
        this.idDoctor = idDoctor;
        this.idUsuario = idUsuario;
        this.nombreCompleto = nombreCompleto;
        this.apellido = apellido;
        this.cedulaProfesional = cedulaProfesional;
        this.telefono = telefono;
        this.horario = horario;
        this.estado = estado;
    }


    // Getters y setters
    public Long getIdDoctor() { return idDoctor; }
    public void setIdDoctor(Long idDoctor) { this.idDoctor = idDoctor; }

    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getCedulaProfesional() { return cedulaProfesional; }
    public void setCedulaProfesional(String cedulaProfesional) { this.cedulaProfesional = cedulaProfesional; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public void setFechaHora(LocalDateTime horario) {
        this.horario = horario;
    }
}
