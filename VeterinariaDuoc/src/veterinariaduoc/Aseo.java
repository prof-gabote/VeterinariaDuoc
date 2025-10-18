/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinariaduoc;

import java.time.LocalDate;


//Se debe establecer la herencia
public class Aseo {

    private boolean incluyeCorte;
    private boolean incluyeDesparasitado;

    //Se debe generar el cosntructor en herencia
    public Aseo() {
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

    //Se debe sobreescribir calcularCostoFinal()
    
    //Se debe sobreescribir resumen() "[" + super.getCodigo() + "] " + super.getFecha() + " - Aseo (Base: $" + super.getCostoBase() + ") - Total: $" + calcularCostoFinal();
    
    //Se debe sobreescribir validar ()
    
        //El costo no debe ser menor a 10000
    
        //El peso de la mascota no debe ser mayor a 50kg
}
