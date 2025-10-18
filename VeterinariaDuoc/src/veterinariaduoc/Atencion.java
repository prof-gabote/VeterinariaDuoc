/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinariaduoc;

import java.time.LocalDate;

/**
 *
 * @author Gabote
 */
public abstract class Atencion implements Facturable {

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

    public abstract double calcularCostoFinal();

    public abstract String resumen();

    public boolean validar() {
        if (fecha == null) {
            System.out.println("La fecha de la atención " + getCodigo() + " no puede ser nula.");
            return false;
        }
        if (fecha.isAfter(LocalDate.now())) {
            System.out.println("La fecha de la atención " + getCodigo() + " no puede ser futura.");
            return false;
        }
        if (costoBase <= 0) {
            System.out.println("El costo base de la atención " + getCodigo() + " debe ser mayor a cero.");
            return false;
        }
        if (mascota == null) {
            System.out.println("Debe asociarse una mascota válida a la atención " + getCodigo() + ".");
            return false;
        }
        return true;
    }
}
