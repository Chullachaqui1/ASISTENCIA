/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author A16
 */
public class CURSO {
    
    private int IdCurso;
    private String NCurso;

    public CURSO() {
    }

    public CURSO(int IdCurso, String NCurso) {
        this.IdCurso = IdCurso;
        this.NCurso = NCurso;
    }

    public int getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(int IdCurso) {
        this.IdCurso = IdCurso;
    }

    public String getNCurso() {
        return NCurso;
    }

    public void setNCurso(String NCurso) {
        this.NCurso = NCurso;
    }
    
    
}
