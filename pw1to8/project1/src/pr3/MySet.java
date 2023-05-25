package pr3;

import java.util.*;
import java.util.function.Predicate;

public class MySet<T> implements Set<T> {
    private Set<T> mySet = new HashSet<T>();

    @Override
    public synchronized boolean add(T t){
        return mySet.add(t);
    }

    @Override
    public synchronized boolean contains(Object o) {
        return mySet.contains(o);
    }

    @Override
    public synchronized boolean addAll(Collection c) {
        return false;
    }

    @Override
    public synchronized boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public synchronized boolean remove(Object o) {
        return mySet.remove(o);
    }

    @Override
    public synchronized boolean isEmpty() {
        return mySet.isEmpty();
    }

    @Override
    public synchronized boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public synchronized boolean removeIf(Predicate<? super T> filter) {
        return Set.super.removeIf(filter);
    }

    @Override
    public synchronized boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public synchronized int size() {
        return mySet.size();
    }

    @Override
    public synchronized Iterator<T> iterator() {
        return mySet.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public synchronized void clear() {
        mySet.clear();
    }
}
