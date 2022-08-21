import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int cant,i;
        boolean ValorArreglo;
        cant=ModulosArreglo.DefCantPosArray();
        int Numeros1[]=new int[cant];
        int Numeros2[]=new int[cant];
        Numeros1=ModulosArreglo.CargaArregloInt(cant);
        System.out.println("Cargar segundo arreglo");
        Numeros2=ModulosArreglo.CargaArregloInt(cant);
        ValorArreglo=ArreglosIguales(Numeros1, Numeros2, cant);
        System.out.println("Los arreglos son iguales:"+ValorArreglo);
    }
    public static boolean ArreglosIguales(int Numeros1[],int Numeros2[],int cant){
        boolean valor;
        valor=false;
        for(int i=0;i<cant;i++){
            if(Numeros1[i]==Numeros2[i]){
                valor=true;
            }else{
                valor=false;
            }
        }
        return valor;
    }
}
