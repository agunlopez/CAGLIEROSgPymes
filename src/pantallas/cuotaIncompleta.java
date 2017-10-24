/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Usuarios.InicioSesion;
import entidades.Contrato;
import entidades.Cuotas;
import entidades.Eventos;
import entidades.Movimiento;
import gestores.GestorEventos;
import gestores.GestorMovimientos;
import gestores.GestoresContrato;
import gestores.GestoresImpuestos;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import modelos.ModeloTablaImpuesto;
import modelos.ModeloTablaPagosRealizados;
import static pantallas.LiquidacionInquilino.cuotaActual;
import static pantallas.LiquidacionInquilino.lblPeriodo;

/**
 *
 * @author Nahuel
 */
public class cuotaIncompleta extends javax.swing.JFrame {

    /**
     * Creates new form Descuento
     */
    public cuotaIncompleta() {
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
        alquiler = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        periodo = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sellado = new javax.swing.JTextField();
        impuestos = new javax.swing.JTextField();
        garantia = new javax.swing.JTextField();
        expensas = new javax.swing.JTextField();
        lblAlquiler = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblSellado = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblImpuestos = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblGarantia = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblExpensas = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPagos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asignar Liquidacion");
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Sellado: ");

        alquiler.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alquiler.setText("0");
        alquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alquilerActionPerformed(evt);
            }
        });
        alquiler.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                alquilerKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setLabel("Asignar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        periodo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        periodo.setText("Expensas");

        id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(id)
                .addGap(18, 18, 18)
                .addComponent(periodo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(periodo)
                    .addComponent(id))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("$");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Alquiler (mas punitorios):");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Total Impuestos: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Garantia:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Expensas ");

        sellado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sellado.setText("0");
        sellado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selladoActionPerformed(evt);
            }
        });
        sellado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                selladoKeyTyped(evt);
            }
        });

        impuestos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        impuestos.setText("0");
        impuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impuestosActionPerformed(evt);
            }
        });
        impuestos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                impuestosKeyTyped(evt);
            }
        });

        garantia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        garantia.setText("0");
        garantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                garantiaActionPerformed(evt);
            }
        });
        garantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                garantiaKeyTyped(evt);
            }
        });

        expensas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        expensas.setText("0");
        expensas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expensasActionPerformed(evt);
            }
        });
        expensas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                expensasKeyTyped(evt);
            }
        });

        lblAlquiler.setText("jLabel7");

        jLabel8.setText("$");

        lblSellado.setText("jLabel7");

        jLabel10.setText("$");

        lblImpuestos.setText("jLabel7");

        jLabel12.setText("$");

        lblGarantia.setText("jLabel7");

        jLabel14.setText("$");

        lblExpensas.setText("jLabel7");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Monto a distribuir:");

        lblMonto.setText("jLabel7");

        jLabel9.setText("$");

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pagos Realizados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tablaPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaPagos);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblExpensas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(expensas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblGarantia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(garantia, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblSellado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sellado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblAlquiler)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                        .addComponent(alquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblImpuestos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(impuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMonto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(lblMonto))
                        .addGap(30, 30, 30)
                        .addComponent(alquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblAlquiler))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sellado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(lblSellado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(impuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(lblImpuestos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(garantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(lblGarantia))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(expensas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(lblExpensas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public static double total=0;
 public static double montoPagado;
 public static double alquilerPago;
 public static double selladoPago;
 public static double expensaPaga;
 public static double impuestoPago;
 public static double garantiaPaga;
 public static boolean ban = true;
 
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

  
        
        GenerarAsignaciones();

    }//GEN-LAST:event_jButton2ActionPerformed

      public void GenerarAsignaciones(){
        Cuotas cuota=new Cuotas();
        ban=false;
        montoPagado=Double.parseDouble(lblMonto.getText());
        if(alquiler.getText().isEmpty()){
            alquiler.setText("0");
        }
        if(sellado.getText().isEmpty()){
            sellado.setText("0");
        }
        if(impuestos.getText().isEmpty()){
            impuestos.setText("0");
        }
        if(garantia.getText().isEmpty()){
            garantia.setText("0");
        }
        if(expensas.getText().isEmpty()){
            expensas.setText("0");
        }
        
        total= Double.parseDouble(alquiler.getText())+Double.parseDouble(sellado.getText())+Double.parseDouble(impuestos.getText())+Double.parseDouble(garantia.getText())+Double.parseDouble(expensas.getText());

         if(Double.parseDouble(lblMonto.getText()) == total ){ 
             if((Integer.parseInt(alquiler.getText()) <= ( Double.parseDouble(lblAlquiler.getText())))) {
                
                if (Double.parseDouble(sellado.getText())<= ( Double.parseDouble(lblSellado.getText()))) {  

                if (Double.parseDouble(impuestos.getText())<=  ( Double.parseDouble(lblImpuestos.getText()))){

                if (Double.parseDouble(garantia.getText())<= (Double.parseDouble(lblGarantia.getText()))){                        

                if (Double.parseDouble(expensas.getText())<= ( Double.parseDouble(lblExpensas.getText()))){
                 
  
             
             
                    Movimiento movimiento=new Movimiento();

                    Contrato contrato=new Contrato();
                    Calendar ahora= Calendar.getInstance();

                    int diaActual=ahora.get(Calendar.DATE);
                    int mesActual=ahora.get((Calendar.MONTH))+1;
                    int añoActual=ahora.get(Calendar.YEAR);


//
//                    movimiento.setContrato(contrato);
//                    movimiento.setContratoCuota(cuota);
//                    movimiento.setTipoMovimiento("I");
//                    movimiento.setHonorarios(0);
//                    movimiento.setFecha(diaActual+"/"+mesActual+"/"+añoActual);
//                    movimiento.setAlquileresPagos(Double.parseDouble(alquiler.getText()));
//                    movimiento.setImpuestosPagos(Double.parseDouble(impuestos.getText()));
//                    movimiento.setSelladosPagos(Double.parseDouble(sellado.getText()));
//                    movimiento.setGarantiaPagos(Double.parseDouble(garantia.getText()));
//                    movimiento.setExpensasPagas(Double.parseDouble(expensas.getText()));

                    alquilerPago=Double.parseDouble(alquiler.getText());
                    selladoPago=(Double.parseDouble(sellado.getText()));
                    garantiaPaga=(Double.parseDouble(garantia.getText()));
                    impuestoPago=Double.parseDouble(impuestos.getText());
                    expensaPaga=Double.parseDouble(expensas.getText());



//                    GestorMovimientos gestorIngreso=new GestorMovimientos();

//                     try {
//
//                         movimiento.setAsignacion("A");
////                         gestorIngreso.AltaIngreso(movimiento);
//                         int recibo=gestorIngreso.numeroRecibo();
//
//
//                     } catch (IOException ex) {
//                         Logger.getLogger(LiquidacionInquilino.class.getName()).log(Level.SEVERE, null, ex);
//                     } catch (SQLException ex) {
//                         Logger.getLogger(LiquidacionInquilino.class.getName()).log(Level.SEVERE, null, ex);
//                     }

                    JOptionPane.showMessageDialog(new JDialog(),"Los valores se asignaron correctamente");
                    dispose();
            
                }else{
                    JOptionPane.showMessageDialog(new JDialog(),"Los montos asignados no pueden ser mayor a los montos de la cuota");

                }
                }else{
                    JOptionPane.showMessageDialog(new JDialog(),"Los montos asignados no pueden ser mayor a los montos de la cuota");

                }
                }else{
                    JOptionPane.showMessageDialog(new JDialog(),"Los montos asignados no pueden ser mayor a los montos de la cuota");

                }
                }else{
                    JOptionPane.showMessageDialog(new JDialog(),"Los montos asignados no pueden ser mayor a los montos de la cuota");
                }
        
                }else{
                    JOptionPane.showMessageDialog(new JDialog(),"Los montos asignados no pueden ser mayor a los montos de la cuota");
            
                }
         }else{ 
                
                 JOptionPane.showMessageDialog(new JDialog(),"El total asignado debe ser igual al monto total");
        }       
  }
    private void alquilerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alquilerKeyTyped

 if(!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.' && alquiler.getText().contains(".")){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_alquilerKeyTyped

    private void alquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alquilerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alquilerActionPerformed

    private void selladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selladoActionPerformed

    private void selladoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selladoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_selladoKeyTyped

    private void impuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impuestosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_impuestosActionPerformed

    private void impuestosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_impuestosKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_impuestosKeyTyped

    private void garantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_garantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_garantiaActionPerformed

    private void garantiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_garantiaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_garantiaKeyTyped

    private void expensasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expensasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expensasActionPerformed

    private void expensasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_expensasKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_expensasKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated


        cuotaActual=GestoresContrato.ConsultarCuotaActual(Integer.parseInt(DetallesContrato.lblIdContrato.getText()));
        double expensas=0;
        double impuestos=0;
        double garantia=0;
        double sellado=0;
        double alquiler=0;
        Cuotas cuota=new Cuotas();
        Cuotas cuota2=new Cuotas();
        Movimiento mov=new Movimiento();
        LiquidacionInquilino liq = new LiquidacionInquilino();
        String Periodo= (String) liq.lblPeriodo.getText();
//        ArrayList movim =GestorMovimientos.consultaPagados(Integer.parseInt(DetallesContrato.lblIdContrato.getText()), cuotaActual);
        cuota2=GestoresContrato.consultarPagadosLiquidacion(Integer.parseInt(DetallesContrato.lblIdContrato.getText()), cuotaActual);
        cuota=GestoresContrato.consultarCuotaLiquidacion(Integer.parseInt(DetallesContrato.lblIdContrato.getText()), cuotaActual);

//        for(int i=0; i<movim.size() ;i++){
//           Alqui= 
//                   
//        }
    
        ArrayList<Movimiento> Movimien=GestorMovimientos.consultaPagosRealizados(Integer.parseInt(DetallesContrato.lblIdContrato.getText()),cuotaActual);
                        ModeloTablaPagosRealizados modelo=new ModeloTablaPagosRealizados(Movimien);
                        tablaPagos.setModel(modelo);
                    
              for(int i=0; i<tablaPagos.getRowCount();i++){
                String ex=tablaPagos.getValueAt(i,3).toString();
                String imp=tablaPagos.getValueAt(i,1).toString();
                String gar=tablaPagos.getValueAt(i,4).toString();
                String sell=tablaPagos.getValueAt(i,2).toString();
                String alq=tablaPagos.getValueAt(i,0).toString();
       
                expensas=expensas+Double.parseDouble(ex);
        
                impuestos=impuestos+Double.parseDouble(imp);

                garantia=garantia+Double.parseDouble(gar);

                sellado=sellado+Double.parseDouble(sell);

                alquiler=alquiler+Double.parseDouble(alq);
           
            }    
        int intvalue= (int) alquiler;
        int punitorios= (int) cuota.getPunitorios();
              
        lblPeriodo.setText((String) DetallesContrato.tablaDetalle.getValueAt((cuotaActual-1), 0));
        lblAlquiler.setText(Integer.toString(cuota.getValorCuota() + punitorios - intvalue));
        lblGarantia.setText(Double.toString(cuota.getValorGarantia()-garantia));
        lblMonto.setText(Double.toString(liq.monto));
        lblSellado.setText(Double.toString(cuota.getTotalSellado()-sellado));
        lblImpuestos.setText(Double.toString(cuota.getTotalImpuestos()-impuestos));
        lblExpensas.setText(Double.toString(cuota.getExpensas()-expensas));
        
        
        
        


        
  
            // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(cuotaIncompleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cuotaIncompleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cuotaIncompleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cuotaIncompleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cuotaIncompleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField alquiler;
    public static javax.swing.JTextField expensas;
    public static javax.swing.JTextField garantia;
    public static javax.swing.JLabel id;
    public static javax.swing.JTextField impuestos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlquiler;
    private javax.swing.JLabel lblExpensas;
    private javax.swing.JLabel lblGarantia;
    private javax.swing.JLabel lblImpuestos;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblSellado;
    public static javax.swing.JLabel periodo;
    public static javax.swing.JTextField sellado;
    private javax.swing.JTable tablaPagos;
    // End of variables declaration//GEN-END:variables

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/Cagliero.png"));
        return retValue;
    }

    public static int numeroCuota;
}
