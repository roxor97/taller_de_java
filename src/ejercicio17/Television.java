package ejercicio17;
public class Television extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT;

    // Constructor por defecto
    public Television() {
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    // Constructor con parámetros de precio y peso
    public Television(Integer precioBase, Integer peso) {
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }
    
    public Television(Integer precioBase, Integer peso, Integer resolucion, Boolean sintonizadorTDT) {
        super(precioBase, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public int precioFinal(){
        int precioFinal = super.precioFinal();
        if (this.resolucion > 40) {
            precioFinal += (int) (super.getPrecioBase() * 0.30);
        }
        if (this.sintonizadorTDT) {
            precioFinal += 50;
        }
        return precioFinal;
    }

}
