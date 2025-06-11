package Pertemuan_11;

public class BinaryTree23 {
    Node23 root;

    public BinaryTree23() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Student23 data) {
        if (isEmpty()) {
            root = new Node23(data);
        } else {
            Node23 current = root;
            while (true) {
                if (data.ipk < current.data.ipk) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node23(data);
                        break;
                    }
                } else if (data.ipk > current.data.ipk) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node23(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node23 current = root;
        while (current != null) {
            if (current.data.ipk == ipk) {
                result = true;
                break;
            } else if (ipk < current.data.ipk) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    public void traversePreOrder(Node23 node) {
        if (node != null) {
            node.data.print();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node23 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.print();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node23 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.data.print();
        }
    }

    Node23 getSuccessor(Node23 del) {
        Node23 successor = del.right;
        Node23 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node23 parent = root;
        Node23 current = root;
        boolean isLeftChild = false;
        while (current.data.ipk != ipk) {
            parent = current;
            if (ipk < current.data.ipk) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                System.out.println("Couldn't find data!");
                return;
            }
        }

        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {
            Node23 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }

    public void addRekursif(Student23 data) {
        root = addRekursif(root, data);
    }

    private Node23 addRekursif(Node23 current, Student23 data) {
        if (current == null) {
            return new Node23(data);
        }

        if (data.ipk < current.data.ipk) {
            current.left = addRekursif(current.left, data);
        } else if (data.ipk > current.data.ipk) {
            current.right = addRekursif(current.right, data);
        }

        return current;
    }

    public Student23 getMinIPK() {
        Node23 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public Student23 getMaxIPK() {
        Node23 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public void displayStudentsWithIPKAbove(double threshold) {
        displayAboveThreshold(root, threshold);
    }

    private void displayAboveThreshold(Node23 node, double threshold) {
        if (node != null) {
            displayAboveThreshold(node.left, threshold);
            if (node.data.ipk > threshold) {
                node.data.print();
            }
            displayAboveThreshold(node.right, threshold);
        }
    }

}
