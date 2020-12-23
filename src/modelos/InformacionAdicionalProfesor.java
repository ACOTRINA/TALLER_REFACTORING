package modelos;

public class InformacionAdicionalProfesor {
    private int añosdeTrabajo;
    private String facultad;
    private double BonoFijo;
    
    public int getAñosdeTrabajo() {
        return añosdeTrabajo;
    }
    public String getFacultad() {
        return facultad;
    }
    public double getBonoFijo() {
        return BonoFijo;
    }
    public void setAñosdeTrabajo(int añosdeTrabajo) {
        this.añosdeTrabajo = añosdeTrabajo;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public void setBonoFijo(double BonoFijo) {
        this.BonoFijo = BonoFijo;
    }
    public double calcularSueldo() {
        double sueldo = 0;
        sueldo = añosdeTrabajo * 600 + BonoFijo;
        return sueldo;
    }
}


