import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cant;
        cant=ModulosArreglo.DefCantPosArray();
        String Palabras[]=new String[cant];
        String ArregloPares[]=new String[cant];
        String ArregloImpares[]=new String[cant];

        Palabras=ModulosArreglo.CargaArregloString(cant);
        ModulosArreglo.LimpiarArray(ArregloPares);
        ModulosArreglo.LimpiarArray(ArregloImpares);
        ArregloPares=ArregloPares(Palabras,cant);
        ArregloImpares= ArregloImpares(Palabras,cant);
        
        MostrarArreglo(ArregloPares, cant);
        System.out.println();
        MostrarArreglo(ArregloImpares, cant);
        
    }
    public static void MostrarArreglo(String Arreglo[],int cant){
        for(int i=0;i<Arreglo.length;i++){
            System.out.print(Arreglo[i]);
        }
    } 

    public static String[] ArregloPares(String Palabras[],int cant){
        String ArregloPares[]=new String[cant];
        for(int i=0; i<cant;i++){
            if(i % 2==0){
                ArregloPares[i]=Palabras[i];
            }else{
                ArregloPares[i]=" ";
            }
        }
        return ArregloPares;
    }
    public static String[] ArregloImpares(String Palabras[],int cant){
        String ArregloImpares[]=new String[cant];
        for(int i=0; i<cant;i++){
            if(i % 2!=0){
                ArregloImpares[i]=Palabras[i];
            }else{
                ArregloImpares[i]=" ";
            }
        }
        return ArregloImpares;
    }
}
