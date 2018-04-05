/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgcss.conversor;

/**
 *
 * @author marcys-okomo
 */
//Opcionalmente implemento este metodo por que no tengo nada asignado y, tampoco se como va la practica
public class Perimetro_opcional
{
   private float altura, base;

    public Perimetro_opcional() {
    }

    public Perimetro_opcional(float altura, float base) {
        this.altura = altura;
        this.base = base;
    }
   
   public float perimetro()
   {
       return 2*(getAltura()+getBase());
   }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    
   
}
