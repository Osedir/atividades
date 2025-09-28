public class Pilha{
    private int [] elementos;
    private int topo;

    public Pilha (int capacidade){
        elementos = new int [capacidade];
        topo = -1;
    }

    public void push (int valor){
        if (topo == elementos.length -1){
            System.out.println ("Pilha cheia!");
            return;
        }
    }   elementos [++topo] = valor;

    public int pop(){
        if (isEmpty()){
            System.out.println("Pilha vazia!");
            return -1;
        }
    }   return elementos [topo--];

    public int peek(){
        if (isEmpty()){
            System.out.println("Pilha vazia!");
            return -1;
        }
    }   return elementos [topo];

    public boolean isEmpty(){
        return topo == -1;
    }

    public static void main (String[] args){
        
        Pilha pl = new Pilha(5);

        pl.push(20);
        pl.push(40);
        pl.push(60);

        System.out.println ("O primeiro elemento é: " + pl.peek());

        while (!pl.isEmpty()){
            int removido = pl.pop();
            System.out.println ("Elemento removido: " + removido);
        }
    }
}
