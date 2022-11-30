/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Scanner;
import java.util.Locale;

public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero_empleados;
        numero_empleados = 0;
        String nombre;
        nombre = "";
        int cedula;
        cedula = 0;
        int horas_nocturnas;
        horas_nocturnas = 0;
        int horas_matutinas;
        horas_matutinas = 0;
        String ciudad;
        ciudad = "";
        double seguro;
        seguro = 0;
        boolean bandera = true;
        String opcion;
        opcion = "";
        int total_nocturna;
        total_nocturna = 0;
        int total_matutina;
        total_matutina = 0;
        int descuento1;
        descuento1 = 0;
        double total;
        total = 0;
        int subtotal;
        subtotal = 0;
        String mensaje;
        mensaje = "";
        while (bandera == true) {

            System.out.println("Ingrese el nombre del empleado");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el numero de cedula del empleado");
            cedula = entrada.nextInt();
            System.out.println("Ingrese el numero de horas matutinas trabajadas");
            horas_matutinas = entrada.nextInt();
            System.out.println("Ingrese el numero de horas nocturnas trabajadas");
            horas_nocturnas = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese la ciudad de la empresa");
            ciudad = entrada.nextLine();

            total_nocturna = horas_nocturnas * 15;
            total_matutina = horas_matutinas * 10;
            subtotal = total_nocturna + total_matutina;
            if (horas_nocturnas >= 10) {
                descuento1 = (int) (total_nocturna * 0.10);
                total_nocturna = total_nocturna + descuento1;
            }
            total = total_matutina + total_nocturna;

            seguro = total * 0.18;
            total = (int) (total - seguro);

            mensaje = mensaje + "Rol del trabajador con nombre " + nombre  
                    + ""
                    + "Y con cedula " + cedula + "\n+" + "Horas matutinas "
                    + "trabajadas "
                    + horas_matutinas + "\n" + "horas nocturnas "+"trabajadas "
                    + horas_nocturnas +"\n"+"Subtotal "+subtotal+"\n"+"Seguro "
                    + "social "+seguro+"\n"+"total a cancelar "+total+"\n";
            numero_empleados = numero_empleados + 1;
            System.out.println("Ingrese la letra s para salir");
            opcion = entrada.nextLine();
            if (opcion.equals("s")) {
                bandera = false;
            }
        }
        System.out.println(mensaje);
        System.out.printf("Numero de empleados: " + numero_empleados);
    }

}
