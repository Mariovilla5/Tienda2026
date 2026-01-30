/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.educastur.mariova62.tienda2026;

/**
 *
 * @author 1dawd07
 */
public class Articulo {

    private String idArticulo;
    private String description;
    private int existencias;
    private double pvp;

    public Articulo(String idArticulo, String description, int existencias, double pvp) {
        this.idArticulo = idArticulo;
        this.description = description;
        this.existencias = existencias;
        this.pvp = pvp;
    }

    public String getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getDescripcion() {
        return description;
    }

    public void setDescripcion(String description) {
        this.description = description;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    @Override
    public String toString() {
        return "Articulo [idArticulo=" + idArticulo + ", description=" + description + ", existencias=" + existencias
                + ", pvp=" + pvp + "]";
    }
//    @Override
//    public String toString() {
//        return String.format("""
//        ARTÍCULO
//        ───────────────────────
//        ID:          %s
//        Descripción: %s
//        Stock:       %d unidades
//        Precio:      %.2f €
//        """,
//                idArticulo, description, existencias, pvp
//        );
//    }

}