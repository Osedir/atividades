package ListaSimples;

public class Main {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();

        System.out.println("Inserindo no início:");
        lista.inserirNoInicio(100);
        lista.inserirNoInicio(120);
        lista.exibir();  

        System.out.println("Inserindo no final:");
        lista.inserirNoFinal(50);
        lista.inserirNoFinal(60);
        lista.exibir(); 

        System.out.println("Inserindo na posição 2:");
        lista.inserirNaPosicao(2, 25);
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
