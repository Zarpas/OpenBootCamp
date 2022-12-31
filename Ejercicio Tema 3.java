public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();

        int resultado;
        resultado = suma( 10, 30, 50);

        System.out.println(resultado);

        miCoche.aumentaPuertas(2);
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche{
    public int puertas = 0;

    public void aumentaPuertas(int a) {
        this.puertas += a;
    }
}
