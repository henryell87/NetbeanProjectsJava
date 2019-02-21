/*
 * Copyright 2016 henryellbytes
 */
package binarysearchtree;

/**
 *
 * @author HENRYELL
 */
public interface Tree<D extends Comparable> {
   public boolean isEmpty();
   public int cardinality();
   public boolean member(D elt);
   public NonEmptyBST<D> add(D elt);
}
