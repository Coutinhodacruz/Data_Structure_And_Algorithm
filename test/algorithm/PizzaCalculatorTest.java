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

        // The expected number of packs needed for 3 young people consuming 3 * 2 = 6 pieces
        // is 1 pack with 2 remaining pieces.
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

        // The expected number of packs needed for 2 elderly people consuming 2 * 3 = 6 pieces
        // and 1 young person consuming 1 * 2 = 2 pieces is 1 pack with 0 remaining pieces.
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

        // The expected number of packs needed for 2 elderly people consuming 2 * 3 = 6 pieces
        // is 1 pack with 2 remaining pieces.
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

        // With zero people, no packs are needed, and there are no remaining pieces.
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

        // Calculate the expected number of pieces needed for 1000 elderly and 500 young people
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
