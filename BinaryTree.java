/**
 * Universidad del Valle de Guatemala
 * Curso: Algoritmos y Estructura Datos
 * Nombre: Fernando José Garavito Ovando    Carné: 18071
 * Hoja de Trabajo No. 7
 * BinaryTree.java
 */

// Importamos el paquete "Classes"
package Classes;

// Extraido de https://www.cs.dartmouth.edu/~mcasey/cs10/notes/8/code/BinaryTree.java

public class BinaryTree {

    private Node b;

    public BinaryTree( int a ) {
        this.b = new Node( a );
    }

    public BinaryTree( Node raiz ) {
        this.b = raiz;
    }

    public Node getRaiz() {
        return b;
    }

    public void setRaiz(Node b) {
        this.b = b;
    }
    private void addNodo( Node nodo, Node b ) {

        if ( b == null ) {
            this.setRaiz(nodo);
        }
        else {
            if ( nodo.toString().equals(b.toString()) ) {
                if (b.getLeft() == null) {
                    b.setLeft(nodo);
                }
                else {
                    addNodo( nodo , b.getLeft() );
                }
            }
            else {
                if (b.getRight() == null) {
                    b.setRight(nodo);
                }
                else {
                    addNodo( nodo, b.getRight() );
                }
            }
        }
    }

    public void addNodo( Node nodo ) {
        this.addNodo( nodo , this.b );
    }

    //Extraído de: Geeksforgeeks.com
    public boolean find(Node nodo, String val) {
        if(b ==null) {
            return false;
        }
        if( nodo.toString().equals(nodo)) {
            return true;
        }
        else {
            if( nodo.toString().equals(nodo)) {
                return true; //ver si se modifica esto
            }
        }
        return true;
    }

    //Extraído de: https://stackoverflow.com/questions/43825134/binary-tree-in-order-sorting
    public void inOrder()
    {
        inOrder(b);
    }

    public void inOrder(Node nodo)
    {
        if (nodo != null)
        {
            inOrder(nodo.getLeft());
            System.out.println(nodo.getParent());
            inOrder(nodo.getRight());
        }
    }
}