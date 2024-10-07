/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author A16
 */
public class Permisos {
    
   private int IdPermiso,IdRol,IdSubMenu;
   private boolean Activo;

    public Permisos() {
    }

    public Permisos(int IdPermiso, int IdRol, int IdSubMenu, boolean Activo) {
        this.IdPermiso = IdPermiso;
        this.IdRol = IdRol;
        this.IdSubMenu = IdSubMenu;
        this.Activo = Activo;
    }

    public int getIdPermiso() {
        return IdPermiso;
    }

    public void setIdPermiso(int IdPermiso) {
        this.IdPermiso = IdPermiso;
    }

    public int getIdRol() {
        return IdRol;
    }

    public void setIdRol(int IdRol) {
        this.IdRol = IdRol;
    }

    public int getIdSubMenu() {
        return IdSubMenu;
    }

    public void setIdSubMenu(int IdSubMenu) {
        this.IdSubMenu = IdSubMenu;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }
   
}
