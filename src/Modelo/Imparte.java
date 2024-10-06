/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author A16
 */
public class Imparte {
    
    int IdImparte,IdUsuarios,IdCurso,IdAula;

    public Imparte() {
    }

    public Imparte(int IdImparte, int IdUsuarios, int IdCurso, int IdAula) {
        this.IdImparte = IdImparte;
        this.IdUsuarios = IdUsuarios;
        this.IdCurso = IdCurso;
        this.IdAula = IdAula;
    }

    public int getIdImparte() {
        return IdImparte;
    }

    public void setIdImparte(int IdImparte) {
        this.IdImparte = IdImparte;
    }

    public int getIdUsuarios() {
        return IdUsuarios;
    }

    public void setIdUsuarios(int IdUsuarios) {
        this.IdUsuarios = IdUsuarios;
    }

    public int getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(int IdCurso) {
        this.IdCurso = IdCurso;
    }

    public int getIdAula() {
        return IdAula;
    }

    public void setIdAula(int IdAula) {
        this.IdAula = IdAula;
    }
    
}
