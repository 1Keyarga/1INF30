package pkg2024_1_lab02;

import java.util.Date;

public class Teleconsulta extends CitaMedica{
    private Plataforma plataforma;
    private String enlace;

    public Teleconsulta(Paciente paciente, Medico medico, Date fecha_atencion, String motivo, Plataforma plataforma, String enlace) {
        super(paciente, medico, fecha_atencion, motivo);
        this.plataforma = plataforma;
        this.enlace = enlace;
    }

    /**
     * @return the plataforma
     */
    public Plataforma getPlataforma() {
        return plataforma;
    }

    /**
     * @param plataforma the plataforma to set
     */
    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    /**
     * @return the enlace
     */
    public String getEnlace() {
        return enlace;
    }

    /**
     * @param enlace the enlace to set
     */
    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
    
}
