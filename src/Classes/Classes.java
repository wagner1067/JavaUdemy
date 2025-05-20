package Classes;

public class Classes {
    public static void main (String [] args){
        double value = Math.round(10.3); // arredondando valor
        double valueCima = Math.ceil(10.3);// arredondando valor para cima
        double valueBaixo = Math.floor(10.7); // aredondando valor para baixo
        int valueRandom = (int)Math.round(Math.random() * 100);// numero aleatorio de 0 a 100
        System.out.println(value);
        System.out.println(valueCima);
        System.out.println(valueBaixo);
        System.out.println(valueRandom);
    }
}
