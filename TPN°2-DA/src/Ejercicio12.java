import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int cant;
        cant=ModulosArreglo.DefCantPosArray();
        char CaracArray[]=new char[cant];
        char CaracArrayCopia[]=new char[cant];
        CaracArray=ModulosArreglo.CargaArreglochar(cant);
        CaracArrayCopia=CopiaArray(CaracArray,cant);
        for(int i=0;i<cant;i++){
            System.out.print(CaracArrayCopia[i]);
        }
    }
    public static char[] CopiaArray(char CaracArray[],int cant){
        char CaracArrayCopia[]=new char[cant];
        for(int i=0;i<cant;i++){
            CaracArrayCopia[i]=CaracArray[i];
        }
        return CaracArrayCopia;
    }
    
}
