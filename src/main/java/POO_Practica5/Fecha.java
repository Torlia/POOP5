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

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    /**
     * Constructor vacío
     */
    public Fecha() {
    }

    /**
     * Constructor de objetos tipo fecha
     * @param dia día de nacimiento
     * @param mes mes de nacimiento
     * @param anio año de nacimiento
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /**
     * Getter para consultar el valor de la variable día
     * @return el valor de día
     */
    public int getDia() {
        return dia;
    }

    /**
     * Setter para modificar el valor de la variable día
     * @param dia valor del día de nacimiento
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Getter para consultar el valor de la variable mes
     * @return el valor de mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * Setter para modificar el valor de la variable mes
     * @param mes valor del mes de nacimiento
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Getter para consultar el valor de la variable año
     * @return el valor de año
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Setter para modificar el valor de la variable año
     * @param anio  valor del año de nacimiento
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * Override que permite imprimir en una línea todas las variables del objeto tipo fecha 
     * @return valores de la fecha de nacimiento
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
}
