package Pokemon;

public class Charmander extends Pokemon {
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola Soy Charmander y este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola Soy Charmander y este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola Soy Charmander y este es mi ataque mordisco");
    }
}
