import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int cantArreglo,num,mayor,menor;
        System.out.println("Ingrese cantidad de posiciones del Arreglo");
        cantArreglo=sc.nextInt();
        int MayorMenor[]=new int[cantArreglo];
        for(int i=0;i<MayorMenor.length;i++){
            System.out.println("Ingrese numeros para el arreglo");
            num=sc.nextInt();
            MayorMenor[i]=num;
        }  
        mayor=NumeroMayor(MayorMenor);
        menor=NumeroMenor(MayorMenor);
        System.out.println("El numero mas grande del arreglo es:"+mayor);
        System.out.println("El numero mas pequeño del arreglo es:"+menor);
    }
    public static int NumeroMayor (int MayorMenor[]){
        int posMayor=0;
        for(int i=0;i<MayorMenor.length;i++){
            if(posMayor<MayorMenor[i]){
                posMayor=MayorMenor[i];
            }
        }  
        return posMayor;
    }
    public static int NumeroMenor (int MayorMenor[]){
        int posMenor=1000000000;
        for(int j=0;j<MayorMenor.length;j++){
            if(posMenor>MayorMenor[j]){
                posMenor=MayorMenor[j];
            }
        }  
        return posMenor;
    }
}
