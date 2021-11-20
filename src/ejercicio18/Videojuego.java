package ejercicio18;
public class Videojuego implements Entregable {
    private String titulo;
    private int horas;
    private boolean entregado;
    private String company;

    public Videojuego(){
        this.titulo = "";
        this.horas = 10;
        this.entregado = false;
        this.company = "";
    }
   
    public Videojuego(String titulo, int horas){
        this.titulo = titulo;
        this.horas = horas;
        this.entregado = false;
        this.company = "";
    }
    
    public Videojuego(String titulo, int horas, String company){
        this.titulo = titulo;
        this.horas = horas;
        this.entregado = false;
        this.company = company;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Videojuego [company=" + company + ", entregado=" + entregado + ", horas=" + horas + ", titulo=" + titulo
                + "]";
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public void compareTo(Object a) {
        if(this.horas > ((Videojuego)a).horas){
            System.out.println("El videojuego " + this.titulo + " es mas largo que el videojuego " + ((Videojuego)a).titulo);
        }else if(this.horas < ((Videojuego)a).horas){
            System.out.println("El videojuego " + this.titulo + " es mas corto que el videojuego " + ((Videojuego)a).titulo);
        }else{
            System.out.println("El videojuego " + this.titulo + " es igual que el videojuego " + ((Videojuego)a).titulo);
        }
        
    }
    
}
