import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int[] Multiplos = new int[10];
        int numero,mult;
        System.out.println("Ingrese Numero");
        numero=sc.nextInt();
        for(int i=1; i<=10;i++){
            mult=numero*i;
            Multiplos[i-1]=mult;
            System.out.println(Multiplos[i-1]);
        }
    }
}
