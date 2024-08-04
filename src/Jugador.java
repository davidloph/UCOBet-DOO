public class Jugador {
    private String nombre;
    private String email;
    private String cedula;
    private String celular;
    int numerosAApostar;
    private String apuesta;
    private String numSorteo;

    public Jugador(String cedula, String celular, String email, String nombre, int numerosAApostar, String apuesta,  String numSorteo) {
        this.cedula = cedula;
        this.celular = celular;
        this.email = email;
        this.nombre = nombre;
        this.numerosAApostar = numerosAApostar;
        this.apuesta = apuesta;
        this.numSorteo = numSorteo;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumerosAApostar() {return numerosAApostar;}

    public String getApuesta() {return apuesta;}

    public String getNumSorteo() {
        return numSorteo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + '\n' +
                "Documento: " + cedula + '\n' +
                "Correo: " + email + '\n' +
                "Celular: " + celular + '\n' +
                "Cantidad de números: " + numerosAApostar + '\n' +
                "Apuesta: $" + apuesta + '\n' +
                "Sorteo: " + numSorteo;
    }
}
