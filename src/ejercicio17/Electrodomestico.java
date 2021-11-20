package ejercicio17;

public class Electrodomestico {
    // atributos

    private int precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    // contructor por defecto
    public Electrodomestico() {
        this.precioBase = 100;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    // Un constructor con el precio y peso. El resto por defecto.
    public Electrodomestico(double precioBase2, double peso2) {
        this.precioBase = (int) precioBase2;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = (int) peso2;
    }

    // Un constructor con todos los atributos.
    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public void setColor(String color) {
        color = color.toLowerCase();
        if (color == "blanco" || color == "negro" || color == "rojo" || color == "azul" || color == "gris") {
            this.color = color;
        } else {
            System.out.println("los colores disponibles son: blancos, negro, rojo, azul y gris.");
        }
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E') {
            return letra;
        } else {
            return 'F';
        }
    }

    private String comprobarColor(String color) {
        color = color.toLowerCase();
        if (color == "blanco" || color == "negro" || color == "rojo" || color == "azul" || color == "gris") {
            return color;
        } else {
            return "blanco";

        }
    }

    public int precioFinal(){
        int precioFinal = 0;
        if (consumoEnergetico == 'A') {
            precioFinal = precioBase + 100;
        } else if (consumoEnergetico == 'B') {
            precioFinal = precioBase + 80;
        } else if (consumoEnergetico == 'C') {
            precioFinal = precioBase + 60;
        } else if (consumoEnergetico == 'D') {
            precioFinal = precioBase + 50;
        } else if (consumoEnergetico == 'E') {
            precioFinal = precioBase + 30;
        }else if(consumoEnergetico == 'F'){
            precioFinal = precioBase + 10;
        } 
        else {
            precioFinal = precioBase;
        }

        if (peso < 20) {
            precioFinal = precioFinal + 10;
        } else if (peso >= 20 && peso < 50) {
            precioFinal = precioFinal + 50;
        } else if (peso >= 50 && peso < 80) {
            precioFinal = precioFinal + 80;
        } else {
            precioFinal = precioFinal + 100;
        }
        return precioFinal;
    }
}