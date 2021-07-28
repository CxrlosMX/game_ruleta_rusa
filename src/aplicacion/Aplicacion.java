/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import clases.Juego;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 27/07/2021
 *
 */
public class Aplicacion {

    public static void main(String[] args) {
        Juego juego = new Juego(2);

        //Utilizamos diferentes métodos para la realizacion
        while (!(juego.finJuego()));
        System.out.println("El juego ha terminado");

        //Si utilizamos este tipo para recorrer el juego necesitamos comentar las lineas: 51,52,53 de la clase Juego.
        /*while (!(juego.finJuego())) {            
         juego.rondaV2();
         }
         System.out.println("El juego ha terminado");*/
    }

}
