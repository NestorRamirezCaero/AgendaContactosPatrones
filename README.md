# Agenda de Contactos en Java

Este proyecto implementa una agenda de contactos simple en la terminal usando el lenguaje **Java**. Permite **añadir**, **buscar**, **editar** y **eliminar** contactos. demostrando el uso de tres **patrones de diseño**.

##  Funcionalidades

- Añadir nuevo contacto (nombre, teléfono y correo)
- Buscar contacto por nombre
- Editar teléfono y correo de un contacto existente
- Eliminar contacto
- Listar todos los contactos
- Agregar contacto externo (simulado) usando patrón Adapter

##  Patrones de diseño usados

### 1. Singleton (Creacional)
Utilizado en la clase `Agenda` para asegurar que solo exista una instancia de la agenda en todo el programa. Garantiza consistencia entre las operaciones.

### 2. Adapter (Estructural)
La clase `AdaptadorContactoExterno` adapta una clase `ContactoExterno` con una estructura diferente al formato usado internamente. Esto permite integrar contactos externos como si fueran locales.

### 3. Command (Comportamiento)
Cada acción (agregar, buscar/editar/eliminar) se encapsula en clases que implementan la interfaz `Comando`. Esto permite separar la lógica de ejecución y facilita mantener el código.






