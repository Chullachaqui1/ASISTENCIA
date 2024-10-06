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
public class ASISTENCIA {
    
    int IdAsistencia , IdAula,DNIALUMNO,IdObservaciones;
    Date fecha;
    String IdTipoAsis;

    public ASISTENCIA() {
    }

    public ASISTENCIA(int IdAsistencia, int IdAula, int DNIALUMNO, int IdObservaciones, Date fecha, String IdTipoAsis) {
        this.IdAsistencia = IdAsistencia;
        this.IdAula = IdAula;
        this.DNIALUMNO = DNIALUMNO;
        this.IdObservaciones = IdObservaciones;
        this.fecha = fecha;
        this.IdTipoAsis = IdTipoAsis;
    }

    public int getIdAsistencia() {
        return IdAsistencia;
    }

    public void setIdAsistencia(int IdAsistencia) {
        this.IdAsistencia = IdAsistencia;
    }

    public int getIdAula() {
        return IdAula;
    }

    public void setIdAula(int IdAula) {
        this.IdAula = IdAula;
    }

    public int getDNIALUMNO() {
        return DNIALUMNO;
    }

    public void setDNIALUMNO(int DNIALUMNO) {
        this.DNIALUMNO = DNIALUMNO;
    }

    public int getIdObservaciones() {
        return IdObservaciones;
    }

    public void setIdObservaciones(int IdObservaciones) {
        this.IdObservaciones = IdObservaciones;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdTipoAsis() {
        return IdTipoAsis;
    }

    public void setIdTipoAsis(String IdTipoAsis) {
        this.IdTipoAsis = IdTipoAsis;
    }
    
    
}
