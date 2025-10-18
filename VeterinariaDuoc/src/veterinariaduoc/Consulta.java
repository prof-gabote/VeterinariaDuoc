/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinariaduoc;

import java.time.LocalDate;

//Se debe establecer la herencia
public class Consulta {

    private boolean incluyeVacunas;
    private boolean requiereSedacion;

    //Se debe generar el cosntructor en herencia
    public Consulta() {
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
    
    //Se debe sobreescribir calcularCostoFinal()
    
    //Se debe sobreescribir resumen()
    //"[" + super.getCodigo() + "] " + super.getFecha() + " - Consulta (Base: $" + super.getCostoBase() + ") - Total: $" + calcularCostoFinal();
}
