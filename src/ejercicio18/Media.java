package ejercicio18;

public class Media {
    public static void main(String[] args) {
        // array para almacenar 5 series
        Object[] series = new Object[5];
        series[0] = new Serie();
        series[1] = new Serie();
        series[2] = new Serie();
        series[3] = new Serie();
        series[4] = new Serie();
        // array para almacenar 5 Videojuegos
        Object[] videojuegos = new Object[5];
        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego();
        videojuegos[2] = new Videojuego();
        videojuegos[3] = new Videojuego();
        videojuegos[4] = new Videojuego();
        // Entrega algunos Videojuegos y Series con el método entregar().
        ((Videojuego) videojuegos[0]).entregar();
        ((Videojuego) videojuegos[1]).entregar();
        ((Videojuego) videojuegos[2]).entregar();
        ((Serie) series[0]).entregar();
        ((Serie) series[1]).entregar();
        ((Serie) series[2]).entregar();
        ((Serie) series[3]).entregar();
        ((Serie) series[4]).entregar();

        // Cuenta cuantos Series y Videojuegos hay entregados.
        // Al contarlos, devuélvelos.
        int contadorSeries = 0;
        int contadorVideojuegos = 0;
        for (int i = 0; i < series.length; i++) {
            if (series[i] instanceof Serie) {
                if (((Serie) series[i]).isEntregado()) {
                    ((Serie) series[i]).devolver();
                    contadorSeries++;
                }
            }
        }
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i] instanceof Videojuego) {
                if (((Videojuego) videojuegos[i]).isEntregado()) {
                    ((Videojuego) videojuegos[i]).devolver();
                    contadorVideojuegos++;
                }
            }
        }
        System.out.println("Hay " + contadorSeries + " series entregadas.");
        System.out.println("Hay " + contadorVideojuegos + " videojuegos entregados.");

        // Por último, indica el Videojuego tiene más horas estimadas y la serie con mas
        // temporadas. Muéstralos en pantalla con toda su información (usa el método
        // toString()).
        int horasEstimadasVideojuego = 0;
        int temporadasSerie = 0;
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i] instanceof Videojuego) {
                if (((Videojuego) videojuegos[i]).getHoras() > horasEstimadasVideojuego) {
                    horasEstimadasVideojuego = ((Videojuego) videojuegos[i]).getHorasEstimadas();
                    System.out.println("El videojuego con más horas estimadas es: " + videojuegos[i]);
                }
            }
        }
        for (int i = 0; i < series.length; i++) {
            if (series[i] instanceof Serie) {
                if (((Serie) series[i]).getTemporadas() > temporadasSerie) {
                    temporadasSerie = ((Serie) series[i]).getTemporadas();
                    System.out.println("La serie con mas temporadas es: " + series[i]);
                }
            }
        }


    }

}
