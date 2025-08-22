package com.esfe.sistemaDeCitas.domain.model;


import java.time.LocalDateTime;


public class Cita {

    private Long idCita;

    private Long idPaciente;
    private Long idDoctor;
    private LocalDateTime fechaHora;
    private String estado;

    public Cita() {
    }

    public Cita(Long idPaciente, Long idDoctor, LocalDateTime fechaHora, String estado) {
        this.idPaciente = idPaciente;
        this.idDoctor = idDoctor;
        this.fechaHora = fechaHora;
        this.estado = estado;

    }

    // Getters y setters
    public Long getIdCita() { return idCita; }
    public void setIdCita(Long idCita) { this.idCita = idCita; }

    public Long getIdPaciente() { return idPaciente; }
    public void setIdPaciente(Long idPaciente) { this.idPaciente = idPaciente; }

    public Long getIdDoctor() { return idDoctor; }
    public void setIdDoctor(Long idDoctor) { this.idDoctor = idDoctor; }

    public LocalDateTime getFechaHora() { return fechaHora; }
    public void setFechaHora(LocalDateTime fechaHora) { this.fechaHora = fechaHora; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

}
