import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int cantArreglo,num;
        float promedioArray;
        cantArreglo=ModulosArreglo.DefCantPosArray();
        int Enteros[]=new int[cantArreglo];
        for(int i=0;i<Enteros.length;i++){
            System.out.println("Ingrese numeros para el arreglo");
            num=sc.nextInt();
            Enteros[i]=num;
        } 
        promedioArray=CalculoPromedio(Enteros);
        System.out.println("El promedio de los numeros del array es:"+promedioArray);
    }
    public static float CalculoPromedio(int Enteros[]){
        float promedio,acum;
        acum=0;
        promedio=0;
        for(int j=0;j<Enteros.length;j++){
            acum=acum+Enteros[j];
        }
        promedio=acum/Enteros.length;
        return promedio;
    }
}
