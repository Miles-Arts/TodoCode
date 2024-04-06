package DiscoTienda;

import DiscoTienda.logica.Productos;

import java.util.ArrayList;
import java.util.List;

public class BuscaDisco {

    public static void main(String[] args) {


        List<Productos> listaMusical = new ArrayList<Productos>();


        Productos albumGrupo1 = new Productos(001, "Soda Stereo", "Último Concierto", 1999, "Rock en Español");
        Productos albumGrupo2 = new Productos(002, "Sui Generis", "No Quiero Volverme tan Loco", 1980, "Rock en Español");
        Productos albumGrupo3 = new Productos(003, "Seru Giran", "Canción para mi Muerte", 1980, "Rock en Español");
        Productos albumGrupo4 = new Productos(004, "Jamiroquai", "Virtual Insanity", 1995, "Funk");
        Productos albumGrupo5 = new Productos(005, "Pedro Aznar", "Canta Brasil", 2007, "Fusión");

        listaMusical.add(albumGrupo1);
        listaMusical.add(albumGrupo2);
        listaMusical.add(albumGrupo3);
        listaMusical.add(albumGrupo4);
        listaMusical.add(albumGrupo5);

        for( Productos listaProductos : listaMusical ) {

            System.out.println("-----Grupos Musicales-----");
            System.out.println("Grupo Musical: " + listaProductos.getGrupoMusica());
            System.out.println("Albúm Musical: " + listaProductos.getAlbumMusica());
            System.out.println("Año del Albúm: " + listaProductos.getAnio());
            System.out.println("Género Musical: " + listaProductos.getCategoriaMusica());
            System.out.println();

        }

        albumGrupo4.setAlbumMusica("Travelling Without Moving");
        albumGrupo4.setAnio(1996);

        albumGrupo5.setAlbumMusica("Aznar Canta Brasil");
        albumGrupo5.setAnio(2005);

        for( Productos listaProductos : listaMusical ) {

            System.out.println("-----Grupos Musicales-----");
            System.out.println("Grupo Musical: " + listaProductos.getGrupoMusica());
            System.out.println("Albúm Musical: " + listaProductos.getAlbumMusica());
            System.out.println("Año del Albúm: " + listaProductos.getAnio());
            System.out.println("Género Musical: " + listaProductos.getCategoriaMusica());
            System.out.println();

        }

        System.out.println("-----Rock en Español-----");
        for(Productos listaProductos : listaMusical) {
            if( listaProductos.getCategoriaMusica().equals("Rock en Español") ){
                System.out.println(listaProductos.toString());
            }
        }
    }
}
