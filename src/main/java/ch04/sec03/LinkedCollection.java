/*
 * Chapter 4 Declarations
 * Section 3 Nested Classes
 */
package ch04.sec03;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Nested classes example
 * @author emaphis
 * @param <E>
 */
public class LinkedCollection<E> extends AbstractCollection<E> {

    private class Node {
        private E element;
        private Node next = null;
        private Node(E elt) { element = elt; }
    }
    private Node first = new Node(null);
    private Node last = first;

    private int size = 0;

    public LinkedCollection() {}
    public LinkedCollection(Collection<? extends E> c) { addAll(c); }

    @Override
    public int size() { return size; }

    @Override
    public boolean add(E elt) {
        last.next = new Node(elt);
        last = last.next;
        size++;
        return true;
    }

    public Iterator<E> interator() {
        return new Iterator<E>() {
            private Node current = first;
            @Override
            public boolean hasNext() {
                return current.next != null;
            }

            @Override
            public E next() {
                if (current.next != null) {
                    current = current.next;
                    return current.element;
                } else
                    throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        return super.removeIf(filter); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Spliterator<E> spliterator() {
        return super.spliterator(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Stream<E> stream() {
        return super.stream(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Stream<E> parallelStream() {
        return super.parallelStream(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        super.forEach(action); //To change body of generated methods, choose Tools | Templates.
    }

}
