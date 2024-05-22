package Lista5.EstruturaDeDados;

public class Nodo {
    private int numero;
    private Nodo anterior;

    public Nodo() {
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}