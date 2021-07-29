/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import clases.Juego;
import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 28/07/2021
 *
 */
public class Aplicacion_version2 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //Crear una version del juego de la ruleta mejorado
        int n, op = 0;
        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "RULETA RUSA GAME\n1.-Iniciar Juego\n2.-Salir", "Menu", 3));

                switch (op) {
                    case 1: {
                        //Bandera para determinar si el jugador desea seguir jugando
                        boolean bandera = true;
                        do {
                            //Mensaje
                            JOptionPane.showMessageDialog(null, "     RULETA RUSA GAME", "Iniciando Juego", 1);
                            //Numero de jugadores
                            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de jugadores", "Introduciendo N jugadores", 1));
                            Juego juego = new Juego(n);
                            //Muestra el nombre de los jugadores
                            juego.mostrarJugadores();
                            //Inicia el juego
                            //Se ejecutara mientras no halla muerto ningun jugador
                            while (!(juego.finJuegov2()));
                            //Mensaje con el jugador que ha muerto
                            JOptionPane.showMessageDialog(null, "Juego Terminado\nJugador Muerto : " + juego.jMuerto().getNombre(), "Terminado", 1);
                            
                            //Mensaje con opción si desea seguir jugando
                            //En este caso usamos una ventana emergente
                            if ((JOptionPane.showConfirmDialog(null, "Continuar Jugando", "Seguir?", JOptionPane.YES_NO_OPTION, 1) == JOptionPane.YES_OPTION)) {

                            } else {
                                bandera = false;
                            }

                        } while (bandera);

                        break;
                    }
                    case 2: {
                        JOptionPane.showMessageDialog(null, "Cerrando Juego", "Saliendo", 1);

                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Introduce una opción valida", "Error de Opción", 2);

                        break;
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error", 0);
            }

        } while (op != 2);

    }

}
