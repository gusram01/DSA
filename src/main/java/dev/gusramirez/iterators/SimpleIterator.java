package dev.gusramirez.iterators;

public class SimpleIterator<T> {
  private int current = 0;
  private SimpleIterable<T> iterable;

  public SimpleIterator(SimpleIterable<T> iterable) {
    this.iterable = iterable;
  }

  public boolean hasNext() {
    return current < iterable.getSize();
  }

  public Object next() {
    return iterable.elements.get(current++);
  }

}
