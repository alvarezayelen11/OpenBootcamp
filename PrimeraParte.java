public class PrimeraParte {

public static void main(String[] parameters) {
int resultado = Mifuncion (10,20,30);
System.out.println(resultado);
Coche Micoche = new Coche ();
Micoche.añadirpuerta();
System.out.println(Micoche.puertas);
}

public static int Mifuncion (int a,int b,int c){
return a+b+c;
}
}
