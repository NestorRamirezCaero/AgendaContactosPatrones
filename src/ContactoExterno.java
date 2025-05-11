public class ContactoExterno {
    private String nombre;
    private String telefono;
    private String correo;

    public ContactoExterno(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String nombreCompleto() { return nombre; }
    public String numeroTelefono() { return telefono; }
    public String direccionCorreo() { return correo; }
}