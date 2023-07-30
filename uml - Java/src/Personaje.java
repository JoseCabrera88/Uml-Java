public abstract class Personaje{
    protected String nombre;
    protected String descripcion;
    protected Long tamano;
    protected int poder;
    protected int vida;
    public Personaje(String nombre, String descripcion, Long tamano, int poder, int vida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamano = tamano;
        this.poder = poder;
        this.vida = vida;
    }

    public abstract void Desplazarse();

    public int MostrarVida() {
        return vida;
    }

    public void MostrarPoder() {
    }
}
