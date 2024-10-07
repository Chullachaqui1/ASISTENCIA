/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author A16
 */
public class DETALLESASISTENCIA {
    
    private int IdAsistencia,IdImparte,IdUsuarios;

    public DETALLESASISTENCIA() {
    }

    public DETALLESASISTENCIA(int IdAsistencia, int IdImparte, int IdUsuarios) {
        this.IdAsistencia = IdAsistencia;
        this.IdImparte = IdImparte;
        this.IdUsuarios = IdUsuarios;
    }

    public int getIdAsistencia() {
        return IdAsistencia;
    }

    public void setIdAsistencia(int IdAsistencia) {
        this.IdAsistencia = IdAsistencia;
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
    
}
