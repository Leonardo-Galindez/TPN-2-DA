import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantPos;
        String palabraMayor;
        palabraMayor = "";
        cantPos = ModulosArreglo.DefCantPosArray();
        String CadenaArray[] = new String[cantPos];
        CadenaArray = ModulosArreglo.CargaArregloString(cantPos);
        for (int i = 0; i < CadenaArray.length; i++) {
            if (palabraMayor.length() < CadenaArray[i].length()) {
                palabraMayor = CadenaArray[i];
            }
        }
        System.out.println("La palabra mas larga del arreglo es:" + palabraMayor);
    }
}
