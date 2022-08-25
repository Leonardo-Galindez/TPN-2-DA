import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] empleados;
        double[] sueldos;
        int largo;
        System.out.println("Ingrese la cantidad de personas empleadas en la empresa");
        largo = sc.nextInt();
        empleados = new String[largo];
        sueldos = new double[largo];
        cargarEmpl(empleados);
	    cargarSueldos(sueldos);
        opciones(empleados, sueldos);
    }

//*modulo que carga el arreglo empleados*//
     public static void cargarEmpl(String[] arr) {
        Scanner sc = new Scanner(System.in);
        int lon, i;
        String nombre;
        lon = arr.length;
        for (i = 0; i < lon; i++) {
            System.out.println("Ingrese el nombre del/la empleado/a " + (i + 1) + ".");
            nombre = sc.nextLine();
            arr[i] = nombre;
        }
    }

//*Modulo que carga los sueldos de los empleados*//
    public static void cargarSueldos(double[] arr) {
        Scanner sc = new Scanner(System.in);
        int lon, i;
        double sueldo;
        lon = arr.length;
        for (i = 0; i < lon; i++) {
            System.out.println("Ingrese el sueldo del/la empleado/a " + (i + 1) + ".");
            sueldo = sc.nextInt();
            arr[i] = sueldo;
        }
    }
//*modulo que busca el empleado con mayor sueldo*//
    public static void mayorSueldo(double[] sueldo, String[] empl) {
        int lon, i;
        double mayor;
        String empleado = empl[0];
        lon = sueldo.length;
        mayor = sueldo[0];
        for (i = 0; i < lon; i++) {
            if (sueldo[i] > mayor) {
                empleado = empl[i];
                mayor = sueldo[i];
            }
        }
        System.out.println("El/la empleado/a que tiene mayor sueldo es " + empleado + ". Su sueldo es de $" + mayor + " ");
    }

//*Modulo que busca un sueldo determinado*//
    public static void buscarSueldo(double[] sueldo, String[] empl) {
        Scanner sc = new Scanner(System.in);
        int lon, i;
        double buscar;
        lon = sueldo.length;
        System.out.println("Buscar personas que cobren exactamente $(ingrese sueldo)");
        buscar = sc.nextDouble();
        for (i = 0; i < lon; i++) {
            if (buscar == sueldo[i]) {
                System.out.println(empl[i]);
            }
        }
    }


//*Modulo que aumenta un 10% los sueldos inferiores a 10000*//
    public static void aumentar(double[] sueldo, String[] empl) {
        int lon, i;
        lon = sueldo.length;
        for (i = 0; i < lon; i++) {
            if (sueldo[i] < 10000) {
                sueldo[i] = sueldo[i] + ((sueldo[i] * 10) / 100);
                System.out.println("El sueldo de "+empl[i]+"ha aumentado a $"+sueldo[i]);
            }
        }
    }

//*modulo que busca a una persona determinada y muestra el sueldo*//
    public static void buscarPersona(String[] empl, double[] sueldo) {
        Scanner sc = new Scanner(System.in);
        int lon, i;
        String persona, nombre = "";
        lon = sueldo.length;
        System.out.println("Ingrese el nombre de la persona que desea buscar");
        persona = sc.nextLine();
        for (i = 0; i < lon; i++) {
            nombre = empl[i];
            if (persona.equals(nombre)) {
                System.out.println("El sueldo de " + persona + " es: $" + sueldo[i]);
        } else {
                System.out.println("No se ha encontrado el nombre de la persona");
            }

        }
    }

	

    public static void opciones(String[] arr, double[] sueldo) {
        boolean sigue;
        int rta;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero del 1 al 5, segun la opcion que desee realizar.");
            System.out.println("1- Buscar persona que tiene mayor sueldo.");
            System.out.println("2- Listar personas que cobran un sueldo determinado");
            System.out.println("3- Aumentar los sueldos que sean inferiores a 10000");
            System.out.println("4- Buscar una persona y mostrar sueldo.");
            System.out.println("5- Finalizar");
            rta = sc.nextInt();
            switch (rta) {
                case 1:
                    mayorSueldo(sueldo, arr);
                    break;
                case 2:
                    buscarSueldo(sueldo, arr);
                    break;
                case 3:
                    aumentar(sueldo, arr);
                    break;
                case 4:
                    buscarPersona(arr, sueldo);
                    break;
                case 5:
                    System.out.println("LA OPERACION HA FINALIZADO");
                    break;
                default:
                    System.out.println("ERROR. Se ingreso una opcion incorrecta");
            }
            System.out.println("Desea realizar otra tarea? Ingrese true o false.");
            sigue = sc.nextBoolean();
        } while (sigue);
   
    System.out.println("LA OPERACIÓN HA FINALIZADO"); }
}


