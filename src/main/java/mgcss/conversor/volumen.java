/**
 * Métodos para convertir unidades de volumen del sistema británico a litros del sistema métrico
 * Esta clase implementa los métodos para convertir barril, picotazo, galón, cuarto de galón y onza líquita a litros
 * @author: Equipo <indicar equipo> Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;

public class volumen {
    
    public static double galón(double galón) {
        return (galón*3.78541);
    }
    
    public static double cuartoGalón(double qgalón) {
        return (galón(qgalón)/4);
    }
}
