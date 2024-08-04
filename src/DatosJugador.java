import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class DatosJugador {
    public static void datosJugador(ArrayList<Jugador> jugadores) {
        String nombre;
        String email;
        String cedula;
        String celular;
        int numerosAApostar;
        String apuesta;
        String numSorteo;

        while(true) {
            nombre = JOptionPane.showInputDialog("Nombre: ");
            if (nombre == null || nombre.isBlank()) {
                JOptionPane.showMessageDialog(null, "Ingrese un nombre válido.");
            } else {
                break;
            }
        }
        while (true) {
            email = JOptionPane.showInputDialog("Correo: ");
            if (email == null || email.isBlank()) {
                JOptionPane.showMessageDialog(null, "Ingrese un correo válido.");
            } else {
                break;
            }
        }
        while (true) {
            cedula = JOptionPane.showInputDialog("Documento: ");
            if (cedula == null || cedula.isBlank()) {
                JOptionPane.showMessageDialog(null, "Ingrese un documento válido.");
            } else {
                break;
            }
        }
        while (true) {
            celular = JOptionPane.showInputDialog("Celular: ");
            if (celular == null || celular.isBlank() || !celular.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Ingrese un celular válido.");
            } else {
                break;
            }
        }
        while (true) {
            numerosAApostar = JOptionPane.showOptionDialog(null, "Escoge la cantidad de números a apostar:", "UCO Bet", 0, 0,null, Arrays.asList("1", "2", "3", "4").toArray(), null) + 1;
            if (numerosAApostar == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor.");
            } else {
                break;
            }
        }
        while (true) {
            apuesta = JOptionPane.showInputDialog("Valor apuesta: ");
            if (apuesta == null || apuesta.isBlank() || !apuesta.matches("\\d+") || apuesta.contains("-")) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor válido.");
            } else {
                break;
            }
        }
        while (true) {
            numSorteo = JOptionPane.showInputDialog("Sorteo: ");
            if (numSorteo == null || numSorteo.isBlank() || numSorteo.length() != numerosAApostar || !numSorteo.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero válido.");
            } else {
                break;
            }
        }



        Jugador jugador = new Jugador(nombre, email, cedula, celular, numerosAApostar, apuesta, numSorteo);
        JOptionPane.showMessageDialog(null, "Jugador guardado:\n\n" + jugador.toString());
        jugadores.add(jugador);

    }
}
