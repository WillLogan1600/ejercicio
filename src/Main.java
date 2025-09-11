import com.sun.source.tree.ReturnTree;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        menu();
        System.out.println("Imc");


    }
    public static void menu (){
        Scanner teclado= new Scanner(System.in);
        int eleccion;
        boolean ejecucion=true;

        while(ejecucion){

            System.out.println("¿Que ejercicio desea escoger?");
            System.out.println("1- 2 dados lanzados 20 rondas");
            System.out.println("2- 3 dados lanzados 20 rondas");
            System.out.println("3- Indice de grasa corporal");
            System.out.println("4- Numeros primos");
            System.out.println("6- Salir");

            eleccion= teclado.nextInt();

            switch(eleccion) {
                case 1:
                    dado2();
                    break;
                case 2:
                    dado3();
                    break;
                case 3:
                    Imc();
                    break;
                case 4:
                    primo();
                    break;
                case 6:
                    System.out.println("Saliendo del ciclo");
                    ejecucion=false;
                    break;
                default:
                    System.out.println("Ingrese un valor correcto");

            }
        }


    }
    public static void dado2(){
        Random aleatorio=new Random();
        int sumaD1=0, sumaD2=0, sumaD3=0,dado2, dado1;

        for (int i=1; i<=20; i++){
            dado1= aleatorio.nextInt((6-1)+1)+1;
            dado2= aleatorio.nextInt((6-1)+1)+1;

            sumaD1=sumaD1+dado1;
            sumaD2=sumaD2+dado2;
        }

        if (sumaD1>sumaD2 && sumaD1>sumaD3) {
            System.out.println("El dado 1 es el ganador: " + sumaD1);
        }else
            System.out.println("El dado2 es el ganador: "+sumaD2);

    }
    public static void dado3(){
        Random aleatorio=new Random();
        int sumaD1=0, sumaD2=0, sumaD3=0,dado2, dado1, dado3;

        for (int i=1; i<=20; i++){
            dado1= aleatorio.nextInt((6-1)+1)+1;
            dado2= aleatorio.nextInt((6-1)+1)+1;
            dado3= aleatorio.nextInt((6-1)+1)+1;
            sumaD1=sumaD1+dado1;
            sumaD2=sumaD2+dado2;
            sumaD3=sumaD3+dado3;
        }
        //Cuando el dado 1 es mayor, busca entre el dado 2 y 3 para saber cual esta en el medio y cual fue el ultimo
        if (sumaD1>sumaD2 && sumaD1>sumaD3){
            System.out.println("El dado 1 es el primer lugar: "+sumaD1);
            if (sumaD2>sumaD3){
                System.out.println("El dado 2 es el segundo lugar: "+sumaD2);
                System.out.println("El dado 3 es el tercer lugar: "+sumaD3);
            }else if (sumaD3>sumaD2){
                System.out.println("El dado 3 es el segundo lugar: "+sumaD3);
                System.out.println("El dado 2 es el tercer lugar: "+sumaD2);
            }
        }
        else if (sumaD2>sumaD1 && sumaD2>sumaD3) {
            System.out.println("El dado 2 es el ganador: "+sumaD2);
            if (sumaD1>sumaD3){
                System.out.println("El dado 1 es el segundo lugar: "+sumaD1);
                System.out.println("El dado 3 es el ultimo lugar: "+sumaD3);
            } else if (sumaD3>sumaD1) {
                System.out.println("El dado 3 es el segundo lugar: "+sumaD3);
                System.out.println("El dado 1 es el ultimo lugar: "+sumaD1);
            }
        }
        else if (sumaD3>sumaD1 && sumaD3>sumaD2){
            System.out.println("El dado 3 es el ganador: "+sumaD3);
            if (sumaD1>sumaD2){
                System.out.println("El dado 1 es el segundo: "+sumaD1);
                System.out.println("El dado 2 es el ultimo: "+sumaD2);
            } else if (sumaD2>sumaD1) {
                System.out.println("El dado 2 es el segundo: "+sumaD2);
                System.out.println("El dado 1 es el ultimo:  "+sumaD1);
            }
        }
    }
    public static String Imc() {
        Scanner teclado = new Scanner(System.in);
        double peso, estatura, imc, e2;
        System.out.println("Digite su peso (en Kg):");
        peso = teclado.nextDouble();
        System.out.println("Digite su estatura (en m): ");
        estatura = teclado.nextDouble();


        e2 = estatura * estatura;

        imc = peso / e2;

        if (imc < 18.5) {
            System.out.println("Esta bajo de peso, su indice de grasa es:  " + imc);

        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Esta en un peso normal, su indice de grasa es " + imc);

        } else if (imc >= 25 && imc <= 26.9) {

            System.out.println("Esta en sobre peso grado 1, su indice de grasa es " + imc);

        } else if (imc >= 27 && imc <= 29.9) {


            System.out.println("Esta en sobre peso grado 2, su indice de grasa es " + imc);

        } else if (imc >= 30 && imc <= 34.9) {


            System.out.println("Esta en Obecidad tipo 1, su indice de grasa es " + imc);

        } else if (imc >= 35 && imc <= 39.9) {


            System.out.println("Esta en Obecidad tipo 2, su indice de grada es " + imc);

        } else if (imc >= 40 && imc <= 49.9) {

            System.out.println("Esta en obecidad tipo 3, su indic de grasa es " + imc);

        } else if (imc > 50) {

            System.out.println("Esta en obecidad tipo 4, su indice de grasa es " + imc);
        }
        return"Imc";

    }
    public static void primo() {
        Scanner teclado = new Scanner(System.in);
        int n, raiz, contador;
        System.out.println("Digite su primer numero: ");
        n= teclado.nextInt();

        if (n<=1){
            System.out.println("El numero "+n+(" No es primo"));
        }else{
            //Math.sqrt() sirve para calcular la raiz de cualquier numero
            raiz=(int) Math.sqrt(n);
            contador=0;
            for (int i = raiz; i>1; i--){
                if (n % i ==0){
                    contador++;
                }
            }

            System.out.println(">> " + contador);

            if (contador<1){
                System.out.println("El numero " +n+" es primo");

            }else {
                System.out.println("El numero "+n+" no es primo");
            }

        }






    }
}
