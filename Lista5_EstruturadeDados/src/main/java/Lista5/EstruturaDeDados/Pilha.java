package Lista5.EstruturaDeDados;

public class Pilha {
    private Nodo ultimo;
    private int tamanho;

    // Método para criar uma pilha vazia
    public Pilha() {
        this.ultimo = null;
        this.tamanho = 0;
    }

    // Método para inserir um elemento na pilha
    public void inserirElemento(int elemento) {
        Nodo nodo = new Nodo();
        nodo.setNumero(elemento);
        nodo.setAnterior(ultimo);
        ultimo = nodo;
        tamanho++;
    }

    // Método para remover um elemento da pilha
    public Integer remover() {
        if (ultimo == null) {
            return null;
        }
        else{
            int info = ultimo.getNumero();
            ultimo = ultimo.getAnterior();
            tamanho--;

            return  info;
        }
    }

    // Método para exibir o conteúdo da pilha
    public void exibir() {
        Nodo aux = ultimo;
        System.out.print("[");
        while (aux != null) {
            System.out.print(aux.getNumero());
            if (aux.getAnterior() != null) {
                System.out.print(", ");
            }
            aux = aux.getAnterior();
        }
        System.out.println("]");
    }
    // Método que retorna o número de elementos existentes na pilha
    public int tamanho() {
        return tamanho;
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.inserirElemento(3);
        pilha.inserirElemento(5);
        pilha.inserirElemento(7);
        pilha.inserirElemento(9);
        pilha.exibir();
        pilha.tamanho();
        pilha.remover();
        pilha.exibir();
        pilha.tamanho();
        pilha.remover();
        pilha.remover();
        pilha.exibir();
        pilha.tamanho();
    }

}


