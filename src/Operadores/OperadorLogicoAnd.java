package Operadores;

public class OperadorLogicoAnd {
    public static void main (String [] args){
        //priceproduct = R$20
        // comprar somente entre R$10 e R$15

        // sinal de && -> significa AND(e)
        // sinal de || -> significa OR(ou)
        int priceProduct = 15;
        boolean buy = priceProduct >= 10 && priceProduct <= 15;

        System.out.println(buy);
    }
}
