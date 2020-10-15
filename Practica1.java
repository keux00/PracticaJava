package practica1;
import java.util.Scanner;

public class Practica1 {
    
    // CAMBIO DE MONEDAS
    
    public static void monedas(){
       
        Scanner in = new Scanner (System.in);   
        System.out.println("¿Cuánto cuesta?");
        int precio = in.nextInt();
        System.out.println("¿Cuánto entrega?");
        int dinero = in.nextInt();
        
        //Operaciones con céntimos de valor 1,2,5,10,20 y 50
        
            int cambio;
            
            cambio=dinero-precio;
            
            if(dinero<precio){
                System.out.println("Se ha entregado poco dinero, no se puede pagar el producto");
                return;
            }
            
            System.out.println("Para devolver " + cambio + " debes dar");
            
        
             if (cambio >= 50) {
            System.out.println("Monedas de 50 céntimos: " + cambio / 50);
            cambio %= 50;
             }
             if (cambio >= 20) {
            System.out.println("Monedas de 20 céntimos " + cambio / 20);
            cambio %= 20;
             }
             if (cambio >= 10) {
            System.out.println("Monedas de 10 céntimos: " + cambio / 10);
            cambio %= 10;
             }
             if (cambio >= 5) {
            System.out.println("Monedas de 5 céntimos: " + cambio / 5);
            cambio %= 5;
             }
             if (cambio >= 2) {
            System.out.println("Monedas de 2 céntimos: " + cambio / 2);
            cambio %= 2;
             }
             if (cambio >= 1) {
            System.out.println("Monedas de un céntimo: " + cambio / 1);
            cambio = 0;
             }
    }

    // DIBUJO RECTANGULO
    
    public static void dibujo(){
        
        int i=0;
        int j=0;
        int k=0;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Introduzca el ancho del rectángulo: ");
        int ancho = in.nextInt();
        
        System.out.println("Introduzca el alto del rectángulo: ");
        int alto = in.nextInt();
        
        //Parte de arriba
        
        for (k=0;k<ancho;k++){
                System.out.print("+");
            }
        
        System.out.println();
        
        //Relleno
        
        while (i<alto){
            System.out.print("+");
            while (j<ancho-2){
                System.out.print("*");
                j++;
            }
            System.out.print("+");
            System.out.println();
            j=0;
            i++;
        }
        
        //Parte de abajo
        
        for (k=0;k<ancho;k++){
                System.out.print("+");
            }
        
        System.out.println();
        }
    
    // JUEGO AHORCADO
    
    public static void juegoAhorcado(){
        
        Scanner s = new Scanner(System.in);
        int vidas = 10;
        String palabra;
        int aciertos = 0;
        int tamaño;
        String opcionah;
        int contador = 0;
        String[] palabras = new String[]{"abeja", "aguila", "avispa", "ballena", "bisonte", "bufalo", "burro", "caballo", "camello", "canario", "cangrejo", "canguro", "caracol", "cebra", "cerdo", "chimpance", "ciervo", "cisne", "bufalo", "cocodrilo", "elefante", "escarabajo", "escorpion", "foca", "gallina", "gallo", "gato", "golondrina", "hipopotamo", "hormiga", "jabali", "jirafa", "leon", "loro", "mosca", "mosquito", "oso", "oveja", "perdiz", "perro", "pinguino", "pollo", "saltamontes", "serpiente", "tigre", "topo", "toro", "tortuga", "vaca", "zorro"};
        char[] respuesta;
        palabra = palabras[(int) (Math.random() * 48)];
        tamaño = palabra.length();
        respuesta = new char[tamaño];
         
         
        for (int l = 0; l<tamaño; l++) {
            respuesta[l] = 'X';
        }
 
        while (aciertos != tamaño && vidas != 0) {
            System.out.println("=========AHORCADO==========          VIDAS="+vidas +" Aciertos= "+aciertos);
            dibujarAhorcado(vidas);
            System.out.println("");
            for (int l = 0; l<tamaño; l++) {
 
                System.out.print("__" + respuesta[l] + "___  ");
            }
            System.out.println("\nIngresa una letra: ");
            opcionah = s.next();
            if (palabra.contains(opcionah)) {
                for (int l = 0; l<tamaño; l++) {
                    if (palabra.charAt(l) == opcionah.charAt(0)) {
                        respuesta[l] = opcionah.charAt(0);
                        contador++;
                    }
                }
 
                aciertos = aciertos + contador;
            } else {
                vidas--;
            }
 
            contador = 0;
        }
        if(vidas==0){
            dibujarAhorcado(vidas);
        }else
        {
            System.out.println("");
            for (int l = 0; l<tamaño; l++) {
 
                System.out.print("__" + respuesta[l] + "___  ");
            }
            System.out.println("Has ganado");
             
        }
    }
    
    // INTERFAZ AHORCADO
    
    private static void dibujarAhorcado(int l) {
        switch (l) {
            case 10:
                System.out.println(" ---------------------");
                for (int m = 0; m<15; m++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
            
            case 9:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                for (int m = 0; m<10; m++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
            
            case 8:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                for (int m = 0; m<10; m++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
            
            case 7:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                for (int m = 0; m<5; m++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 6:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                for (int m = 0; m<5; m++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
            
            case 5:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / |   ");
                System.out.println(" |                 /   |   ");
                System.out.println(" |                /    |   ");
                System.out.println(" |                     |   ");
                for (int m = 0; m<5; m++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
            case 4:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / |   ");
                System.out.println(" |                 /   |   ");
                System.out.println(" |                /    |   ");
                System.out.println(" |                     |   ");
                for (int m = 0; m<5; m++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
            
            case 3:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                for (int m = 0; m<5; m++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
                
            case 2:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                for (int m = 0; m<5; m++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
                    
            case 1:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    /  ");
                System.out.println(" |                   /      ");
                System.out.println(" |                  /       ");
                for (int m = 0; m<2; m++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 0:
               System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | X  X  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    / \\");
                System.out.println(" |                   /   \\  ");
                System.out.println(" |                  /     \\ ");
                for (int m = 0; m<2; m++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                System.out.println("GAME OVER");
                break;
        }
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
