package Desafios;
//Se for querer para imprimir o impar so colocar o sinal -> !=
public class DesafioFour {
    public static void main (String [] args){
       int limitePar = 100;
       // Imprimir pares de 0 a 100
       for(int i = 0; i <= limitePar; i++){
           if ( i % 2 == 0){
               System.out.print(i + " ");
           }
       }
       String spaces = "\nHello World";
       for (int i = 0; i < spaces.length(); i++)
           System.out.print(spaces.charAt(i) + " ");// Imprime cada letra
    }
}
