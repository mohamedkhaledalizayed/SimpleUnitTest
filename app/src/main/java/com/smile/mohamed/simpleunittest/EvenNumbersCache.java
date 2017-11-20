package com.smile.mohamed.simpleunittest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by COMPUMAGIC on 20/11/2017.
 */

public class EvenNumbersCache {

    final List<Integer> cache = new ArrayList<>();

    void add(Integer evenNumber){

        if(evenNumber % 2 == 0) cache.add(evenNumber);

    }

}