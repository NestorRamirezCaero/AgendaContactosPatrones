import java.util.ArrayList;
import java.util.List;
// PATRÓN SINGLETON (Creacional):
// Esta clase utiliza el patrón Singleton para asegurar que solo exista
// una única instancia de la Agenda en todo el sistema.
// Esto permite tener una lista de contactos centralizada y coherente.
public class Agenda {
    private static Agenda instancia;
    private List<Contacto> contactos;

    private Agenda() {
        contactos = new ArrayList<>();
    }

    public static Agenda obtenerInstancia() {
        if (instancia == null) {
            instancia = new Agenda();
        }
        return instancia;
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public Contacto buscarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    public boolean eliminarContacto(String nombre) {
        Contacto c = buscarContacto(nombre);
        if (c != null) {
            contactos.remove(c);
            return true;
        }
        return false;
    }

    public List<Contacto> obtenerTodos() {
        return contactos;
    }
}