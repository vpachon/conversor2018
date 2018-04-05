/**
 * Métodos para convertir unidades de volumen del sistema británico a litros del sistema métrico
 * Esta clase implementa los métodos para convertir bitcoin, dolar americano, dínar tunecino, chelín comalí a euros
 * @author: Equipo <indicar equipo> Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;

public class moneda {

   
    public static double dinar_tunecino(Double n){
        return n*0.3393;
    }
    public static double bitcoin(Double n){
        return n*7010.76;

    // TODO resto de métodos
    
    public static Double chelin_somali(Double n){
        return n*0.0014;
    }
    public static Double dolar_americano(Double n){
        return n*0.8123;

    }
}