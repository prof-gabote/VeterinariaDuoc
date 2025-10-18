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
public class Consulta extends Atencion {

    private boolean incluyeVacunas;
    private boolean requiereSedacion;

    public Consulta() {
    }

    public Consulta(String codigo, LocalDate fecha, Mascota mascota, String veterinario,
            double costoBase, String observaciones,
            boolean incluyeVacunas, boolean requiereSedacion) {
        super(codigo, fecha, mascota, veterinario, costoBase, observaciones);
        this.incluyeVacunas = incluyeVacunas;
        this.requiereSedacion = requiereSedacion;
    }

    public boolean isIncluyeVacunas() {
        return incluyeVacunas;
    }

    public void setIncluyeVacunas(boolean incluyeVacunas) {
        this.incluyeVacunas = incluyeVacunas;
    }

    public boolean isRequiereSedacion() {
        return requiereSedacion;
    }

    public void setRequiereSedacion(boolean requiereSedacion) {
        this.requiereSedacion = requiereSedacion;
    }

    @Override
    public double calcularCostoFinal() {
        double total = getCostoBase();
        if (incluyeVacunas) {
            total += 7000;
        }
        if (requiereSedacion) {
            total += 5000;
        }
        return total;
    }

    @Override
    public String resumen() {
        return "[" + super.getCodigo() + "] " + super.getFecha() + " - Consulta (Base: $" + super.getCostoBase() + ") - Total: $" + calcularCostoFinal();
    }
}
