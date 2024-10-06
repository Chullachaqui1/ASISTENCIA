/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/*import Datos.USUARIOSDAO;
import Modelo.AULA;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

*/
/**
 *
 * @author A16
 */
/*public class AULAControl {
    private final AULADAO DATOS;
    private AULA obj;
    private DefaultTableModel modeloTabla;
    public int registrosMostrados;
	
    public AULAControl(){
        this.DATOS=new AULADAO();
        this.obj=new AULA();
        this.registrosMostrados=0;
}
	public DefaultTableModel listar(String texto){
        List<AULA> lista=new ArrayList();
        lista.addAll(DATOS.listar(texto));
        
        String[] titulos={"IdAula","Grado","Seccion","IdUsuarios"};
        this.modeloTabla=new DefaultTableModel(null,titulos);        
        
        String[] registro = new String[5];
        
        this.registrosMostrados=0;
        for (AULA item:lista){
            
            registro[0]=Integer.toString(item.getIdAula());
            registro[1]=item.getGrado();
            registro[2]=item.getSeccion();
            registro[3]=item.getDireccion();
            registro[4]=Integer.toString(item.getIdUsuarios());

            this.modeloTabla.addRow(registro);
            this.registrosMostrados=this.registrosMostrados+1;
        }
        return this.modeloTabla;
    }
}*/

