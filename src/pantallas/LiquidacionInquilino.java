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
import gestores.fechas;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import static pantallas.DetallesContrato.tablaDetalle;
import static pantallas.cuotaIncompleta.alquiler;
import static pantallas.cuotaIncompleta.expensas;
import static pantallas.cuotaIncompleta.garantia;
import static pantallas.cuotaIncompleta.impuestos;
import static pantallas.cuotaIncompleta.sellado;

/**
 *
 * @author Nahuel
 */
public class LiquidacionInquilino extends javax.swing.JFrame {

    JDialog reciboInq= new JDialog(new JFrame(),"Recibo",true);
    
    conexion.Conexion con= new conexion.Conexion();

    public static boolean band=false;
    
 
    public LiquidacionInquilino() {
        super();
        initComponents();
        this.setResizable(false);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtMontoaPagar = new javax.swing.JTextField();
        lblPeriodo = new javax.swing.JLabel();
        lblPunitorios = new javax.swing.JLabel();
        lblAlquiler = new javax.swing.JLabel();
        lblTotalaPagar = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaImpuestosLiquidacion = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblGarantia = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTotalPagado = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblPagoParcial = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblExpensas = new javax.swing.JLabel();
        lblSellado = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Liquidacion Inquilino");
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Periodo: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Alquiler: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Punitorios: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Impuestos: ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Total a Pagar: ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Monto a Pagar: ");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Generar Liquidacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtMontoaPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoaPagarKeyTyped(evt);
            }
        });

        lblPeriodo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPunitorios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblAlquiler.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTotalaPagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton2.setText("Calcular Punitorios");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tablaImpuestosLiquidacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripcion", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaImpuestosLiquidacion);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Garantia: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Descuento: ");

        lblGarantia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblDescuento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Total Pagado:");

        lblTotalPagado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalPagado.setText("jLabel8");

        jLabel8.setText("Todos los valores se representan el ($) Peso Argentino");

        lblPagoParcial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPagoParcial.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Sellado: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Expensas: ");

        lblExpensas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblExpensas.setText("jLabel8");

        lblSellado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSellado.setText("jLabel8");

        jButton3.setText("Asignar montos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel7))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDescuento)
                                            .addComponent(lblGarantia))
                                        .addGap(169, 169, 169)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblSellado))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblExpensas))))
                                    .addComponent(lblTotalPagado)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTotalaPagar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPagoParcial))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAlquiler)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblPunitorios)
                                                .addGap(49, 49, 49)
                                                .addComponent(jButton2))
                                            .addComponent(lblPeriodo)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMontoaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(78, 78, 78)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblPeriodo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblAlquiler))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblPunitorios)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblGarantia))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblDescuento)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblSellado))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblExpensas))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblTotalPagado))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(lblTotalaPagar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblPagoParcial)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMontoaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3))
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static double monto = 0;
public static String peri;
public static double total=0;
public static double totalAlquiler=0;
public static double totalSellado=0;
public static double totalExpensas=0;
public static double totalImpuestos=0;
public static double totalGarantia=0;
public static boolean bandera=true;


    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated



        cuotaActual=GestoresContrato.ConsultarCuotaActual(Integer.parseInt(DetallesContrato.lblIdContrato.getText()));
        Cuotas cuota=new Cuotas();
        cuota=GestoresContrato.consultarCuotaLiquidacion(Integer.parseInt(DetallesContrato.lblIdContrato.getText()), cuotaActual);
        lblPeriodo.setText((String) DetallesContrato.tablaDetalle.getValueAt((cuotaActual-1), 0));
        lblAlquiler.setText(Integer.toString(cuota.getValorCuota()));
        lblPunitorios.setText(Double.toString(cuota.getPunitorios()));
        lblGarantia.setText(Double.toString(cuota.getValorGarantia()));
        lblDescuento.setText("("+Double.toString(cuota.getDescuento())+")");
        lblTotalPagado.setText(Double.toString(cuota.getTotalPagado()));
        lblTotalaPagar.setText(Double.toString(cuota.getTotalaPagar()));
        double txtTotal=cuota.getTotalaPagar();
        lblPagoParcial.setText(cuota.getPagoParcial());
        lblSellado.setText(Double.toString(cuota.getTotalSellado()));
        lblExpensas.setText(Double.toString(cuota.getExpensas()));
        total= cuota.getTotalaPagar();
        totalAlquiler= cuota.getValorCuota();
        totalExpensas= cuota.getExpensas();
        totalGarantia= cuota.getValorGarantia();
        totalImpuestos= cuota.getTotalImpuestos();
        totalSellado= cuota.getTotalSellado();

        
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//this.setCursor(Cursor.WAIT_CURSOR);
    cuotaIncompleta incompleta = new cuotaIncompleta();
    Cuotas cuota=new Cuotas();
    double pagado= Double.parseDouble(lblTotalPagado.getText());
    
    if(bandera==true){
        
//           monto=Double.parseDouble(txtMontoaPagar.getText());
        if(txtMontoaPagar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(new JDialog(),"Monto a pagar no puede estar vacio");
        }else if(Double.parseDouble(txtMontoaPagar.getText())==0){
            JOptionPane.showMessageDialog(new JDialog(),"Monto a pagar no puede ser cero"); 
        }else if(Double.parseDouble(txtMontoaPagar.getText())< Double.parseDouble(lblTotalaPagar.getText())&&incompleta.total==0 || (pagado != 0)){
                    
                    
            Object[] opciones = {"Asignar montos", "Cancelar"};
            int eleccion = JOptionPane.showOptionDialog(null, "Faltar asignar montos, debe asignar los montos","Mensaje de Confirmacion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE, null, opciones, "Cancelar");
            if (eleccion == JOptionPane.YES_OPTION) {
                String Periodo= (String) lblPeriodo.getText();  
                incompleta.id.setText(Integer.toString(PrincipalAdministrador.idConsAsociado) );
                incompleta.periodo.setText(Periodo);
                incompleta.setLocationRelativeTo(null);
                monto=Double.parseDouble(txtMontoaPagar.getText());  
                bandera=false;
                incompleta.setVisible(true);  
            }   
        }else{
                    bandera=true;
                    GenerarLiquidacion();
        }  
    }else{
            txtMontoaPagar.setText(Double.toString(incompleta.total));
            bandera=true;
            GenerarLiquidacion();
    }
  

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");       
        Calendar ahora= Calendar.getInstance();
        int diaActual=ahora.get(Calendar.DATE);
        int mesActual=ahora.get((Calendar.MONTH))+1;
        int añoActual=ahora.get(Calendar.YEAR);
        int mesV = 0;
        String[] meses = {"Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sept","Oct","Nov","Dic"};
        for(int i=0;i<meses.length;i++){
            if(meses[i].equals(lblPeriodo.getText().substring(0,3))){
                mesV=i+1;
            }
        }
        String vencimiento = PrincipalAdministrador.diaPago+"/"+mesV+"/"+lblPeriodo.getText().substring(4,8);
        String actual = mesActual+"/"+añoActual;
 
        int dias;
        try {
            dias = fechas.cantidadDias(vencimiento,actual );           
            if(dias>0){
                GestoresContrato gestPun=new GestoresContrato();
                if(DetallesContrato.datosContrato.getPunitorios()>1){
                    double punitorio=dias+DetallesContrato.datosContrato.getPunitorios();                  
                    Object[] opciones = {"Aceptar", "Cancelar"};
                    int eleccion = JOptionPane.showOptionDialog(null, "Desea agregar el total de: "+punitorio+" en concepto de Punitorios?","Mensaje de Confirmacion",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE, null, opciones, "Cancelar");
                    if (eleccion == JOptionPane.YES_OPTION) {           
                        int r = gestPun.ActualizarPunitorios(DetallesContrato.datosContrato.getIdContrato(),punitorio, DetallesContrato.datosContrato.getCuotaActual() );                  
                        double total=punitorio+Double.parseDouble(lblTotalaPagar.getText());
                        gestPun.ActualizarTotalaPagar(DetallesContrato.datosContrato.getIdContrato(), DetallesContrato.datosContrato.getCuotaActual());
                        if(r==1){
                            JOptionPane.showMessageDialog(new JDialog(),"Punitorios Actualizados: "+punitorio);
                        }
                    }                                                                
                }else{
                    double punitorio=(Double.parseDouble(lblAlquiler.getText())*DetallesContrato.datosContrato.getPunitorios())*dias;
                    
                    Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(null, "Desea agregar el total de: "+punitorio+" en concepto de Punitorios?","Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE, null, opciones, "Cancelar");
        if (eleccion == JOptionPane.YES_OPTION) {
            
            int r = gestPun.ActualizarPunitorios(DetallesContrato.datosContrato.getIdContrato(),punitorio, DetallesContrato.datosContrato.getCuotaActual() );
                   double total=punitorio+Double.parseDouble(lblTotalaPagar.getText());
                   gestPun.ActualizarTotalaPagar(DetallesContrato.datosContrato.getIdContrato(), DetallesContrato.datosContrato.getCuotaActual());
                   if(r==1){
                       JOptionPane.showMessageDialog(new JDialog(),"Punitorios Actualizados: "+punitorio);
                   }
        }else{
            dispose();
        }
        
        
                   
                }
            }else{
                JOptionPane.showMessageDialog(new JDialog(),"La Cuota no esta Vencida");
            }
            
        } catch (ParseException ex) {
            Logger.getLogger(LiquidacionInquilino.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LiquidacionInquilino.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtMontoaPagarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoaPagarKeyTyped

char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
        }   
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoaPagarKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//     monto=Double.parseDouble(txtMontoaPagar.getText());
      if(bandera==true){
             if(txtMontoaPagar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(new JDialog(),"Monto a pagar no puede estar vacio");
            
        }else if(Double.parseDouble(txtMontoaPagar.getText())==0){
            JOptionPane.showMessageDialog(new JDialog(),"Monto a pagar no puede ser cero");
           
        }else if(Double.parseDouble(txtMontoaPagar.getText()) > Double.parseDouble(lblTotalaPagar.getText()) ){    
             JOptionPane.showMessageDialog(new JDialog(),"Monto a pagar no puede ser mayor al total a pagar");
        }else{
            peri=(String) lblPeriodo.getText(); 
            String Periodo= (String) lblPeriodo.getText();  
            cuotaIncompleta incompleta = new cuotaIncompleta();
            incompleta.id.setText(Integer.toString(PrincipalAdministrador.idConsAsociado) );
            incompleta.periodo.setText(Periodo);
            incompleta.setLocationRelativeTo(null);
            bandera = false;
            monto=Double.parseDouble(txtMontoaPagar.getText());
            incompleta.setVisible(true);
            // TODO add your handling code here:
        } 
      } else{
           JOptionPane.showMessageDialog(new JDialog(),"Ya se asignaron los montos");
      } 
                      
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(LiquidacionInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LiquidacionInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LiquidacionInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LiquidacionInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LiquidacionInquilino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAlquiler;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblExpensas;
    private javax.swing.JLabel lblGarantia;
    private javax.swing.JLabel lblPagoParcial;
    public static javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblPunitorios;
    private javax.swing.JLabel lblSellado;
    private javax.swing.JLabel lblTotalPagado;
    private javax.swing.JLabel lblTotalaPagar;
    public static javax.swing.JTable tablaImpuestosLiquidacion;
    public static javax.swing.JTextField txtMontoaPagar;
    // End of variables declaration//GEN-END:variables

    
    
    public static int cuotaActual;
    
  
    public void GenerarLiquidacion(){
        Cuotas cuota=new Cuotas();
         Movimiento movimiento=new Movimiento();
           double to=0;
            to=total;
            double tal=0;
            tal=Double.parseDouble(txtMontoaPagar.getText());
//     txtMontoaPagar.setText(Double.toString(monto));

         if(Double.parseDouble(lblTotalaPagar.getText()) >= Double.parseDouble(txtMontoaPagar.getText())){     
//             if(movimiento.getAsignacion().equals("A") ){
             double pagado=GestoresContrato.totalPagado(cuotaActual, Integer.parseInt(DetallesContrato.lblIdContrato.getText()));
                if(Double.parseDouble(lblTotalaPagar.getText()) == Double.parseDouble(txtMontoaPagar.getText())){               
                    double totalPagado=Double.parseDouble(txtMontoaPagar.getText())+pagado;
                    GestoresContrato gestorContrato=new GestoresContrato();
                    gestorContrato.GenerarLiquidacion(totalPagado, cuotaActual,Integer.parseInt(DetallesContrato.lblIdContrato.getText()));
                    int nuevaCuota=cuotaActual+1;
                    gestorContrato.ActualizarCuotaActual(nuevaCuota,Integer.parseInt(DetallesContrato.lblIdContrato.getText()));

                }else{
                    double totalPagado=Double.parseDouble(txtMontoaPagar.getText())+pagado;               
                    GestoresContrato gestorContrato=new GestoresContrato();              
                    gestorContrato.GenerarLiquidacion(totalPagado, cuotaActual,Integer.parseInt(DetallesContrato.lblIdContrato.getText()));
                       movimiento.setAsignacion("B");
                   }      
            
             
            
           
            Contrato contrato=new Contrato();
            Calendar ahora= Calendar.getInstance();
            cuotaIncompleta inc= new cuotaIncompleta();

            int diaActual=ahora.get(Calendar.DATE);
            int mesActual=ahora.get((Calendar.MONTH))+1;
            int añoActual=ahora.get(Calendar.YEAR);
            
            contrato.setIdContrato(Integer.parseInt(DetallesContrato.lblIdContrato.getText()));
            cuota.setNroCuota(cuotaActual);
            
            movimiento.setContrato(contrato);
            movimiento.setContratoCuota(cuota);
            movimiento.setFecha(diaActual+"/"+mesActual+"/"+añoActual);
            movimiento.setTipoMovimiento("I");
            movimiento.setValorMovimiento(Double.parseDouble(txtMontoaPagar.getText()));
            movimiento.setHonorarios(0);
            movimiento.setFecha(diaActual+"/"+mesActual+"/"+añoActual);
         
            double pago= Double.parseDouble(lblTotalPagado.getText());
            if(Double.parseDouble(txtMontoaPagar.getText())< Double.parseDouble(lblTotalaPagar.getText()) || (pago != 0)){
                movimiento.setAlquileresPagos(inc.alquilerPago);
                movimiento.setImpuestosPagos(inc.impuestoPago);
                movimiento.setSelladosPagos(inc.selladoPago);
                movimiento.setGarantiaPagos(inc.garantiaPaga);
                movimiento.setExpensasPagas(inc.expensaPaga);
            }else{
                movimiento.setAlquileresPagos(totalAlquiler);
                movimiento.setImpuestosPagos(totalImpuestos);
                movimiento.setSelladosPagos(totalSellado);
                movimiento.setGarantiaPagos(totalGarantia);
                movimiento.setExpensasPagas(totalExpensas);
               
            }
            
            GestorMovimientos gestorIngreso=new GestorMovimientos();
            GestoresContrato gestorContrato=new GestoresContrato();
             try {
                
     
                 Eventos evento=new Eventos();            
                 evento.setUsuario(InicioSesion.usuarioEnSesion);
                 evento.setTipo("MOVIMIENTO");
                 evento.setDescipcion("Se registro el cobro de la cuota "+movimiento.getContratoCuota().getNroCuota()+" del contrato "+movimiento.getContrato().getIdContrato()+" por $"+movimiento.getValorMovimiento());
                 evento.setFecha(GestorEventos.getFechaActual());
                 gestorContrato.ActualizarTotalaPagar(Integer.parseInt(DetallesContrato.lblIdContrato.getText()),cuotaActual);
                 gestorIngreso.AltaIngreso(movimiento);
                 int recibo=gestorIngreso.numeroRecibo();
                 int e=GestorEventos.AltaEvento(evento);
                 JOptionPane.showMessageDialog(new JDialog(),"La liquidacion se cargo correctamente"); 
                 conexion.ConexionReporte con=new conexion.ConexionReporte();
                

//        try{
//            
//            Map parametro=new HashMap();
//            
//            parametro.put("Recibo",recibo); 
////            JasperReport reciboInquilino=JasperCompileManager.compileReport("C"esktop\\SM Inmobiliaria\\src\\Recibos\\reciboInq.jrxml");           
////            JasperPrint jasperPrint=JasperFillManager.fillReport(reciboInquilino, parametro, con.conexion());
//            
//            
//            reciboInq.setSize(1000,700);
//            reciboInq.setLocationRelativeTo(null);
//            JRViewer jrv=new JRViewer(jasperPrint);
//            reciboInq.getContentPane().add(jrv);
//            reciboInq.setVisible(true);
//        } catch (JRException ex) {
//            Logger.getLogger(PrincipalAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        
               
                 
             } catch (IOException ex) {
                 Logger.getLogger(LiquidacionInquilino.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(LiquidacionInquilino.class.getName()).log(Level.SEVERE, null, ex);
             }
             
//          }
              dispose();
            
            }else{
            JOptionPane.showMessageDialog(new JDialog(),"El monto a pagar no puede ser mayor al total");
            
        }
         
    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/SM.png"));
        return retValue;
    }
}
