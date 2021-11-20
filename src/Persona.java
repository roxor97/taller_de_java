import java.util.Scanner;

public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = this.peso / (this.altura * this.altura);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    private void comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = 'H';
        } else {
            this.sexo = sexo;
        }
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nDNI: " + this.dni + "\nSexo: " + this.sexo
                + "\nPeso: " + this.peso + "\nAltura: " + this.altura;
    }

    private void generaDNI() {
        int numero = (int) (Math.random() * 1000000);
        String letra = "";
        if (numero < 1000000) {
            letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        } else {
            letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        }
        this.dni = numero + letra.charAt(numero % 23);
    }

    /* Métodos set de cada parámetro, excepto de DNI. */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static void main(String[] args) throws Exception {
        // Pide por teclado el nombre, la edad, sexo, peso y altura.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();
        System.out.println("Introduce el sexo (H/M): ");
        char sexo = sc.next().toUpperCase().charAt(0);
        System.out.println("Introduce el peso: ");
        double peso = sc.nextDouble();
        System.out.println("Introduce la altura: ");
        double altura = sc.nextDouble();
        // Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores
        // variables pedidas por teclado, el segundo objeto obtendrá todos los
        // anteriores menos el peso y la altura y el último por defecto, para este
        // último utiliza los métodos set para darle a los atributos un valor.
        Persona persona1 = new Persona(nombre, edad, sexo);
        Persona persona2 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona3 = new Persona();
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);
        
        // comprobar si el objeto persona1 tiene sobrepeso
        if (persona1.calcularIMC() == 1) {
            System.out.println("El objeto persona1 tiene sobrepeso");
        } else {
            System.out.println("El objeto persona1 no tiene sobrepeso");
        }

        if (persona2.calcularIMC() == 1) {
            System.out.println("El objeto persona1 tiene sobrepeso");
        } else {
            System.out.println("El objeto persona1 no tiene sobrepeso");
        }

        if (persona3.calcularIMC() == 1) {
            System.out.println("El objeto persona1 tiene sobrepeso");
        } else {
            System.out.println("El objeto persona1 no tiene sobrepeso");
        }

        //Indicar para cada objeto si es mayor de edad.
        if (persona1.esMayorDeEdad()) {
            System.out.println("El objeto persona1 es mayor de edad");
        } else {
            System.out.println("El objeto persona1 no es mayor de edad");
        }
        if (persona2.esMayorDeEdad()) {
            System.out.println("El objeto persona1 es mayor de edad");
        } else {
            System.out.println("El objeto persona1 no es mayor de edad");
        }
        if (persona3.esMayorDeEdad()) {
            System.out.println("El objeto persona1 es mayor de edad");
        } else {
            System.out.println("El objeto persona1 no es mayor de edad");
        }

        //Por último, mostrar la información de cada objeto
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);



    }

}
