package ejercicio18;
public class Serie implements Entregable {
    private String titulo;
    private int temporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie(){
        this.titulo = "";
        this.temporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }
    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.temporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = creador;
    }

    public Serie(String titulo, int temporadas, String genero, String creador){
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.genero = genero;
        this.creador = creador;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getCreador() {
        return creador;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }
    @Override
    public String toString() {
        return "Serie [creador=" + creador + ", entregado=" + entregado + ", genero=" + genero + ", temporadas="
                + temporadas + ", titulo=" + titulo + "]";
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
        if(this.titulo.compareTo(((Serie)a).getTitulo())>0){
            System.out.println("La serie " + this.titulo + " es mayor que " + ((Serie)a).getTitulo());
        }else if(this.titulo.compareTo(((Serie)a).getTitulo())<0){
            System.out.println("La serie " + this.titulo + " es menor que " + ((Serie)a).getTitulo());
        }else{
            System.out.println("La serie " + this.titulo + " es igual que " + ((Serie)a).getTitulo());
        }
        
    } 
}
