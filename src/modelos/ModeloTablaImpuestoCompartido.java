package modelos;

import entidades.Impuesto;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;
import pantallas.ListaInmueble;


public class ModeloTablaImpuestoCompartido extends AbstractTableModel {

    JButton btnEliminar=new JButton();
        
    final String[] COLUMN_NAMES = {"ID","Porcentaje","Inmueble"}; //cambiar los titulos
    ArrayList<Impuesto> lista = null;
    //retormanos el numero de elementos del array de datos

    public ModeloTablaImpuestoCompartido(ArrayList lista) {
        super();
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }
    
    @Override
    public int getColumnCount() {
        return 3;//numeros de titulos
    }

    @Override
    public String getColumnName(int col) {
        return COLUMN_NAMES[col];
    }


    @Override
    public Object getValueAt(int fila, int columna) {
        Font negrita = new Font("Arial", Font.BOLD, 14);
        btnEliminar.setFont(negrita);
        btnEliminar.setName("e");
        btnEliminar.setOpaque(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setBorderPainted(false );
        btnEliminar.setBackground(java.awt.Color.decode("#B7B7B7"));
        
        
////        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menos.png")));
        if (fila > lista.size()) {
            return null;
        } else {
            switch (columna) {
                
              
                case 0:{
                    return lista.get(fila).getContrato().getIdContrato();
                }      
                case 1: {
                    return lista.get(fila).getPorcentaje();
                 }    
                  case 2:{
                     return lista.get(fila).getInmueble().getCalle();
                }

//                case 3:{
//                    return btnEliminar;
//                }

                                                         
                default:
                    return null;
            }
        }
    }

}
