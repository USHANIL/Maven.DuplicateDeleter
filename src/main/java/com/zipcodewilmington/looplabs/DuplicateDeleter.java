package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);

    //http://javacodedepot.com/tutorial/java-8-stream-count-occurrences
    public int countOccurence(T element){
        return (int) Arrays.stream(array)
                .filter(ele -> ele.equals(element))
                .count();
    }
}
