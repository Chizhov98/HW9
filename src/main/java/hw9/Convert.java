package hw9;

public class Convert {

    private int transformLetterCoord(String coord) {
        coord = coord.toUpperCase();
        coord = coord.trim();
        coord = coord.substring(0, 1);

        switch (coord) {
            case "A":
                return 0;
            case "B":
                return 1;
            case "C":
                return 2;
            case "D":
                return 3;
            case "E":
                return 4;
            case "F":
                return 5;
            case "G":
                return 6;
            case "H":
                return 7;
        }
        return -100;
    }

    private int transformNumCoord(String coord) {
        coord = coord.toUpperCase();
        coord = coord.trim();
        coord = coord.substring(1);

        return Integer.valueOf(coord) - 1;

    }
    protected int[] getCoords(String startPos,String lastPos){

        int lCoordA =transformLetterCoord(startPos);
        int nCoordA = transformNumCoord(startPos);
        int lCoordB = transformLetterCoord(lastPos);
        int nCoordB = transformNumCoord(lastPos);
        int coordArray[] = {lCoordA,lCoordB,nCoordA,nCoordB};
        return coordArray;

    }

}
