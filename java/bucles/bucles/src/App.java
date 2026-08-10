import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
   Scanner sc = new Scanner (System.in);

//BUCLE WHILE (NO EJECUTA EL CODIGO SI NO CUMPLE CON LA CONDICION PROPUESTA)
/*WHILE(CONDICION){
    "CODIGO"
}

 int edad;
 System.out.print("ingrese un numero");
 edad=sc.nextInt();
while (edad < 18){ //este codigo se va a ejecutar solo si la edad es menor a 18 


System.out.print("Ingrese una edad valida (18 o mas): ");

edad=sc.nextInt();//SE VUELVE A PONER PARA QUE PREGUNTE DE NUVEO EL NUMERO
}
//si la edad es mayor a 18 no se ejecuta el while y pasa directamente a la siguiente linea
System.out.print("usted es mayor de edad: acceso permitido");
*/




//BUCLE DO WHILE EL DO-WHILE SE EJECUTA AL MENOS UNA VEZ PARA VER SI LA CONDICION ES VERDADERA O NO AL REVE DE WHIE QUE PRIMERO DECIDE Y DESPUES EJECUTA


/*do {
    // Código que se ejecuta AL MENOS UNA VEZ
} while (condicion); 

int edad;


do{
System.out.print("ingrese su edad (debe ser mayor de 18 años): ");
edad=sc.nextInt();
}while(edad <= 18);
System.out.print("usted es mayor de edad,acceso valido");


//while: Se usa cuando quizás no necesites ejecutar el código ni una sola vez si la condición falla de entrada.

//do-while: Se usa cuando necesitás obligatoriamente que el código se ejecute la primera vez (ideal para pedir datos por consola o mostrar menús de opciones).
*/


//BUCLE FOR CONTROLA LA CANTIDAD DE VECES QUE QUERES QUE SE REPITA UNA OPERACION
 /*for (inicializacion; condicion; incremento){
        int i = 0       i < 5          i++

        inicializacion declara una variable de contador
        condicion: Se evalúa antes de cada repetición. Mientras sea verdadera, el bucle sigue.
        Incremento (i++): Se ejecuta al final de cada vuelta para sumar o restar al contador
    } */

//TAMBIEN ESTAN LAS SALIDAS ANTICIPADAS (BREAK/ CONTINUE)
//BREAK UNA VEZ QUE SE ENCONTRO LA CONDICION PROPUESTA SE CORTA EL BUCLE

/*for (int i = 1; i <= 100; i++) {
        if (i == 7) {
            System.out.println("¡Encontré el 7! Cortando el bucle...");
            break; // <--- SALE ANTICIPADAMENTE ACÁ
    }
        ystem.out.println("Buscando, voy por el número: " + i);
    }*/






        //DSIÑAR UN PROGRAMA QUE MUESTRE QUE CADA NUMERRO INGRESADO ES PAR O IMPAR, SI ES POSITIVO Y SU CUADRADO. ESTO SE TIENE QUE REPETIR HASTA QUE EL NUMERO INGRESADO SEA 0

        /*int num;
            System.out.print("ingrese un numero");
            num =sc.nextInt();

            while(num !=0 ){
                int cuadrado = num*num;
                if(num % 2 == 0){
                System.out.print("el numero ingresado es par: "+ num +" ");
                }else {
                    System.out.print("el numero ingresdo es impar: "+num +" ");
                }if(num > 0 ){
                System.out.print("el numero ingresado es positivo: "+num);
                }else
                    System.out.print("el numero ingresado es negativo: "+num + " " );

                    System.out.print("Su cuadrado es: "+ cuadrado +" ");
                
                    System.out.print("Ingrese otro numero: ");
                            num = sc.nextInt();
            }
        System.out.print("usted ingreso el numero 0, finalizo el programa");
        sc.close();*/
        





        //calcular datos estadisticos de las edades de los alumnos , se introdujeran datos hasta que uno sea negativo, al final tiene que mostrar todas las edades, la media, de cuantos alumnos hemos introducidos las edades y cuantos alumnos son mayores de edad.

        int alumnos=0;//contador de alumnos
        int sumaedad=0;//acumulador de edad
        int sumaedadMayor=0;//contador de mayor edad
        int edad;
        System.out.print("introduzca edad: ");
        edad=sc.nextInt();

        while(edad >= 0){
            sumaedad +=edad;//acumulacioon de datos,
            alumnos++;//incrementamos,suma 1 cada vez que se introduce una edad
                
            if(edad>=18){
                    sumaedadMayor++;//contador de edades mayor(incrementa)
                
                }
                System.out.print("introduzca edad: ");
                edad=sc.nextInt();
                

        }
                System.out.print("suma de todas las edades: "+sumaedad +" ");
                System.out.print("todas las edades sumadas: "+alumnos +" ");
                System.out.print("mayores de edad: "+sumaedadMayor);

 }
 
}






















































