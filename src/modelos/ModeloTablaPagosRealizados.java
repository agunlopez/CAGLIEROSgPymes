package modelos;

import entidades.CuotaImpuesto;
import entidades.Movimiento;
import java.util.ArrayList;
import javax.swing.JButton;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;



public class ModeloTablaPagosRealizados extends AbstractTableModel {

    JButton btnEliminar=new JButton();
        
    final String[] COLUMN_NAMES = {"Alquileres","Impuestos","Sellados","Expensas","Garantias","Fecha"}; //cambiar los titulos
    ArrayList<Movimiento> lista = null;
    //retormanos el numero de elementos del array de datos

    public ModeloTablaPagosRealizados(ArrayList lista) {
        super();
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }
    
    @Override
    public int getColumnCount() {
        return 6;//numeros de titulos
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
                    return lista.get(fila).getAlquileresPagos();
                }                   
                case 1: {
                    return lista.get(fila).getImpuestosPagos();
                }
                case 2: {                   
                    return lista.get(fila).getSelladosPagos();
                }
                case 3: {
                    return lista.get(fila).getExpensasPagas();
                }
                case 4:{
                    return lista.get(fila).getGarantiaPagos();
                }
                case 5:{
                    return lista.get(fila).getFecha();
                }

                                                         
                default:
                    return null;
            }
        }
    }

}
