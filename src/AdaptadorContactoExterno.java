// PATRÓN ADAPTER (Estructural):
// Esta clase adapta un objeto ContactoExterno, cuya interfaz es diferente,
// para que pueda ser usado como un Contacto en nuestro sistema.
// Esto permite integrar clases externas sin modificar el código existente.
public class AdaptadorContactoExterno extends Contacto {
    public AdaptadorContactoExterno(ContactoExterno externo) {
        super(externo.nombreCompleto(), externo.numeroTelefono(), externo.direccionCorreo());
    }
}