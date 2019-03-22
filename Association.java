/**
 * Universidad del Valle de Guatemala
 * Curso: Algoritmos y Estructura Datos
 * Nombre: Fernando José Garavito Ovando    Carné: 18071
 * Hoja de Trabajo No. 7
 * Association.java
 */

// Importamos el paquete "Classes"
package Classes;

// Extraído de: https://liveexample.pearsoncmg.com/html/MyMap.html

public class Association<K,V> {
    private K key;
    private V value;

    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Association [key=" + key + ", value=" + value + "]";
    }

}