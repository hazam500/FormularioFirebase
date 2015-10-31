package com.example.android.formulariofirebase;

/**
 * Created by TOSHIBA on 29/10/2015.
 */
public class Usuario {

    private String usuarioDato;
    private int edadDato;
    private String formaPagoDato;
    private Double latitudDato;
    private Double longitudDato;



    public Usuario(String usuarioDato, int edadDato, String formaPagoDato, Double latitudDato, Double longitudDato) {

        this.usuarioDato = usuarioDato;
        this.edadDato = edadDato;
        this.formaPagoDato = formaPagoDato;
        this.latitudDato = latitudDato;
        this.longitudDato = longitudDato;
    }

    public int getEdadDato() {
        return edadDato;
    }

    public String getFormaPagoDato() {
        return formaPagoDato;
    }

    public Double getLatitudDato() {
        return latitudDato;
    }

    public Double getLongitudDato() {
        return longitudDato;
    }

    public String getUsuarioDato() {
        return usuarioDato;
    }
}
