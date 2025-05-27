public class CarEncapsulation {
    public static void main (String [] args){
        Encapsulation car = new Encapsulation("BMW","X6",2024 , 125_000);

        car.setModelo("X5"); // Alterando o modelo

        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        System.out.println("Valor da venda: " + car.getValor());
    }
}
