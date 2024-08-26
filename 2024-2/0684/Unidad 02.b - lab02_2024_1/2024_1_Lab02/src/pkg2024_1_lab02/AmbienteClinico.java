package pkg2024_1_lab02;

public abstract class AmbienteClinico implements IConsultable{
    private Double metraje;
    private char torre;
    private Integer piso;

    public AmbienteClinico(Double metraje, char torre, Integer piso) {
        this.metraje = metraje;
        this.torre = torre;
        this.piso = piso;
    }
    
    

    /**
     * @return the metraje
     */
    public Double getMetraje() {
        return metraje;
    }

    /**
     * @param metraje the metraje to set
     */
    public void setMetraje(Double metraje) {
        this.metraje = metraje;
    }

    /**
     * @return the torre
     */
    public char getTorre() {
        return torre;
    }

    /**
     * @param torre the torre to set
     */
    public void setTorre(char torre) {
        this.torre = torre;
    }

    /**
     * @return the piso
     */
    public Integer getPiso() {
        return piso;
    }

    /**
     * @param piso the piso to set
     */
    public void setPiso(Integer piso) {
        this.piso = piso;
    }
}
