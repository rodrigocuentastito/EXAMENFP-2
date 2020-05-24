import java.util.Scanner;


public class Examenpregunta3.main(Examenpregunta3.java:25){
        final String sexo;
		String tipovacuna;
        int edad;
        System.out.println("Ingrese la edad de la persona");
        edad=teclado.netxInt();
        System.out.println("Ingrese el sexo de la persona");
        sexo=teclado.netx();
        if(edad<16){
            tipovacuna="aplicar vacuna tipo A";
        }else if(edad>=16 && edad<=69){
            if(sexo.equals("M")){
            tipovacuna="aplicar vacuna tipo B";
            }else
            tipovacuna="aplicar vacuna tipo A";
        }
    }   else{
            tipovacuna="aplicar vacuna tipo C";
    } 
     System.out.println(tipovacuna);  
    public static void main(final String[] arg){
        System.out.println("hola rodrigo"); 
        tipovacunaRMCT();
    }
}
 }