package modelos;

import entidades.Impuesto;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;
import pantallas.ListaInmueble;


public class ModeloTablaImpuestoCompartido extends AbstractTableModel {

    JButton btnEl=new JButton();
        
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
    public Object getValueAt(int fila, int columna)  {
        btnEl.setOpaque(false);
        btnEl.setContentAreaFilled(false);
        btnEl.setBorderPainted(false );
        
        btnEl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sm.png")));
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



                                                         
                default:
                    return null;
            }
        }
    }

}
