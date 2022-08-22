import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        int cant,j;
        cant=ModulosArreglo.DefCantPosArray();
        String CadenaArray[]=new String[cant];
        CadenaArray=ModulosArreglo.CargaArregloString(cant);
        
        for(int i=0;i<cant;i++){
            if(CadenaArray[i].length()==5){
                for(j=0;j<CadenaArray[i].length();j++){
                    if((j>=65&&j<=90) ||(j>=97&&j<=122)){

                    }else{

                    }
                }
            }else{
                j=i;
                if(i<cant){
                    
                    CadenaArray[j]="";
                    CadenaArray[j]=CadenaArray[j+1];
                }else{
                    CadenaArray[j]="";
                }
                
            }
        }
        for(int a=0;a<cant;a++){
            System.out.println(CadenaArray[a]);
        }
    }
}
