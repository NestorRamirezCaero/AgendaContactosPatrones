import java.util.Scanner;
// PATRÓN COMMAND (Comportamiento):
// Esta clase implementa una acción concreta (agregar contacto) como un comando.
// El patrón Command encapsula las solicitudes como objetos, permitiendo
// manejar operaciones de forma flexible y desacoplada del menú principal.
public class ComandoAgregar implements Comando {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();
        System.out.print("Correo: ");
        String correo = sc.nextLine();

        Contacto nuevo = new Contacto(nombre, telefono, correo);
        Agenda.obtenerInstancia().agregarContacto(nuevo);
        System.out.println("Contacto agregado.");
    }
}