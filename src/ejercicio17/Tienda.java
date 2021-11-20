package ejercicio17;
import java.util.ArrayList;

public class Tienda {

    public static void main(String[] args) throws Exception {
        
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        
        electrodomesticos.add(new Television());
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Television());
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Television());
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Television());
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Television());
        electrodomesticos.add(new Lavadora());
       

        double preciotelevisores = 0;
        double preciolavadoras = 0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Television) {
                preciotelevisores += electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Lavadora) {
                preciolavadoras += electrodomestico.precioFinal();
            } else {
                System.out.println("No se puede calcular el precio de este electrodomestico");
            }
        }
        System.out.println("Precio de las televisiones: " + preciotelevisores);
        System.out.println("Precio de las lavadoras: " + preciolavadoras);
        System.out.println("Precio total de electrodomesticos: " + (preciotelevisores + preciolavadoras));

    }

}
