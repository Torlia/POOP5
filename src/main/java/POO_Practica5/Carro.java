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
public class Carro {
    private String marca;
    private String modelo;
    private String color;
    private int anio;
    private int kilometraje;
    private boolean estandar;
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
        
    /**
     * Constructor vacío
     */
    public Carro() {
    }
    

    /*
    public void irLugar(String lugar){
        System.out.println("Estoy llendo a "+ lugar);
    }    
    public void vender(String comprador){
        System.out.println("Vendi mi coche y el nuevo dueño es: "+ comprador);
    }
    public void gasolina(int porcentaje){
        System.out.println("Tengo un "+porcentaje+" % de gas");
    }
    public void servicio(){
            if (kilometraje > 50000) {
                System.out.println("El carro necesita servicio");
            }else{
                System.out.println("Aun falta para ir a servicio");
            }
    }
    public void recorridoTiempo(float tiempoHoras){
        System.out.println("El tiempo del trayecto es de: "+tiempoHoras+" horas");
    }
    */
   
    /**
     * Constructor con todos los atributos
     * @param marca nombre de la marca del carro
     * @param modelo modelo del carro
     * @param color color del carro
     * @param anio año del carro
     * @param kilometraje kilometraje con el que cuenta el carro
     * @param estandar valor booleano para idicar si es estandar o no
     */
    public Carro(String marca, String modelo, String color, int anio, int kilometraje, boolean estandar) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.estandar = estandar;
    }

    /**
     * Getter para consultar el valor de la variable marca
     * @return el valor de marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Setter para modificar el valor de la variable marca
     * @param marca nombre de la marca del carro
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Getter para consultar el valor de la variable modelo
     * @return el valor de modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Setter para modificar el valor de la variable modelo
     * @param modelo modelo del carro 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Getter para consultar el valor de la variable color
     * @return el valor de color
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter para modificar el valor de la variable color
     * @param color color del carro
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter para consultar el valor de la variable año
     * @return el valor del año
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Setter para modificar el valor de la variable año
     * @param anio año del carro
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * Getter para consultar el valor de la variable kilometraje
     * @return el valor de kilometraje
     */
    public int getKilometraje() {
        return kilometraje;
    }

    /**
     * Setter para modificar el valor de la variable kilometraje
     * @param kilometraje kilometraje con el que cuenta el carro
     */
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     *  Getter para consultar el valor de la variable estandar
     * @return el valor de estandar
     */
    public boolean isEstandar() {
        return estandar;
    }

    /**
     * Setter para modificar el valor de la variable estandar
     * @param estandar valor booleano para idicar si es estandar o no
     */
    public void setEstandar(boolean estandar) {
        this.estandar = estandar;
    }
    
    /**
     * Constructor con objetos tipo Persona
     * @param P1 Persona 1, chofer
     * @param P2 Persona 2, copiloto
     * @param P3 Persona 3, pasajero 1
     * @param P4 Persona 4, pasajero 2
     */
    public void lugares(Persona P1, Persona P2, Persona P3,Persona P4){
        this.chofer = P1;
        this.copiloto = P2;
        this.pasajero1 = P3;
        this.pasajero2= P4;
    }
     
    //Modo largo:

    /**
     * Getter para consultar el valor de la variable chofer
     * @return datos del chofer
     */
    public Persona getChofer() {
        return chofer;
    }

    /**
     * Setter para modificar el valor de la variable chofer
     * @param chofer datos del chofer
     */
    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }

    /**
     * Getter para consultar el valor de la variable copiloto
     * @return datos del copiloto
     */
    public Persona getCopiloto() {
        return copiloto;
    }

    /**
     * Setter para modificar el valor de la variable copiloto
     * @param copiloto datos del copiloto
     */
    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }

    /**
     * Getter para consultar el valor de la variable pasajero 1
     * @return  datos del pajasero 1
     */
    public Persona getPasajero1() {
        return pasajero1;
    }

    /**
     * Setter para modificar el valor de la variable pasajero 1
     * @param pasajero1 datos del pasajero 1
     */
    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }

    /**
     * Getter para consultar el valor de la variable pasajero 2
     * @return datos del pasajero 2
     */
    public Persona getPasajero2() {
        return pasajero2;
    }

    /**
     * Setter para modificar el valor de la variable pasajero 2
     * @param pasajero2 datos del pasajero 2
     */
    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }
    
    /**
     * Método que imprime los datos de todos los pasajeros del carro
     */
    public void impCarroLugares(){
        System.out.println("CARRO: Modelo: "+modelo+" Marca: "+marca+" Año: "+anio+" Color: "+color);
        System.out.println("\tTripulantes:");
        System.out.println("\tChofer: "+chofer.toStringCarr());
        System.out.println("\tCopiloto: "+copiloto.toStringCarr());
        System.out.println("\tPasajero 1: "+pasajero1.toStringCarr());
        System.out.println("\tPasajero 2: "+pasajero2.toStringCarr());
    }
    
    /**
     * Setter para modificar el valor de las variables marca, modelo, color y año
     * @param marca nombre de la marca del carro
     * @param modelo modelo del carro
     * @param color color del carro
     * @param anio año del carro
     */
    public void setMarcaModeloColorAnio(String marca, String modelo, String color, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
    }
    
}
