/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author CxrlosMX
 */
public interface Metodos {

    //Método que genera numeros aleatorios
    public static int generarAleatorio(int max, int min) {
        int n = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return n;
    }

}
