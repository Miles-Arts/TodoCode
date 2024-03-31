package ejerciciovideojuego;

import ejerciciovideojuego.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;


public class EjercicioVideoJuego {

    public static void main(String[] args) {

        List<VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego>();

        VideoJuego videoJuego1 = new VideoJuego(1, "Mario Bros", "Nintendo 64", 10, "Plataforma");


        VideoJuego videoJuego2 = new VideoJuego(2, "Mario Party 3", "Nintendo 64", 4, "Plataforma");

        VideoJuego videoJuego3 = new VideoJuego(3, "Age of Empire II", "PC", 1, "Estrategia");

        VideoJuego videoJuego4 = new VideoJuego(4, "Counter Strike 1.5", "PC", 1, "Shooter");

        VideoJuego videoJuego5 = new VideoJuego(5, "Mario Prime", "Nintendo 64", 2, "Plataforma");


    listaVideoJuegos.add(videoJuego1);
    listaVideoJuegos.add(videoJuego2);
    listaVideoJuegos.add(videoJuego3);
    listaVideoJuegos.add(videoJuego4);
    listaVideoJuegos.add(videoJuego5);


    //Recorrido
    for(VideoJuego video : listaVideoJuegos) {
        System.out.println("------------JUEGO------------");
        System.out.println("Título: " + video.getTitulo());
        System.out.println("Consola: " + video.getConsola());
        System.out.println("Cantidad Jugadores: " + video.getCantidadJugadores());
        System.out.println("Categoría: " + video.getCategoria());
        System.out.println(" ");
    }

    //Cambio de Nombre

        videoJuego1.setTitulo("Mario Bros III");
        videoJuego1.setCantidadJugadores(4);

        videoJuego4.setTitulo("Counter Strike Legend");
        videoJuego4.setCantidadJugadores(4);

    //REcorre ArrayList


        System.out.println("------------NINTENDO------------");
        for(VideoJuego video : listaVideoJuegos) {
            if( video.getConsola().equals("Nintendo 64") ) {

                System.out.println(video.toString());

            }
        }
    }
}
