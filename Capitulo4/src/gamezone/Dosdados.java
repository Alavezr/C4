
package gamezone;

import java.util.Scanner;

public class Dosdados {
    
    public static void main(String[] args) {
         
        
         int respuesta = 0;
         do{ 
      
           
        Cubilete humano = new Cubilete();
        Cubilete computadora = new Cubilete();
        
        humano.tirar();
        humano.mostrar();
        computadora.tirar();
        computadora.mostrar();
                
        int dado1 = humano.evaluar();
        int dado2 = computadora.evaluar();
        
        if(dado1==dado2){
            System.out.println("Empate\n");
        }
        else{
            if(dado1>dado2){
                System.out.println("Gana el humano\n");
            }
            else{
                System.out.println("Gana Skynet\n");
            }
        }
            //System.out.println("");
            System.out.println("Quieres jugar de nuevo?\n");
            System.out.println("Si 1\n");
            System.out.println("No 2\n");
            
            Scanner num = new Scanner(System.in);
            
            num.nextInt();
        
        }while(respuesta >= 2);
        
       
}
}
