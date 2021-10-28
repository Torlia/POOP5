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
public class Circulo {
    
    private float radio;
    
    /**
     * Constructor vacío
     */
    public Circulo(){
    }
        
    /**
     * Método para determinar el perímetro del círculo
     * @return perímetro del círculo
     */
    public float perimetro (){
        return 2*(float)Math.PI*radio;
    }    
    
    /**
     * Método para determinar el área del círculo
     * @return área del círculo
     */
    public float area(){
        return (float)Math.PI * radio* radio;
    }
    
    //como poner un get
    /**
     * Getter para consultar el valor de la variable radio
     * @return el valor del radio
     */
    public float getRadio(){
        return radio;
    }
    
    //para modificar con un set
    /**
     * Setter para modificar el valor de la variable radio
     * En caso de que sea menor de cero, regresar su valor absoluto
     * @param radio valor del radio del círculo
     */
    public void setRadio(float radio){
        if (radio<0) {
            this.radio = Math.abs(radio);
            //this.radio = 0;
        }else{
            this.radio = radio;
        }
    }

    /**
     * Override que permite imprimir en una línea todas las variables del objeto tipo clase 
     * @return valores del círculo
     */
    @Override
    public String toString() {
        return "Circulo [radio =" + radio+ "]";
    }
}
