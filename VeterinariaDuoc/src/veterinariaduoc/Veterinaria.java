/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinariaduoc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabote
 */
public class Veterinaria {

    private List<Atencion> atenciones = new ArrayList<>();

    public Veterinaria() {
    }

    public void registrarAtencion(Atencion a) {
        if (a.validar()) {
            atenciones.add(a);
            System.out.println("Atención registrada correctamente: " + a.getCodigo());
            return;
        }
        System.out.println("No fue posible registrar la atención: " + a.getCodigo());
    }

    public void listarAtenciones() {
        if (atenciones.isEmpty()) {
            System.out.println(" No hay atenciones registradas.");
            return;
        }
        
        System.out.println("\n LISTADO DE ATENCIONES");
        for (Atencion a : atenciones) {
            
            System.out.println(a.resumen() + " - Mascota: " + a.getMascota().obtenerDetalle());
        }
        System.out.println("Total de atenciones: " + atenciones.size());
    }

    public double calcularTotal() {
        double total = 0;
        for (Atencion a : atenciones) {
            total += a.calcularCostoFinal();
        }
        return total;
    }
}
