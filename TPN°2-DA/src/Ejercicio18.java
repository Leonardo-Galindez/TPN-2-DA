import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        int op,cant;
        cant=ModulosArreglo.DefCantPosArray();
        String EmpleadosArray[]= new String[cant];
        int SueldosArray[]=new int[cant];
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Mostrar la persona que tiene el mayor sueldo---------------------1");
        System.out.println("Lista todas la personas que cobran X sueldo----------------------2");
        System.out.println("Aumentar en un 10% los sueldos que inferiores a $10000-----------3");
        System.out.println("Buscar una persona y  mostrar su sueldo--------------------------4");
        op=sc.nextInt();
        switch(op){
            case 1:
            break;
            case 2:
            break;
            case 3:
            break;
            case 4:
            break;
            default:
            System.out.println("ERROR");
            break;
        }
    }

}
