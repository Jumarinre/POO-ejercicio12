package ejercicio12;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        double horasTrabajadas, valorHora, retencion, salarioBruto, salarioNeto;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de horas trabajadas");
        horasTrabajadas = entrada.nextDouble();
        System.out.println("Ingrese el valor por hora");
        valorHora = entrada.nextDouble();
        salarioBruto = horasTrabajadas*valorHora;
        retencion = (0.125)*salarioBruto;
        salarioNeto = salarioBruto - retencion;
        
        System.out.println("El salario bruto del trabajador es " + salarioBruto);
        System.out.println("La retencion de la fuente del trabajador es " + retencion);
        System.out.println("El salario neto del trabajador es " + salarioNeto);
    }
}
