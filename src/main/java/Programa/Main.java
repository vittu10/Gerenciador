package Programa;

import java.time.LocalDate;
import java.util.List;

import entidades.Event;
import entidades.EventManager;

public class Main {

	public static void main(String[] args) {
	    EventManager eventManager = new EventManager();

        // Adicione alguns eventos
	    eventManager.addEvent(new Event("Conferência de Negócios", "Conferência", LocalDate.of(2024, 9, 5), "Salvador"));
	    eventManager.addEvent(new Event("Conferência de Ciência", "Conferência", LocalDate.of(2024, 11, 13), "Salvador"));
	    eventManager.addEvent(new Event("Conferência de Educação", "Conferência", LocalDate.of(2024, 12, 9), "Salvador"));
	    eventManager.addEvent(new Event("Conferência de TI", "Conferência", LocalDate.of(2024, 10, 20), "Salvador"));
	    eventManager.addEvent(new Event("Workshop de Desenvolvimento Web", "Workshop", LocalDate.of(2024, 11, 15), "Salvador"));
	    eventManager.addEvent(new Event("Seminário de Marketing Digital", "Seminário", LocalDate.of(2024, 12, 5), "Salvador"));
	    eventManager.addEvent(new Event("Seminário de Inovação Tecnológica", "Seminário", LocalDate.of(2024, 2, 13), "Salvador"));
	    eventManager.addEvent(new Event("Seminário de Empreendedorismo", "Seminário", LocalDate.of(2024, 5, 15), "Salvador"));
	    eventManager.addEvent(new Event("Seminário de Inteligência Artificial", "Seminário", LocalDate.of(2024, 12, 9), "Salvador"));
	    eventManager.addEvent(new Event("Seminário de Tecnologia da Informação", "Seminário", LocalDate.of(2024, 12, 10), "Salvador"));
	    eventManager.addEvent(new Event("Seminário de Gestão de Projetos", "Seminário", LocalDate.of(2024, 12, 10), "Salvador"));
	    eventManager.addEvent(new Event("Seminário de Desenvolvimento de Software", "Seminário", LocalDate.of(2024, 12, 10), "Salvador"));
	    eventManager.addEvent(new Event("Seminário de Big Data", "Seminário", LocalDate.of(2024, 12, 10), "Salvador"));
	    eventManager.addEvent(new Event("Seminário de Segurança da Informação", "Seminário", LocalDate.of(2024, 12, 10), "Salvador"));
	    eventManager.addEvent(new Event("Workshop de Design Thinking", "Workshop", LocalDate.of(2024, 8, 15), "Salvador"));
	    eventManager.addEvent(new Event("Workshop de Desenvolvimento de Jogos", "Workshop", LocalDate.of(2024, 9, 5), "Salvador"));
	    eventManager.addEvent(new Event("Workshop de Fotografia", "Workshop", LocalDate.of(2024, 10, 13), "Salvador"));
	    eventManager.addEvent(new Event("Workshop de Liderança", "Workshop", LocalDate.of(2024, 11, 9), "Salvador"));
        

        // Liste todos os eventos
        List<Event> allEvents = eventManager.getEvents();
        for (Event event : allEvents) {
            System.out.println("Evento: " + event.getName() + ", Data: " + event.getDate() + ", Local: " + event.getLocation());
        }

        // Liste os eventos de uma categoria específica
        List<Event> categoryEvents = eventManager.getEventsByCategory("Seminário");
        System.out.println("\nEventos de Workshop:");
        for (Event event : categoryEvents) {
            System.out.println("Evento: " + event.getName() + ", Data: " + event.getDate() + ", Local: " + event.getLocation());
        }
     
    }

}