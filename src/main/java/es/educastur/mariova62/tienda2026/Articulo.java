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
    private String descripcion;
    private int exustencias;
    private double pvp;

    

    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setExustencias(int exustencias) {
        this.exustencias = exustencias;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public String getIdArticulo() {
        return idArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getExustencias() {
        return exustencias;
    }

    public double getPvp() {
        return pvp;
    }

    public Articulo(String idArticulo, String descripcion, int exustencias, double pvp) {
        this.idArticulo = idArticulo;
        this.descripcion = descripcion;
        this.exustencias = exustencias;
        this.pvp = pvp;
    }
@Override
    public String toString() {
        return "Articulo{" + "idArticulo=" + idArticulo + ", descripcion=" + descripcion + ", exustencias=" + exustencias + ", pvp=" + pvp + '}';
    }
}
