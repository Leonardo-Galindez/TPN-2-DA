import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cant, j;
        j = 0;

        cant = ModulosArreglo.DefCantPosArray();

        char Carac[] = new char[cant];

        Carac = ModulosArreglo.CargaArreglochar(cant);

        char VocalesArray[] = new char[cant];

        for (int i = 0; i < VocalesArray.length; i++) {
            if (Carac[i] == 'a' || Carac[i] == 'e' || Carac[i] == 'i' || Carac[i] == 'o' || Carac[i] == 'u'
                    || Carac[i] == 'A' || Carac[i] == 'E' || Carac[i] == 'I' || Carac[i] == 'O' || Carac[i] == 'U') {
                VocalesArray[i] = Carac[i];
            }
            j++;
        }
        for (int i = 0; i < VocalesArray.length; i++) {
            System.out.print(VocalesArray[i]);
        }

    }
}
