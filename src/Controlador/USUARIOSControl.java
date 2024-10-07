/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Datos.USUARIOSDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Modelo.Usuario;

    
    public class USUARIOSControl {
     private final USUARIOSDAO DATOS;
    private Usuario obj;
    private DefaultTableModel modeloTabla;
    public int registrosMostrados;

    public USUARIOSControl(){
        this.DATOS=new USUARIOSDAO();
        this.obj=new Usuario();
        this.registrosMostrados=0;
    }
    public DefaultTableModel listar1(String texto){
        List<Usuario> lista=new ArrayList();
        lista.addAll(DATOS.listar1(texto));
        
        String[] titulos={"IdUsuarios","Nombres","Apellidos","correo","DNI","Clave","IdRol"};
        this.modeloTabla=new DefaultTableModel(null,titulos);        
        
        String[] registro = new String[7];
        
        this.registrosMostrados=0;
        for (Usuario item:lista){
           
            registro[0]=Integer.toString(item.getIdUsuarios());
            registro[1]=item.getNombres();
            registro[2]=item.getApellidos();
            registro[3]=item.getCorreo();
            registro[4]=Integer.toString(item.getDNI()) ;
	    registro[5]=item.getClave();
	    registro[6]=Integer.toString(item.getIdRol());

            this.modeloTabla.addRow(registro);
            this.registrosMostrados=this.registrosMostrados+1;
        }
        return this.modeloTabla;
    }
}
