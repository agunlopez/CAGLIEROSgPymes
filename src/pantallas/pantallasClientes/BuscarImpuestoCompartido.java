/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas.pantallasClientes;

import gestores.GestoresImpuestos;
import gestores.gestoresCliente.BusquedaCliente;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import modelos.ModeloTablaImpComp;
import modelos.ModeloTablaPropietarioResumen;
import pantallas.DatosInmueble;
import pantallas.EliminarImpuestoCompartido;


/**
 *
 * @author Nahuel
 */
public class BuscarImpuestoCompartido extends javax.swing.JFrame {

    /**
     * Creates new form ListaPropietarios
     */
    public BuscarImpuestoCompartido() {
        initComponents();
        this.setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaImpuestosCompartidos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista Impuestos Compartidos");
        setIconImage(getIconImage());
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jScrollPane1.setBorder(null);

        tablaImpuestosCompartidos.setModel(modelo
        );
        tablaImpuestosCompartidos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tablaImpuestosCompartidosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tablaImpuestosCompartidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaImpuestosCompartidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaImpuestosCompartidos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaImpuestosCompartidosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablaImpuestosCompartidosAncestorAdded
        // TODO add your handling code here:
        
                                
    }//GEN-LAST:event_tablaImpuestosCompartidosAncestorAdded

    private void tablaImpuestosCompartidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaImpuestosCompartidosMouseClicked
        if(evt.getClickCount()==2){
 
            int row = tablaImpuestosCompartidos.getSelectedRow();

            String idImpComp=tablaImpuestosCompartidos.getValueAt(row, 0).toString();
            String Impuesto=tablaImpuestosCompartidos.getValueAt(row, 3).toString();
            String Inmueble=tablaImpuestosCompartidos.getValueAt(row, 2).toString();

            EliminarImpuestoCompartido eliminarImp=new EliminarImpuestoCompartido();
            eliminarImp.pack();
            eliminarImp.lblIdImpuestoCompartido.setText(idImpComp);
            eliminarImp.lblDescripcion.setText(Impuesto);
            eliminarImp.setLocationRelativeTo(null);
            eliminarImp.setVisible(true);
       }
       
    }//GEN-LAST:event_tablaImpuestosCompartidosMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        ArrayList listaCliente=GestoresImpuestos.consultarImpuestoCompartidoCalle();
        ModeloTablaImpComp modelo=new ModeloTablaImpComp(listaCliente);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarImpuestoCompartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarImpuestoCompartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarImpuestoCompartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarImpuestoCompartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarImpuestoCompartido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaImpuestosCompartidos;
    // End of variables declaration//GEN-END:variables

        ArrayList listaCliente=GestoresImpuestos.consultarImpuestoCompartidoCalle();
        ModeloTablaImpComp modelo=new ModeloTablaImpComp(listaCliente);

public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/Cagliero.png"));
        return retValue;
    }
}
