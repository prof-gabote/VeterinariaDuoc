/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinariaduoc;

import java.time.LocalDate;

//Implementar interfaces y abstracción
public class Atencion {

    private String codigo;
    private LocalDate fecha;
    private Mascota mascota;
    private String veterinario;
    private double costoBase;
    private String observaciones;

    public Atencion() {
    }

    public Atencion(String codigo, LocalDate fecha, Mascota mascota,
            String veterinario, double costoBase, String observaciones) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.costoBase = costoBase;
        this.observaciones = observaciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    //Implementar método abstracto calcularCostoFinal()

    //Implementar método abstracto resumen()

    //Implementar método validar
    public boolean validar() {
        
        //La fecha de atención no puede ser nula

        //La fecha de atención no puede ser futura

        //El costo debe ser mayor a 0

        //Se debe asociar una mascota válida a atención

        return true;
    }
}
