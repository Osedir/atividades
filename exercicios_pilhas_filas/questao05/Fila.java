public class Fila{
    private int [] elementos;
    private int inicio;
    private int fim;
    private int tamanho;
    private int capacidade;

    public Fila (int capacidade){
        this.capacidade = capacidade;
        elementos = new int [capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public void enqueue (int valor){
        if (tamanho == capacidade){
            System.out.println("Fila cheia!");
            return;
        }
        elementos[fim] = valor;
        fim = (fim + 1) % capacidade;
        tamanho++;
    }

    public int dequeue(){
        if (isEmpty()){
            System.out.println("Fila vazia!");
            return -1;
        }
        int valorRemovido = elementos[inicio];
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        return valorRemovido;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Fila vazia!");
            return -1;
        }
        return elementos[inicio];

    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

    public static void main (String[] args){

        Fila fl = new Fila(5);

        fl.enqueue(20);
        fl.enqueue(40);
        fl.enqueue(60);
        fl.enqueue(80);
        fl.enqueue(100);

        System.out.println("O primeiro elemento da fila é: " + fl.peek());

        while(!fl.isEmpty()){
            int removido = fl.dequeue();
            System.out.println("Elemento removido: " + removido);
        }
    }
}
