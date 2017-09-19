/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import conexion.Conexion;
import entidades.Cliente;
import entidades.Contrato;
import entidades.Cuotas;
import entidades.Inmueble;
import entidades.Movimiento;
import entidades.PropietarioPago;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Nahuel
 */
public class GestorMovimientos {
    
    public int AltaIngreso(Movimiento ingreso)throws IOException{
        int r=0;
        String sql="INSERT INTO `movimientos`(`tipoMov`, `valorMov`, `fecha`, `idContrato`, `nroCuota`,honorariosCobrados,`alquilerPago`,`expensasPagas`,`selladoPago`,`impuestoPago`,`garantiaPaga` )"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql);
           
            pst.setString(1, ingreso.getTipoMovimiento());
            pst.setDouble(2, ingreso.getValorMovimiento());
            pst.setString(3,ingreso.getFecha());
            pst.setInt(4, ingreso.getContrato().getIdContrato());
            pst.setInt(5, ingreso.getContratoCuota().getNroCuota());
            pst.setDouble(6, ingreso.getHonorarios());
            pst.setDouble(7, ingreso.getAlquileresPagos());
            pst.setDouble(8, ingreso.getExpensasPagas());
            pst.setDouble(9, ingreso.getSelladosPagos());
            pst.setDouble(10, ingreso.getImpuestosPagos());
            pst.setDouble(11, ingreso.getGarantiaPagos());
            
