
import java.util.*;
public class Main {
    public static void main(String[] args) {
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
    }
