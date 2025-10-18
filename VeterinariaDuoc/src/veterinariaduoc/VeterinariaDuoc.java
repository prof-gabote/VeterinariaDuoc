/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veterinariaduoc;

import java.time.LocalDate;

/**
 *
 * @author Gabote
 */
public class VeterinariaDuoc {

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        Veterinaria vet = new Veterinaria();

        Propietario juan = new Propietario("Juan Pérez", "987654321");
        Propietario ana = new Propietario("Ana López", "945612378");
        Propietario pedro = new Propietario("Pedro Rivas", "911223344");

        Mascota perro = new Mascota("Rocky", "Perro", 12.3, juan);
        Mascota gato = new Mascota("Michi", "Gato", 4.5, ana);
        Mascota hamster = new Mascota("Chispa", "Hamster", 0.8, pedro); // pesa menos de 1 kg

        System.out.println("=== REGISTRO DE ATENCIONES ===");

        //  Caso 1: atención válida
        vet.registrarAtencion(new Consulta("A001", LocalDate.now(), perro, "Dr. Silva",
                20000, "Control anual", true, false));

        //  Caso 2: Aseo válido
        vet.registrarAtencion(new Aseo("A002", LocalDate.now(), gato, "Dra. Paredes",
                15000, "Baño con shampoo hipoalergénico", true, true));

        //  Caso 3: Hospitalización válida
        vet.registrarAtencion(new Hospitalizacion("A003", LocalDate.now(), perro, "Dr. Soto",
                25000, "Post cirugía", 6));

        //  Caso 4: Costo base menor a $10.000 → debería mostrar advertencia
        vet.registrarAtencion(new Aseo("A004", LocalDate.now(), gato, "Dra. Vega",
                8000, "Baño rápido", false, false));

        //  Caso 5: Peso excesivo (>50 kg) → debería mostrar advertencia
        Mascota mastin = new Mascota("Hércules", "Perro", 65.0, juan);
        vet.registrarAtencion(new Aseo("A005", LocalDate.now(), mastin, "Dra. Vega",
                12000, "Baño general", true, false));

        //  Caso 6: Fecha futura → debe ser rechazada por validación en superclase
        vet.registrarAtencion(new Consulta("A006", LocalDate.now().plusDays(2), gato,
                "Dr. Silva", 18000, "Control futuro", false, false));

        //  Caso 7: Sedación con peso <1 kg → advertencia de Consulta
        vet.registrarAtencion(new Consulta("A007", LocalDate.now(), hamster,
                "Dr. Ramírez", 18000, "Chequeo dental", false, true));

        //  Mostrar resultados
        vet.listarAtenciones();
        System.out.println("\n💰 Total general: $" + vet.calcularTotal());
    }
}
