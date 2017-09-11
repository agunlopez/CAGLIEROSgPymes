/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import entidades.Contrato;
import java.util.Date;

/**
 *
 * @author Nahuel
 */
public class ExcepcionNuevoContrato extends Exception {
    public ExcepcionNuevoContrato(String msg) {
        super(msg);
    }
    public static void rango(Date fechaComienzo,Date fechaFin,String diaPago,Contrato contrato)throws ExcepcionNuevoContrato{
        if(fechaComienzo==null){
            throw new ExcepcionNuevoContrato("Ingrese la fecha de Inicio del Contrato");
        }
        if(fechaFin==null){
            throw new ExcepcionNuevoContrato("Ingrese la fecha de Vencimiento del Contrato");
        }
        String texto=diaPago;
        texto=texto.replaceAll(" ", "");
        if(texto.length()==0){
            throw new ExcepcionNuevoContrato("Ingrese el dia de Pago");
        }else{
            if(Integer.parseInt(texto)<1 || Integer.parseInt(texto)>31){
                throw new ExcepcionNuevoContrato("Dia de pago invalido");             
            }
        }
        if(contrato.getInmueble().getPropietario().getId()==contrato.getInquilino().getId() || contrato.getInmueble().getPropietario().getId()==contrato.getGarante1().getId() || contrato.getInmueble().getPropietario().getId()==contrato.getGarante2().getId()
                || contrato.getInquilino().getId()==contrato.getGarante1().getId() || contrato.getInquilino().getId()==contrato.getGarante2().getId() || contrato.getGarante1().getId()==contrato.getGarante2().getId()){
            throw new ExcepcionNuevoContrato("Los Clientes no se pueden repetir");         
        }
}
}