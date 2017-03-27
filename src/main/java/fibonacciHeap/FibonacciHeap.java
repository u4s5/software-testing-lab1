package fibonacciHeap;

public class FibonacciHeap {

    private Node min;
    private int rootsAmount;       // количество узлов

    public void add(int key, StringBuilder log) {
        log.append(0);
        Node node = new Node(key);
        add(node, log);
    }

    private void add(Node node, StringBuilder log) {
        log.append(1);
        if (min == null) {
            log.append(2);
            min = node;
            node.left = node;
            node.right = node;
        } else {
            log.append(3);
            node.right = min.right;
            node.right.left = node;
            node.left = min;
            min.right = node;
        }

        if (node.key < min.key) {
            log.append(4);
            min = node;
        }

        rootsAmount++;
        node.parent = null;
    }

    int getMin() {
        if (min == null)
            throw new IllegalStateException("Can not get min value");
        return min.key;
    }

    int extractMin(StringBuilder log) {
        log.append(5);
        Node res = min;
        if (res != null) {
            log.append(6);
            childsInRoot(res, log);
            removeRoot(res, log);

            if (res.right == res) {
                log.append(7);
                min = null;
            } else {
                log.append(8);
                min = min.right;
                consolidate(log);
            }
        }

        if (res == null)
            throw new IllegalStateException("Can not extract min value");

        return res.key;
    }

    private void consolidate(StringBuilder log) {
        log.append(9);
        int SIZE = 31;
        Node[] A = new Node[SIZE];
        Node x = min;
        int initRoots = rootsAmount;
        int maxDegree = 0;

        for (int i = 0; i < initRoots; ++i) {
            log.append("A");
            int d = x.degree;
            Node next = x.right;
            while (A[d] != null) {
                log.append("B");
                Node y = A[d];
                if (y.key < x.key) {
                    log.append("C");
                    Node temp = y;
                    y = x;
                    x = temp;
                }
                fibHeapLink(y, x, log);
                A[d++] = null;
            }
            A[d] = x;
            maxDegree = maxDegree > d ? maxDegree : d;
            x = next;
        }

        min = null;
        rootsAmount = 0;

        for (int i = 0; i <= maxDegree; ++i) {
            log.append("D");
            if (A[i] != null) {
                log.append("E");
                add(A[i], log);
            }
        }
    }

    private void fibHeapLink(Node ch, Node par, StringBuilder log) {
        log.append("F");
        removeRoot(ch, log);

        if (par.child == null) {
            log.append("G");
            par.child = ch;
            ch.left = ch;
            ch.right = ch;
        } else {
            log.append("H");
            ch.right = par.child.right;
            ch.right.left = ch;
            ch.left = par.child;
            par.child.right = ch;
        }

        if (ch.key < par.child.key) {
            log.append("I");
            par.child = ch;
        }

        if (par.child == min) {
            log.append("J");
            rootsAmount++;
            ch.parent = null;
        }

        par.degree++;
        ch.parent = par;

        ch.mark = false;
    }

    private void removeRoot(Node node, StringBuilder log) {
        log.append("K");
        killLRLinks(node, log);
        rootsAmount--;
    }

    private void killLRLinks(Node node, StringBuilder log) {
        log.append("L");
        if (node.left != node) {
            log.append("M");
            node.right.left = node.left;
            node.left.right = node.right;
        }
    }

    private void childsInRoot(Node node, StringBuilder log) {
        log.append("N");
        while (node.child != null) {
            log.append("O");
            removeChild(node.child, log);
        }
    }

    private void removeChild(Node node, StringBuilder log) {
        log.append("P");
        node.parent.degree--;
        node.parent.child = node.right == node ? null : node.right;
        killLRLinks(node, log);
        add(node, log);
        node.mark = false;
    }

    void clear() {
        min = null;
        rootsAmount = 0;
    }
}
