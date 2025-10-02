package ListaDupla;

public class ListaDupla {
    private No inicio;
    private No fim;
    private int tamanho;

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void inserirNoInicio(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        tamanho++;
    }

    public void inserirNoFinal(int valor) {
        No novo = new No(valor);
        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        tamanho++;
    }

    public void inserirNaPosicao(int pos, int valor) {
        if (pos < 0 || pos > tamanho) {
            System.out.println("Posição inválida.");
            return;
        }

        if (pos == 0) {
            inserirNoInicio(valor);
        } else if (pos == tamanho) {
            inserirNoFinal(valor);
        } else {
            No novo = new No(valor);
            No atual = inicio;
            for (int i = 0; i < pos; i++) {
                atual = atual.proximo;
            }
            No anterior = atual.anterior;

            anterior.proximo = novo;
            novo.anterior = anterior;

            novo.proximo = atual;
            atual.anterior = novo;

            tamanho++;
        }
    }

    public void removerNoInicio() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tamanho--;
    }

    public void removerNoFinal() {
        if (fim == null) {
            System.out.println("Lista vazia.");
            return;
        }

        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tamanho--;
    }

    public void removerNaPosicao(int pos) {
        if (pos < 0 || pos >= tamanho) {
            System.out.println("Posição inválida.");
            return;
        }

        if (pos == 0) {
            removerNoInicio();
        } else if (pos == tamanho - 1) {
            removerNoFinal();
        } else {
            No atual = inicio;
            for (int i = 0; i < pos; i++) {
                atual = atual.proximo;
            }
            No anterior = atual.anterior;
            No proximo = atual.proximo;

            anterior.proximo = proximo;
            proximo.anterior = anterior;

            tamanho--;
        }
    }

    public int tamanho() {
        return tamanho;
    }

    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " <-> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}

