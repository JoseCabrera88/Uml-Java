public class Elfo extends Personaje implements Heroe {
    private String field;

    public Elfo(String nombre, String descripcion, Long tamano, int poder, int vida, String field) {
        super(nombre, descripcion, tamano, poder, vida);
        this.field = field;
    }

    @Override
    public void Desplazarse() {
    }

    @Override
    public void atacar() {
    }

    @Override
    public void defender() {
    }

    @Override
    public void recibirAtaque() {
    }
}