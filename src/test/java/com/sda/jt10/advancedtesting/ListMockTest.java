package com.sda.jt10.advancedtesting;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class ListMockTest {
    List<String> mockList = mock(List.class);

    @Test
    public void size_basic() {

        // Mockito: teaching your mockList to fake the size() behavior
        when(mockList.size()).thenReturn(5);

        // assert/verify that our mockList work as expected
        assertEquals(mockList.size(), 5);
        assertEquals(mockList.size(), 10);

    }

    @Test
    public void mockito_with_arguments() {
        when(mockList.get(0)).thenReturn("Hello");

        assertEquals(mockList.get(0), "Hello");
    }

    @Test
    public void mockito_with_generic_arguments() {
        when(mockList.get(anyInt())).thenReturn("Hello");

        assertEquals(mockList.get(1), "Hello");
        assertEquals(mockList.get(200), "Hello");
    }

    @Test
    public void verificationBasics() {
        String value1 = mockList.get(0);
        String value2 = mockList.get(1);
        String value3 = mockList.get(0);

        verify(mockList, times(2)).get(0);
        verify(mockList, atLeast(1)).get(1);
    }


}
