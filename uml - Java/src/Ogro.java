public class Ogro extends Personaje implements Villano {
    private String field;

    public Ogro(String nombre, String descripcion, Long tamano, int poder, int vida, String field) {
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
    public void destruir() {
    }
}