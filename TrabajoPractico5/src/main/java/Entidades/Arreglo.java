
package Entidades;

public class Arreglo {
    
    public static void sumarLista(int arreglo[]){
        float suma=0;
        float prom;
        int cant;
        for(int i=0;i<arreglo.length;i++){
            suma+=arreglo[i];
        }
        prom = suma/arreglo.length;
        System.out.println("La suma de los elementos del arreglo es: "+suma);
        System.out.println("El promedio de los elementos del arreglo es: "+prom);
    }
    
    public static int buscarMayor(int arreglo[][]){
        int mayor =-99999;
        for(int i=0;i<arreglo.length;i++){
            for(int j=0;j<arreglo[i].length;j++){
                if (arreglo[i][j]>mayor){
                    mayor = arreglo[i][j];
                }
            }    
        }
        return mayor;
    }
  
    public static int cuentaVocales(String palabra) {
        int cant = 0;
        palabra = palabra.toLowerCase();
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c =='a' || c =='e' || c =='i' || c =='o' || c =='u'){
                cant++;
            }
        }
        return cant;
    }
    
    public static int cuentaCaracter(String palabra, char p){
        int cant =0;
        palabra = palabra.toLowerCase();
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c == p){
                cant++;
            }
        }
        return cant;
    }

}
