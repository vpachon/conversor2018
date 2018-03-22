/**
 * Métodos para convertir unidades de velocidad a kilómetros por hora
 * Esta clase implementa los métodos para convertir millas por segundo, millas por hora, pies por segundo, nudos naúticos,
 * velocidad de la luz, velocidad del sonido, caminata rápida y velocidad del caracol de jardín a kilómetros por hora
 * @author: Equipo <indicar equipo> Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;

public class velocidad {
   // TODO resto de métodos 
   public static double millas_segundos( double valor ){
       return valor * 5793.64;
   }
   
   public static double millas_hora( double valor ){
       return valor * 1.61;
   }
   
   public static double pies_segundos( double valor ){
       return valor * 1.1;
   }
   
   public static double nudos_nauticos( double valor ){
       return valor * 0.87;
   }
}
