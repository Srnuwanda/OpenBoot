public class Ejercicio8 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Santiago");
        persona.setEdad(23);
        persona.setTelefono(911);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}