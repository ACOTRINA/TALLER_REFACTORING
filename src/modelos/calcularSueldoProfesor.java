package modelos;

public class calcularSueldoProfesor {
    
    public double calcularSueldo(Profesor prof){
        double sueldo=0;
        sueldo= prof.info.getAñosdeTrabajo()*600 + prof.info.getBonoFijo();
        return sueldo;
    }  
}
