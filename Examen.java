import java.util.Scanner;
public class Examen{
    public static void main(String[] arg) {
        Scanner leer= new Scanner(System.in);
        float notas ;
        float suma = 0;
        float promedio;
        int a;
        for(a=1 ; a<=4 ;a++)
        {
            System.out.println("Ingresa el dato:"+a+"");
            notas=leer.nextFloat();
            suma=suma+notas;
        }
        promedio=suma/(a-1);
        System.out.println("La nota final es:"+promedio);
       
    }
}