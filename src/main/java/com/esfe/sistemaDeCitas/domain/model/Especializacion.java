package com.esfe.sistemaDeCitas.domain.model;


public class Especializacion {

    private Long idEspecializacion;

    private String nombre;
    private String descripcion;
    private int estado;

    public Especializacion() {
    }

    public Especializacion(String nombre, String descripcion, int estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    // Getters y setters
    public Long getIdEspecializacion() { return idEspecializacion; }
    public void setIdEspecializacion(Long idEspecializacion) { this.idEspecializacion = idEspecializacion; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getEstado() { return estado; }
    public void setEstado(int estado) { this.estado = estado; }
}
