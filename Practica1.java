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
        int vidas = 6;
        String palabra;
        int aciertos = 0;
        int tamaño;
        String opcionah;
        int contador = 0;
        String[] palabras = new String[]{"lapiz", "goma", "libreta", "maestro", "examen", "matematicas"};
        char[] respuesta;
        palabra = palabras[(int) (Math.random() * 48)];
        tamaño = palabra.length();
        respuesta = new char[tamaño];
         
         
        for (int i = 0; i<tamaño; i++) {
            respuesta[i] = 'X';
        }
         
 
        while (aciertos != tamaño && vidas != 0) {
            System.out.println("=========AHORCADO==========          VIDAS="+vidas +" Aciertos= "+aciertos);
            dibujarAhorcado(vidas);
            System.out.println("");
            for (int i = 0; i<tamaño; i++) {
 
                System.out.print("__" + respuesta[i] + "___  ");
            }
            System.out.println("\nIngresa una letra: ");
            opcionah = s.next();
            if (palabra.contains(opcionah)) {
                for (int i = 0; i<tamaño; i++) {
                    if (palabra.charAt(i) == opcionah.charAt(0)) {
                        respuesta[i] = opcionah.charAt(0);
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
            for (int i = 0; i<tamaño; i++) {
 
                System.out.print("__" + respuesta[i] + "___  ");
            }
            System.out.println("Has ganado");
             
        }
    }
    
    // INTERFAZ AHORCADO
    
    private static void dibujarAhorcado(int i) {
        switch (i) {
            case 6:
                System.out.println(" ---------------------");
                for (int j = 0; j<15; j++) {
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
                for (int j = 0; j<10; j++) {
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
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j<5; j++) {
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
                System.out.println(" |                   / |   ");
                System.out.println(" |                 /   |   ");
                System.out.println(" |                /    |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j<5; j++) {
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
                for (int j = 0; j<5; j++) {
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
                for (int j = 0; j<2; j++) {
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
                for (int j = 0; j<2; j++) {
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
