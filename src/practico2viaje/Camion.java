package practico2viaje;


import practico2viaje.Vehiculo;

public class Camion extends Vehiculo {

    private String marca;

    private String patente;

    private Combustible combustible;

    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    
    @Override
    public double calcularCostoDeCombustible(double distancia) {
    return distancia*12/100;
    }
}
