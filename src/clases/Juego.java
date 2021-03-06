/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 26/07/2021
 *
 */
public class Juego {

    //Tendremos un conjunto de jugadores 
    //*Nota: A los atributos nunca se le da valor a los atributos, !Solo a las Constantes!
    private Jugador[] jugadores;
    private Revolver revolver;

    public Juego(int n) { //Recibe como parametro el numero de jugadores 
        comprobarJugadores(n);//Comprobamos nuestros jugadores
        agregarJugadores();//Agregamos nuestros jugadores a nuestra Lista
        revolver = new Revolver();
        System.out.println(revolver + "\n");
    }

    //Creamos un método para agregar jugadores a nuestro juego
    private void agregarJugadores() {
        String nombre;
        for (int i = 0; i < jugadores.length; i++) {
            nombre = JOptionPane.showInputDialog(null, "Introduce el Nombre del jugador " + (i + 1), "Introduciendo Nombre", 1);
            jugadores[i] = new Jugador(nombre);
        }
    }

    //Método para comprobar si el numero de jugadores que jugaran el juego
    private void comprobarJugadores(int numeroJugadores) {
        if (!(numeroJugadores >= 1 && numeroJugadores <= 6)) { //Si el numero introducido no cumple con los requerimiento cambiamos el valor a 6

            numeroJugadores = 6;
        }
        jugadores = new Jugador[numeroJugadores];

    }

    //Método para mostrar el fin del juego
    public boolean finJuego() {
        for (int i = 0; i < jugadores.length; i++) {//Recorremos la lista de Jugadores
            System.out.println(revolver);
            jugadores[i].disparar(revolver); //Iniciamos la partida, el jugador toma la pistola y dispara
            System.out.println("");
            if (!(jugadores[i].isVivo())) {//Comprobamos si el jugador esta vivo, si no esta vivo, retornamos un true y termina el juego
                return true;
            }
        }
        //Si se termina de recorrer la lista y ningun jugador a muerto retornamos un false;
        return false;
    }

    //Método para mostrar el fin del juego, version 2
    public boolean finJuegov2() {
        for (int i = 0; i < jugadores.length; i++) {//Recorremos la lista de Jugadores
            //System.out.println(revolver);
            jugadores[i].dispararv2(revolver); //Iniciamos la partida, el jugador toma la pistola y dispara
            // System.out.println("");
            if (!(jugadores[i].isVivo())) {//Comprobamos si el jugador esta vivo, si no esta vivo, retornamos un true y termina el juego
                return true;
            }
        }
        //Si se termina de recorrer la lista y ningun jugador a muerto retornamos un false;
        return false;
    }

    //Mostrar Jugador Muerto
    public Jugador jMuerto() {
        boolean encontrado = false;
        Jugador j=null;
        for (int i = 0; i < jugadores.length && !encontrado; i++) {
            if (!jugadores[i].isVivo()) {
                j=jugadores[i];
                encontrado=true;
            }
        }
        return j;
    }

    //Ronda 
    public void ronda() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].disparar(revolver);
            System.out.println(revolver);
        }
    }

    //Método para mostrar a los jugadores
    public void mostrarJugadores() {
        String cadena = "";

        for (int i = 0; i < jugadores.length; i++) {
            cadena = cadena + "\n" + jugadores[i].toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, "Lista Jugadores\n" + cadena, "Jugadores", 1);
    }

    //Ronda V2
    public void rondaV2() {
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println(revolver);
            jugadores[i].disparar(revolver);
            System.out.println("");
            if (!jugadores[i].isVivo()) {
                return; //El return corta el Ciclo o break;
            }
        }
    }

}
