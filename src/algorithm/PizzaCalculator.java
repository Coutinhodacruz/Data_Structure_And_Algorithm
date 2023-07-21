package algorithm;

public class PizzaCalculator {

    public static void main(String[] args) {
        int totalElderly = 5;
        int totalYoung = 2;
        int piecesPerPack = 8;
        int totalPeople = totalElderly + totalYoung;

        int[] result = calculatePacksAndRemaining(totalElderly, totalYoung, piecesPerPack, totalPeople);
        int packsNeeded = result[0];
        int remainingPieces = result[1];

        System.out.println("Number of packs needed: " + packsNeeded);
        System.out.println("Remaining pieces: " + remainingPieces);
    }

    public static int[] calculatePacksAndRemaining(int totalElderly, int totalYoung, int piecesPerPack, int totalPeople) {
        int totalPiecesNeeded = calculatePiecesConsumed(totalElderly, totalYoung);
        int packsNeeded = totalPiecesNeeded / piecesPerPack;
        if (totalPiecesNeeded % piecesPerPack != 0) {
            packsNeeded++;
        }

        int remainingPieces = (packsNeeded * piecesPerPack) - totalPiecesNeeded;

        int[] result = new int[2];
        result[0] = packsNeeded;
        result[1] = remainingPieces;

        return result;
    }

//    public static int calculatePiecesConsumed(int totalElderly, int totalYoung) {
//        int elderlyPieces = totalElderly * 3;
//        int youngPieces = totalYoung * 2;
//        return elderlyPieces + youngPieces;
//    }
    public static int calculatePiecesConsumed(int totalElderly, int totalYoung) {
        int piecesPerElderly = 3;
        int piecesPerYoung = 2;

        return (totalElderly * piecesPerElderly) + (totalYoung * piecesPerYoung);
    }
}
