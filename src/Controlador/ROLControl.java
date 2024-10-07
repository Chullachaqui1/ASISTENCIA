package Controlador;

import Datos.RolDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Modelo.ROL;

/**
 *
 * @author A07
 */
public class ROLControl {
    private final RolDAO DATOS;
    private ROL obj;
    private DefaultTableModel modeloTabla;
    public int registrosMostrados;
    
    public ROLControl(){
        this.DATOS=new RolDAO();
        this.obj=new ROL();
        this.registrosMostrados=0;
    }
    
    public DefaultTableModel listar(){
        List<ROL> lista=new ArrayList();
        lista.addAll(DATOS.listar());
        
        String[] titulos={"Nombre"};
        this.modeloTabla=new DefaultTableModel(null,titulos);        
        
        String[] registro = new String[1];
        
        this.registrosMostrados=0;
        for (ROL item:lista){
            
            registro[0]=item.getNombre();
            this.modeloTabla.addRow(registro);
            this.registrosMostrados=this.registrosMostrados+1;
        }
        return this.modeloTabla;
    }
}
