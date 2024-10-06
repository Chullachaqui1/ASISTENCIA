/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author A16
 */
public class HISTORIALAUDIC {
    
    int IdHistorialAl,Registro;
    String Tipo,Tabla,Campo,ValorAntes,ValorDespues,Usuario;
    Date Fecha;

    public HISTORIALAUDIC() {
    }

    public HISTORIALAUDIC(int IdHistorialAl, int Registro, String Tipo, String Tabla, String Campo, String ValorAntes, String ValorDespues, String Usuario, Date Fecha) {
        this.IdHistorialAl = IdHistorialAl;
        this.Registro = Registro;
        this.Tipo = Tipo;
        this.Tabla = Tabla;
        this.Campo = Campo;
        this.ValorAntes = ValorAntes;
        this.ValorDespues = ValorDespues;
        this.Usuario = Usuario;
        this.Fecha = Fecha;
    }

    public int getIdHistorialAl() {
        return IdHistorialAl;
    }

    public void setIdHistorialAl(int IdHistorialAl) {
        this.IdHistorialAl = IdHistorialAl;
    }

    public int getRegistro() {
        return Registro;
    }

    public void setRegistro(int Registro) {
        this.Registro = Registro;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTabla() {
        return Tabla;
    }

    public void setTabla(String Tabla) {
        this.Tabla = Tabla;
    }

    public String getCampo() {
        return Campo;
    }

    public void setCampo(String Campo) {
        this.Campo = Campo;
    }

    public String getValorAntes() {
        return ValorAntes;
    }

    public void setValorAntes(String ValorAntes) {
        this.ValorAntes = ValorAntes;
    }

    public String getValorDespues() {
        return ValorDespues;
    }

    public void setValorDespues(String ValorDespues) {
        this.ValorDespues = ValorDespues;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    
}
