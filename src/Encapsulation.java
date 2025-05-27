public class Encapsulation {

    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    Encapsulation(String marca, String modelo, int ano, double valor){
        this.marca = marca;
        this.modelo= modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public String getMarca(){
        return  marca;
    }

    public String getModelo(){
        return  modelo;
    }

    public int getAno(){
        return  ano;
    }

    public double getValor(){
        return valor * 1.1;
    }

    public void setModelo(String modelo){
        this.modelo = modelo; // Para alterar o modelo
    }
}
