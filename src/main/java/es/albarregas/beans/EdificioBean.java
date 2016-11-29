/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

/**
 *
 * @author Adrian
 */
public class EdificioBean {
    String tipoEd;
    int numeroHab;
    int fechaConst;
    String tipoConst;
    // ESTA CANTIDAD ES double
    int valorMerc;

    public String getTipoEd() {
        return tipoEd;
    }

    public void setTipoEd(String tipoEd) {
        this.tipoEd = tipoEd;
    }

    public int getNumeroHab() {
        return numeroHab;
    }

    public void setNumeroHab(int numeroHab) {
        this.numeroHab = numeroHab;
    }

    public int getFechaConst() {
        return fechaConst;
    }

    public void setFechaConst(int fechaConst) {
        this.fechaConst = fechaConst;
    }

    public String getTipoConst() {
        return tipoConst;
    }

    public void setTipoConst(String tipoConst) {
        this.tipoConst = tipoConst;
    }

    public int getValorMerc() {
        return valorMerc;
    }

    public void setValorMerc(int valorMerc) {
        this.valorMerc = valorMerc;
    }

}
