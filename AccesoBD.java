/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

;

/**
 *
 * @author FP Mañana A
 */
public class AccesoBD {
   private static Connection c=null;
	private static Statement stmt=null;
	public static void conectarBD() {
		try {
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda_tpv","root","");
			stmt=c.createStatement();
                        System.out.println("Te has conectado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
                        System.out.println("Ha habido algun problema: "+e.getMessage());
		}
	}
        public static boolean sacarDependientesNombres(String nombre_dependiente){
        boolean aux=false;
        String sql="SELECT * FROM `dependientes` WHERE `nombre`='"+nombre_dependiente+"' ";
        try {
            ResultSet rs=stmt.executeQuery(sql);
            if(rs.next())
            {
              aux=true;  
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aux;
    }
        public static boolean sacarDependientesPassword(String password_dependiente)
    {
        boolean aux=false;
        String sql="SELECT * FROM `dependientes` WHERE `password`='"+password_dependiente+"' ";
        try {
            ResultSet rs=stmt.executeQuery(sql);
            if(rs.next())
            {
              aux=true;  
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aux;
    }
}
