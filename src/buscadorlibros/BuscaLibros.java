package buscadorlibros;

import buscadorlibros.logica.Libros;

import java.util.ArrayList;
import java.util.List;

public class BuscaLibros {

    public static void main(String[] args) {


        List<Libros> listaLibros = new ArrayList<Libros>();

        Libros libro1 = new Libros(1, "Man Ray", "Taschen", 300, "Arte");
        Libros libro2 = new Libros(2, "Educar sin Culpa", "Panamericana", 250, "Psicologia" );
        Libros libro3 = new Libros(3, "Hábitos Atómicos", "Obeja Negra", 400, "Desarrollo Personal");
        Libros libro4 = new Libros(4, "Alejandro Obregón", "Taschen", 400, "Arte");
        Libros libro5 = new Libros(5, "Javacheff", "Taschen", 300, "Arte");


        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);
        listaLibros.add(libro4);
        listaLibros.add(libro5);

        for( Libros librosLista : listaLibros ) {

            System.out.println("--------Libros--------");
            System.out.println("Titulo del Libro: " + librosLista.getTitulo() );
            System.out.println("Editorial del Libro: " + librosLista.getEditorial() );
            System.out.println("Páginas del Libro: " + librosLista.getPaginasLibro() );
            System.out.println("Categoria del Libro: " + librosLista.getCategoria() );
            System.out.println(" ");

        }

        libro1.setTitulo("Man Ray Historia");
        libro1.setPaginasLibro(350);

        libro5.setTitulo("Escultor Christo Havacheff");
        libro5.setPaginasLibro(500);

        System.out.println("--------TASCHEN--------");

        for( Libros librosLista : listaLibros ) {
            if ( librosLista.getEditorial().equals("Taschen")) {
                System.out.println(librosLista.toString());
            }
        }
    }
}
