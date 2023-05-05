package algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class FavourWorkTest {

    FavourWork favourWork;

    @BeforeEach
    void startAllTestWith(){
        favourWork = new FavourWork();
        assertNotNull(favourWork);
    }

    @Test
    public void testThatYouCanPrintTheIndexesInTheList(){
        int[] number = {5,7,7,8,8,10};
        int target = 8;
        int[] result = {3, 4};
        assertArrayEquals(result, favourWork.searchRange(number, target));

    }
    @Test
    public void testForTheNegativeIndexesInTheList(){

        int[] number = {5,7,7,8,8,10};
        int target = 9;
        int[] result = {-1, -1};
        assertArrayEquals(result, favourWork.searchRange(number, target));

    }

    @Test
    public void testThatOtherIndexCanPrint(){
        int[] number = {5,7,7,8,8,10,4,9,10};
        int target = 5;
        int[] result = {0, 0};
        assertArrayEquals(result, favourWork.searchRange(number, target));

    }
    @Test
    public void testThatYouCanPrintTheLastIndex(){
        int[] number = {5,7,7,8,8,10,4,9,10};
        int target = 7;
        int[] result = {1, 2};
        assertArrayEquals(result, favourWork.searchRange(number, target));

    }


}