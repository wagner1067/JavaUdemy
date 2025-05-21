package Operadores;

public class OperadorLogicoOr {
    public static void main (String [] args){
        // sinal de && -> significa AND(e)
        // sinal de || -> significa OR(ou)

        boolean temEmprego = true;
        boolean temEmpresa = false;
        boolean tem50k = true; // obrigatório isso ser true
        boolean podeFinanciar = (temEmprego || temEmpresa) && tem50k;

        System.out.println(podeFinanciar);
    }
}
