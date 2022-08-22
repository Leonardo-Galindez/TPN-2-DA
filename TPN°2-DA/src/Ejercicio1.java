import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ingreso;
        char carac;
        char Arreglo[] = new char[5];
        LimpiarArray(Arreglo);
        System.out.println("Ingrese caracter");
        for(int i=0;i<Arreglo.length;i++){
            carac=sc.next().charAt(0);
            Arreglo[i]=carac;
        }
        System.out.println("Desea ver los caracteres en el orden ingresado'1' ò '2' invertido");
        ingreso=sc.nextInt();
        
        if(ingreso==1){
            MostrarArreglo(Arreglo);
        }else{
            MostrarInvertir(Arreglo);
        } 
    }
    public static void MostrarInvertir(char Array[]){
        int j;
        j=Array.length;
        for(int i=j-1;i>=0;i--){
            System.out.print(Array[i]);
        }  
    }

    public static void MostrarArreglo(char Array[]){
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i]);
        }
    }

    public static void LimpiarArray(char Array[]){
        for(int i=0;i<Array.length;i++){
            Array[i]=' ';
        }
    }
}
