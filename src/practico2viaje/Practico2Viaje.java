
package practico2viaje;


public class Practico2Viaje {

  
    public static void main(String[] args) {
         Combustible infinia= new Combustible("infinia",100);
         Ciudad Sanfrancisco = new Ciudad("San Francisco",58,19);
         Ciudad Arroyito= new Ciudad("Arroyito",358,19);
         Camioneta Ranger= new Camioneta("ford","mby969",infinia);
         Viaje cba= new Viaje(Sanfrancisco,Arroyito,Ranger,3);
         System.out.println(cba.calculoCostoCombustible(infinia, 30));
         System.out.println(cba.calculoCostoPeaje());
         System.out.println(cba.calculoDeDistancia());
         System.out.println(cba.calculoCostoTotal());
        
    }
    
}