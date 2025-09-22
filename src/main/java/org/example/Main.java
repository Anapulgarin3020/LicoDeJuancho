package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     String azul="\u001B[34m";
        System.out.println(azul+"Licorera donde juancho");

        System.out.println("1. Cóctel Blody Mary-->$38000🍸");
        System.out.println("2. Cóctel Mimosa-->$25000🍸");
        System.out.println("3. Cóctel Mojito-->$35000🍸");
        System.out.println("4. Cóctel de biche-->$24000🍸");
        System.out.println("5. Cóctel de flores-->$28000🍸");
        System.out.println("6. Cóctel cucaracho-->$30000🍸");
        System.out.println("7. Cóctel Paisa-->18000🍸");
        System.out.println("8. Cóctel Refajo Colombiano-->20000🍸");

        System.out.println("BIENVENIDO.....Queremos conocerte.");
        String nombreCliente;
        String nombreAcompañante;
        String telefonoCliente;
        Scanner leerTeclado= new Scanner(System.in);

        System.out.println("¿Cuál es su nombre?");
        nombreCliente=leerTeclado.nextLine();

        System.out.println("¿Quién te acompaña hoy?");
        nombreAcompañante=leerTeclado.nextLine();

        System.out.println("¿Cuál es tu teléfono?");
        telefonoCliente=leerTeclado.nextLine();

        System.out.println("Tus datos recogidos:");

        System.out.println("Su nombre es..."+nombreCliente);
        System.out.println("Su acompañante es..."+nombreAcompañante);
        System.out.println("Su teléfono es..."+telefonoCliente);

        System.out.println("Registrando tu orden:🔔");
        Integer opcionMenu=100;
        Integer cantidadPedidoCliente;
        Integer cantidadPedidaAcompañante;

        while (opcionMenu !=9){
            System.out.println("Digita una opcion");
            opcionMenu=leerTeclado.nextInt();

            //Evaluando el pedido
            if (opcionMenu==1){
                System.out.println("Elegiste Blody Mary🩸");
                System.out.println("¿Cuántos cócteles lleva el pedido?");
                cantidadPedidoCliente=leerTeclado.nextInt();
                System.out.println("El cliente pidió..."+cantidadPedidoCliente);
            } else if (opcionMenu==2) {
                System.out.println("Elegiste Mimosa🍷");
                System.out.println("¿Cuántos cócteles lleva el pedido?");
                cantidadPedidaAcompañante=leerTeclado.nextInt();
                System.out.println("El acompañante pidió..."+cantidadPedidaAcompañante);
            }else {

            }
        }


    }
}