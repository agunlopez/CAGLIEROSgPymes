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
import entidades.Impuesto;
import gestores.GestoresContrato;
import gestores.GestoresImpuestos;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Nahuel
 */
public class AgregarImpuestoCuota extends javax.swing.JFrame {

    /**
     * Creates new form AgregarImpuestos
     */
    public AgregarImpuestoCuota() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboImpuestos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        importeImpuesto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        idPeriodo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnImpuestoCompartido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Impuesto");
        setIconImage(getIconImage());
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jButton1.setText("Finalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Impuesto: ");

        comboImpuestos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Importe:");

        importeImpuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                importeImpuestoKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        idPeriodo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(idPeriodo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idPeriodo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("$");

        btnImpuestoCompartido.setText("Impuesto Compartido");
        btnImpuestoCompartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpuestoCompartidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnImpuestoCompartido, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(importeImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importeImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImpuestoCompartido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        String sql="SELECT * FROM `descripcionimpuesto` ORDER BY `idDescripcion` ASC";
        ResultSet rs=null;
        try{
            PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql);
            rs=pst.executeQuery();
            
            while(rs.next()){
                comboImpuestos.addItem(rs.getString("idDescripcion")+" - "+rs.getString("descripcion"));
            }
            
            
        }catch (SQLException e) {
			JOptionPane.showMessageDialog(new JDialog(),"Error al consultar Impuesto"+e.toString());
        }
        


        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        try{
            
        
        String sql2="SELECT * FROM `impuesto`ORDER BY idImpuesto DESC LIMIT 1";
        ResultSet rs2=null;
        try{
            PreparedStatement pst2=Conexion.getConexionn().prepareStatement(sql2);
            rs2=pst2.executeQuery();            
            while(rs2.next()){
                 idImpuesto=Integer.parseInt(rs2.getString("idImpuesto"))+1;
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(new JDialog(),"Error al consultar Impuesto"+e.toString());
        }
        
        String descripcion=(String) comboImpuestos.getSelectedItem();
        
        Contrato contrato=new Contrato();
        Cuotas cuotas=new Cuotas();
        CuotaImpuesto cuotaImp=new CuotaImpuesto();
        Impuesto impuesto=new Impuesto();
        
        contrato.setIdContrato(Integer.parseInt(idPeriodo.getText().substring(0, idPeriodo.getText().indexOf("-")-1)));
        
        cuotas.setContrato(contrato);
        cuotas.setNroCuota(nroCuota);        
        
        impuesto.setIdImpuesto(idImpuesto);
        impuesto.setIdDescripcion(Integer.parseInt(descripcion.substring(0,(descripcion.indexOf("-")-1))));
        impuesto.setValor(Double.parseDouble(importeImpuesto.getText()));
        
        cuotaImp.setCuotas(cuotas);
        cuotaImp.setImpuesto(impuesto);
        
        
        GestoresImpuestos gestorImp=new GestoresImpuestos();
        GestoresContrato gestorCon=new GestoresContrato();
        int r=gestorImp.GestorAltaImpuesto(cuotaImp);
        try {
            int rr=gestorImp.ActualizarTotalImpuesto(cuotaImp.getCuotas().getContrato().getIdContrato(), nroCuota);
            
            int actualizarTotal=gestorCon.ActualizarTotalaPagar(cuotaImp.getCuotas().getContrato().getIdContrato(), nroCuota);
        } catch (SQLException ex) {
            Logger.getLogger(AgregarImpuestoCuota.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        if(r==1){
            
            
            JOptionPane.showMessageDialog(new JDialog(),"Agregado Correctamente");
            importeImpuesto.setText(" ");
            comboImpuestos.removeAllItems();
        }
        }catch(NumberFormatException ex){
            
            JOptionPane.showMessageDialog(new JDialog(),"Inserte un Valor");

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void importeImpuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_importeImpuestoKeyTyped

        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
        }
         if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.' && importeImpuesto.getText().contains(".")){
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_importeImpuestoKeyTyped

    private void btnImpuestoCompartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpuestoCompartidoActionPerformed

        ImpuestoCompartido impcom = new ImpuestoCompartido();
   impcom.setVisible(true); 
          // TODO add your handling code here:
    }//GEN-LAST:event_btnImpuestoCompartidoActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarImpuestoCuota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarImpuestoCuota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarImpuestoCuota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarImpuestoCuota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarImpuestoCuota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImpuestoCompartido;
    private javax.swing.JComboBox<String> comboImpuestos;
    public static javax.swing.JLabel idPeriodo;
    private javax.swing.JTextField importeImpuesto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/SM.png"));
        return retValue;
    }
    private int idImpuesto;
    public static int nroCuota;
}

