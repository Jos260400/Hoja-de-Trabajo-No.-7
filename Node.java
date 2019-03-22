/**
 * Universidad del Valle de Guatemala
 * Curso: Algoritmos y Estructura Datos
 * Nombre: Fernando José Garavito Ovando    Carné: 18071
 * Hoja de Trabajo No. 7
 * Node.java
 */

// Importamos el paquete "Classes"
package Classes; /**

 // Extraído de: https://serprogramador.es/programar-arboles-binarios-parte-1-introduccionclasesagregar-nodo/
 */
public class Node {
    private int a;

    private Node parent;
    private Node left;
    private Node right;

    public Node(int valor) {
        this.a = a;
    }


    public void setValor(int value) {
        this.a = value;
    }

    public int getValue() {
        return a;
    }

    public Node getParent() {
        return parent;
    }

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }
    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}