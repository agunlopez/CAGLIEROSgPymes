/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import static Excepciones.ExcepcionGarantia.VerificarTextField;

/**
 *
 * @author Nahuel
 */
public class ExcepcionGarantia extends Exception {
    public ExcepcionGarantia(String msg) {
        super(msg);
    }
    public static void rango(int cuotas, int cuotasGara,int Garantia,int totalFilas)throws ExcepcionGarantia{
        if(cuotasGara>cuotas){
            throw new ExcepcionGarantia("Las cuotas del deposito de garantia no pueden superar el total de cuotas del contrato");
        }
        if(cuotasGara<1){
            throw new ExcepcionGarantia("Las cuotas del deposito de garantia no pueden ser menor a 1");
        }
        if(Garantia<0){
            throw new ExcepcionGarantia("La garantia debe ser mayor a 0");
        }
        if(totalFilas==0){
            throw new ExcepcionGarantia("Seleccione los precios de las Cuotas");
        }
    }
    
    public static void VerificarTextField(String garantia,String cuotasGarantia,String punitorios,String comision)throws ExcepcionGarantia{
        String txtGarantia=garantia;
        txtGarantia=txtGarantia.replaceAll(" ", "");
        if(txtGarantia.length()==0){
            throw new ExcepcionGarantia("Ingrese deposito de garantia. En caso de no haber ingrese 0");
        }
        String txtCuotasGarantia=cuotasGarantia;
        txtCuotasGarantia=txtCuotasGarantia.replaceAll(" ", "");
        if(txtCuotasGarantia.length()==0){
            throw new ExcepcionGarantia("Ingrese las cuotas de garantia. En caso de no haber ingrese 1");
        }
        String txtPunitorios=punitorios;
        txtPunitorios=txtPunitorios.replaceAll(" ", "");
        if(txtPunitorios.length()==0){
            throw new ExcepcionGarantia("Ingrese el valor de los Punitorios");
        }
        String txtComision=comision;
        txtComision=txtComision.replaceAll(" ", "");
        if(txtComision.length()==0){
            throw new ExcepcionGarantia("Ingrese el valor de la Comision");
        }
    }
}