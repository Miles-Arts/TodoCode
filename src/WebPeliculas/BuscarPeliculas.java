package WebPeliculas;

import WebPeliculas.logica.Productos;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class BuscarPeliculas {

    public static void main(String[] args) {


        List<Productos> listaProductos = new ArrayList<Productos>();

        Productos listaPP1 = new Productos(001, "Mentiras Verdaderas", "Sony", 1998, "Acción");
        Productos listaPP2 = new Productos(002, "Mision Imposible", "Universal", 1996, "Acción");
        Productos listaPP3 = new Productos(003, "Jumanjy", "Disney", 1994, "Aventura");
        Productos listaPP4 = new Productos(004, "La Última Puerta", "Europa", 2000, "Misterio");
        Productos listaPP5 = new Productos(005, "Mclaren", "Europa", 2018, "Documental");

        listaProductos.add(listaPP1);
        listaProductos.add(listaPP2);
        listaProductos.add(listaPP3);
        listaProductos.add(listaPP4);
        listaProductos.add(listaPP5);

        for( Productos listasMovies : listaProductos ) {

            System.out.println("-----Películas-----");
            System.out.println("Película: " + listasMovies.getTitulo());
            System.out.println("Productora: " + listasMovies.getProductora());
            System.out.println("Año: " + listasMovies.getAnioPelicula());
            System.out.println("Genero: " + listasMovies.getCategoria());
            System.out.println(" ");

        }

        listaPP1.setAnioPelicula(1994);
        listaPP1.setProductora("20th Century Studios,");

        listaPP4.setAnioPelicula(1999);
        listaPP4.setProductora("Artisan Entertainment,");

        for( Productos listasMovies : listaProductos ) {

            System.out.println("-----Películas-----");
            System.out.println("Película: " + listasMovies.getTitulo());
            System.out.println("Productora: " + listasMovies.getProductora());
            System.out.println("Año: " + listasMovies.getAnioPelicula());
            System.out.println("Genero: " + listasMovies.getCategoria());
            System.out.println(" ");


        }




    }
}
