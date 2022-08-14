public class NewMain {

    public static void main(String[] args) {
    int numeroif = 50;
    int numerowhile = 0;
    int numerodowhile = 2;
    int numerofor;
    String estacion = "hola";

if (numeroif>0){
System.out.println("Es positivo");
    } else if (numeroif==0){
    System.out.println("Es cero");
        } else {System.out.println("Es negativo");
       }

while (numerowhile<3){
     numerowhile = numerowhile +1;
     System.out.println(numerowhile);
}

do {numerodowhile = numerodowhile+1;
System.out.println(numerodowhile);
} while (numerodowhile<3);

for (numerofor = 0; numerofor<=3; numerofor = numerofor+1){
System.out.println(numerofor);
}

switch(estacion){
        case "verano":
        System.out.println("Es verano");
        break;
        case "invierno":
        System.out.println("Es invierno");
        break;
        case "otoño":
        System.out.println("Es otoño");
        break;
        case "primavera":
        System.out.println("Es primavera");
        break;
        default:
        System.out.println("No es una estación");
}
}
}

