/**
 * Métodos para convertir unidades de masa del sistema japonés y chino a kilogramos del sistema métrico
 * Esta clase implementa los métodos para convertir koku, kann, kinn, monnme, tael y ku ping a kilogramos
 * @author: Equipo <indicar equipo> Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;

public class masa {
    // TODO resto de métodos


    public static double convertirKoku(double n){
        
        return n*180.41;   
        
    }
    
    
    public static double convertirKann(double n){
    
    return n*3.75;
}

    public static double convertirKinn(double n ){
        return n *0.6;
    }
    
    public static double convertirMonnme(double n){
        return n*0.00375;
        
    }
    
    public static double convertirTael(double n){
        return n*0.04;
    }
    
    public static double convertirKuPing (double n){
        return n*0.04;
    }
    
    
}

