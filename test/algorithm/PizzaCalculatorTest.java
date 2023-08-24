package algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaCalculatorTest {

    @Test
    public void testCalculatePacksAndRemainingWithOnlyYoungPeople() {
        int totalElderly = 0;
        int totalYoung = 3;
        int piecesPerPack = 8;
        int totalPeople = totalElderly + totalYoung;

        int[] result = PizzaCalculator.calculatePacksAndRemaining(totalElderly, totalYoung, piecesPerPack, totalPeople);


        Assertions.assertEquals(1, result[0]);
        Assertions.assertEquals(2, result[1]);
    }

    @Test
    public void testCalculatePacksAndRemainingWithMixedPeople() {
        int totalElderly = 2;
        int totalYoung = 1;
        int piecesPerPack = 8;
        int totalPeople = totalElderly + totalYoung;

        int[] result = PizzaCalculator.calculatePacksAndRemaining(totalElderly, totalYoung, piecesPerPack, totalPeople);


        Assertions.assertEquals(1, result[0]);
        Assertions.assertEquals(0, result[1]);
    }

    @Test
    public void testCalculatePacksAndRemainingWithOnlyElderlyPeople() {
        int totalElderly = 2;
        int totalYoung = 0;
        int piecesPerPack = 8;
        int totalPeople = totalElderly + totalYoung;

        int[] result = PizzaCalculator.calculatePacksAndRemaining(totalElderly, totalYoung, piecesPerPack, totalPeople);


        Assertions.assertEquals(1, result[0]);
        Assertions.assertEquals(2, result[1]);
    }

    @Test
    public void testCalculatePacksAndRemainingWithZeroPeople() {
        int totalElderly = 0;
        int totalYoung = 0;
        int piecesPerPack = 8;
        int totalPeople = 0;

        int[] result = PizzaCalculator.calculatePacksAndRemaining(totalElderly, totalYoung, piecesPerPack, totalPeople);


        Assertions.assertEquals(0, result[0]);
        Assertions.assertEquals(0, result[1]);
    }

    @Test
    public void testCalculatePacksAndRemainingWithLargeNumberOfPeople() {
        int totalElderly = 1000;
        int totalYoung = 500;
        int piecesPerPack = 8;
        int totalPeople = totalElderly + totalYoung;

        int[] result = PizzaCalculator.calculatePacksAndRemaining(totalElderly, totalYoung, piecesPerPack, totalPeople);


        int expectedPieces = (1000 * 3) + (500 * 2);
        int expectedPacks = expectedPieces / piecesPerPack;
        if (expectedPieces % piecesPerPack != 0) {
            expectedPacks++;
        }
        int expectedRemainingPieces = 0;

        Assertions.assertEquals(expectedPacks, result[0]);
        Assertions.assertEquals(expectedRemainingPieces, result[1]);
    }
}
