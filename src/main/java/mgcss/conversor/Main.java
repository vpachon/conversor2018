/**
 * Proyecto colaborativo: conversor de unidades de medida
 */
package mgcss.conversor;

import java.util.Scanner;

public class Main {
/**
     * @param args no hay
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al convertidor de unidades de medida");
        System.out.println("***********************************************");
       //TODO aquí pondremos las llamadas a los métodos para convertir unidades
        /* ejemplo de llamada 
        double millas=0;
        double kilometros=longitud.milla(millas); */

    
    double koku=1, kann=1, kinn=1, monme=1, tael=1, ku=1;
    
    double kilometro1=masa.convertirKoku(koku);
    double km2=masa.convertirKann(kann);
    double km3=masa.convertirKinn(kinn);
    double km4=masa.convertirMonnme(monme);
    double km5 = masa.convertirTael(tael);
    double km6=masa.convertirKuPing(ku);
    

        Perimetro_opcional per = new Perimetro_opcional();
        Scanner sc = new Scanner(System.in);
        System.out.println("Aqui vamos a probar el calculo del perimetro de una figura dada sus dimenciones");
        System.out.print("\nDeme el altura de la figura");
        per.setAltura(sc.nextFloat());
        System.out.print("\nDeme la base de la figura");
        per.setBase(sc.nextFloat());
        
        

    }

}
