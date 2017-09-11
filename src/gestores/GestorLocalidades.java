/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import conexion.Conexion;
import entidades.Localidades;
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
public class GestorLocalidades {
    
    public static ArrayList<Localidades> consultarProvincias(){
        ArrayList<Localidades> listaProvincias=new ArrayList<Localidades>();
        Localidades provincia=null;				
        ResultSet rs=null;
        String sql="SELECT * FROM `provincias`";
	try{
            PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){	
                provincia=new Localidades();
                provincia.setIdProvincia(rs.getInt("id"));
                provincia.setProvincias(rs.getString("provincia"));
                
                listaProvincias.add(provincia);
		       
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JDialog(),"Error al consultar"+e.toString());		
        }		
        return listaProvincias;
    }
    
    public static ArrayList<Localidades> consultarCiudades(String provincia){
        ArrayList<Localidades> listaLocalidades=new ArrayList<Localidades>();
        Localidades localidad=null;				
        ResultSet rs=null;
        String sql="SELECT * FROM `localidades` INNER JOIN provincias ON localidades.id_privincia=provincias.id WHERE provincias.provincia like ?";
	try{
            PreparedStatement pst=Conexion.getConexionn().prepareStatement(sql);
            pst.setString(1, provincia);
            rs=pst.executeQuery();
            while(rs.next()){		  
                localidad=new Localidades();
                localidad.setLocalidad(rs.getString("localidad"));
                
                listaLocalidades.add(localidad);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JDialog(),"Error al consultar"+e.toString());		
        }		
        return listaLocalidades;
    }
}
