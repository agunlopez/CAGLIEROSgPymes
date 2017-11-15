package modelos;

import entidades.Impuesto;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;
import pantallas.ListaInmueble;


public class ModeloTablaImpComp extends AbstractTableModel {

    JButton btnEliminar=new JButton();
        
    final String[] COLUMN_NAMES = {"ID","Porcentaje","Inmueble","Impuesto"}; //cambiar los titulos
    ArrayList<Impuesto> lista = null;
    //retormanos el numero de elementos del array de datos

    public ModeloTablaImpComp(ArrayList lista) {
        super();
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }
    
    @Override
    public int getColumnCount() {
        return 4;//numeros de titulos
    }

    @Override
    public String getColumnName(int col) {
        return COLUMN_NAMES[col];
    }


    @Override
    public Object getValueAt(int fila, int columna) {
    
        if (fila > lista.size()) {
            return null;
        } else {
            switch (columna) {

                case 0:{
                    if(fila == 0){
                        return lista.get(fila).getIdImpuestoCompartido();
                    }else{
                        if(lista.get(fila).getIdImpuestoCompartido() == lista.get(fila-1).getIdImpuestoCompartido()){
                            return " ";
                        }else{
                            return lista.get(fila).getIdImpuestoCompartido();
                        }
                    } 
                }      
                case 1: {
                    return lista.get(fila).getPorcentaje();
                }    
                case 2:{
                     return lista.get(fila).getInmueble().getCalle();
                }
                case 3:{
                      return lista.get(fila).getDescripcion().getDescripcion();
                }
                                     
                default:
                    return null;
            }
        }
    }

}
