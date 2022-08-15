package openbootcamp.persona;

public class OpenBootcampPersona {

public static void main(String[] args) {
       Persona persona = new Persona();

persona.setNombre ("Camila");
persona.setEdad(15);
persona.setTelefono("15-3001-6070");

System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años y su teléfono es " + persona.getTelefono());
}  
}
