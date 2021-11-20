import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 1.Declara 2 variables numéricas (con el valor que desees), he indica cual es
        // mayor de los dos. Si son iguales indicarlo también. Ve cambiando los valores
        // para comprobar que funciona.
        // 2.Al ejercicio anterior agregar entrada por consola de dos valores e indicar
        // si son mayores, menores o iguales.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo valor");
        int n2 = sc.nextInt();
        if (n1 > n2) {
            System.out.println("n1 es mayor que n2");
        } else if (n1 < n2) {
            System.out.println("n1 es menor que n2");
        } else {
            System.out.println("Los valores son iguales");
        }
        // ---------------------------------------------------------------//
        // 3.Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se
        // pedirá por teclado (recuerda pasar de String a double con
        // Double.parseDouble). Usa la constante PI y el método pow de Math.
        System.out.println("Ingrese el radio");
        double radio = sc.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
        // ---------------------------------------------------------------//
        // 4.Lee un número por teclado que pida el precio de un producto (puede tener
        // decimales) y calcule el precio final con IVA. El IVA sera una constante que
        // sera del 21%.
        System.out.println("Ingrese el precio del producto");
        double precio = sc.nextDouble();
        double iva = precio * 0.21;
        double precioFinal = precio + iva;
        System.out.println("El precio final es: " + precioFinal);
        // ---------------------------------------------------------------//
        // 5.Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un
        // bucle while.
        int contador = 1;
        while (contador <= 100) {
            if (contador % 2 == 0) {
                System.out.println(contador + " es par");
            } else {
                System.out.println(contador + " es impar");
            }
            contador++;
        }
        // ---------------------------------------------------------------//
        // 6.Realiza el ejercicio anterior usando un ciclo for.
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }
        }
        // ---------------------------------------------------------------//
        // 7.Lee un número por teclado y comprueba que este numero es mayor o igual que
        // cero, si no lo es lo volverá a pedir (do while), después muestra ese número
        // por consola.
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        do {
            if (numero < 0) {
                System.out.println("El numero debe ser mayor o igual a cero");
                System.out.println("Ingrese un numero");
                numero = sc.nextInt();
            }
        } while (numero < 0);
        // ---------------------------------------------------------------//
        // 8.Crea una aplicación por consola que nos pida un día de la semana y que nos
        // diga si es un día laboral o no. Usa un switch para ello.
        System.out.println("Ingrese un dia de la semana");
        String dia = sc.next();
        switch (dia) {
        case "lunes":
        case "martes":
        case "miercoles":
        case "jueves":
        case "viernes":
            System.out.println("Es un dia laboral");
            break;
        case "sabado":
        case "domingo":
            System.out.println("Es un dia no laboral");
            break;
        default:
            System.out.println("No es un dia valido");
            break;
        }
        // ---------------------------------------------------------------//
        // 9.Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza
        // todas las a del String anterior por una e, adicionalmente concatenar a esta
        // frase una adicional que ustedes quieran incluir por consola y las muestre
        // luego unidas.
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String fraseFinal = frase.replaceAll("a", "e");
        System.out.println(fraseFinal);
        System.out.println("Ingrese una frase");
        String frase2 = sc.next();
        System.out.println(fraseFinal + " " + frase2);
        // ---------------------------------------------------------------//
        // 10.Realizar una aplicación de consola, que al ingresar una frase por teclado
        // elimine los espacios que esta contenga.
        System.out.println("Ingrese una frase");
        String frase3 = sc.next();
        String fraseFinal2 = frase3.replaceAll(" ", "");
        System.out.println(fraseFinal2);
        // ---------------------------------------------------------------//
        // 11.Realizar la construcción de un algoritmo que permita de acuerdo a una
        // frase pasada por consola, indicar cual es la longitud de esta frase,
        // adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
        System.out.println("Ingrese una frase");
        String frase4 = sc.next();
        int contador2 = 0;
        for (int i = 0; i < frase4.length(); i++) {
            if (frase4.charAt(i) == 'a' || frase4.charAt(i) == 'e' || frase4.charAt(i) == 'i' || frase4.charAt(i) == 'o'
                    || frase4.charAt(i) == 'u') {
                contador2++;
            }
        }
        System.out.println("La longitud de la frase es: " + frase4.length());
        System.out.println("La cantidad de vocales es: " + contador2);
        // ---------------------------------------------------------------//
        // 12.Pedir dos palabras por teclado, indicar si son iguales, sino son iguales
        // mostrar sus diferencias.
        System.out.println("Ingrese una palabra");
        String palabra1 = sc.next();
        System.out.println("Ingrese otra palabra");
        String palabra2 = sc.next();
        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras son diferentes");
        }
        for (int i = 0; i < palabra1.length(); i++) {
            if (palabra1.charAt(i) != palabra2.charAt(i)) {
                System.out.println("La diferencia es en la posicion: " + i);
            }
        }
        // ---------------------------------------------------------------//
        // 13.Realizar un algoritmo que permita consulta la fecha y hora actual en el
        // formato (AAAA/MM/DD) (HH:MM:SS)
        Calendar fecha = new GregorianCalendar();
        System.out.println("La fecha actual es: " + fecha.get(Calendar.YEAR) + "/" + (fecha.get(Calendar.MONTH) + 1)
                + "/" + fecha.get(Calendar.DAY_OF_MONTH) + " " + fecha.get(Calendar.HOUR_OF_DAY) + ":"
                + fecha.get(Calendar.MINUTE) + ":" + fecha.get(Calendar.SECOND));
        // ---------------------------------------------------------------//
        // 14.Crear un programa que pida un numero por teclado y que imprima por
        // pantalla los números desde el numero introducido hasta 1000 con saltos de 2
        // en 2.
        System.out.println("Ingrese un numero");
        int numero2 = sc.nextInt();
        for (int i = numero2; i <= 1000; i += 2) {
            System.out.println(i);
        }
        // ---------------------------------------------------------------//
        /*15) Hacer un programa que muestre el siguiente menú de opciones
                   ****** GESTION CINEMATOGRÁFICA ********
        1-NUEVO ACTOR
        2-BUSCAR ACTOR
        3-ELIMINAR ACTOR
        4-MODIFICAR ACTOR
        5-VER TODOS LOS ACTORES
        6- VER PELICULAS DE LOS ACTORES
        7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
        8-SALIR
        EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, 
        MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y 
        SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE 
        " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
        PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.*/

        int opcion = 0;
        //crea un array con varios nombres de actores
        String[] actores = new String[5];
        actores[0] = "Leonardo Dicaprio";
        actores[1] = "Will Smith";
        actores[2] = "Jack Nicholson";
        
        do {
            System.out.println("****** GESTION CINEMATOGRÁFICA ********");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");
            System.out.println("EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8,  MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y  SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE  \" OPCION INCORRECTO\". Y MOSTRAR EL MENU NUEVAMENTE.");
            System.out.println("Ingrese una opcion");
            opcion = sc.nextInt();
            switch (opcion) {
            case 1:
                System.out.println("NUEVO ACTOR");
                System.out.println("Ingrese el nombre del nuevo actor");
                String nuevoActor = sc.next();
                for (int i = 0; i < actores.length; i++) {
                    if (actores[i] == null) {
                        actores[i] = nuevoActor;
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("BUSCAR ACTOR");
                System.out.println("Ingrese el nombre del actor a buscar");
                String buscarActor = sc.next();
                for (int i = 0; i < actores.length; i++) {
                    if (actores[i] == buscarActor) {
                        System.out.println("El actor " + buscarActor + " se encuentra en la posicion " + i);
                        break;
                    }
                }
                break;
            case 3:
                System.out.println("ELIMINAR ACTOR");
                System.out.println("Ingrese el nombre del actor a eliminar");
                String eliminarActor = sc.next();
                for (int i = 0; i < actores.length; i++) {
                    if (actores[i] == eliminarActor) {
                        actores[i] = null;
                        break;
                    }
                }
                break;
            case 4:
                System.out.println("MODIFICAR ACTOR");
                System.out.println("Ingrese el nombre del actor a modificar");
                String modificarActor = sc.next();
                for (int i = 0; i < actores.length; i++) {
                    if (actores[i] == modificarActor) {
                        System.out.println("Ingrese el nuevo nombre del actor");
                        String nuevoNombre = sc.next();
                        actores[i] = nuevoNombre;
                        break;
                    }
                }
                break;
            case 5:
                System.out.println("VER TODOS LOS ACTORES");
                for (int i = 0; i < actores.length; i++) {
                    if (actores[i] != null) {
                        System.out.println(actores[i]);
                    }
                }
                break;
            case 6:
                System.out.println("VER PELICULAS DE LOS ACTORES");
                System.out.println("Ingrese el nombre del actor");
                String nombreActor = sc.next();
                for (int i = 0; i < actores.length; i++) {
                    if (actores[i] == nombreActor) {
                        System.out.println("Las peliculas del actor " + nombreActor + " son:");
                        String[] peliculas = new String[5];
                        peliculas[0] = "pelicula 1";
                        peliculas[1] = "Pelicula 2";
                        peliculas[2] = "pelicula 3";
                        peliculas[3] = "pelicula 4";
                        peliculas[4] = "pelicula 5";
                        for (int j = 0; j < peliculas.length; j++) {
                            if (peliculas[j] != null) {
                                System.out.println(peliculas[j]);
                            }
                        }
                        break;
                    }
                }
                break;
            case 7:
                System.out.println("VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                System.out.println("Ingrese el nombre del actor");
                String nombreActor2 = sc.next();
                for (int i = 0; i < actores.length; i++) {
                    if (actores[i] == nombreActor2) {
                        System.out.println("Las categorias del actor " + nombreActor2 + " son:");
                        String[] categorias = new String[5];
                        categorias[0] = "Terror";
                        categorias[1] = "Thriller";
                        categorias[2] = "romance";
                        categorias[3] = "suspenso";
                        categorias[4] = "comedia";
                        for (int j = 0; j < categorias.length; j++) {
                            if (categorias[j] != null) {
                                System.out.println(categorias[j]);
                            }
                        }
                        break;
                    }
                }
                break;
            case 8:
                System.out.println("SALIR");
                break;
            default:
                System.out.println("OPCION INCORRECTO");
                break;
            }
        } while (opcion != 8);
        // ---------------------------------------------------------------//
        //16)
        


    }
}
