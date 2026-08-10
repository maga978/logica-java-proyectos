import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc =new Scanner (System.in);



       // DISEÑAR UNA APLICACIÓN QUE SOLICITE AL USUARIO UN NÚMERO E INDIQUE SI ES PAR O IMPAR

/*int num;
System.out.print("introduzca un numero: ");
num = sc.nextInt();

if (num % 2 == 0) {
    System.out.println("el numero es par");
} else {
    System.out.println("el numero es impar");
}*/
//FIN DEL EJERCCIO

//PEDIR DOS NUMEROS ENTEROS Y DECIR SI SON IGUALES
 /*int num1;
 int num2;
 System.out.print("ingrese el primer numero: ");
 num1=sc.nextInt();
 System.out.print("ingrese el segundo numero: ");
 num2=sc.nextInt();

 if(num1==num2){
System.out.print("los numeros ingresados son iguales: " + num1 +" " + "y" +" "+ num2);
 }else{
System.out.print("los numeros ingresados son distintos: " + num1 +" " + "y" +" "+ num2);
 }*/

//fin del ejercicio

//SOLICITAR DOS NUMEROS DISTINTO Y MOSTRAR CUAL ES EL MAYOR
/*int num1;
int num2;
System.out.print("ingrese el primer numero: ");
num1=sc.nextInt();

System.out.print("ingrese el segundo numero: ");
num2=sc.nextInt();
if(num1 > num2){
System.out.print("el el primer numero es el mayor"+ num1 + " ");
}else{
    System.out.print("el segundo numero es el mayor: " + num2 +" ");
}*/

//IMPLEMENTAR UN PRGRAMA QUE PIDA UN NUMERO DECIMAL E INDIQUE SI ES U NUMERO CASI CERO

/*double num;
System.out.print("ingrese un numero: ");
num=sc.nextDouble();
if((num>0 && num<1)||(num < 0 && num > -1)){
System.out.print("el numero es un casi cero");
}else{
System.out.print("el numero no entra enn el grupo de casi cero");
}*/

//PEDIR DOS NUMEROS Y MOSTRARLOS ORDENADOS DE FORMA DECRECIENTE

/*int num1;
int num2;
System.out.print("ingrese el  primer numero: ");
num1=sc.nextInt();
System.out.print("ingrese el segundo numero: ");
num2=sc.nextInt();
if((num1>num2)||(num2<num1)){
System.out.print("el primer numero es el mayor: "+num1+ " " +"mayor"+ " " +num2+ " " + "menor");
}else{
    System.out.print("el segundo numero es el mayor: "+num2+ " " +"mayor"+ " " +num1+" "+"menor");
}*/

//pedir tres numeros y mostrarlos ordenados de mayor a menor
/*int num1;
int num2;
int num3;
 System.out.print("introduzca el primer numero: ");
 num1=sc.nextInt();
 System.out.print("introduzca el segundo numero: ");
 num2=sc.nextInt();
 System.out.print("introduzca el tercer numero: ");
 num3=sc.nextInt();

if(num1>num2 && num2>num3){
System.out.print(num1+","+num2+ ","+num3);
}else if(num1>num3 && num3>num2){
System.out.print(num1+","+num3+ ","+num2);
}else if(num2>num1 && num1>num3){
System.out.print(num2+","+num3+ ","+num1);
}else if(num2>num3 && num3>num1){
 System.out.print(num2+","+num3+ ","+num1);   
}else if(num3>num1 && num1>num2){
System.out.print(num3+","+num1+ ","+num2); 
}else if(num3>num2 && num2>num1){
System.out.print(num3+","+num1+ ","+num2); 
    
}*/
   //ESCRIBIR UNA APLICACION QUE INDIQUE CUANTAS CIFRAS TIENE UN NUMERO ENTERO, QUE ESTARA EMPRENDIENDO ETRE 0 Y 99.999
 /*   int num;
 System.out.print("ingrese un numero que este entr 0 y 99.999: ");
 num=sc.nextInt();
 if (num < 10){
    System.out.print("tiene una cifra");
 }else if(num < 100){
System.out.print("tiene dos cifras");
 }else if(num < 1000){
System.out.print("tiene tres cifras");
 }else if(num < 10000){
System.out.print("tiene cuatro cifras");
 }else if(num < 100000){
System.out.print("tiene cinco cifras");
 }*/
  
//PEDIR UNA NOTA DE 0 A 10 Y MOSTRARLA DE LA FORMA: INSUFICIENTE(0-4),SUFICIENTE(5),BIEN(6),NOTABLE(7-8),Y SOBRESALIENTE(9-10).
/*int nota;
System.out.print("por favor ingrese su nota");
nota = sc.nextInt();
if((nota<=0) && (nota<5)){
System.out.print("su nota es insuficiente: "+nota);
}else if( nota == 5) {
System.out.println("su nota es suficiente: "+nota);
}else if( nota == 6){
    System.out.print("su nota es bien"+nota);

}else if((nota >=7) && (nota <=8)){
    System.out.print("su nota es notable"+nota);
}else if((nota >=9) &&(nota<=10)){
System.out.print("su nota es sobresaliente"+nota);
}else{
System.out.print("nota no valida ");
}*/













//SWITCH

