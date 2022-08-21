import java.util.Scanner;
public class Ejercicio10 {  
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int cant,i;
        cant=ModulosArreglo.DefCantPosArray();
        int Enteros[]= new int[cant];
        int EnterosInvert[]= new int[cant];
        Enteros=ModulosArreglo.CargaArregloInt(cant);
        i=Enteros.length-1;
        for(int j=0;j<Enteros.length;j++){
            EnterosInvert[j]=Enteros[i];
            i--;
        }
        ModulosArreglo.MostrarArreglo(EnterosInvert, cant);
        
    }
}
