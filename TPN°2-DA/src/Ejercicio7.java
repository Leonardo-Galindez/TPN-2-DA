import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[]args){
        int cantPos;
        String frase,fraseInversa;
        Scanner sc= new Scanner(System.in);
        cantPos=ModulosArreglo.DefCantPosArray();
        String CadenaArray[]=new String[cantPos];   
        CadenaArray=ModulosArreglo.CargaArregloString(cantPos);
        for(int i=0;i<CadenaArray.length;i++){
            System.out.println(CadenaArray[i]);
        }
        
        frase=GenerarCadena(CadenaArray);
        System.out.println(frase);
        fraseInversa=GenerarCadenaInversa(CadenaArray);
        System.out.println(fraseInversa);
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
