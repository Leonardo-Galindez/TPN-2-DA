import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,cifras,resto;
        String TablaLetras[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E",};
        do{
        System.out.println("Ingrese numero 8 cifras");
        num=sc.nextInt();
        cifras=VerificarCifras(num);
        }while(cifras!=8); 
        resto=RestoDNI(num);
        System.out.println(num+TablaLetras[resto]);
    }
    //calcular el resto del numero ingresado
    public static int RestoDNI(int numero){
        int resto;
        resto=numero%23;
        return resto;
    }
    //modulo para verificar las cifras del numero ingresado
    public static int VerificarCifras(int numero){
        boolean valorCifra;
        int cifra;
        cifra=0;
        valorCifra=false;
        while(!valorCifra){
            numero=numero/10;
            if(numero==0){
             valorCifra=true;
            }
            cifra++;
        }
        return cifra;
    }
}
