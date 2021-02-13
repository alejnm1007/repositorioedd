
package examen_edd.prueba1_edd2;

import java.util.Scanner;

public class edd_funcion2 {

    public static void main(String[] args) {

        System.out.println("");
        Scanner entrada = new Scanner (System.in);
        int Mxy[][],filas,columnas;
        int X,Y;
        
        System.out.print("Por favor ingrese el número de filas de la matriz: ");
        filas = entrada.nextInt();
        System.out.println("");
        System.out.print("Por favor ingrese el número de columnas de la matriz: ");
        columnas = entrada.nextInt();
        
        Mxy = new int [filas][columnas];
       
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                Mxy[i][j] = (2304+10*(i+1))+(2003-3+10*(j+1));
                
            }
        }   
         System.out.println("");
        
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                System.out.print(Mxy[i][j]+" ");
                
            }
            System.out.println("");
        }   
         System.out.println("");
    }
    
}
