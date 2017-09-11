package gestores.gestoresCliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import conexion.Conexion;
import entidades.Cliente;


public class BusquedaPropietario {

    public static ArrayList<Cliente> consultaTablaPropietario(){
        ArrayList<Cliente> listaP=new ArrayList<Cliente>();
        Cliente prop=null;
        String tipo="Propietario";		
        ResultSet rs=null;
        String sql="SELECT DISTINCT idCliente,nombre,apellido,apellidoMaterno,cuit,correo,ciudad,celular,dni,domicilio,dgi,estadoCivil,telefono,profesion,cliente.provincia,"
                + " fechaNacimiento,habilitado,cliente.tipo FROM cliente,inmueble where inmueble.idPropietario=cliente.idCliente or cliente.tipo like  ?";
        try{
            PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql);
            pst.setString (1, tipo);
            rs=pst.executeQuery();
            while(rs.next()){
				
                prop=new Cliente();
                prop.setId(Integer.parseInt(rs.getString("idCliente")));
                prop.setApellido(rs.getString("apellido"));
                prop.setApellidoMaterno(rs.getString("apellidoMaterno"));
                prop.setNombre(rs.getString("nombre"));
                prop.setDni(Integer.parseInt(rs.getString("dni")));;
                prop.setCuit(rs.getString("cuit"));
                prop.setCorreo(rs.getString("correo"));
                prop.setTel(rs.getString("telefono"));
                prop.setFechaNac(rs.getString("fechaNacimiento"));
                prop.setEstadoCivil(rs.getString("estadoCivil"));
                prop.setProfesion(rs.getString("profesion"));
                prop.setDireccion(rs.getString("domicilio"));
                prop.setLocalidad(rs.getString("ciudad"));
                prop.setProvincia(rs.getString("provincia"));
                prop.setDgi(rs.getString("dgi"));
                prop.setCelular(rs.getString("celular"));                               

                if(rs.getBoolean("habilitado")==true){
                    listaP.add(prop);  
                }	       
            }			
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JDialog(),"Error al consultar");		
        }		
        return listaP;	}
	
    public static Cliente busquedaDatos(int id){
		
		      Cliente prop=null;
		      ResultSet rs=null;
		      
		      String sql="SELECT * FROM `cliente` WHERE idCliente=?";
		      
		      try{
		    	  PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql);		
					pst.setInt(1, id);
					rs=pst.executeQuery();
					
					while(rs.next()){
						prop=new Cliente();
						prop.setId(Integer.parseInt(rs.getString("idCliente")));
						prop.setApellido(rs.getString("apellido"));
						prop.setApellidoMaterno(rs.getString("apellidoMaterno"));
						prop.setNombre(rs.getString("nombre"));
						prop.setDni(Integer.parseInt(rs.getString("dni")));;
						prop.setCuit(rs.getString("cuit"));
						prop.setCorreo(rs.getString("correo"));
						prop.setTel(rs.getString("telefono"));
						prop.setFechaNac(rs.getString("fechaNacimiento"));
						prop.setEstadoCivil(rs.getString("estadoCivil"));
						prop.setProfesion(rs.getString("profesion"));
						prop.setDireccion(rs.getString("domicilio"));
						prop.setLocalidad(rs.getString("ciudad"));
						prop.setProvincia(rs.getString("provincia"));
						prop.setDgi(rs.getString("dgi"));
						prop.setCelular(rs.getString("celular"));
						
					}
					
		      }catch(SQLException e1){
		    	  JOptionPane.showMessageDialog(new JDialog(),"Error al consultar");
		    	  
		      }
		
		
		      return prop;
	}
	
    public static Cliente busquedaDatos2(String apellido){
		
	      Cliente prop=null;
	      ResultSet rs=null;
	      
	      String sql="SELECT * FROM `cliente` WHERE apellido=?";
	      
	      try{
	    	  PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql);		
				pst.setString(1,apellido);
				rs=pst.executeQuery();
				
				while(rs.next()){
					prop=new Cliente();
					prop.setId(Integer.parseInt(rs.getString("idCliente")));
					prop.setApellido(rs.getString("apellido"));
					prop.setApellidoMaterno(rs.getString("apellidoMaterno"));
					prop.setNombre(rs.getString("nombre"));
					prop.setDni(Integer.parseInt(rs.getString("dni")));;
					prop.setCuit(rs.getString("cuit"));
					prop.setCorreo(rs.getString("correo"));
					prop.setTel(rs.getString("telefono"));
					prop.setFechaNac(rs.getString("fechaNacimiento"));
					prop.setEstadoCivil(rs.getString("estadoCivil"));
					prop.setProfesion(rs.getString("profesion"));
					prop.setDireccion(rs.getString("domicilio"));
					prop.setLocalidad(rs.getString("ciudad"));
					prop.setProvincia(rs.getString("provincia"));
					prop.setDgi(rs.getString("dgi"));
					prop.setCelular(rs.getString("celular"));
                                        
					
				}
				
	      }catch(SQLException e1){
	    	  JOptionPane.showMessageDialog(new JDialog(),"Error al consultar");
	    	  
	      }
	
	
	      return prop;
}
    
   
}
