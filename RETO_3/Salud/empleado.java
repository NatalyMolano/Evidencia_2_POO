package Salud;

public class empleado extends Persona 
{
    String cargo, departamento;
    int horastrabajadas;
    double valorhora,valortotal;
    
    public empleado()
    {

    }

    public empleado(String tipodoc,int documento,String nombre,String appelido,double peso, double estatura,int edad,String sexo,String cargo, String departamento, int horastrabajadas, double valorhora) {
        super(tipodoc,documento,nombre,appelido,peso,estatura,edad,sexo);
        this.cargo = cargo;
        this.departamento = departamento;
        this.horastrabajadas = horastrabajadas;
        this.valorhora = valorhora;
    }

    
    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    public String getCargo() {
        return cargo;
    }



    public void setCargo(String cargo) {
        this.cargo = cargo;
    }



    public String getDepartamento() {
        return departamento;
    }



    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }



    public int getHorastrabajadas() {
        return horastrabajadas;
    }



    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }



    public double getValorhora() {
        return valorhora;
    }



    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }

    public void registrarParaCalculo()
    {
        System.out.println("Ingrese cargo");
        cargo = lectura.next();
        System.out.println("Ingrese departamento");
        departamento = lectura.next();
        System.out.println("Ingrese el valor por hora");
        valorhora = lectura.nextDouble();
        System.out.println("Ingrese la cantidad de hora");
        horastrabajadas = lectura.nextInt();
    }

    public void calcularHonorarios(double v, int c)
    {
        valortotal = (v*c) -((v*c)* 0.966)/100 ;
        System.out.println(valortotal);
    }
    public void mostrardatos()
    {
        System.out.println("tipo de documento:" +getTipodoc()+ "\nnúmero de documento:" +getDocumento()+ "\nNombre:"+getNombre() +""+getAppelido()+
        "\nCargo:"+ cargo +"\nhoras trabajadas:" + horastrabajadas  +"\nvalor por hora:"+valorhora+ "\ntotal a pagar:" +valortotal);
    }
}
