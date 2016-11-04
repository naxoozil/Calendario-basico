
/**
 * Write a description of class CalendarioBasicoNacho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasicoNacho
{
    
    private int dia;
    
    private int mes;
    
    private int año;

    /**
     * Constructor for objects of class CalendarioBasicoNacho
     */
    public CalendarioBasicoNacho()
    {
        dia = 01;
        mes = 01;
        año = 01;
        
    }

    /**
     * Permite fijar la fecha 
     */
    public void fijarFecha(int dia1, int mes1, int año1)
    {
        dia = dia1;
        mes = mes1;
        año = año1;
    }
    
    /**
     * 
     */
    public void avanzarFecha()
    {
        if (dia >= 30){
            dia = 01;
            mes++;
        }
        else if (mes == 13){
            mes = 01;
            año++;
        }
        else{
            dia = dia + 1;
        }
        
    }
    
    public String obtenerFecha ()
    {
        return dia;
    }
}
