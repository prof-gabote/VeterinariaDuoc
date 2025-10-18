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
public class Aseo extends Atencion {

    private boolean incluyeCorte;
    private boolean incluyeDesparasitado;

    public Aseo() {
        super(null, null, null, null, 0, null);
    }

    public Aseo(String codigo, LocalDate fecha, Mascota mascota, String veterinario,
            double costoBase, String observaciones,
            boolean incluyeCorte, boolean incluyeDesparasitado) {
        super(codigo, fecha, mascota, veterinario, costoBase, observaciones);
        this.incluyeCorte = incluyeCorte;
        this.incluyeDesparasitado = incluyeDesparasitado;
    }

    public boolean isIncluyeCorte() {
        return incluyeCorte;
    }

    public void setIncluyeCorte(boolean incluyeCorte) {
        this.incluyeCorte = incluyeCorte;
    }

    public boolean isIncluyeDesparasitado() {
        return incluyeDesparasitado;
    }

    public void setIncluyeDesparasitado(boolean incluyeDesparasitado) {
        this.incluyeDesparasitado = incluyeDesparasitado;
    }
    
    @Override
    public double calcularCostoFinal() {
        double total = getCostoBase() + (getMascota().getPeso() * 1000);
        if (incluyeCorte) {
            total += 3000;
        }
        if (incluyeDesparasitado) {
            total += 5000;
        }
        return total;
    }

    @Override
    public String resumen() {
        return "[" + super.getCodigo() + "] " + super.getFecha() + " - Aseo (Base: $" + super.getCostoBase() + ") - Total: $" + calcularCostoFinal();
    }
    
    @Override
    public boolean validar (){
        if(!super.validar())
            return false;
        if (getCostoBase() < 10000) {
            System.out.println("Advertencia - La atención " + getCodigo() + " tiene un precio menor a $10000");
            return false;
        }
        if (getMascota().getPeso() > 50) {
            System.out.println("Advertencia- La mascota de la atención " + getCodigo() + " tiene un peso mayor a 50kg");
            return false;
        }
        return true;
    }

}
