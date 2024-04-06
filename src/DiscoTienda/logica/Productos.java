package DiscoTienda.logica;

public class Productos {

    private int codigo;
    private String grupoMusica;
    private String albumMusica;
    private int anio;
    private String categoriaMusica;

    public Productos() {
    }


    public Productos(int codigo, String grupoMusica, String albumMusica, int anio, String categoriaMusica) {
        this.codigo = codigo;
        this.grupoMusica = grupoMusica;
        this.albumMusica = albumMusica;
        this.anio = anio;
        this.categoriaMusica = categoriaMusica;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getGrupoMusica() {
        return grupoMusica;
    }

    public void setGrupoMusica(String grupoMusica) {
        this.grupoMusica = grupoMusica;
    }

    public String getAlbumMusica() {
        return albumMusica;
    }

    public void setAlbumMusica(String albumMusica) {
        this.albumMusica = albumMusica;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCategoriaMusica() {
        return categoriaMusica;
    }

    public void setCategoriaMusica(String categoriaMusica) {
        this.categoriaMusica = categoriaMusica;
    }
}
