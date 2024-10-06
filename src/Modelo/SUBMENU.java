/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author A16
 */
public class SUBMENU {
    
    int IdSubMenu,IdMenu;
    String Nombre , NombreFormulario;

    public SUBMENU() {
    }

    public SUBMENU(int IdSubMenu, int IdMenu, String Nombre, String NombreFormulario) {
        this.IdSubMenu = IdSubMenu;
        this.IdMenu = IdMenu;
        this.Nombre = Nombre;
        this.NombreFormulario = NombreFormulario;
    }

    public int getIdSubMenu() {
        return IdSubMenu;
    }

    public void setIdSubMenu(int IdSubMenu) {
        this.IdSubMenu = IdSubMenu;
    }

    public int getIdMenu() {
        return IdMenu;
    }

    public void setIdMenu(int IdMenu) {
        this.IdMenu = IdMenu;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombreFormulario() {
        return NombreFormulario;
    }

    public void setNombreFormulario(String NombreFormulario) {
        this.NombreFormulario = NombreFormulario;
    }
    
}