            r=pst.executeUpdate();
            
            

            
        }catch(SQLException e){
	JOptionPane.showMessageDialog(new JDialog(),"Error al Registrar el Ingreso"+e.toString());}
        return r;
    }
    
    public static ArrayList<Movimiento> consultaTabla(){
       ArrayList<Movimiento> listaMovimientos=new ArrayList<Movimiento>();
       Movimiento mov=null;
       Inmueble inm=null;
       Cliente prop=null;
       Cliente inq=null;
       Contrato contrato=null;
       Cuotas cuota=null;
       
       ResultSet rs=null;
       
       String sql2="SELECT movimientos.*,cuota.totalImpuestos,cuota.totalPagado,cuota.totalSellado,cuota.valorGarantia,cuota.expensas,inmueble.calle,inmueble.piso,inmueble.dpto,"
               +"prop.apellido,prop.nombre,inq.apellido,inq.nombre " 
               +"FROM `movimientos` INNER JOIN contrato on movimientos.idContrato=contrato.idContrato "
               +"INNER JOIN inmueble on contrato.idInmueble=inmueble.idInmueble " 
               +"INNER JOIN cliente as prop on inmueble.idPropietario=prop.idCliente " 
               +"INNER JOIN cliente as inq on contrato.idInquilino=inq.idCliente  " 
               +"INNER JOIN contratocuota as cuota on contrato.idContrato=cuota.idContrato";

       String sql="SELECT movimientos.fecha,inmueble.calle,inmueble.numero,inmueble.piso,inmueble.dpto,prop.apellido,prop.nombre,inq.apellido,inq.nombre,movimientos.ingreso"
               + ",movimientos.egreso FROM `movimientos`,inmueble,cliente as prop,cliente as inq"
               + " WHERE movimientos.idInmueble=inmueble.idInmueble and movimientos.idInquilino=inq.idCliente and movimientos.idPropietario=prop.idCliente";
       
       try{
           PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql2);
			rs=pst.executeQuery();

			while(rs.next()){
                            mov=new Movimiento();
                            inm=new Inmueble();
                            prop=new Cliente();
                            inq=new Cliente();
                            contrato=new Contrato();
                            cuota=new Cuotas();
                            
                            inm.setCalle(rs.getString("inmueble.calle"));
                            inm.setPiso(rs.getString("inmueble.piso"));
                            inm.setDpto(rs.getString("inmueble.dpto")); 
                            prop.setApellido(rs.getString("prop.apellido"));
                            prop.setNombre(rs.getString("prop.nombre"));
                            inm.setPropietario(prop);
                            inq.setApellido(rs.getString("inq.apellido"));
                            inq.setNombre(rs.getString("inq.nombre"));
                            
                            contrato.setIdContrato(Integer.parseInt(rs.getString("movimientos.idContrato")));
                            contrato.setInmueble(inm);
                            contrato.setInquilino(inq);
                            cuota.setNroCuota(Integer.parseInt(rs.getString("movimientos.nroCuota")));;
                            cuota.setExpensas(Double.parseDouble(rs.getString("cuota.expensas")));
                            cuota.setTotalSellado(Double.parseDouble(rs.getString("cuota.totalSellado")));
                            cuota.setTotalImpuestos(Double.parseDouble(rs.getString("cuota.totalImpuestos")));
                            cuota.setValorGarantia(Double.parseDouble(rs.getString("cuota.valorGarantia")));
                            
                            mov.setFecha(rs.getString("movimientos.fecha"));
                            mov.setValorMovimiento(Double.parseDouble(rs.getString("valorMov")));
                            mov.setTipoMovimiento(rs.getString("tipoMov"));
                            mov.setRecibo(Integer.parseInt(rs.getString("recibo")));
                            mov.setHonorarios(Double.parseDouble(rs.getString("honorariosCobrados")));
                            mov.setContrato(contrato);
                            mov.setContratoCuota(cuota);
                            
                            listaMovimientos.add(mov);
                            
                            
                        }
       }catch (SQLException e) {
			JOptionPane.showMessageDialog(new JDialog(),"Error al consultar Caja"+e.toString());
		
	}
       
       return listaMovimientos;
    }
    
    
    public static int AltaEgreso(Movimiento egreso)throws IOException{
        int r=0;
        String sql="INSERT INTO `movimientos`( `tipoMov`, `valorMov`, `fecha`, `honorariosCobrados`, `idContrato`, `nroCuota`) "
                + "VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql);
            
            pst.setString(1,egreso.getTipoMovimiento());
            pst.setDouble(2, egreso.getValorMovimiento());
            pst.setString(3, egreso.getFecha());
            pst.setDouble(4, egreso.getHonorarios());
            pst.setInt(5, egreso.getContrato().getIdContrato());      
            pst.setInt(6, egreso.getContratoCuota().getNroCuota());
            
            r=pst.executeUpdate();
            


            
        }catch(SQLException e){
	JOptionPane.showMessageDialog(new JDialog(),"Error al Registrar el egreso"+e.toString());}
        return r;
    }
    
    public int PagoPropietario(PropietarioPago propietarioPago)throws IOException{
        int r=0;
        String sql="INSERT INTO `pagopropietario`(`idContrato`, `periodo`, `totalPagado`) VALUES (?,?,?)";
        try{
            PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql);
            pst.setInt(1, propietarioPago.getContrato().getIdContrato());
            pst.setInt(2, propietarioPago.getPeriodo());
            pst.setDouble(3, propietarioPago.getTotal());

            r=pst.executeUpdate();
            


            
        }catch(SQLException e){
	JOptionPane.showMessageDialog(new JDialog(),"Error al Registrar el Pago"+e.toString());}
        return r;
    }

     public static ArrayList<Movimiento> consultaTablaPorEstado(String periodo){
       ArrayList<Movimiento> listaMovimientos=new ArrayList<Movimiento>();
       Movimiento mov=null;
       Inmueble inm=null;
       Cliente prop=null;
       Cliente inq=null;
       Contrato contrato=null;
       Cuotas cuota=null;
       
       ResultSet rs=null;
       
       String sql2="SELECT movimientos.*,inmueble.calle,inmueble.piso,inmueble.dpto, prop.apellido,prop.nombre,inq.apellido,inq.nombre"
               + " FROM `movimientos` "
               + "INNER JOIN contrato on movimientos.idContrato=contrato.idContrato "
               + "INNER JOIN inmueble on contrato.idInmueble=inmueble.idInmueble "
               + "INNER JOIN cliente as prop on inmueble.idPropietario=prop.idCliente "
               + "INNER JOIN cliente as inq on contrato.idInquilino=inq.idCliente  "
               + "WHERE movimientos.fecha like ? ";
       
       String sql="SELECT movimientos.fecha,inmueble.calle,inmueble.numero,inmueble.piso,inmueble.dpto,prop.apellido,prop.nombre,inq.apellido,inq.nombre,movimientos.ingreso"
               + ",movimientos.egreso FROM `movimientos`,inmueble,cliente as prop,cliente as inq"
               + " WHERE movimientos.idInmueble=inmueble.idInmueble and movimientos.idInquilino=inq.idCliente and movimientos.idPropietario=prop.idCliente";
       
       try{
           PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql2);
           pst.setString(1, periodo);
			rs=pst.executeQuery();

			while(rs.next()){
                            mov=new Movimiento();
                            inm=new Inmueble();
                            prop=new Cliente();
                            inq=new Cliente();
                            contrato=new Contrato();
                            cuota=new Cuotas();
                           
                            
                            
                            inm.setCalle(rs.getString("inmueble.calle"));
                            inm.setPiso(rs.getString("inmueble.piso"));
                            inm.setDpto(rs.getString("inmueble.dpto"));
                            
                            prop.setApellido(rs.getString("prop.apellido"));
                            prop.setNombre(rs.getString("prop.nombre"));
                            inm.setPropietario(prop);
                            inq.setApellido(rs.getString("inq.apellido"));
                            inq.setNombre(rs.getString("inq.nombre"));
                            
                            contrato.setIdContrato(Integer.parseInt(rs.getString("movimientos.idContrato")));
                            contrato.setInmueble(inm);
                            contrato.setInquilino(inq);
                            cuota.setNroCuota(Integer.parseInt(rs.getString("movimientos.nroCuota")));
                            mov.setExpensasPagas(Double.parseDouble(rs.getString("expensasPagas")));
                            mov.setAlquileresPagos(Double.parseDouble(rs.getString("alquilerPago")));
                            mov.setGarantiaPagos(Double.parseDouble(rs.getString("garantiaPaga")));
                            mov.setSelladosPagos(Double.parseDouble(rs.getString("selladoPago")));
                            mov.setImpuestosPagos(Double.parseDouble(rs.getString("impuestoPago")));
                            mov.setFecha(rs.getString("movimientos.fecha"));
                            mov.setValorMovimiento(Double.parseDouble(rs.getString("valorMov")));
                            mov.setTipoMovimiento(rs.getString("tipoMov"));                            
                            mov.setRecibo(Integer.parseInt(rs.getString("recibo")));
                            mov.setHonorarios(Double.parseDouble(rs.getString("honorariosCobrados")));
                            mov.setContrato(contrato);
                            mov.setContratoCuota(cuota);
                            
                            listaMovimientos.add(mov);
                            
                            
                        }
       }catch (SQLException e) {
           JOptionPane.showMessageDialog(new JDialog(),"Error al consultar Caja por Estado"+e.toString());
		
	}
       
       return listaMovimientos;
    }
     public static ArrayList<Movimiento> consultaPagados(int idContrato, int nroCuota){
       ArrayList<Movimiento> listaMovimientos=new ArrayList<Movimiento>();
       Movimiento mov=null;
   
       
       ResultSet rs=null;
       
       String sql2="SELECT movimientos.*"
               + " FROM `movimientos` "
               + "WHERE movimientos.idCuota like ? ";
       
       String sql="SELECT movimientos.fecha,inmueble.calle,inmueble.numero,inmueble.piso,inmueble.dpto,prop.apellido,prop.nombre,inq.apellido,inq.nombre,movimientos.ingreso"
               + ",movimientos.egreso FROM `movimientos`,inmueble,cliente as prop,cliente as inq"
               + " WHERE movimientos.idInmueble=inmueble.idInmueble and movimientos.idInquilino=inq.idCliente and movimientos.idPropietario=prop.idCliente";
       
       try{
           PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql2);
           pst.setInt(1, idContrato);
           pst.setInt(2,nroCuota);
			rs=pst.executeQuery();

			while(rs.next()){
                            mov=new Movimiento();
                            
                           
                            
                            
                      
                            mov.setExpensasPagas(Double.parseDouble(rs.getString("expensasPagas")));
                            mov.setAlquileresPagos(Double.parseDouble(rs.getString("alquilerPago")));
                            mov.setGarantiaPagos(Double.parseDouble(rs.getString("garantiaPaga")));
                            mov.setSelladosPagos(Double.parseDouble(rs.getString("selladoPago")));
                            mov.setImpuestosPagos(Double.parseDouble(rs.getString("impuestoPago")));
                            mov.setFecha(rs.getString("movimientos.fecha"));
                            mov.setValorMovimiento(Double.parseDouble(rs.getString("valorMov")));
                            mov.setTipoMovimiento(rs.getString("tipoMov"));                            
                            mov.setRecibo(Integer.parseInt(rs.getString("recibo")));
                            mov.setHonorarios(Double.parseDouble(rs.getString("honorariosCobrados")));
                        
                            
                            
                        }
       }catch (SQLException e) {
           JOptionPane.showMessageDialog(new JDialog(),"Error al consultar Caja por Estado"+e.toString());
		
	}
       
       return listaMovimientos;
    }
     
           public static Cuotas consultarPagadosLiquidacion( int idContrato, int nroCuota){
            Cuotas cuota=new Cuotas();
            Movimiento mov= new Movimiento();
            Contrato contrato=null;
            ResultSet rs=null;
            
            String sql="SELECT movimientos.* FROM `contrato` INNER JOIN movimientos on contrato.idContrato=movimientos.idContrato WHERE contrato.idContrato=? and movimiento.nroCuota=? ";
            
            try{
			PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql);
//			pst.setInt(1, idContrato);
                        pst.setInt(1, idContrato);
                        pst.setInt(2, nroCuota);
			rs=pst.executeQuery();

			while(rs.next()){
                          cuota=new Cuotas();
                          mov=new Movimiento();
                          contrato=new Contrato();
                          contrato.setIdContrato(Integer.parseInt(rs.getString("idContrato")));
                          mov.setAlquileresPagos(Double.parseDouble(rs.getString("alquilerPago")));
                          mov.setSelladosPagos(Double.parseDouble(rs.getString("selladoPago")));
                          mov.setImpuestosPagos(Double.parseDouble(rs.getString("impuestoPago")));
                          mov.setGarantiaPagos(Double.parseDouble(rs.getString("garantiaPaga")));
                          mov.setExpensasPagas(Double.parseDouble(rs.getString("espensasPagas")));
                          
//			  cuota.setContrato(contrato);
//                          cuota.setNroCuota(Integer.parseInt(rs.getString("nroCuota")));
//                          cuota.setTotalImpuestos(Double.parseDouble(rs.getString("totalImpuestos")));
//                          cuota.setValorCuota(Integer.parseInt(rs.getString("valorCuota")));
//                          cuota.setTotalaPagar(Double.parseDouble(rs.getString("montoTotal")));                        
//                          cuota.setTotalPagado(Double.parseDouble(rs.getString("totalPagado")));
//                          cuota.setValorGarantia(Double.parseDouble(rs.getString("valorGarantia")));
//                          cuota.setDescuento(Double.parseDouble(rs.getString("descuento")));
//                          cuota.setPunitorios(Double.parseDouble(rs.getString("punitorios")));
//                          cuota.setComision(Double.parseDouble(rs.getString("comicion")));
//                          cuota.setTotalSellado(Double.parseDouble(rs.getString("totalSellado")));
//                          cuota.setExpensas(Double.parseDouble(rs.getString("expensas")));
//                          cuota.setPagoParcial(rs.getString("pagoParcial"));
//                          
//                          
//                          
                          
                          
            
			}
                        
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(new JDialog(),"Error al consultar "+e.toString());
		
	}
        
        return cuota;
}
           
           
    public static ArrayList<Movimiento> consultaPagosPropietario(int idContrato ){
        ArrayList<Movimiento> listaMovimientos=new ArrayList<Movimiento>();
        Movimiento mov=null;
        PropietarioPago pago=null;
        ResultSet rs=null;
        String tipo="E";
        
        String sql="SELECT movimientos.recibo, movimientos.fecha,movimientos.tipoMov,pagopropietario.periodo,"
                + "pagopropietario.totalPagado,movimientos.honorariosCobrados "
                + "FROM `movimientos` INNER JOIN pagopropietario ON movimientos.idContrato=pagopropietario.idContrato "
                + "and movimientos.nroCuota=pagopropietario.periodo AND movimientos.nroCuota=pagopropietario.periodo"
                + " WHERE movimientos.tipoMov like ? AND movimientos.idContrato=?";
        try{
           PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql);
           pst.setString(1, tipo);
           pst.setInt(2, idContrato);
           rs=pst.executeQuery();
           
           while(rs.next()){
               mov=new Movimiento();
               pago=new PropietarioPago();
               
               pago.setPeriodo(rs.getInt("pagopropietario.periodo"));
               pago.setTotal(rs.getDouble("pagopropietario.totalPagado"));
               
               mov.setFecha(rs.getString("movimientos.fecha"));
               mov.setHonorarios(rs.getDouble("movimientos.honorariosCobrados"));
               mov.setRecibo(rs.getInt("movimientos.recibo"));
               mov.setPropietarioPago(pago);
                                                     
                                                        
               listaMovimientos.add(mov);
               
           }
       }catch (SQLException e) {
			JOptionPane.showMessageDialog(new JDialog(),"Error al consultar Pagos al Propietario"+e.toString());
		
	}
        return listaMovimientos;
    }
       
     
     public static int numeroRecibo() throws SQLException{
         int numeroRecibo=0;
         ResultSet rs=null;
         String sql="SELECT recibo from movimientos ORDER BY recibo DESC LIMIT 1";
         
         try{
             PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql);
             rs=pst.executeQuery();
             
             while(rs.next()){
                 numeroRecibo=rs.getInt("recibo");
             }
             
         }catch (SQLException e) {
			JOptionPane.showMessageDialog(new JDialog(),"Error al consultar Pagos al Propietario"+e.toString());
		
	}
         
         
         
         return numeroRecibo;
     }
     
     public static int confirmarDevolucion(int idContrato){
         int x=0;
         ResultSet rs=null;
         String sql="SELECT contrato.idContrato FROM `movimientos` INNER JOIN contrato ON movimientos.idContrato=contrato.idContrato "
                 + "WHERE movimientos.nroCuota=99 AND contrato.idContrato=?";
         try{
             PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql);
             pst.setInt(1, idContrato);
             rs=pst.executeQuery();
             
             while(rs.next()){
                 x=rs.getInt("contrato.idContrato");
             }
             
         }catch (SQLException e) {
			JOptionPane.showMessageDialog(new JDialog(),"Error al estado garantia"+e.toString());
		
	}
         return x;
     }
     
     public static ArrayList<Movimiento> consultaPagosInquilino(int idContrato ){
        ArrayList<Movimiento> listaMovimientos=new ArrayList<Movimiento>();
        Movimiento mov=null;
        Cuotas cuotas=null;
        ResultSet rs=null;
        String tipo="I";
        
        String sql="SELECT movimientos.recibo,movimientos.fecha,movimientos.tipoMov,movimientos.valorMov,movimientos.nroCuota "
                + "FROM movimientos WHERE movimientos.tipoMov"
                + " LIKE ? and movimientos.idContrato=?";
        try{
           PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql);
           pst.setString(1, tipo);
           pst.setInt(2, idContrato);
           rs=pst.executeQuery();
           
           while(rs.next()){
               mov=new Movimiento();            
               cuotas=new Cuotas();
               
               cuotas.setNroCuota(rs.getInt("movimientos.nroCuota"));
               mov.setFecha(rs.getString("movimientos.fecha"));
               mov.setRecibo(rs.getInt("movimientos.recibo"));
               mov.setValorMovimiento(rs.getDouble("movimientos.valorMov"));
               mov.setContratoCuota(cuotas);
               
                                                     
                                                        
               listaMovimientos.add(mov);
               
           }
       }catch (SQLException e) {
			JOptionPane.showMessageDialog(new JDialog(),"Error al consultar recibos del Inquilino "+e.toString());
		
	}
        return listaMovimientos;
    }
 
}
