/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package es.educastur.mariova62.tienda2026;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 1dawd07
 */
public class Tienda2026 {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Pedido> pedidos;
    private HashMap<String, Articulo> articulos;
    private HashMap<String, Cliente> clientes;

    public Tienda2026() {
        pedidos = new ArrayList();
        articulos = new HashMap();
        clientes = new HashMap();
    }

    public static void main(String[] args) {
        Tienda2026 t2026 = new Tienda2026();
        t2026.cargaDatos();
        t2026.menu();
    }

    public void cargaDatos() {
        clientes.put("80580845T", new Cliente("80580845T", "ANA ", "658111111", "ana@gmail.com"));
        clientes.put("36347775R", new Cliente("36347775R", "LOLA", "649222222", "lola@gmail.com"));
        clientes.put("63921307Y", new Cliente("63921307Y", "JUAN", "652333333", "juan@gmail.com"));
        clientes.put("02337565Y", new Cliente("02337565Y", "EDU", "634567890", "edu@gmail.com"));

        articulos.put("1-11", new Articulo("1-11", "RATON LOGITECH ST ", 14, 15));
        articulos.put("1-22", new Articulo("1-22", "TECLADO STANDARD  ", 9, 18));
        articulos.put("2-11", new Articulo("2-11", "HDD SEAGATE 1 TB  ", 16, 80));
        articulos.put("2-22", new Articulo("2-22", "SSD KINGSTOM 256GB", 9, 70));
        articulos.put("2-33", new Articulo("2-33", "SSD KINGSTOM 512GB", 0, 200));
        articulos.put("3-22", new Articulo("3-22", "EPSON PRINT XP300 ", 5, 80));
        articulos.put("4-11", new Articulo("4-11", "ASUS  MONITOR  22 ", 5, 100));
        articulos.put("4-22", new Articulo("4-22", "HP MONITOR LED 28 ", 5, 180));
        articulos.put("4-33", new Articulo("4-33", "SAMSUNG ODISSEY G5", 12, 580));

        LocalDate hoy = LocalDate.now();
        pedidos.add(new Pedido("80580845T-001/2025", clientes.get("80580845T"), hoy.minusDays(1), new ArrayList<>(List.of(new LineaPedido("1-11", 3), new LineaPedido("4-22", 3)))));
        pedidos.add(new Pedido("80580845T-002/2025", clientes.get("80580845T"), hoy.minusDays(2), new ArrayList<>(List.of(new LineaPedido("4-11", 3), new LineaPedido("4-22", 2), new LineaPedido("4-33", 4)))));
        pedidos.add(new Pedido("36347775R-001/2025", clientes.get("36347775R"), hoy.minusDays(3), new ArrayList<>(List.of(new LineaPedido("4-22", 1), new LineaPedido("2-22", 3)))));
        pedidos.add(new Pedido("36347775R-002/2025", clientes.get("36347775R"), hoy.minusDays(5), new ArrayList<>(List.of(new LineaPedido("4-33", 3), new LineaPedido("2-11", 3)))));
        pedidos.add(new Pedido("63921307Y-001/2025", clientes.get("63921307Y"), hoy.minusDays(4), new ArrayList<>(List.of(new LineaPedido("2-11", 5), new LineaPedido("2-33", 3), new LineaPedido("4-33", 2)))));
    }
//<editor-fold defaultstate="collapsed" desc="MENUS">

