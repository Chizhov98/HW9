package hw9;

import javax.swing.*;

public class Task1 {
    static Convert converter = new Convert();
    static CheckTurn check = new CheckTurn();

    Task1() {
    }

    Task1(Convert convert) {
        this.converter = convert;
    }

    Task1(CheckTurn check) {
        this.check = check;
    }

    Task1(CheckTurn check, Convert convert) {
        this.check = check;
        this.converter = convert;
    }

    public static void main(String[] args) {
        String startPos = "a1";
        String lastPos = "B3";

        System.out.println(checkHorseTurn(startPos, lastPos) ? "You can do this turn" : "You can`t do this turn");
    }


    public static boolean checkHorseTurn(String startPos, String lastPos) {
        int[] coordArray = converter.getCoords(startPos, lastPos);
        return check.checkTurn(coordArray[0], coordArray[1], coordArray[2], coordArray[3]);
    }
}
