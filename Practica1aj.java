package practica1aj;
import java.util.Scanner;

public class Practica1aj {
    
    public static void monedas(){
        
        int moneda[]={50,20,10,5,2,1};
        int cantidad[]={0,0,0,0,0,0};
        
        Scanner in = new Scanner (System.in);   
        System.out.println("¿Cuanto cuesta?");
        int precio = in.nextInt();
        System.out.println("¿Cuanto entrega?");
        int dinero = in.nextInt();
        
        //Operaciones con céntimos de valor 1,2,5,10,20 y 50
        
            int num;
            num=dinero-precio;
            cantidad[0]=num;
            for(int i=0;i<6;i++){
            cantidad[i]=num/moneda[i];
            while(cantidad[i]>0 && cantidad[i]!=num-1){
                
            int res=num-(moneda[i]*cantidad[i]);
            
            for(int j=0;j<6;j++){
            if(j>i){
                cantidad[j]=res/moneda[j];
                res-=moneda[j]*cantidad[j];
            }
            System.out.println(cantidad[j]+" monedas de "+moneda[j]);
            
                System.out.println("----------------------");
                 cantidad[i]--;
                }
              }
            }
        }
        
    public static void dibujo(){
    }
    public static void juegoAhorcado(){
    }
    
    public static void main(String[] args) {
         
          Scanner in = new Scanner (System.in);
            
          int opcion=4;
          
          do{
          
          System.out.print("1.- Cambio de monedas\n");
          System.out.print("2.- Dibujo un rectángulo\n");
          System.out.print("3.- Juego del ahorcado\n");
          System.out.print("Opción: ");
          
          opcion = in.nextInt();
          
          switch(opcion){
              
              case 1: monedas();
                      break;
              case 2: dibujo();
                      break;
              case 3: juegoAhorcado();
                      break;
          }
          
    }while(opcion!=4);
    
}
}