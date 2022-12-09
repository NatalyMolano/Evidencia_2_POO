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

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppelido() {
        return appelido;
    }

    public void setAppelido(String appelido) {
        this.appelido = appelido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
    public double calcularImc(double p, double e)
    {
        double pesoActual = p/(e*e);
        return pesoActual;
       
     
    }
    public void mayorEdad()
    {
        if(edad<18){System.out.println("Usted es menor de edad");}
        else{System.out.println("Usted es mayor de edad");}
    }
    
}
