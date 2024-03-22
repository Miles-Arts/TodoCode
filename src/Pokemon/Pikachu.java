package Pokemon;

public class Pikachu extends Pokemon {
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola Soy Pikachu y este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola Soy Pikachu y este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola Soy Pikachu y este es mi ataque Mordisco");
    }
}
