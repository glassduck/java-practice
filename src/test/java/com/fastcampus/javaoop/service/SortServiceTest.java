package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sortService=new SortService(new JavaSort<String>());

    @Test
    void doSort() {
        //Given

        //When
        List<String> actual=sortService.doSort(Arrays.asList("3","2","1"));

        //Then

        assertEquals(Arrays.asList("1","2","3"),actual);

    }
}