import java.util.Scanner;
public class EXAMEN_DIAGNOSTICO{
    public static void main(String[] args){
        String e,a,b,d,f,g,h,i,j,k,l,m,n;
        int edad;
        Scanner cel=new Scanner(System.in);

    System.out.println("*EXAMEN DIAGNOSTICO*\n");
    System.out.println("*ENCUESTA FAMILIAR*\n");
    System.out.println("NOMBRE COMPLETO:\n");
    a=cel.nextLine();
    System.out.println("FECHA DE NACIMIENTO:\n");
    b=cel.nextLine();
    System.out.println("EDAD:\n");
    edad=cel.nextInt();
    System.out.println("SEXO:\n");
    d=cel.nextLine();
    System.out.println("OCUPACION:\n");
    f=cel.nextLine();
    System.out.println("HOBBY:\n");
    g=cel.nextLine();
    System.out.println("PELICULA FAVORITA:\n");
    h=cel.nextLine();
    System.out.println("COMIDA FAVORITA:\n");
    i=cel.nextLine();
    System.out.println("ANIMAL FAVORITO:\n");
    j=cel.nextLine();
    System.out.println("COLOR FAVORITO:\n");
    k=cel.nextLine();
    System.out.println("¿QUE ESPERAS DE MI EN LA CARRERA?\n");
    l=cel.nextLine();
    System.out.println("¿ESTAS ORGULLOS@ DE MI?\n");
    e=cel.nextLine();
    if("SI".equals(e)){
        System.out.println("Te quiero mucho\n");
    }else if ("NO".equals(e)){
        System.out.println("¿POR QUE?\n");
        m=cel.nextLine();
        System.out.println("¿QUE TE GUSTARIA QUE MEJORARA?\n");
        n=cel.nextLine();
        
    }

    }
    }






