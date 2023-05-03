
package testprofesor;

class Profesores{
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    private ProvinciaNacimiento provinciaNacimiento;

    public Profesores() {}
    
    public Profesores(String nombre, String apellido, double sueldoBasico, String cedula, ProvinciaNacimiento provinciaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
        this.provinciaNacimiento = provinciaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void calcularSueldoTotal() {
        this.sueldoTotal = this.sueldoBasico + (this.sueldoBasico*0.2);
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setProvinciaNacimiento(ProvinciaNacimiento provinciaNacimiento) {
        this.provinciaNacimiento = provinciaNacimiento;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public String getCedula() {
        return cedula;
    }

    public ProvinciaNacimiento getProvinciaNacimiento() {
        return provinciaNacimiento;
    }

    @Override
    public String toString() {
        return "Profesores{" + "nombre=" + nombre + ", apellido=" + apellido + ", sueldoBasico=" + sueldoBasico + ", sueldoTotal=" + sueldoTotal + ", cedula=" + cedula + ", provinciaNacimiento=" + provinciaNacimiento + '}';
    }


}


class ProvinciaNacimiento{
    private String nombre;
    private int numeroHabitantes;

    public ProvinciaNacimiento() {}
    public ProvinciaNacimiento(String nombre, int numeroHabitantes) {
        this.nombre = nombre;
        this.numeroHabitantes = numeroHabitantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }
    
    
    
}




public class TestProfesor {

    public static void main(String[] args) {
        
        ProvinciaNacimiento provinciaNacimiento1 = new ProvinciaNacimiento("Loja", 1000);
        Profesores profesor1 = new Profesores("Maria","Gonzalez", 100,"110232839",provinciaNacimiento1);
        profesor1.calcularSueldoTotal();
        System.out.println(profesor1);
    }
    
}
