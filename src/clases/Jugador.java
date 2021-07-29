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
public class Jugador {

    //Atributos de la clase Jugador 
    private static int idSiguiente = 1;
    private int id;
    private String nombre;
    private boolean vivo;

    public Jugador(String nombre) {
        this.id = idSiguiente++;
        this.nombre = nombre;
        this.vivo = true;
    }

    //Funcion para disparar
    /*En esta funcion pasamos como parametro el revolver el cual 
   llamamos el metodo de la clase revolver "disparar" si este nos devuelve un true
    es que la pistola se dispara y el jugador muere 
    */
    public void disparar(Revolver r) {
        System.out.println("El "+this.nombre+" se apunta y dispara");
        if (r.disparar()) {
            this.vivo = false;
            System.out.println("El "+nombre+ " ha muerto xD");
        }else{
            System.out.println("El "+nombre+" se ha salvado");
        } 
    }
    //Método mejorado
      public void dispararv2(Revolver r) {
          JOptionPane.showMessageDialog(null, this.nombre+" toma la pistola y dispara","Dispara",1);
        //System.out.println("El "+this.nombre+" se apunta y dispara");
        if (r.disparar()) {
            this.vivo = false;
            JOptionPane.showMessageDialog(null,"Has Muerto","Jugador Muerto",0);
            //System.out.println("El "+nombre+ " ha muerto xD");
        }else{
            //System.out.println("El "+nombre+" se ha salvado");
            JOptionPane.showMessageDialog(null, "Te has salvado","Salvado ",1);
        } 
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre;
    }
    
    
    

}
