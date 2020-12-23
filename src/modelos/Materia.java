package modelos;

public class Materia {

    private String codigo;
    private String nombre;
    private String facultad;
    private double notaInicial;
    private double notaFinal;

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


    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNotaInicial(Nota notas) {
        return CalcularNota(notas);
    }

    //Calcula y devuelve la nota final contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.    
    public double CalcularNotaFinal(Nota notas) {
        return CalcularNota(notas);
    }

    public double CalcularNota(Nota notas) {
        double nota = 0;
        double notaTeorico = (notas.getNexamen() + notas.getNdeberes() + notas.getNlecciones()) * 0.80;
        double notaPractico = (notas.getNtalleres()) * 0.20;
        nota = notaTeorico + notaPractico;
        return nota;
    }

    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal() {
        double notaTotal = 0;
        notaTotal = (notaInicial + notaFinal) / 2;
        return notaTotal;

    }

}
