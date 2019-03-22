/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesyObjetos;

/**
 *
 * @auth
 */
public class Coche {
    
    //atributos
    String color;
    String marca;
    int km;
    
    //metodos
    public static void main(String [] args){
        Coche coche1 = new Coche();
        
        coche1.color = "blanco";
        coche1.marca = "audi";
        coche1.km = 0;
        
        System.out.println("El color del coche es: "+coche1.color);
        System.out.println("L marca del coche es: "+coche1.marca);
        System.out.println("El kilometraje del coche es: "+coche1.km);

        Coche coche2 = new Coche();
        
        coche2.color = "blanco";
        coche2.marca = "audi";
        coche2.km = 0;
        
        System.out.println("\nEl color del coche 2 es: "+coche2.color);
        System.out.println("L marca del coche 2 es: "+coche2.marca);
        System.out.println("El kilometraje del coche 2 es: "+coche2.km);
    }
}
