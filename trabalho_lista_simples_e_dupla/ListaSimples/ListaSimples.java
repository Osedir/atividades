package ListaSimples;

public class ListaSimples {
    private No inicio;

    public ListaSimples() {
        this.inicio = null;
    }

    public void inserirNoInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = inicio;
        inicio = novo;
    }

    public void inserirNoFinal(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    public void inserirNaPosicao(int pos, int valor) {
        if (pos < 0) {
            System.out.println("Posição inválida.");
            return;
        }

        if (pos == 0) {
            inserirNoInicio(valor);
            return;
        }

        No novo = new No(valor);
        No atual = inicio;
        int contador = 0;

        while (atual != null && contador < pos - 1) {
            atual = atual.proximo;
            contador++;
        }

        if (atual == null) {
            System.out.println("Posição fora dos limites.");
        } else {
            novo.proximo = atual.proximo;
            atual.proximo = novo;
        }
    }

    public void removerNoInicio() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
        } else {
            inicio = inicio.proximo;
        }
    }

    public void removerNoFinal() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
        } else if (inicio.proximo == null) {
            inicio = null;
        } else {
            No atual = inicio;
            while (atual.proximo.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = null;
        }
    }

    public void removerNaPosicao(int pos) {
        if (pos < 0 || inicio == null) {
            System.out.println("Posição inválida ou lista vazia.");
            return;
        }

        if (pos == 0) {
            removerNoInicio();
            return;
        }

        No atual = inicio;
        int contador = 0;

        while (atual.proximo != null && contador < pos - 1) {
            atual = atual.proximo;
            contador++;
        }

        if (atual.proximo == null) {
            System.out.println("Posição fora dos limites.");
        } else {
            atual.proximo = atual.proximo.proximo;
        }
    }

    public int tamanho() {
        int count = 0;
        No atual = inicio;
        while (atual != null) {
            count++;
            atual = atual.proximo;
        }
        return count;
    }

    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}
