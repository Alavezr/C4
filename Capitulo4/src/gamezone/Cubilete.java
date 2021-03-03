
package gamezone;


    public class Cubilete {
    private Dados[] dados;
    
    public Cubilete(){
        this.dados = new Dados [5];
        for(int i =0;i<5;i++){
            this.dados[i] = new Dados();
        }
    }    
    public void mostrar(){
    for(int i=0;i<5;i++){
        
        System.out.println(this.dados[i].getNumero()+ "");
    }
    
    System.out.println("\n");
    }

    public int evaluar(){
    int acomulador=0;
    int mayor = 0;
    for(int i=1; i<= 6; i++){
        
    for(int j=0; i<=5; i++){
        if(this.dados[j].getNumero()== i){
            
        acomulador ++;
        
        }
        
        
            }
    if(acomulador> mayor){
        mayor = acomulador;
    }
        acomulador=0;
        }
    return mayor;
    }
    
        public void tirar(){
        for(int i=0; i<5; i++){
            this.dados[i].lanzar();
        }
    }


}
