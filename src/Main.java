import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {1
            System.out.println("\n1. Agregar Contacto");
            System.out.println("2. Buscar/Editar/Eliminar");
            System.out.println("3. Mostrar Todos");
            System.out.println("4. Agregar Contacto Externo");
            System.out.println("5. Salir");

            String opcion = sc.nextLine();
            Comando comando;

            switch (opcion) {
                case "1":
                    comando = new ComandoAgregar();
                    comando.ejecutar();
                    break;
                case "2":
                    comando = new ComandoBuscarEditarEliminar();
                    comando.ejecutar();
                    break;
                case "3":
                    for (Contacto c : Agenda.obtenerInstancia().obtenerTodos()) {
                        System.out.println(c);
                    }
                    break;
                case "4":
                    ContactoExterno externo = new ContactoExterno("Mario López", "999999999", "mario@ejemplo.com");
                    Contacto adaptado = new AdaptadorContactoExterno(externo);
                    Agenda.obtenerInstancia().agregarContacto(adaptado);
                    System.out.println("Contacto externo agregado mediante Adaptador.");
                    break;
                case "5":
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}