/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Renders;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import static pantallas.DetallesContrato.tablaDetalle;
import static pantallas.DetallesContrato.tablaImpuestos;
import static pantallas.CargaImpuestoCompartido.tablaInmuebles;
import static pantallas.DetallesContrato.tablaImpuestos;

/**
 *
 * @author Nahuel
 */
public class RenderEliminarImpuestoCompartido extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        if(value instanceof JButton){
            JButton btn=(JButton) value;
            return btn;
        }

        
         TableColumnModel columnModel = tablaInmuebles.getColumnModel();
        columnModel.getColumn(0).setCellRenderer(new RenderFondoImpuesto());
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setCellRenderer(new RenderFondoImpuesto());
         columnModel.getColumn(1).setPreferredWidth(85);
        columnModel.getColumn(2).setCellRenderer(new RenderFondoImpuesto());
         columnModel.getColumn(2).setPreferredWidth(85);
        columnModel.getColumn(3).setCellRenderer(new RenderFondoImpuesto());
         columnModel.getColumn(3).setPreferredWidth(85);
         



        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
         
    }
    
   
  
    
}
