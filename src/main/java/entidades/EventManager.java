package entidades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 * Esta classe é responsável por gerenciar os eventos.
 */
public class EventManager {

	    /**
	     * Lista de eventos gerenciados.
	     */
	    private List<Event> events;

	    /**
	     * Construtor da classe EventManager.
	     * Inicializa a lista de eventos como uma nova ArrayList.
	     */
	    public EventManager() {
	        this.events = new ArrayList<>();
	    }

	    /**
	     * Adiciona um evento à lista de eventos e ordena a lista por data.
	     * @param event O evento a ser adicionado.
	     */
	    public void addEvent(Event event) {
	        events.add(event);
	        events.sort(Comparator.comparing(Event::getDate));
	    }

	    /**
	     * Obtém todos os eventos gerenciados.
	     * @return Uma lista contendo todos os eventos.
	     */
	    public List<Event> getEvents() {
	        return events;
	    }

	    /**
	     * Obtém uma lista de eventos filtrados por categoria.
	     * @param category A categoria pela qual filtrar os eventos.
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


