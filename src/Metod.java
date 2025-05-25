public class Metod {
    public static void main (String [] args){
        productList("Banana", 12.20);
        productList("Laranja", 17.90);

    }
    public static void productList (String productName, Double productValue) {
        System.out.println(productName + " - " + productValue);
    }
}
