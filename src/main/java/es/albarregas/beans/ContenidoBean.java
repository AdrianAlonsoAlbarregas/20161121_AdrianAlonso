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
public class ContenidoBean {
    String danosAccidentales;
    int cantidadAsegurada;
    int franquicia;

    public String getDanosAccidentales() {
        return danosAccidentales;
    }

    public void setDanosAccidentales(String danosAccidentales) {
        this.danosAccidentales = danosAccidentales;
    }

    public int getCantidadAsegurada() {
        return cantidadAsegurada;
    }

    public void setCantidadAsegurada(int cantidadAsegurada) {
        this.cantidadAsegurada = cantidadAsegurada;
    }

    public int getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(int franquicia) {
        this.franquicia = franquicia;
    }
    
}
