import java.util.Scanner;

public static void main(String[] args) {// inicio clase main
     int opcion;
     Calculadora cal = new Calculadora();
     Scanner entrada = new Scanner(System.in);// instanciamos la clase escanner para ingresar datos desde el teclado
     System.out.print("***Bienvenido a mi calculadora******** \n ");
     int condicion = 10;
     while (condicion == 10) {
          System.out.print(
                    "Ingresa una opcion para comensar: \n 1-Suma  \n 2-Resta \n 3-Multiplicacion \n 4-Divicion \n 5-Salir \n");
          opcion = entrada.nextInt(); // creamos la variable opcion para guardar los valoes de 1 al 4 para nuestro
                                      // switch
          // creamos dos variables globales
          Double primero = 0.0;
          Double segundo = 0.0;

          switch (opcion) {
               case 1:
                    System.out.println("Elegiste la opcion Suma \n");
                    System.out.print("Ingresa primer numero:");
                    primero = entrada.nextDouble();
                    System.out.print("Ingresa segundo numero:");
                    segundo = entrada.nextDouble();
                    Double totalsuma = 0.0;
                    totalsuma = cal.suma(primero, segundo);// envia los valores dentro del parentesis al metodo de suma
                    System.out.print("El resultado de la suma es:" + totalsuma);
                    break;
               case 2:
                    System.out.print("Elegiste la opcion Resta \n");
                    System.out.print("Ingresa primer numero:");
                    primero = entrada.nextDouble();
                    System.out.print("Ingresa segundo numero:");
                    segundo = entrada.nextDouble();
                    Double totalresta = 0.0;
                    totalresta = cal.resta(primero, segundo);
                    System.out.print("El resultado de la resta es:" + totalresta);
                    break;
               case 3:
                    System.out.print("Elegiste la opcion Multiplicacion \n");
                    System.out.print("Ingresa primer numero:");
                    primero = entrada.nextDouble();
                    System.out.print("Ingresa segundo numero:");
                    segundo = entrada.nextDouble();
                    Double totalmultiplicacion = 0.0;
                    totalmultiplicacion = cal.multiplicacion(primero, segundo);
                    System.out.print("El resultado de la multiplicacion es:" + totalmultiplicacion);
                    break;
               case 4:
                    System.out.print("Elegiste la opcion Divicion \n");
                    System.out.print("Ingresa primer numero:");
                    primero = entrada.nextDouble();
                    System.out.print("Ingresa segundo numero:");
                    segundo = entrada.nextDouble();
                    Double totaldivicion = 0.0;
                    totaldivicion = cal.divicion(primero, segundo);
                    System.out.print("El resultado de la divicion es:" + totaldivicion);
                    break;
               case 5:
                    System.out.print("Adios............");
                    System.exit(0);
                    break;
               default:
                    System.out.print("Por favor elige una opcion valida \n");
                    break;

          }

     } // fin del while

}// fin clase main
