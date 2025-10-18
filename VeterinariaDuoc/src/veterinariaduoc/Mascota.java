/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinariaduoc;

/**
 *
 * @author Gabote
 */
public class Mascota {

    private String nombre;
    private String especie;
    private double peso;
    private Propietario propietario;

    public Mascota() {
    }

    public Mascota(String nombre, String especie, double peso, Propietario propietario) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.propietario = propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String obtenerDetalle() {
        return nombre + " (" + especie + ", " + peso + "kg, dueño: " + propietario.getNombre() + ")";
    }

}
