package ejercicio17;
public class Lavadora extends Electrodomestico {
    private int carga;

    // constructor
    public Lavadora(int carga, int precioBase, String color, char consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    // constructor por defecto
    public Lavadora() {
        super();
        this.carga = 5;
    }

    // constructor con precio y peso, el resto por defecto
    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
        this.carga = 5;
    }
    
    public int getCarga() {
        return carga;
    }
    
    @Override
    public int precioFinal() {
        int precioFinal = 0;
        if (this.getCarga() > 30) {
            precioFinal = this.getPrecioBase() + 50;
        } else {
            precioFinal = this.getPrecioBase();
        }
        return precioFinal;
    }
}
