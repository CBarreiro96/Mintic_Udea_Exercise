package vehiculos;

public class Carro extends Vehiculo {
    private String tipoCarro;

    public Carro(String placa, String marca, String color, String tipoCarro){
        super(placa,marca,color);
        this.tipoCarro = tipoCarro;
    }

}
