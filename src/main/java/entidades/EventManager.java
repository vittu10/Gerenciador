package entidades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 * Esta classe é responsável por gerenciar os eventos.
 */
public class EventManager {
	
	    private List<Event> events;
	    /**
	     * Construtor padrão que inicializa a lista de eventos.
	     */
	    public EventManager() {
	        this.events = new ArrayList<>();
	    }
	    /**
	     * Adiciona um evento à lista de eventos.
	     * 
	     * @param event O evento a ser adicionado.
	     */

	    public void addEvent(Event event) {
	        events.add(event);
	        events.sort(Comparator.comparing(Event::getDate));

	    }
	    /**
	     * Retorna todos os eventos cadastrados.
	     * 
	     * @return Uma lista contendo todos os eventos cadastrados.
	     */

	    public List<Event> getEvents() {
	        return events;
	    }
	    /**
	     * Retorna uma lista de eventos de uma categoria específica.
	     * 
	     * 
	     * 
	     * @param category A categoria dos eventos desejados.
	     * @return Uma lista contendo os eventos da categoria especificada.
	     */

	    public List<Event> getEventsByCategory(String category) {
	        List<Event> filteredEvents = new ArrayList<>();
	        for (Event event : events) {
	            if (event.getCategory().equals(category)) {
	                filteredEvents.add(event);
	            }
	        }
	        return filteredEvents;
	    }
	}

