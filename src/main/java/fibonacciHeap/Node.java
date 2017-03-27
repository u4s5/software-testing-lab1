package fibonacciHeap;

class Node {

    Node(int key) {
        this.key = key;
        left = this;
        right = this;
        degree = 0;
        mark = false;
    }

    Node parent;
    Node child;
    Node left;
    Node right;
    int degree;         // количество дочерних узлов
    boolean mark;       // метка - был ли удален один из дочерних элементов
    int key;            // числовое значение узла

}
