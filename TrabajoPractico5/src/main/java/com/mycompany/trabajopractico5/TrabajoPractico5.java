
package com.mycompany.trabajopractico5;

import Entidades.Arreglo;
import java.util.Scanner;

public class TrabajoPractico5 {

    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       Scanner leer2= new Scanner(System.in);
       int op=0;
       while(op<1 || op>4){
           System.out.println("MENU");
           System.out.println("1. Calcular la suma y promedio de elemetos en un arreglo");
           System.out.println("2. Buscar el valor mas grande en un arreglo bidimensional e irregular");
           System.out.println("3. Contar la cantidad de vocales en una palabra");
           System.out.println("4. Contar la cantidad de veces que aparece un caracter");
           System.out.println("5. Salir");
           op = leer.nextInt();
           switch(op){
               case 1:
                   int cant,arreglo[];
                   System.out.println("Ingrese la cantidad de elementos a ingresar en el arreglo: ");
                   cant = leer.nextInt();
                   arreglo= new int [cant];
                   for(int i=0;i<cant;i++){
                       System.out.println("Ingrese un numero: ");
                       arreglo[i]=leer.nextInt();
                   }
                    Arreglo.sumarLista(arreglo);
                    break;
               case 2:
                    int arreglobi[][]={{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
                    System.out.println("El valor mas grande del arreglo bidimensional irregular es: "+Arreglo.buscarMayor(arreglobi));
                    break;
               case 3:
                   String pal;
                   System.out.println("Ingrese la palabra de la cual desea conocer la cantidad de vocales: ");
                   pal = leer2.nextLine();
                   System.out.println("La cantidad de vocales que tiene la palabra "+pal+" es: "+Arreglo.cuentaVocales(pal));
                   break;
               case 4:
                   String palab;
                   char c;
                   System.out.println("Ingrese la palabra:");
                   palab=leer2.nextLine();
                   System.out.println("Ingrese el caracter:");
                   c = leer2.next().charAt(0);
                   System.out.println("La cantidad de veces que aparece el caracter "+c+" en la palabra "+palab+" es: "+Arreglo.cuentaCaracter(palab, c));
                   break;
               default:
                   break;
      
           }
       }
    
    }
}
