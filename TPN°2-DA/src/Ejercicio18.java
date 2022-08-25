import java.util.Scanner;

//sc.next();para no tener errores cuando lea un un intero o real y luego un cadena de texto nextline
public class Ejercicio18 {
    public static void main(String[] args) {
        int op,cant,posEmpleado,posSueldo;
        String nombreEmpleado,empleado;
        float sueldoEmpleado,sueldoBus;
        cant=ModulosArreglo.DefCantPosArray();
        String EmpleadosArray[]= new String[cant];
        float SueldosArray[]=new float[cant];

        Scanner sc= new Scanner(System.in);

        System.out.println("Cargar Planillas");

        for(int i=0;i<cant;i++){
            System.out.println("Ingrese nombre Empleado");
            nombreEmpleado=sc.next();
            System.out.println("Ingrese sueldo Empleado");
            sueldoEmpleado=sc.nextFloat();
            EmpleadosArray[i]=nombreEmpleado;
            SueldosArray[i]=sueldoEmpleado;
        }

        System.out.println("Mostrar la persona que tiene el mayor sueldo---------------------1");
        System.out.println("Lista todas la personas que cobran X sueldo----------------------2");
        System.out.println("Aumentar en un 10% los sueldos que inferiores a $10000-----------3");
        System.out.println("Buscar una persona y  mostrar su sueldo--------------------------4");
        op=sc.nextInt();

        switch(op){
            case 1://Empleado con mayor sueldo
                posEmpleado=PosMayorSueldo(SueldosArray,cant);
                System.out.println("El empleado con mayor sueldo es:\n"+EmpleadosArray[posEmpleado]+"\nSueldo:"+SueldosArray[posEmpleado]);
            break;

            case 2://lsitar todos los empleados con sueldo X
                System.out.println("Ingrese sueldo para filtrar");
                sueldoBus=sc.nextFloat();
                ListarSueldoX(SueldosArray,EmpleadosArray,sueldoBus,cant);
            break;
            case 3://Aumentar un 10% los sueldo menores a 10000
                for(int j=0;j<cant;j++){
                    AumentoSueldo(SueldosArray,j);
                    System.out.println(EmpleadosArray[j]+"\nSueldo:"+SueldosArray[j]);
                }
            break;
            case 4://buscar empleado
                System.out.println("Ingrese nombre empleado a buscar");
                empleado=sc.next();
                posSueldo=BuscarEmpleado(EmpleadosArray, cant, empleado);
                System.out.println(EmpleadosArray[posSueldo]+"\nSueldo:"+SueldosArray[posSueldo]);
            break;
            default:
                System.out.println("ERROR");
            break;
        }
    }
    //Empleado con mayor sueldo
    public static int PosMayorSueldo(float SueldosArray[],int cant){
        int posEmpleado;
        float mayorSueldo;
        mayorSueldo=0;
        posEmpleado=0;
        for(int i=0;i<cant;i++){
            if(mayorSueldo<SueldosArray[i]){
                mayorSueldo=SueldosArray[i];
                posEmpleado=i;
            }
        }
        return posEmpleado;
    }
    //lsitar todos los empleados con sueldo X
    public static void ListarSueldoX(float SueldosArray[],String EmpleadosArray[],float sueldo,int pos){
        for(int i=0;i<pos;i++){
            if(SueldosArray[i]==sueldo){
                System.out.println(EmpleadosArray[i]+"\nSueldo:"+SueldosArray[i]);
                System.out.println();
            }
        }
    }
    //Aumentar un 10% los sueldo menores a 10000
    public static void AumentoSueldo(float SueldosArray[],int i){
        float aumento;
        if(SueldosArray[i]<10000){
            aumento=(SueldosArray[i]*10)/100;
            SueldosArray[i]=SueldosArray[i]+aumento;
        }
    }
    //buscar empleado
    public static int BuscarEmpleado(String EmpleadosArray[],int cant,String nombre){
        int posEmpleado;
        posEmpleado=0;
        for(int i=0;i<cant;i++){
            if(nombre.equals(EmpleadosArray[i])){
                posEmpleado=i;
            }
        }
        return posEmpleado;
    }

}
