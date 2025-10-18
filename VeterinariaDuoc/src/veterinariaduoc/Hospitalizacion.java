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
public class Hospitalizacion extends Atencion {

    private int diasEstadia;

    public Hospitalizacion() {
    }
    
    public Hospitalizacion(String codigo, LocalDate fecha, Mascota mascota, String veterinario,
            double costoBase, String observaciones, int diasEstadia) {
        super(codigo, fecha, mascota, veterinario, costoBase, observaciones);
        this.diasEstadia = diasEstadia;
    }

    public int getDiasEstadia() {
        return diasEstadia;
    }

    public void setDiasEstadia(int diasEstadia) {
        this.diasEstadia = diasEstadia;
    }

    @Override
    public double calcularCostoFinal() {
        double total = diasEstadia * getCostoBase();
        if (diasEstadia > 5) {
            total *= 0.9; // 10% de descuento
        }
        return total;
    }

    @Override
    public String resumen() {
        return "[" + super.getCodigo() + "] " + super.getFecha() + " - Hospitalización (Base: $" + super.getCostoBase() + ") - Total: $" + calcularCostoFinal();
    }

}
