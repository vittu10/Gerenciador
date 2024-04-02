package Programa;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import entidades.Event;
import entidades.EventManager;

public class Main {

	public static void main(String[] args) {
		EventManager eventManager = new EventManager();

		Scanner scanner = new Scanner(System.in);
		

		while (true) {
			System.out.println("Digite o nome do evento (ou 'sair' para sair):");
			String name = scanner.nextLine();
			if (name.equalsIgnoreCase("sair")) {
				break;
			}

			System.out.println("Digite a categoria do evento:");
			String category = scanner.nextLine();

			System.out.println("Digite a data do evento (formato YYYY-MM-DD):");
			LocalDate date = LocalDate.parse(scanner.nextLine());

			System.out.println("Digite o local do evento:");
			String location = scanner.nextLine();

			Event event = new Event(name, category, date, location);
			eventManager.addEvent(event);

			System.out.println("Evento adicionado com sucesso!");
		}

		System.out.println("\nEventos marcados e em ordem de data:");
		for (Event event : eventManager.getEvents()) {
			System.out.println(
					"Evento: " + event.getName() + ", Data: " + event.getDate() + ", Local: " + event.getLocation());
		}

		scanner.close();
	}

}
