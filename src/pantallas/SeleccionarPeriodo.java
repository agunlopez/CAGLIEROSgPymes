/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import conexion.Conexion;
import entidades.Contrato;
import entidades.CuotaImpuesto;
import entidades.Cuotas;
import gestores.GestoresContrato;
import gestores.GestoresImpuestos;
import gestores.fechas;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nahuel
 */
public class SeleccionarPeriodo extends javax.swing.JFrame {

    /**
     * Creates new form Descuento
     */
    public SeleccionarPeriodo() {
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblPeriodo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Expensas");
        setIconImage(getIconImage());
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Periodo: (mm/aaaa)");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblPeriodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblPeriodoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LiquidacionInquilino liquidacionInq=new LiquidacionInquilino();
        try {
            datosContrato=GestoresContrato.consultaDatosContrato(idCon);
            
            inicio = (datosContrato.getFechaInicio());
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
     
            Calendar ahora= Calendar.getInstance();
            int diaActual=ahora.get(Calendar.DATE);
            int mesActual=ahora.get((Calendar.MONTH))+1;
            int añoActual=ahora.get(Calendar.YEAR);
            String act=lblPeriodo.getText();
            actual= "05/"+act;
            String fechaInicio = inicio;

            Date fechaInicial=dateFormat.parse(fechaInicio);
            Date fechaFinal=dateFormat.parse(actual);
            int cantmes = fechas.calcularMesesAFecha(fechaInicial ,fechaFinal );
            datosCuota=GestoresContrato.consultarCuotaLiquidacion(idCon, cantmes);
            double cant= datosCuota.getTotalaPagar();
            if(datosCuota.getTotalaPagar()==0){
                JOptionPane.showMessageDialog(new JDialog(),"Pago de cuotas completo");
                dispose();
            }else{

                //int cuotaAct=GestoresContrato.ConsultarCuotaActual(idCon);
                ArrayList<CuotaImpuesto> impuestos=GestoresImpuestos.consultaTablaImpuesto(idCon,cantmes);

                for(int i=0;i<impuestos.size();i++){
                    DefaultTableModel model=(DefaultTableModel)LiquidacionInquilino.tablaImpuestosLiquidacion.getModel();

                    model.addRow(new Object[]{
                        impuestos.get(i).getImpuesto().getDescripcion().getDescripcion(),impuestos.get(i).getImpuesto().getValor()
                    });
                }
                liquidacionInq.pack();
                liquidacionInq.cuotaActual=cantmes;
                liquidacionInq.setLocationRelativeTo(null);
                liquidacionInq.setVisible(true);
                dispose();
            }
        } catch (ParseException ex) {
            Logger.getLogger(SeleccionarPeriodo.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
private void calcularcantmes() throws ParseException{
    
    datosContrato=GestoresContrato.consultaDatosContrato(idCon);
                inicio = (datosContrato.getFechaInicio());
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
                    
                Calendar ahora= Calendar.getInstance();
                int diaActual=ahora.get(Calendar.DATE);
                int mesActual=ahora.get((Calendar.MONTH))+1;
                int añoActual=ahora.get(Calendar.YEAR);
                actual=lblPeriodo.getText();       
                String fechaInicio = inicio;
                Date fechaInicial=dateFormat.parse(fechaInicio);
                Date fechaFinal=dateFormat.parse(actual);
                int cantmes = fechas.calcularMesesAFecha(fechaInicial ,fechaFinal );

}
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

       // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowIconified

    private void lblPeriodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblPeriodoKeyTyped

        // TODO add your handling code here:
    }//GEN-LAST:event_lblPeriodoKeyTyped

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
            java.util.logging.Logger.getLogger(SeleccionarPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionarPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionarPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionarPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionarPeriodo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JTextField lblPeriodo;
    // End of variables declaration//GEN-END:variables

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/Cagliero.png"));
        return retValue;
    }
    public static int idCon;
    public static int numeroCuota;
    public static Contrato datosContrato;
    public static Cuotas datosCuota;
    public static String inicio;
    public static String actual;
}