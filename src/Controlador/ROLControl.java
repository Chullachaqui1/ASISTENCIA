package controlador;

import Datos.RolDAO;
import Modelo.ROL;

import java.util.List;
import java.util.stream.Collectors;

public class ROLControl {
    private RolDAO rolDAO;

    public ROLControl() {
        rolDAO = new RolDAO(); 
    }

    public List<ROL> listar() {
        return rolDAO.listar();
    }
}