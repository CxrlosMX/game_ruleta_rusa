/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import metodos.Metodos;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 26/07/2021
 *
 */
public class Revolver implements Metodos {

    private int posicionBalaActual; //Representa la posicion de la bala
    private int posicionBala;

    public Revolver() { //Constructor que no recibe parametros
        //Las posiciones se generaran aleatoriamente  para eso utilizamos una clase o interfaz con dicho método
        posicionBalaActual = Metodos.generarAleatorio(6, 1); //Generamos un numero entre 1 y 6
        posicionBala = Metodos.generarAleatorio(6, 1);
    }

    //Funciones
    //Funcion Disparar devulve un >true si ambas posiciones son iguales
    public boolean disparar() {
        boolean exito = false;
        if (this.posicionBalaActual == this.posicionBala) {
             exito = true;
             
        }
        
        siguienteBala();
       
        return exito;
    }

    private void siguienteBala() { //Cambia la posicion de la bala
        if (this.posicionBalaActual == 6) { //Si la posicion de la bala es 6, tenemos que regresar la posicion a 1
            this.posicionBalaActual = 1;
        } else {
            this.posicionBalaActual++; //Si la posicion es  <6 solo se incrementa en 1
        }
    }

    @Override
    public String toString() {
        return "Posición Bala Actual: " + posicionBalaActual + "\nPosición Bala: " + posicionBala ;
    }
    
    

}
