/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_Practica5;

/**
 *
 * @author MarioTeran, MiguelAngelCamacho, CeciliaZurita, CeciliaTorres, JacielHernandez
 */
public class Main{
    
    /**
     * Método principal donde se llaman a los objetos tipo clase
     * @param args parámetro de tipo cadena
     */
    
    public static void main(String[] args) {
        //Getters Setters
        System.out.println("####Getters y Setters####");
        Circulo cir = new Circulo();
        System.out.println(cir);
        cir.setRadio (5);
        System.out.println(cir);
        System.out.println("Radio de cir = "+ cir.getRadio());
        cir.setRadio((float)7.2);
        cir.setRadio(8.9f);
        cir.setRadio((float) 7.66);
        
        cir.setRadio(-7);
        System.out.println(cir);
        
        System.out.println("####Composicion 1####");
        Persona persona1 = new Persona();
        persona1.setNombre("Rodolfo");
        persona1.setApellido("Teran");
        Fecha fNac = new Fecha(14,10,2021);
        persona1.setfNacimiento(fNac);
        System.out.println(persona1);
        
        System.out.println("####Composicion 2####");
        Fecha f2 = new Fecha(10,02,2003);
        Persona persona2 = new Persona("Héctos","Herrera",f2);
        System.out.println(persona2);
        
        System.out.println("####Composicion 3####");
        Persona persona3 = new Persona("Raúl","Jiménez",22,4,1998);
        System.out.println(persona3);
        
        System.out.println("####Coche####");
        Carro carro1 = new Carro();
        Persona persona4 = new Persona("Rodolfo","Teran",10,02,2003);    
        Persona persona5 = new Persona("Diana","García",10,02,2001);
        Persona persona6 = new Persona("Raquel","Torres",25,02,1978);
        Persona persona7 = new Persona("Perla","G+omez",13,03,2019);
        
        //Método corto:
        carro1.setMarcaModeloColorAnio("Toyota", "Sport", "Azúl", 2021);
        carro1.lugares(persona4, persona5, persona6, persona7);
        carro1.impCarroLugares();
        
        /*Método largo: 
        carro1.setMarca("Toyota");
        carro1.setModelo("Sport");
        carro1.setColor("Azúl");
        carro1.setAnio(2021);
        carro1.setChofer(persona4);
        carro1.setCopiloto(persona5);
        carro1.setPasajero1(persona6);
        carro1.setPasajero2(persona7);
        
        carro1.impCarroLugares();
        */
    }
}
