package Principal;
import java.util.Scanner;
import Salud.Persona;
import Salud.empleado;

public class inicio 
{
    
    public static void main(String[]args)
    {
        int op;
        Scanner lectura= new Scanner(System.in);
        Persona datos=  new Persona();
        empleado empleado = new empleado();
        do
        {
        System.out.println("\nBienvenido al menu de inicio\nelija una de las siguentes opcion\ningrese 1 si desea ingresar datos\nIngrese 2 si desea ver la informacion del usuario\nIngrese 3 si desea calcular su peso Actual\nIngrese 4 si desea Determinar si es mayor de edad\nIngrese 5 datos para calculo\nElija 6 si desea mostrar datos con calculo\nIngrese 7 para salir \n");
        op= lectura.nextInt();
        if(op==1) empleado.pedirDatos();
        else if(op==2) empleado.mostrarPersonal();
        else if(op==3) empleado.calcularImc(datos.getPeso(),datos.getEstatura());
        else if(op==4) empleado.mayorEdad();
        else if(op==5) {empleado.registrarParaCalculo(); empleado.calcularHonorarios(empleado.getValorhora(), empleado.getHorastrabajadas());}
        else if(op==6) empleado.mostrardatos();
        else{System.out.println("Dato invalido");}
        }while(op!=7);
    }
    
    
}
