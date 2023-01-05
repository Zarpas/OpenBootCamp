public class Ejercicio_Tema_9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setEdad(48);
        cliente.setNombre("Igor");
        cliente.setTelefono("555-5555");
        cliente.setCredito((float)5000.00);

        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        trabajador.setEdad(48);
        trabajador.setNombre("Igor");
        trabajador.setTelefono("555-5555");
        trabajador.setSueldo((float)2400.00);

        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSueldo());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private float credito;

    public float getCredito() {
        return this.credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private float sueldo;

    public float getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
}
