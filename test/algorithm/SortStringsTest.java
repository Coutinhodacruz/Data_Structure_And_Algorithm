package algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortStringsTest {

    SortStrings sortStrings;

    @BeforeEach
    void startAllTestWith(){
        sortStrings = new SortStrings();
        assertNotNull(sortStrings);
    }

    @Test
    public void testSortString(){
        String [] myArray = {"caroline", "hazard", "ben", "david", "fred", "ela", "isaac", "abel", "greg", "zaza", "yamarita", "will"};
        SortStrings.sortStrings(myArray);
        String[] expected = {"abel", "ben", "caroline", "david", "ela", "fred", "greg", "hazard","isaac", "will", "yamarita", "zaza"};
        assertArrayEquals(expected, myArray);
    }
    @Test
    public void testReverseString(){
        String [] myArray = {"caroline", "hazard", "ben", "david", "fred", "ela", "isaac", "abel", "greg", "zaza", "yamarita", "will"};
        SortStrings.reverseString(myArray);
        String [] expected = {"zaza", "yamarita", "will", "isaac", "hazard", "greg", "fred", "ela", "david", "caroline", "ben", "abel"};
        assertArrayEquals(expected, myArray);
    }


}