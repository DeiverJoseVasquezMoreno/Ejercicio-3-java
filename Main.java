import java.util.Date;
import java.util.List;

import src.enums.*;
import src.models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear perfiles
        Profile perfil1 = new Profile("Madrid", Gender.FEMALE, "1.70m", "25-30", "Rubio", "Azules", Specialty.MODEL, "5 años");
        Profile perfil2 = new Profile("Barcelona", Gender.MALE, "1.80m", "30-35", "Castaño", "Verdes", Specialty.ACTOR, "10 años");

        // Crear representantes
        Representative representante1 = new Representative("Juan Pérez", "Calle Falsa 123", "555-1234");
        Representative representante2 = new Representative("María López", "Avenida Siempre Viva 742", "555-5678");

        // Crear candidatos
        Candidate candidato1 = new Candidate("C001", "Ana García", "Calle Mayor 1", "555-9876", new Date(), "foto1.jpg", "Madrid", Gender.FEMALE, "1.70m", "25-30", "Rubio", "Azules", Specialty.MODEL, "5 años", representante1, perfil1);
        Candidate candidato2 = new Candidate("C002", "Carlos Fernández", "Calle Menor 2", "555-8765", new Date(), "foto2.jpg", "Barcelona", Gender.MALE, "1.80m", "30-35", "Castaño", "Verdes", Specialty.ACTOR, "10 años", representante2, perfil2);

        // Crear pruebas individuales y asignar candidatos
        IndividualTest prueba1 = new IndividualTest(1, new Date(), "Sala 101", "Descripción de la prueba 1", List.of(candidato1));
        IndividualTest prueba2 = new IndividualTest(2, new Date(), "Sala 102", "Descripción de la prueba 2", List.of(candidato2));
        IndividualTest prueba3 = new IndividualTest(3, new Date(), "Sala 103", "Descripción de la prueba 3", List.of(candidato1, candidato2));

        // Crear fases de casting
        PhaseCasting fase1 = new PhaseCasting(1, new Date(), "Fase001", List.of(prueba1, prueba2));
        PhaseCasting fase2 = new PhaseCasting(2, new Date(), "Fase002", List.of(prueba3));

        // Crear agentes de casting
        CastingAgent agente1 = new CastingAgent("A001", "12345678X", "Pedro Gómez", "Calle Luna 5");
        CastingAgent agente2 = new CastingAgent("A002", "87654321Y", "Laura Martínez", "Calle Sol 10");

        // Crear castings
        Casting casting1 = new Casting("CAST001", "Colección Invierno", "Casting para línea de ropa de invierno", new Date(), 10000.0, CastingType.IN_PERSON, List.of(fase1, fase2), agente1);
        Casting casting2 = new Casting("CAST002", "Anuncio TV", "Casting para anuncio de televisión", new Date(), 5000.0, CastingType.ONLINE, List.of(), agente2);

        // Crear clientes
        Client cliente1 = new Client("CL001", "ModaCorp", "Calle Estilo 8", "555-1122", "Luis Herrera", ActivityType.FASHION);
        Client cliente2 = new Client("CL002", "CineProducciones", "Avenida Cine 15", "555-3344", "Elena Rodríguez", ActivityType.CINEMA);

        // Asignar castings a clientes
        List<Casting> castingsCliente1 = new ArrayList<>();
        castingsCliente1.add(casting1);

        List<Casting> castingsCliente2 = new ArrayList<>();
        castingsCliente2.add(casting2);

        // Mostrar resultados simulados
        System.out.println("Cliente 1 (" + cliente1.getName() + ") tiene los siguientes castings:");
        for (Casting casting : castingsCliente1) {
            System.out.println("- " + casting.getName() + ": " + casting.getDescription());
        }

        System.out.println("\nCliente 2 (" + cliente2.getName() + ") tiene los siguientes castings:");
        for (Casting casting : castingsCliente2) {
            System.out.println("- " + casting.getName() + ": " + casting.getDescription());
        }

        // Mostrar los candidatos que participaron en las pruebas del primer casting
        System.out.println("\nCandidatos que participaron en el primer casting:");
        for (PhaseCasting fase : casting1.getPhases()) {
            for (IndividualTest prueba : fase.getTests()) {
                for (Candidate candidato : prueba.getCandidates()) {
                    System.out.println("- " + candidato.getName() + " en " + prueba.getDescription());
                }
            }
        }
    }
}
