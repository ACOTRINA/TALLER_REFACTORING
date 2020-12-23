package modelos;

public class Materia {
    public String codigo;
    public String nombre;
    public String facultad;
    public double notaInicial;
    public double notaFinal;
    public double notaTotal;

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public double getNotaInicial() {
        return notaInicial;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public double getNotaTotal() {
        return notaTotal;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setNotaInicial(double notaInicial) {
        this.notaInicial = notaInicial;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void setNotaTotal(double notaTotal) {
        this.notaTotal = notaTotal;
    }
    
    
    
}
