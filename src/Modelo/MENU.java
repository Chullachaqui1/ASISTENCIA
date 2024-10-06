/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author A16
 */
public class MENU {
    int IdMenu;
    String Nombre;

    public MENU() {
    }

    public MENU(int IdMenu, String Nombre) {
        this.IdMenu = IdMenu;
        this.Nombre = Nombre;
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
    
}
