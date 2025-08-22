package com.esfe.sistemaDeCitas.domain.model;



public class DoctorEspecializacion {



    private Long idDoctorEspecializacion;
    private Long idDoctor;
    private Long idEspecializacion;

    public DoctorEspecializacion() {
    }

    public DoctorEspecializacion(Long idDoctorEspecializacion, Long idDoctor, Long idEspecializacion) {
        this.idDoctorEspecializacion = idDoctorEspecializacion;
        this.idDoctor = idDoctor;
        this.idEspecializacion = idEspecializacion;
    }

    // Getters y setters
    public Long getIdDoctorEspecializacion() { return idDoctorEspecializacion; }
    public void setIdDoctorEspecializacion(Long idDoctorEspecializacion) { this.idDoctorEspecializacion = idDoctorEspecializacion;}

    public Long getIdDoctor() { return idDoctor; }
    public void setIdDoctor(Long idDoctor) { this.idDoctor = idDoctor; }

    public Long getIdEspecializacion() { return idEspecializacion; }
    public void setIdEspecializacion(Long idEspecializacion) { this.idEspecializacion = idEspecializacion; }
}
