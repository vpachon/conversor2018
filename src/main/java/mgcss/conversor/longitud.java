/**
 * Métodos para convertir unidades de longitud del sistema británico a kilómetros del sistema métrico
 * Esta clase implementa los métodos para convertir millas, estadios, cadenas, barras, yardas, pies y manos
 * a kilómetros.
 * @author: Equipo <indicar equipo> Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;


public class longitud {
    /**
     * Método que convierte millas británicas a kilómetros del sistema métrico
     * @param milla double indica las millas que deseamos convertir
     * @return double valor en kilómetros
     */
    public static double milla(double milla){
              return (milla*1.61);
    }
    public static double estadio(double estadio){
        return (estadio*0.20);
    }
    public static double cadenas(double cadenas){
        return (cadenas*0.02);
    }
    public static double barras(double barras){
        return (barras*0.0050292);
    }
    public static double yarda(double yarda){
        return (yarda*0.0009144);
    }
    public static double pie(double pie){
        return (pie*0.0003048);
    }
    public static double mano(double mano){
            return (mano*0.0001016);
    }
    
    // TODO resto de métodos
}
