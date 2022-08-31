public class Switch {

    public static void main(String[] args) {
        var ESTACION = "INVIERNO";

        switch(ESTACION){
            case "PRIMAVERA":
            System.out.println("estamos en PRIMAVERA");
            break;
            case "OTOÑO":
                System.out.println("estamos en OTOÑO");
                break;
            case "VERANO":
                System.out.println("estamos en VERANO");
                break;
            case "INVIERNO":
                System.out.println("estamos en INVIERNO");
                break;
            default:
                System.out.println("No hay estacion, clima tropical");



        }

    }
}

