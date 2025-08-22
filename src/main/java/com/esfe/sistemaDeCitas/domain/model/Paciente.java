package com.esfe.sistemaDeCitas.domain.model;

import java.time.LocalDate;


public class Paciente {


    private Long idPaciente;

    private String nombreCompleto;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String direccion;
    private String seguro;
    private String estado;

    public Paciente() {
    }

    public Paciente(String nombreCompleto,String apellido,LocalDate fechaNacimiento, String telefono, String direccion, String seguro, String estado) {
        this.apellido = apellido;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.seguro = seguro;
        this.estado = estado;
    }

    // Getters y setters
    public Long getIdPaciente() { return idPaciente; }
    public void setIdPaciente(Long idPaciente) { this.idPaciente = idPaciente; }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getSeguro() { return seguro; }
    public void setSeguro(String seguro) { this.seguro = seguro; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
