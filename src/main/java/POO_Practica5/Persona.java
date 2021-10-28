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

public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;

    public Persona() {
    }
    /**
     * Constructor con atributo de objeto persona
     * @param nombre Nombre de la persna 
     * @param apellido Apellido de la persona 
     * @param fNacimiento Fecha de nacimiento de la persona 
     */
    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }

    /**
     * Constructor con atributo de objeto persona más especificos
     * @param nombre Nombre de la persna 
     * @param apellido Apellido de la persona 
     * @param dia Dia de nacimiento de la persona
     * @param mes Dia de nacimiento de la persona
     * @param anio Dia de nacimiento de la persona
     */
    public Persona(String nombre, String apellido, int dia ,int mes ,int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        //Opcion 1
        //Fecha f3 = new Fecha(dia,mes,anio);
        //this.fNacimiento = f3;
        //Opcion2
        //fNacimiento = new Fecha();  
        //fNacimiento.setDia(dia);
        //fNacimiento.setMes(mes);
        //fNacimiento.setAnio(anio);
        
        //Opcion3
        fNacimiento = new Fecha(dia,mes,anio);
    }
 
    /**
     * Getter para consultar el valor de la variable nombre
     * @return datos de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para modificar el valor de la variable nombre
     * @param nombre dato de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Getter para consultar el valor de la variable apellido
     * @return dato de la persona
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Setter para modificar el valor de la variable apellido
     * @param apellido dato de la persona
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    /**
     * Getter para consultar el valor de la variable fecha
     * @return datos de la persona
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    /**
     * Setter para modificar el valor de la variable fecha
     * @param fNacimiento dato de la persona
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    /**
     * Override que permite imprimir en una línea todas las variables del objeto tipo clase 
     * @return valores de la persona
     */
    @Override
    public String toString() {
        return "Persona{" + "Nombre: " + nombre + " Apellido: " + apellido + "Fecha de nacimiento: " + fNacimiento+"}";
    }
    
    /**
     * Imprime datos completos de la persona
     * @return datos de persona
     */
    public String toStringCarr() {
        return  "Nombre: " + nombre + " Apellido: " + apellido + 
                "\n\t\tFecha de nacimiento: " + fNacimiento+"\n";
    }

}