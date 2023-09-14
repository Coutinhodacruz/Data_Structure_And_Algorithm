package algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SwappingNumberTest {

    SwappingNumber swappingNumber;

    @BeforeEach
    void setUp(){
        swappingNumber = new SwappingNumber();
    }

    @Test
    void testSwappingNumber(){

        int[] number = {22, 18, 15, 13, 5, 3};
        int[] result = {18, 22, 13, 15, 3, 5};
        assertArrayEquals(result, swappingNumber.swapping(number));
    }



    @Test
    public void testEvenOddSwap() {
        int[] arr = {18, 22, 13, 15, 3, 5};
        swappingNumber.swapping(arr);
        assertArrayEquals(new int[]{22, 18, 15, 13, 3, 5}, arr);
    }

}