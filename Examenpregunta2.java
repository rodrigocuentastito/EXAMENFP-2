import java.util.Scanner ;
    public class Examenpregunta2 {
    Scanner teclado=new Scanner(System.in);
    public static void calcularmontodelbonoRMCT(){
        int puntos;
        double salariominimo, montobono;
        System.out.println("ingrese el salario minimo:");
        salariominimo=teclado.nextDouble();
        System.out.println("Ingrese el Puntaje que ha obtenido el profesor:");
        salariominimo=teclado.nextInt();
        if(puntos>=20 && puntos<=100){
            montobono=10*salariominimo/100;
        }else if(puntos>=101 && puntos<=200){
            montobono=50*salariominimo/100;
        }else{
            montobono=100*salariominimo/100
        }
        System.out.println("El monto del bono es:"+montobono)
    }



}