/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author A16
 */
public class AULA {
    private int IdAula,Grado,IdUsuarios;
    private String Seccion;

    public AULA() {
    }

    public AULA(int IdAula, int Grado, int IdUsuarios, String Seccion) {
        this.IdAula = IdAula;
        this.Grado = Grado;
        this.IdUsuarios = IdUsuarios;
        this.Seccion = Seccion;
    }

    public int getIdAula() {
        return IdAula;
    }

    public void setIdAula(int IdAula) {
        this.IdAula = IdAula;
    }

    public int getGrado() {
        return Grado;
    }

    public void setGrado(int Grado) {
        this.Grado = Grado;
    }

    public int getIdUsuarios() {
        return IdUsuarios;
    }

    public void setIdUsuarios(int IdUsuarios) {
        this.IdUsuarios = IdUsuarios;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }
    
    
}
