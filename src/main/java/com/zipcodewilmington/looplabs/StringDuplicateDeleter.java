package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] strArray) {
        super(strArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(ele -> countOccurence(ele) < maxNumberOfDuplications)
                .collect(Collectors.toList())
                .toArray(new String[0]);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(ele -> countOccurence(ele) != exactNumberOfDuplications)
                .collect(Collectors.toList())
                .toArray(new String[0]);
    }
}
