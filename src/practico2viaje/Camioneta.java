package practico2viaje;


import practico2viaje.Vehiculo;

public class Camioneta extends Vehiculo {

    private String marca;

    private String patente;

    private Combustible combustible;

    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

   
    @Override
    public double calcularCostoDeCombustible(double distancia ) {
     return distancia*10/100;
    }
}
