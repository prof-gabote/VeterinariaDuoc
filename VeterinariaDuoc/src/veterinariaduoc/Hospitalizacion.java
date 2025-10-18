/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinariaduoc;

import java.time.LocalDate;

//Se debe establecer la herencia
public class Hospitalizacion {

    private int diasEstadia;

    //Se debe generar el cosntructor en herencia
    public Hospitalizacion() {
    }
   

    public int getDiasEstadia() {
        return diasEstadia;
    }

    public void setDiasEstadia(int diasEstadia) {
        this.diasEstadia = diasEstadia;
    }
    
    //Se debe sobreescribir calcularCostoFinal()
    
    //Se debe sobreescribir resumen() "[" + super.getCodigo() + "] " + super.getFecha() + " - Hospitalización (Base: $" + super.getCostoBase() + ") - Total: $" + calcularCostoFinal();

}
