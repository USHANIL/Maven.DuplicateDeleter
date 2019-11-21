package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    IntegerDuplicateDeleter(Integer[] intArray){
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
//        int count;
//        for (int i =0; i< array.length ; i++)
//        {
//           count = countOccurence(array[i]);
//        }
//        return new Integer[0];
       return Arrays.stream(array)
                .filter(ele -> countOccurence(ele) < maxNumberOfDuplications)
                .collect(Collectors.toList())
                .toArray(new Integer[0]);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(ele -> countOccurence(ele) != exactNumberOfDuplications)
                .collect(Collectors.toList())
                .toArray(new Integer[0]);
    }
}
