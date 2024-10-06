/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author A07
 */
public class Conexion {
    private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
      private final String URL = "jdbc:sqlserver://localhost:1433;databaseName=ASISTENCIARPB1;encrypt=false;trustServerCertificate=true";

    private final String USER = "Vega";
    private final String PASSWORD = "RosalesVega";
    
    public Connection cadena;
    public static Conexion instancia;
    
    public Conexion(){
        this.cadena = null;
    }
    
    public Connection conectar(){
        try {
            Class.forName(DRIVER);
            this.cadena = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        return this.cadena;
    }
    
    public void desconectar(){
        try {
            if (this.cadena != null && !this.cadena.isClosed()) {
                this.cadena.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public synchronized static Conexion getInstancia(){
        if (instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
}
