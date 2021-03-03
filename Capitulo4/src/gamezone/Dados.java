/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone;
import java.util.Random;
/**
 *
 * @author alave
 */
public class Dados {
    private int numero;
    



public Dados(){
    this.lanzar();
}

    public int getNumero(){
        
        return this.numero;
    }
     


    public void lanzar(){
        Random r = new Random();
    int aleatorio = r.nextInt(6)+ 1;
    this.numero = aleatorio;
    }



}