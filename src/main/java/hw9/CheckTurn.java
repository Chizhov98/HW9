package hw9;

public class CheckTurn {

    public boolean checkTurn( int lCoordA, int lCoordB,int  nCoordA, int nCoordB) {

        if (validationOfCoords(lCoordA, lCoordB, nCoordA, nCoordB)) {
            if ((letterRangeOfTurn(lCoordA, lCoordB) == 2 && numRangeOfTurn(nCoordA, nCoordB) == 1) ||
                    (letterRangeOfTurn(lCoordA, lCoordB) == 1 && numRangeOfTurn(nCoordA, nCoordB) == 2)) {
                return true;
            }
        } else {
            System.out.println("Incorrect coords");
        }
        return false;
    }


    public int letterRangeOfTurn(int a, int b) {
        return Math.abs(a - b);
    }

    public int numRangeOfTurn(int a, int b) {
        return Math.abs(a - b);
    }

    public boolean validationOfCoords(int lCoordA, int lCoordB, int nCoordA, int nCoordB) {
        if (lCoordA <= 8 && lCoordA >= 0 && lCoordB <= 8 && lCoordB >= 0 &&
                nCoordA <= 8 && nCoordA >= 0 && nCoordB <= 8 && nCoordB >= 0) {
            return true;
        }
        return false;
    }

}
