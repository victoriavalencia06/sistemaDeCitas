package com.esfe.sistemaDeCitas.domain.model;

import java.time.LocalDateTime;

public class HistorialMedico {

    private Long idHistorial;

    private Long idPaciente;
    private String notas;
    private String diagnosticos;
    private String tratamientos;
    private String cuadroMedico;
    private LocalDateTime fechaHora;
    private int estado;

    public HistorialMedico(Long idHistorial, Long idPaciente, String notas, String diagnosticos, String tratamientos, String cuadroMedico, LocalDateTime fechaHora, int estado) {
        this.idHistorial = idHistorial;
        this.idPaciente = idPaciente;
        this.notas = notas;
        this.diagnosticos = diagnosticos;
        this.tratamientos = tratamientos;
        this.cuadroMedico = cuadroMedico;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    public Long getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(Long idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {this.idPaciente = idPaciente;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(String diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }

    public String getCuadroMedico() {
        return cuadroMedico;
    }

    public void setCuadroMedico(String cuadroMedico) {
        this.cuadroMedico = cuadroMedico;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }



}




