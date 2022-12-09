package Salud;
import java.util.Scanner;
public class Persona
{
    Scanner lectura= new Scanner(System.in);
    String tipodoc;
    int documento;
    String nombre;
    String appelido;
    double peso;
    double estatura;
    int edad;
    String sexo;

    public Persona(){}

    public Persona(String tipodoc,int documento,String nombre,String appelido,double peso, double estatura,int edad,String sexo)
    {
        this.tipodoc= tipodoc;
        this.documento= documento;
        this.nombre=nombre;
        this.appelido=appelido;
        this.peso=peso;
        this.estatura=estatura;
        this.edad=edad;
        this.sexo=sexo;
    }

    
    

    public void pedirDatos()
    {
        System.out.println("Ingrese tipo de documento");
        tipodoc = lectura.next();
        System.out.println("Ingrese numero de documento");
        documento = lectura.nextInt();
        System.out.println("Ingrese Nombre");
        nombre = lectura.next();
        System.out.println("Ingrese Appelido");
        appelido = lectura.next();
        System.out.println("Ingrese peso en kg");
        peso = lectura.nextDouble();
        System.out.println("Ingrese estatura en m");
        estatura = lectura.nextDouble();
        System.out.println("Ingrese edad");
        edad = lectura.nextInt();
        System.out.println("Ingrese sexo");
        sexo = lectura.next();
        
    }
    public void mostrarPersonal()
    {
        System.out.println("\nDATOS\n" +tipodoc+"\n"+documento+"\n"+nombre +"\n"+appelido+"\n"+peso +"\n"+estatura+"\n"+edad+"\n"+sexo);
        
    }
    public void calcularImc()
    {
        String result="";
        double pesoActual = peso/(estatura*estatura);
        if(pesoActual < 20){result = "Peso bajo";}
        else if(pesoActual >= 20 && pesoActual  <=25 ){result = "Peso ideal";}
        else if(pesoActual >25 ){result = "SOBRE PESO";}
        System.out.println(result);
        /*if(pesoActual < 20){System.out.println("Su  peso está por debajo de lo ideal");}
        else if(pesoActual >= 20 && peso <=25 ){System.out.println("Su  peso está ideal");}
        else if(pesoActual >25 ){System.out.println("Tiene sobrepeso");}
         */
        
     
    }
    public void mayorEdad()
    {
        if(edad<18){System.out.println("Usted es menor de edad");}
        else{System.out.println("Usted es mayor de edad");}
    }
    
}
