package lifelink.usermanagement.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lifelink.usermanagement.event.EventContent;

/**
 * Created by Joao_Jardim on 02/06/17.
 */

public class EventContent  {

    /**
     * An array of (Event) events.
     */
    public static List<EventContent.Event> events = new ArrayList<EventContent.Event>();

    /**
     * A map of (Event) events, by ID.
     */
    public static Map<String, EventContent.Event> ITEM_MAP = new HashMap<String, EventContent.Event>();

    private static void addItem(EventContent.Event event) {
        events.add(event);
        ITEM_MAP.put(event.id, event);
    }

    private static String makeDetails(EventContent.Event event) {
        StringBuilder builder = new StringBuilder();
        builder.append("Detalhes: ");
        builder.append("\nId: ").append(event.id);
        builder.append("\nTitulo: ").append(event.titulo);
        builder.append("\nSubtitulo: ").append(event.subtitulo);
        builder.append("\nData: ").append(event.dataEvento);
        builder.append("\nStreet: ").append(event.descricao);
        return builder.toString();
    }

    /**
     * A Event data representation.
     */
    public static class Event {
        public String id;
        public String titulo;
        public String subtitulo;
        public String dataEvento;
        public String descricao;
        public String cadastro;
        public String __v;

        @Override
        public String toString() {
            return titulo + '\n' + subtitulo;
        }

        public Event(String id, String titulo, String subtitulo, String dataEvento, String descricao, String cadastro, String __v) {
            this.id = id;
            this.titulo = titulo;
            this.subtitulo = subtitulo;
            this.dataEvento = dataEvento;
            this.descricao = descricao;
            this.cadastro = cadastro;
            this.__v = __v;
            addItem(this);
        }
    }
}
