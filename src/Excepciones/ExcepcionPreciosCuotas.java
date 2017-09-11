/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Nahuel
 */
public class ExcepcionPreciosCuotas extends Exception {
    public ExcepcionPreciosCuotas(String msg) {
        super(msg);
    }
    public static void rango(int cuotas,int totalPrecios)throws ExcepcionPreciosCuotas{
        if(cuotas!=totalPrecios){
            throw new ExcepcionPreciosCuotas("Debe colocar la misma cantidad de precios que cuotas del contrato: "+cuotas);
        }
        
}
}