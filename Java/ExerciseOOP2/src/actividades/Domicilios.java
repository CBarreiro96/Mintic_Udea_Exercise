package actividades;

import personas.Clientes;
import personas.Empleado;
import personas.Persona;
import vehiculos.Carro;
import vehiculos.Moto;

import java.util.Date;

public class Domicilios {
    public static void main(String[] args) {
        Empleado daniela = new Empleado("123","Daniela","torres","Ing",new Date());
        Clientes cliente = new Clientes("1234","Raul","Florez");
        Carro carro1 = new Carro("ABC123","Renault","Azul","Camioneta");
        Moto moto1 = new Moto("123","Yamaha","Negro");

        Persona ClienteJuan = new Clientes("123","Juan","Lopez");
        System.out.println("Cliente Juan > "+ClienteJuan.imprimirNombre());

        Empleado maria = new Empleado("458","Maria","Ochoa", carro1);
        System.out.println("empleado: " + daniela.imprimirNombre());
        System.out.println("cliente: " + cliente.imprimirNombre());

        System.out.println("moto: " + moto1.imprimir());
        System.out.println("carro: " + carro1.imprimir());

        cliente.solicitarDomicilio();
        System.out.println("Clasificacion 1 " + cliente.getClasificacion());
        cliente.solicitarDomicilio();
        cliente.solicitarDomicilio();
        cliente.solicitarDomicilio();
        System.out.println("Clasificacion 2 " + cliente.getClasificacion());
        cliente.solicitarDomicilio();
        cliente.solicitarDomicilio();
        cliente.solicitarDomicilio();
        System.out.println("Clasificacion 3 " + cliente.getClasificacion());
    }

}
