package dev.gusramirez.iterators;

import java.util.ArrayList;
import java.util.List;

public class SimpleIterable<T> {
  public List<T> elements;

  public int getSize() {
    return this.elements.size();
  }

  public SimpleIterable() {
    this.elements = new ArrayList<T>();
  }

  public SimpleIterator<T> iterator() {
    return new SimpleIterator<T>(this);
  }

  public void add(T element) {
    this.elements.add(element);
  }

}
