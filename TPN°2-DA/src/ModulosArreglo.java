import java.util.Scanner;
public class ModulosArreglo {
    //cargar un arreglo tipo String
    public static String[] CargaArregloString(int cant){
        String CadenaArray [] = new String[cant];
        String palabra;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<CadenaArray.length;i++){
            System.out.println("Ingrese palabra");
            palabra=sc.next();
            CadenaArray[i]=palabra;
        }
        return CadenaArray;
    }  
    //cargar un arreglo tipo char
    public static char[] CargaArreglochar(int cant){
        char CadenaArray [] = new char[cant];
        char carac;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<CadenaArray.length;i++){
            System.out.println("Ingrese caracter");
            carac=sc.next().charAt(0);
            CadenaArray[i]=carac;
        }
        return CadenaArray;
    } 
    //cargar un arreglo tipo int
    public static int[] CargaArregloInt(int cant){
        int Numeros [] = new int[cant];
        int numero;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<Numeros.length;i++){
            System.out.println("Ingrese numero");
            numero=sc.nextInt();
            Numeros[i]=numero;
        }
        return Numeros;
    } 
    //definir cantidad de posiciones
    public static int DefCantPosArray(){
        int cantPos;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese cantidad de posiciones del Arreglo ");
        cantPos=sc.nextInt();
        return cantPos;
    } 
    //mostrar areglo;
    public static void MostrarArreglo(int Arreglo[],int cant){
        for(int i=0;i<Arreglo.length;i++){
            System.out.print(Arreglo[i]);
        }
    } 
    public static void LimpiarArray(String Array[]){
        for(int i=0;i<Array.length;i++){
            Array[i]="";
        }
    }
    public static void MostrarArreglo(String Arreglo[],int cant){
        for(int i=0;i<Arreglo.length;i++){
            System.out.print(Arreglo[i]);
        }
    }
}

