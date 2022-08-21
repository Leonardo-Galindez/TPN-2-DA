import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int cantPos,caracCant;
        boolean valorCarac;
        char caracter;
        cantPos=ModulosArreglo.DefCantPosArray();
        char caracArray[]=new char[cantPos];   
        caracArray=ModulosArreglo.CargaArreglochar(cantPos);
        System.out.println("Ingrese caracter a buscar");
        caracter=sc.next().charAt(0);
        valorCarac=VerificarCarac(caracArray, caracter);
        System.out.println("El caracter "+caracter+" se encuentra en el arreglo:"+valorCarac);
        caracCant=contarCarac(caracArray, caracter);
        System.out.println("La cantidad de veces que aparece"+caracter+"en el arreglo es:"+caracCant);

    }

    public static boolean VerificarCarac(char caracArray[],char carac){
        boolean valor;
        valor=false;
        for(int i=0;i<caracArray.length;i++){
            if(carac==caracArray[i]){
                valor=true;
            }
        }
        return valor;
    } 
    public static int contarCarac(char caracArray[],char carac){
        int cantCarac;
        cantCarac=0;
        for(int i=0;i<caracArray.length;i++){
            if(carac==caracArray[i]){
                cantCarac++;
            }
        }
        return cantCarac;
    }
}
