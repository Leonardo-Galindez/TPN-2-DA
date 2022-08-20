import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[]args){
        int posArray,num;
        Scanner sc=new Scanner(System.in);
        int Entero[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Ingrese un Entero");
        num=sc.nextInt();
        for(int i=1;i<=Entero.length;i++){
            if(i % 2==0){
                Entero[i-1]=num;
            }
            System.out.print(Entero[i-1]);
        }
    }
}
