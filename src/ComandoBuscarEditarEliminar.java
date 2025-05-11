import java.util.Scanner;

public class ComandoBuscarEditarEliminar implements Comando {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del contacto: ");
        String nombre = sc.nextLine();
        Contacto c = Agenda.obtenerInstancia().buscarContacto(nombre);

        if (c == null) {
            System.out.println("Contacto no encontrado.");
            return;
        }

        System.out.println("1. Editar\n2. Eliminar");
        String opcion = sc.nextLine();

        if (opcion.equals("1")) {
            System.out.print("Nuevo Teléfono: ");
            c.setTelefono(sc.nextLine());
            System.out.print("Nuevo Correo: ");
            c.setCorreo(sc.nextLine());
            System.out.println("Contacto actualizado.");
        } else if (opcion.equals("2")) {
            Agenda.obtenerInstancia().eliminarContacto(nombre);
            System.out.println("Contacto eliminado.");
        }
    }
}