import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[]args){
        int cantPos;
        String frase,fraseInversa;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese cantidad de posiciones ");
        cantPos=sc.nextInt();
        String CadenaArray[]=new String[cantPos];   
        CadenaArray=CargaArreglo(cantPos);
        for(int i=0;i<CadenaArray.length;i++){
            System.out.println(CadenaArray[i]);
        }
        
        frase=GenerarCadena(CadenaArray);
        System.out.println(frase);
        fraseInversa=GenerarCadenaInversa(CadenaArray);
        System.out.println(fraseInversa);
    }

    public static String[] CargaArreglo(int cant){
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

    public static String GenerarCadena(String CadenaArray[]){
        String cadena;
        cadena="";
        for(int i=0;i<CadenaArray.length;i++){
            cadena=cadena+CadenaArray[i]+" ";
        }
        return cadena;
    } 

    public static String GenerarCadenaInversa(String CadenaArray[]){
        String cadena;
        cadena="";
        for(int i=CadenaArray.length-1;i>=0;i--){
            cadena=cadena+CadenaArray[i]+"-";
        }
        return cadena;
    }    
}
