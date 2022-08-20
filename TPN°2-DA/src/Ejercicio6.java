import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int cant,i,cantLetras;
        cantLetras=0;
        char carac;
        carac=' ';
        System.out.println("Ingrese cantidad de posiciones del arreglo");
        cant=sc.nextInt();
        char Letras[]=new char[cant];
        for(i=0;i<Letras.length;i++){
            System.out.println("Ingrese letras");
            carac=sc.next().charAt(0);
            if(((carac>=65 && carac<=90)||(carac>=97&&carac<=122))){
                Letras[i]=carac;
                cantLetras++;
            }
        }
        System.out.println("La cantidad de letras ingresadas fue de:"+cantLetras);
    }
}
