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
public class ASIGNA {
    public int IdAsigna,IdAula,DNIALUMNO;
    public Date Año;

    public ASIGNA() {
    }

    public ASIGNA(int IdAsigna, int IdAula, int DNIALUMNO, Date Año) {
        this.IdAsigna = IdAsigna;
        this.IdAula = IdAula;
        this.DNIALUMNO = DNIALUMNO;
        this.Año = Año;
    }

    public int getIdAsigna() {
        return IdAsigna;
    }

    public void setIdAsigna(int IdAsigna) {
        this.IdAsigna = IdAsigna;
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

    public Date getAño() {
        return Año;
    }

    public void setAño(Date Año) {
        this.Año = Año;
    }
    
    
}
