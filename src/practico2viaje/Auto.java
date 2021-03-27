package practico2viaje;


import practico2viaje.Vehiculo;

public class Auto extends Vehiculo {

    private String marca;

    private String patente;

    private Combustible combustible;

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    
    

    @Override
    public double calcularCostoDeCombustible(double distancia) {
return distancia*7/100;
    }
}