    private void menu() {
        int opcion = 0;
        do {
            System.out.println("\n\n\n\n\n\t\t\t\tMENU\n");
            System.out.println("\t\t\t\t1 - MENU CLIENTES");
            System.out.println("\t\t\t\t2 - MENU ARTICULOS");
            System.out.println("\t\t\t\t3 - MENU PEDIDOS");
            System.out.println("\t\t\t\t9 - SALIR");
            System.out.print("Seleccione un apartado: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: {
                    menuClientes();
                    break;
                }
                case 2: {
                    menuArticulos();
                    break;
                }
                case 3: {
                    menuPedidos();
                    break;
                }

            }
        } while (opcion != 9);
    }

    private void menuClientes() {
        int opcion = 0;
        do {
            System.out.println("\n\n\n\n\n\t\t\t\tMENU CLIENTES\n");
            System.out.println("\t\t\t\t1 - ALTA");
            System.out.println("\t\t\t\t2 - BAJA");
            System.out.println("\t\t\t\t3 - MODIFICAR");
            System.out.println("\t\t\t\t4 - LISTAR");
            System.out.println("\t\t\t\t9 - SALIR");
            System.out.print("Seleccione un apartado: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: {
                    altaClientes();
                    break;
                }
                case 2: {
                    bajaClientes();
                    break;
                }
                case 3: {
                    modificarClientes();
                    break;
                }
                case 4: {
                    listarClientes();
                    break;
                }

            }
        } while (opcion != 9);
    }

    private void menuArticulos() {
        int opcion = 0;
        do {
            System.out.println("\n\n\n\n\n\t\t\t\tMENU ARTICULOS\n");
            System.out.println("\t\t\t\t1 - ALTA");
            System.out.println("\t\t\t\t2 - BAJA");
            System.out.println("\t\t\t\t3 - MODIFICAR");
            System.out.println("\t\t\t\t4 - LISTAR");
            System.out.println("\t\t\t\t9 - SALIR");
            System.out.print("Seleccione un apartado: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: {
                    altaArticulos();
                    break;
                }
                case 2: {
                    bajaArticulos();
                    break;
                }
                case 3: {
                    modificarArticulos();
                    break;
                }
                case 4: {
                    listarArticulos();
                    break;
                }

            }

        } while (opcion != 9);
    }

    private void menuPedidos() {
        int opcion = 0;
        do {
            System.out.println("\n\n\n\n\n\t\t\t\tMENU PEDIDOS\n");
            System.out.println("\t\t\t\t1 - LISTADO PEDIDOS");
            System.out.println("\t\t\t\t2 - NUEVO PEDIDO");
            System.out.println("\t\t\t\t9 - SALIR");
            System.out.print("Seleccione un apartado: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: {
                    listadoPedidos();
                    break;
                }
                case 2: {
                    nuevoPedido();
                    break;
                }

            }

        } while (opcion != 9);
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="CLIENTES">
    private void altaClientes() {
    }

    private void bajaClientes() {
    }

    private void modificarClientes() {
    }

    private void listarClientes() {
        System.out.println("Listado de Clientes");
        for (Cliente c : clientes.values()) {
            System.out.println(c);
        }
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="ARTICULOS">
    private void altaArticulos() {

        String idArticulo, descripcion, existencias, pvp;

        System.out.println("ALTA DE NUEVO ARTICULO");

        do {
            System.out.println("IdArticulo (IDENTIFICADOR)");
            idArticulo = sc.nextLine();
        } while (!idArticulo.matches("[1-5][-][0-9][0-9]") || articulos.containsKey(idArticulo));

        System.out.println("DESCRIPCION:");
        descripcion = sc.nextLine();

        do {
            System.out.println("EXISTENCIAS:");
            existencias = sc.nextLine();
        } while (!MetodosAuxiliares.esInt(existencias));

        do {
            System.out.println("PVP:");
            pvp = sc.nextLine();
        } while (!MetodosAuxiliares.esDouble(pvp));

        Articulo a = new Articulo(idArticulo, descripcion, Integer.parseInt(existencias), Double.parseDouble(pvp));
        articulos.put(idArticulo, a);
    }

    private void bajaArticulos() {
    }

    private void modificarArticulos() {
    }

    private void listarArticulos() {
        System.out.println("Listado de Articulos");
        for (Articulo a : articulos.values()) {
            System.out.println(a);
        }
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="PEDIDOS">
    public String generaIdPedido(String idCliente) {
        int contador = 0;
        String nuevoId;
        for (Pedido p : pedidos) {
            if (p.getClientePedido().getIdCliente().equalsIgnoreCase(idCliente)) {
                contador++;
            }
        }
        contador++;

        nuevoId = idCliente + "-" + String.format("%03d", contador) + "/" + LocalDate.now().getYear();
        return nuevoId;
    }

    private void listadoPedidos() {
        System.out.println("Listado de Pedidos");
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
    }

    private void nuevoPedido() {
        String idCliente;
        do{
            System.out.println("DNI CLIENTE");
            idCliente=sc.nextLine().toUpperCase();
        }while (!MetodosAuxiliares.validarDNI(idCliente));
        
        ArrayList <LineaPedido> cestaCompra =new ArrayList();
        String idArticulo;
        int unidades=0;
        do{
            System.out.println("Teclee el ID del articulo deseado (FIN para terminar la compra)");
            idArticulo=sc.next();
            System.out.println("\nTeclea las unidades deseadas: ");
            unidades=sc.nextInt();
            cestaCompra.add(new LineaPedido(idArticulo, unidades));
        }while (!idArticulo.equalsIgnoreCase("FIN"));
        
        generaIdPedido(idCliente);
        Pedido p=new Pedido(generaIdPedido(idCliente), clientes.get(idCliente), LocalDate.now(), cestaCompra);
        pedidos.add(p);
    }
//</editor-fold>

}
