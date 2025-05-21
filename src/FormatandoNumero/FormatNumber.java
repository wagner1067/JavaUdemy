package FormatandoNumero;

import java.text.NumberFormat;

public class FormatNumber {
    public static void main (String [] args){
        NumberFormat reais = NumberFormat.getCurrencyInstance();
        String productvalue = reais.format(1120.80);

        System.out.println(productvalue);
    }
}
