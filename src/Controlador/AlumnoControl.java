/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Datos.AlumnoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Modelo.Alumno;

/**
 *
 * @author A07
 */
public class AlumnoControl {
    private final AlumnoDAO DATOS;
    private Alumno obj;
    private DefaultTableModel modeloTabla;
    public int registrosMostrados;
    
    public AlumnoControl(){
        this.DATOS=new AlumnoDAO();
        this.obj=new Alumno();
        this.registrosMostrados=0;
    }
    
    public DefaultTableModel listar(String texto){
        List<Alumno> lista=new ArrayList();
        lista.addAll(DATOS.listar(texto));
        
        String[] titulos={"Id","Nombres","Apellidos","Direccion","Referencia"};
        this.modeloTabla=new DefaultTableModel(null,titulos);        
        
        String[] registro = new String[5];
        
        this.registrosMostrados=0;
        for (Alumno item:lista){
            
            registro[0]=Integer.toString(item.getDNIALUMNO());
            registro[1]=item.getNombres();
            registro[2]=item.getApellidos();
            registro[3]=item.getDireccion();
            registro[4]=item.getRefDirec();
            this.modeloTabla.addRow(registro);
            this.registrosMostrados=this.registrosMostrados+1;
        }
        return this.modeloTabla;
    }
    
    public DefaultTableModel buscar(String texto){
        List<Alumno> lista=new ArrayList();
        lista.addAll(DATOS.buscar(texto));
        
        String[] titulos={"Id","Nombres","Apellidos","Direccion","Referencia"};
        this.modeloTabla=new DefaultTableModel(null,titulos);        
 
        String[] registro = new String[5];
        
        this.registrosMostrados=0;
        for (Alumno item:lista){
            
            registro[0]=Integer.toString(item.getDNIALUMNO());
            registro[1]=item.getNombres();
            registro[2]=item.getApellidos();
            registro[3]=item.getDireccion();
            registro[4]=item.getRefDirec();
            this.modeloTabla.addRow(registro);
            this.registrosMostrados=this.registrosMostrados+1;
        }
        return this.modeloTabla;
    }
}
