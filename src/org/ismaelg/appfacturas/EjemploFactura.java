package org.ismaelg.appfacturas;

import org.ismaelg.appfacturas.models.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Josue");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc,cliente);

        Producto producto;


        System.out.println();

        for (int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.println("Ingrese prodcuto N " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.println("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.println("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(s.nextInt(),producto));

            System.out.println();
            s.nextInt();
        }

        System.out.println(factura);
    }
}