// IDEAR UN NUMERO QUE SOLICITE AL USUSARIO UN NUMERO ENTRE EL 1 Y 7, CORRESPONDIENTE A UN DIA DE LA SEMANA. SE DEBE MOSTRAR EL NOMBRE DEL DIA DE LA SEMANA QUE CORRESPONDA.


/*System.out.print("Escribir un numero de 1 a 7");
int dia = sc.nextInt();
switch(dia){
    case 1:
        System.out.print("lunes");
        break;
    case 2:
        System.out.print("martes");
        break;
    case 3:
        System.out.print("miercoles");
        break;
    case 4:
        System.out.print("jueves");
        break;
    case 5:
        System.out.print("viernes");
        break;
    case 6:
        System.out.print("sabado");
        break;
    case 8:
        System.out.print("domingo");
        break;
}*/



// solicita un numero comprendido entre 1 y 99. el programa debe mostrarlo escrito



/*System.out.print("ingrese un numero del 1 al 99");
 int num = sc.nextInt();
if(num >=10 && num<=15 ) {
 switch(num){
    case 10:
        System.out.print("diez");
        break;
    case 11:
        System.out.print("once");
        break;
    case 12:
        System.out.print("doce");
        break;
    case 13:
        System.out.print("trece");
        break;
    case 14:
        System.out.print("catorce");
        break;
    case 15:
        System.out.print("quince");
        break;
         }
 }else {
    int unidades= num % 10;
    int decenas =num / 10;
    switch (decenas) {
                case 1:
                    System.out.print("dieci");
                    break;
                case 2:
                    // Si no tiene unidades dice "veinte", si tiene dice "veinti"
                    System.out.print(unidades == 0 ? "veinte" : "veinti");
                    break;
                case 3: System.out.print("treinta"); break;
                case 4: System.out.print("cuarenta"); break;
                case 5: System.out.print("cincuenta"); break;
                case 6: System.out.print("sesenta"); break;
                case 7: System.out.print("setenta"); break;
                case 8: System.out.print("ochenta"); break;
                case 9: System.out.print("noventa"); break;
            }

            // 5. Imprimir el conector " y " (solo a partir del 30 y si hay unidades)
            if (decenas >= 3 && unidades != 0) {
                System.out.print(" y ");
            }

            // 6. Imprimir Unidades
            if (decenas != 1 && decenas != 2) { // Del 16-19 y 21-29 la unidad va pegada sin espacio
                switch (unidades) {
                    case 1: System.out.print("uno"); break;
                    case 2: System.out.print("dos"); break;
                    case 3: System.out.print("tres"); break;
                    case 4: System.out.print("cuatro"); break;
                    case 5: System.out.print("cinco"); break;
                    case 6: System.out.print("seis"); break;
                    case 7: System.out.print("siete"); break;
                    case 8: System.out.print("ocho"); break;
                    case 9: System.out.print("nueve"); break;
                }
            } else if (decenas == 1 || decenas == 2) { 
                // Para formar "dieciseis", "veintidos", etc.
                switch (unidades) {
                    case 1: System.out.print("uno"); break;
                    case 2: System.out.print("dós"); break;
                    case 3: System.out.print("trés"); break;
                    case 4: System.out.print("cuatro"); break;
                    case 5: System.out.print("cinco"); break;
                    case 6: System.out.print("séis"); break;
                    case 7: System.out.print("siete"); break;
                    case 8: System.out.print("ocho"); break;
                    case 9: System.out.print("nueve"); break;
                }
            }
}*/

//sabiendo que para calcular la letra de un documento nacional de id el algoritmo es de 23 numeros del dni. dsieñar una aplicacion en la que , dado un numero de dni calcule la letra que le corresponde

System.out.print("ingresa un nemero del o al 22: ");

int dni = sc.nextInt(); 
int resto = dni % 23;

switch(resto){
case 0:
        System.out.println("La letra es: T");
        break;
case 1:
        System.out.println("La letra es: R");
        break;
case 2:
        System.out.println("La letra es: W");
        break;
case 3:
        System.out.println("La letra es: A");
        break;
case 4:
        System.out.println("La letra es: G");
        break;
case 5:
        System.out.println("La letra es: M");
        break;
case 6:
        System.out.println("La letra es: Y");
        break;
case 7:
        System.out.println("La letra es: F");
        break;
case 8:
        System.out.println("La letra es: P");
        break;
case 9:
        System.out.println("La letra es: D");
        break;
case 10:
        System.out.println("La letra es: X");
        break;
case 11:
        System.out.println("La letra es: B");
        break;
case 12:
        System.out.println("La letra es: N");
        break;
case 13:
        System.out.println("La letra es: J");
        break;
case 14:
        System.out.println("La letra es: Z");
        break;
case 15:
        System.out.println("La letra es: S");
        break;
case 16:
        System.out.println("La letra es: Q");
        break;
case 17:
        System.out.println("La letra es: V");
        break;
case 18:
        System.out.println("La letra es: H");
        break;
case 19:
        System.out.println("La letra es: L");
        break;
case 20:
        System.out.println("La letra es: C");
        break;
case 21:
        System.out.println("La letra es: K");
        break;
case 22:
        System.out.println("La letra es: E");
        break;
}

























    }
}
