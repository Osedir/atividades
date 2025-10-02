package ListaDupla;

public class Main {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        System.out.println("Inserindo no início:");
        lista.inserirNoInicio(10);
        lista.inserirNoInicio(20);
        lista.exibir();

        System.out.println("Inserindo no final:");
        lista.inserirNoFinal(30);
        lista.inserirNoFinal(40);
        lista.exibir();

        System.out.println("Inserindo na posição 2:");
        lista.inserirNaPosicao(2, 50);
        lista.exibir();

        System.out.println("Tamanho da lista: " + lista.tamanho());

        System.out.println("Removendo do início:");
        lista.removerNoInicio();
        lista.exibir(); 

        System.out.println("Removendo do final:");
        lista.removerNoFinal();
        lista.exibir(); 

        System.out.println("Removendo da posição 1:");
        lista.removerNaPosicao(1);
        lista.exibir();

        System.out.println("Tamanho final da lista: " + lista.tamanho());
    }
}

