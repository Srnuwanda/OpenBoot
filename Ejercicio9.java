public class Ejercicio9 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Santiago";
        cliente.edad = 23;
        cliente.telefono = 911;
        cliente.credito = 5000;
        System.out.println(cliente.nombre + "Edad:" + cliente.edad + "Telefono:" + cliente.telefono
                + "Sueldo:" + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Petro";
        trabajador.edad = 62;
        trabajador.telefono = 911911;
        trabajador.salario = 10000;
        System.out.println(trabajador.nombre + "Edad:" + trabajador.edad + "Telefono:" + trabajador.telefono
                + "Sueldo:" + trabajador.salario);

    }
}

class Persona{

    String nombre;
    int telefono;
    int edad;

}
class Cliente extends Persona{
    double credito;
}
class Trabajador extends Persona {
    double salario;
}