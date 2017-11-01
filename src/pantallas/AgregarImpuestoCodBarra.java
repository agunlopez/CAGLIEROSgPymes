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
import gestores.fechas;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static pantallas.ImpuestoCompartido.lblIdImpuestoCompartido;
import static pantallas.LiquidacionInquilino.lblPeriodo;

/**
 *
 * @author Nahuel
 */
public class AgregarImpuestoCodBarra extends javax.swing.JFrame {

    /**
     * Creates new form AgregarImpuestos
     */
    public AgregarImpuestoCodBarra() {
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

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCom = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        codBarra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblIdCon = new javax.swing.JLabel();
        lblNumClie = new javax.swing.JTextField();
        lblImporte = new javax.swing.JTextField();
        lblPeriodo = new javax.swing.JTextField();
        comboImpuestos = new javax.swing.JComboBox<>();

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

        jButton2.setText("Cargar Impuesto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Impuesto: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Importe:");

        jLabel5.setText("$");

        lblCom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        codBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codBarraActionPerformed(evt);
            }
        });
        codBarra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codBarraKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Num Cliente:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Codigo de Barra: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Vencimiento:");

        lblIdCon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblNumClie.setEnabled(false);
        lblNumClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNumClieActionPerformed(evt);
            }
        });
        lblNumClie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblNumClieKeyTyped(evt);
            }
        });

        lblImporte.setEnabled(false);
        lblImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblImporteActionPerformed(evt);
            }
        });
        lblImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblImporteKeyTyped(evt);
            }
        });

        lblPeriodo.setEnabled(false);
        lblPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblPeriodoActionPerformed(evt);
            }
        });
        lblPeriodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblPeriodoKeyTyped(evt);
            }
        });

        comboImpuestos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        comboImpuestos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboImpuestosItemStateChanged(evt);
            }
        });
        comboImpuestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboImpuestosMouseClicked(evt);
            }
        });
        comboImpuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboImpuestosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(codBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(ingresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(lblNumClie, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(lblPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lblCom, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel5)
                                .addGap(28, 28, 28)
                                .addComponent(lblImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(comboImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIdCon, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(codBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ingresar))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(lblNumClie)
                    .addComponent(lblPeriodo)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel4))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel5))
                        .addComponent(lblImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(comboImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIdCon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(19, 19, 19)
                .addComponent(lblCom)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        String descripcion= (String) comboImpuestos.getSelectedItem();
            try{
            int r=0;  
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
            Contrato contrato=new Contrato();
            Cuotas cuotas=new Cuotas();
            CuotaImpuesto cuotaImp=new CuotaImpuesto();
            Impuesto impuesto=new Impuesto();

            contrato.setIdContrato(idCon);
            cuotas.setContrato(contrato);
            cuotas.setNroCuota(canmes);        
            impuesto.setIdImpuesto(idImpuesto);
            impuesto.setIdDescripcion(idDesc);
            impuesto.setValor(Double.parseDouble(lblImporte.getText()));
            cuotaImp.setCuotas(cuotas);
            cuotaImp.setImpuesto(impuesto);

            try {
                lblCom.setText(GestoresImpuestos.TraerImpuestoCompartido(idCon, idDesc));
            } catch (SQLException ex) {
                Logger.getLogger(DetallesContrato.class.getName()).log(Level.SEVERE, null, ex);
            }    
            if(lblCom.getText().isEmpty()){
                GestoresImpuestos gestorImp=new GestoresImpuestos();
                GestoresContrato gestorCon=new GestoresContrato();
                r=gestorImp.GestorAltaImpuesto(cuotaImp);
                try {
                    int rr=gestorImp.ActualizarTotalImpuesto(idCon, canmes);

                    int actualizarTotal=gestorCon.ActualizarTotalaPagar(idCon, canmes);
                } catch (SQLException ex) {
                    Logger.getLogger(AgregarImpuestoCodBarra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                Object[] opciones = {"Cargar impuesto compartido", "Cancelar"};
                int eleccion = JOptionPane.showOptionDialog(null, "El impuesto "+ descripcion+ " es compartido","Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE, null, opciones, "Cancelar");
                if (eleccion == JOptionPane.YES_OPTION) {
                    int x=GestoresImpuestos.ultimoIdImpuestoCompartido()+1;
                    String idImp= Integer.toString(x);
                    ImpuestoCompartido impcom = new ImpuestoCompartido();
                    ImpuestoCompartido.lblDescripcion.setText(descripcion);
                    ImpuestoCompartido.importe.setText(lblImporte.getText());
                    ImpuestoCompartido.idPeriodo.setText(actual);
                    ImpuestoCompartido.nroCuota=nroCuota;
                    ImpuestoCompartido.bandera=1;
                    ImpuestoCompartido.idcon=idCon;
                    ImpuestoCompartido.iddes = idDesc;
                    impcom.setLocationRelativeTo(null);
                    impcom.setVisible(true); 
                    dispose();  
                }   
            }
            if(r==1){
                JOptionPane.showMessageDialog(new JDialog(),"Agregado Correctamente");
                lblIdCon.setText("");
                codBarra.setText("");
                lblImporte.setText("");
                lblPeriodo.setText("");
            }
            }catch(NumberFormatException ex){

                JOptionPane.showMessageDialog(new JDialog(),"Inserte un Valor");

            }
//        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        GestoresImpuestos gestorImp=new GestoresImpuestos();
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");     
            String cb = (codBarra.getText());
            int cb2 =0;               
            int tam= 0;
            String cb3="";
            int n=(codBarra.getText().length());
       
            switch(n){
                case 50://API                    
                    partida = (cb.substring(8,25));
                    periodo = (codBarra.getText().substring(33, 39)); 
                    idCon=gestorImp.consultaIdPorTitular(partida,1);
                    if(idCon == 0){
                        JOptionPane.showMessageDialog(new JDialog(),"No se encontro un contrato asociado a este impuesto");
                    }else{
                    idDesc=1;                  
                    actual = periodo.substring(4,6)+"/"+periodo.substring(2,4)+"/"+"20"+periodo.substring(0,2); 
                    Date fechaFinal=dateFormat.parse(actual);                 
                    datosContrato=GestoresContrato.consultaDatosContrato(Integer.parseInt(String.valueOf(idCon)));
                    inicio = (datosContrato.getFechaInicio());
                    String fechaInicio = inicio;
                    Date fechaInicial=dateFormat.parse(fechaInicio);
                    canmes = fechas.calcularMesesAFecha(fechaInicial ,fechaFinal );
                    datosCuotas = gestorCon.consultarCuotaLiquidacion(idCon,canmes );
                    totalPagar = (datosCuotas.getTotalaPagar());
                    lblNumClie.setText(partida);
                    lblPeriodo.setText(actual);
                    descripcion();              
                    cb2 = Integer.parseInt(cb.substring(40,49));                  
                    tam= (String.valueOf(cb2).length());
                    cb3=String.valueOf(cb2);
                    lblImporte.setText(cb3.substring(0,tam-2)+"."+cb3.substring(tam-2,tam));
                    }
                break; 
                    
                case 33: //AGUA
                    
                    partida = (cb.substring(3,11));
                    periodo = (codBarra.getText().substring(11, 17)); 
                    idCon=gestorImp.consultaIdPorTitular(partida,4); 
                    if(idCon == 0){
                        JOptionPane.showMessageDialog(new JDialog(),"No se encontro un contrato asociado a este impuesto");                   
                    }else{
                        idDesc=4;
                        String actualAGUA = periodo.substring(0,2)+"/"+periodo.substring(4,6)+"/"+"20"+periodo.substring(2,4); 
                        Date fechaFinalAGUA=dateFormat.parse(actualAGUA);  
                        datosContrato=GestoresContrato.consultaDatosContrato(Integer.parseInt(String.valueOf(idCon)));
                        inicio = (datosContrato.getFechaInicio());                  
                        String fechaInicioAGUA = inicio;
                        Date fechaInicialAGUA=dateFormat.parse(fechaInicioAGUA);
                        canmes = fechas.calcularMesesAFecha(fechaInicialAGUA ,fechaFinalAGUA );
                        datosCuotas = gestorCon.consultarCuotaLiquidacion(idCon,canmes );
                        totalPagar = (datosCuotas.getTotalaPagar());
                        lblNumClie.setText(partida);
                        lblPeriodo.setText(actualAGUA);
                        descripcion();     
                        cb2 = Integer.parseInt(cb.substring(18,25));                  
                        tam= (String.valueOf(cb2).length());
                        cb3=String.valueOf(cb2);
                        lblImporte.setText(cb3.substring(0,tam-2)+"."+cb3.substring(tam-2,tam));                      
                        }
                break; 
                
                case 44: // GAS
                    partida = lblNumClie.getText();
                    periodo = (codBarra.getText().substring(26, 34)); 
                    idCon=gestorImp.consultaIdPorTitular(partida,5); 
                    if(lblNumClie.getText().isEmpty()){
                        JOptionPane.showMessageDialog(new JDialog(),"Carcar el Numero de Cliente");  
                        lblNumClie.setEnabled(true);
                        lblIdCon.setText("(10 digitos)");
                        jButton2.setEnabled(false);
                    }else{
                        jButton2.setEnabled(true);
                        if(idCon == 0){
                            JOptionPane.showMessageDialog(new JDialog(),"No se encontro un contrato asociado a este impuesto");                   
                        }else{
                            idDesc=5;
                            String actualGAS = periodo.substring(0,2)+"/"+periodo.substring(2,4)+"/"+periodo.substring(4,8); 
                            Date fechaFinalGAS=dateFormat.parse(actualGAS);  
                            datosContrato=GestoresContrato.consultaDatosContrato(Integer.parseInt(String.valueOf(idCon)));
                            inicio = (datosContrato.getFechaInicio());                  
                            String fechaInicioGAS = inicio;
                            Date fechaInicialGAS=dateFormat.parse(fechaInicioGAS);
                            canmes = fechas.calcularMesesAFecha(fechaInicialGAS ,fechaFinalGAS );
                            datosCuotas = gestorCon.consultarCuotaLiquidacion(idCon,canmes );
                            totalPagar = (datosCuotas.getTotalaPagar());
                            lblNumClie.setEnabled(false);
                            lblPeriodo.setText(actualGAS);
                            descripcion();     
                            cb2 = Integer.parseInt(cb.substring(15,26));                  
                            tam= (String.valueOf(cb2).length());
                            cb3=String.valueOf(cb2);
                            lblImporte.setText(cb3.substring(0,tam-2)+"."+cb3.substring(tam-2,tam));                      
                            }  
                    } 
                break;
                
                case 22: // TASA MUNICIPAL - VARIOS
                    partida = (cb.substring(5,9));                   
                    periodo = lblPeriodo.getText(); 
                    idCon=gestorImp.consultaIdPorTitular(partida,2); 
                   
                    if(lblPeriodo.getText().isEmpty()){
                        JOptionPane.showMessageDialog(new JDialog(),"Cargar la fecha de vencimiento(dd/mm/aaaa) y Impuesto");  
                        lblPeriodo.setEnabled(true);
                        jButton2.setEnabled(false);
                        String sql="SELECT * FROM `descripcionimpuesto` WHERE codBarra=21" ;
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
                            String des=(String) comboImpuestos.getSelectedItem();
                            idDesc=(Integer.parseInt(des.substring(0,(des.indexOf("-")-1))));
                    }else{
                        jButton2.setEnabled(true);
                        if(idCon == 0){
                            JOptionPane.showMessageDialog(new JDialog(),"No se encontro un contrato asociado a este impuesto");                   
                        }else{
                            String actual = periodo; 
                            Date fechaFinal=dateFormat.parse(actual);  
                            datosContrato=GestoresContrato.consultaDatosContrato(Integer.parseInt(String.valueOf(idCon)));
                            inicio = (datosContrato.getFechaInicio());                  
                            String fechaInicio = inicio;
                            Date fechaInicial=dateFormat.parse(fechaInicio);
                            canmes = fechas.calcularMesesAFecha(fechaInicial ,fechaFinal );
                            datosCuotas = gestorCon.consultarCuotaLiquidacion(idCon,canmes);
                            totalPagar = (datosCuotas.getTotalaPagar());
                            lblPeriodo.setEnabled(false);
                            lblPeriodo.setText(actual);
                            lblNumClie.setText(partida);
                            cb3=cb.substring(16,21);
                            cb2 = Integer.parseInt(cb.substring(16,21));                  
                            tam= (String.valueOf(cb2).length());
                            cb3=String.valueOf(cb2);
                            lblImporte.setText(cb3.substring(0,tam-2)+"."+cb3.substring(tam-2,tam));                      
                        }  
                    } 
                break;
                
                         
                case 48: // LUZ
                    partida = lblNumClie.getText();
                    periodo = (codBarra.getText().substring(18, 24)); 
                    idCon=gestorImp.consultaIdPorTitular(partida,3); 
                    if(lblNumClie.getText().isEmpty()){
                        JOptionPane.showMessageDialog(new JDialog(),"Carcar el Numero de Cliente");  
                        lblNumClie.setEnabled(true);
                        lblIdCon.setText("(9 digitos)");
                        jButton2.setEnabled(false);
                    }else{
                        jButton2.setEnabled(true);
                        if(idCon == 0){
                            JOptionPane.showMessageDialog(new JDialog(),"No se encontro un contrato asociado a este impuesto");                   
                        }else{
                            idDesc=3;
                            String actual = periodo.substring(0,2)+"/"+periodo.substring(2,4)+"/"+"20"+periodo.substring(4,6); 
                            Date fechaFinal=dateFormat.parse(actual);  
                            datosContrato=GestoresContrato.consultaDatosContrato(Integer.parseInt(String.valueOf(idCon)));
                            inicio = (datosContrato.getFechaInicio());                  
                            String fechaInicio= inicio;
                            Date fechaInicial=dateFormat.parse(fechaInicio);
                            canmes = fechas.calcularMesesAFecha(fechaInicial ,fechaFinal);
                            datosCuotas = gestorCon.consultarCuotaLiquidacion(idCon,canmes);
                            totalPagar = (datosCuotas.getTotalaPagar());
                            lblNumClie.setEnabled(false);
                            lblPeriodo.setText(actual);
                            descripcion();     
                            cb2 = Integer.parseInt(cb.substring(24,36));                  
                            tam= (String.valueOf(cb2).length());
                            cb3=String.valueOf(cb2);
                            lblImporte.setText(cb3.substring(0,tam-2)+"."+cb3.substring(tam-2,tam));                      
                        }  
                    } 
                break;                
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(new JDialog(),"Inserte un Valor");
        
           }catch (ParseException ex) {
            Logger.getLogger(ImpuestoCompartido.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarActionPerformed
private void descripcion(){
    
  String sql="SELECT * FROM `descripcionimpuesto` WHERE idDescripcion = "+idDesc ;
                    ResultSet rs=null;

 try{
                        PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql);
                        rs=pst.executeQuery();
                    while(rs.next()){
                         comboImpuestos.addItem(rs.getString("descripcion"));
                    }


    }catch (SQLException e) {
			JOptionPane.showMessageDialog(new JDialog(),"Error al consultar Impuesto"+e.toString());
        }
             
}
    private void codBarraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codBarraKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_codBarraKeyTyped

    private void codBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codBarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codBarraActionPerformed

    private void lblNumClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNumClieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNumClieActionPerformed

    private void lblNumClieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblNumClieKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNumClieKeyTyped

    private void lblImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImporteActionPerformed

    private void lblImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblImporteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImporteKeyTyped

    private void lblPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPeriodoActionPerformed

    private void lblPeriodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblPeriodoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPeriodoKeyTyped

    private void comboImpuestosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboImpuestosItemStateChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_comboImpuestosItemStateChanged

    private void comboImpuestosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboImpuestosMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_comboImpuestosMouseClicked

    private void comboImpuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboImpuestosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboImpuestosActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarImpuestoCodBarra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarImpuestoCodBarra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarImpuestoCodBarra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarImpuestoCodBarra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarImpuestoCodBarra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codBarra;
    private javax.swing.JComboBox<String> comboImpuestos;
    private javax.swing.JButton ingresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblCom;
    private javax.swing.JLabel lblIdCon;
    private javax.swing.JTextField lblImporte;
    private javax.swing.JTextField lblNumClie;
    private javax.swing.JTextField lblPeriodo;
    // End of variables declaration//GEN-END:variables

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/Cagliero.png"));
        return retValue;
    }
    private int idImpuesto;
    public static int nroCuota;
    public static Contrato datosContrato;
    private int idCon;
    private String partida;
    private String periodo;
    private int idDesc;
    private int cuota;
    private String inicio;
    public static Cuotas datosCuotas;
    GestoresContrato gestorCon=new GestoresContrato();
    public static double totalPagar;
    private int canmes; 
    private String actual;
    
}

