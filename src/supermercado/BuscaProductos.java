package supermercado;

import supermercado.logica.Productos;

import java.util.ArrayList;
import java.util.List;

public class BuscaProductos {

    public static void main(String[] args) {


        List<Productos> listaProductos = new ArrayList<Productos>();

        Productos producto1 = new Productos(001, "Pollo", "La Braza Roja", 1, "Carnes");

        Productos producto2 = new Productos(002, "Manzana", "Frutas Colombia", 1, "Frutas");
        Productos producto3 = new Productos(003, "Durazno", "Frutas Colombia", 1, "Frutas");
        Productos producto4 = new Productos(004, "Pescado", "Pescadería Jaramillo", 1, "Carnes");
        Productos producto5 = new Productos(005, "Lechuga", "Verduras Colombia", 1, "Verduras" );

        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(producto4);
        listaProductos.add(producto5);

        for ( Productos productoLista : listaProductos ) {

            System.out.println("---------Producto-Disponible---------");
            System.out.println("Producto: " + productoLista.getProducto());
            System.out.println("Marca Producto: " + productoLista.getMarca());
            System.out.println("Peso en Kilos: " + productoLista.getPeso() + " Kg");
            System.out.println("Categoría de Producto: " + productoLista.getCategoria());
            System.out.println(" ");

        }

        producto1.setMarca("Pollos Colombia");
        producto1.setPeso(3);

        producto5.setMarca("Verduras Latina");
        producto5.setPeso(10);

        for ( Productos productoLista : listaProductos ) {

            System.out.println("---------Producto-Disponible---------");
            System.out.println("Producto: " + productoLista.getProducto());
            System.out.println("Marca Producto: " + productoLista.getMarca());
            System.out.println("Peso en Kilos: " + productoLista.getPeso() + " Kg");
            System.out.println("Categoría de Producto: " + productoLista.getCategoria());
            System.out.println(" ");

        }

        System.out.println("---------Fruta-Disponible---------");
        for( Productos productos : listaProductos ) {
            if( productos.getCategoria().equals("Frutas")) {

                System.out.println(productos.toString());

            }
        }
    }
}
