package pkg2024_1_lab02;

import java.util.Date;

public abstract class AtencionMedica {
    protected static Integer correlativo=1;
    protected Integer identificador;
    protected Paciente paciente;
    protected Medico medico;
    protected Date fecha_creacion;
    protected Date fecha_atencion;
    protected Estado_de_atencion estado;

    public AtencionMedica(Paciente paciente, Medico medico, Date fecha_atencion) {
        this.identificador = AtencionMedica.correlativo++;
        this.paciente = paciente;
        this.medico = medico;
        this.fecha_creacion = new Date();
        this.fecha_atencion = fecha_atencion;
        this.estado = Estado_de_atencion.PROGRAMADA;
    }
    
    public abstract String consultarDatos();

    @Override
    public String toString(){
        String resultado = "ID: ".concat(this.identificador.toString()).concat(" - ");
        return resultado;
    }
    /**
     * @return the identificador
     */
    public Integer getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * @return the fecha_creacion
     */
    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    /**
     * @param fecha_creacion the fecha_creacion to set
     */
    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    /**
     * @return the fecha_atencion
     */
    public Date getFecha_atencion() {
        return fecha_atencion;
    }

    /**
     * @param fecha_atencion the fecha_atencion to set
     */
    public void setFecha_atencion(Date fecha_atencion) {
        this.fecha_atencion = fecha_atencion;
    }

    /**
     * @return the estado
     */
    public Estado_de_atencion getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado_de_atencion estado) {
        this.estado = estado;
    }
}
