/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author A16
 */
public class ANTENFERMEDADES {
   public int  DNIALUMNO;
    public String Lesion ,EnfFisica,EnfMental,Discapacidad;

    public ANTENFERMEDADES() {
    }

    public ANTENFERMEDADES(int DNIALUMNO, String Lesion, String EnfFisica, String EnfMental, String Discapacidad) {
        this.DNIALUMNO = DNIALUMNO;
        this.Lesion = Lesion;
        this.EnfFisica = EnfFisica;
        this.EnfMental = EnfMental;
        this.Discapacidad = Discapacidad;
    }

    public int getDNIALUMNO() {
        return DNIALUMNO;
    }

    public void setDNIALUMNO(int DNIALUMNO) {
        this.DNIALUMNO = DNIALUMNO;
    }

    public String getLesion() {
        return Lesion;
    }

    public void setLesion(String Lesion) {
        this.Lesion = Lesion;
    }

    public String getEnfFisica() {
        return EnfFisica;
    }

    public void setEnfFisica(String EnfFisica) {
        this.EnfFisica = EnfFisica;
    }

    public String getEnfMental() {
        return EnfMental;
    }

    public void setEnfMental(String EnfMental) {
        this.EnfMental = EnfMental;
    }

    public String getDiscapacidad() {
        return Discapacidad;
    }

    public void setDiscapacidad(String Discapacidad) {
        this.Discapacidad = Discapacidad;
    }
    
	
	
	
    
}
