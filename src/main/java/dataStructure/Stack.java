package dataStructure;

public class Stack {
    //pilha é formadas por nós

    // nó topo
    private Node top;

    //altura da pilha ou seja (imagina um prato em cima do outro)
    private int height;


    //parecido com a lista ligada
    public class Node {
        //aqui vamos amazenar um valor
        int value;
        // apontando para o proximo nó (ou caixinha)
        Node next;

        // construtor para receber o valor do nó
        Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    //construtor da pilha que recebe o valor inicio que se armazena no nó e esse nó será o topo da pilha
    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    // aqui pega quem está no TOPO da pilha
    public void getTop(){
        if (top==null) {
            System.out.println("pilha vazia");
        } else {
            System.out.println("O valor armazenado no topo da pilha é: " +top.value);
        }

    }

    // aqui pega a altura atual da pilha
    public void getHeight() {
        System.out.println("A altura da pilha é de: " + height);
    }



    public void print() {
        System.out.println("------------------------------");
        // variavel temporaria (o topo não pode ser mexido, sempre terá que apontar pro primeiro elemento) e a variavel temporaria para navegar
        Node temp = top;
        if(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("------------------------------");

    }


    public void push(int value) {
        Node newNode = new Node(value);
        if(height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }

        height++;
    }

    public Node pop() {
        if(height == 0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;


        return temp;
    }



    public static void main(String[] args) {
        Stack stack = new Stack(1);
        stack.push(3);
        stack.push(6);


        System.out.println(stack.pop().value);
        System.out.println(stack.pop().value);
        System.out.println(stack.pop().value);

        stack.getTop();
        stack.getHeight();
        stack.print();
    }

}
