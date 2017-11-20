package com.smile.mohamed.simpleunittest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by COMPUMAGIC on 20/11/2017.
 */
public class EvenNumbersCacheTest {
    @Test
    public void addWithEvenNumberThenReturnCacheSizeAsOne() {

        // arrange :
        EvenNumbersCache evenNumbersCache = new EvenNumbersCache();

        // act :
        evenNumbersCache.add(2);

        // assert :
        Assert.assertTrue(evenNumbersCache.cache.size() == 1);
    }

}