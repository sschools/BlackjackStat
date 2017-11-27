package com.schools.blackjackstat.demo.model;

public class strategyTable {
    private String[][] basicTable = new String[21][10];
    private String[][] altTable = new String[21][10];

    String s = "stand";
    String h = "hit";
    String d = "double";
    String p = "split";
    String n = "none";

    public void setBasicTable() {
        basicTable[0] = new String[]{s, s, s, s, s, s, s, s, s, s}; //player 17+
        basicTable[1] = new String[]{s, s, s, s, s, h, h, h, h, h}; //player 13 - 16
        basicTable[2] = new String[]{h, h, s, s, s, h, h, h, h, h}; //player 12
        basicTable[3] = new String[]{d, d, d, d, d, d, d, d, d, h}; //player 11
        basicTable[4] = new String[]{d, d, d, d, d, d, d, d, h, h}; //player 10
        basicTable[5] = new String[]{h, d, d, d, d, h, h, h, h, h}; //player 9
        basicTable[6] = new String[]{h, h, h, h, h, h, h, h, h, h}; //player 8
        basicTable[7] = new String[]{s, s, s, s, s, s, s, s, s, s}; //player A8
        basicTable[8] = new String[]{s, d, d, d, d, s, s, h, h, h}; //player A7
        basicTable[9] = new String[]{h, d, d, d, d, h, h, h, h, h}; //player A6
        basicTable[10] = new String[]{h, h, d, d, d, h, h, h, h, h}; //player A5
        basicTable[11] = new String[]{h, h, d, d, d, h, h, h, h, h}; //player A4
        basicTable[12] = new String[]{h, h, h, d, d, h, h, h, h, h}; //player A3
        basicTable[13] = new String[]{h, h, h, d, d, h, h, h, h, h}; //player A2
        basicTable[14] = new String[]{p, p, p, p, p, p, p, p, p, p}; //player AA or 88
        basicTable[15] = new String[]{p, p, p, p, p, s, p, p, s, s}; //player 99
        basicTable[16] = new String[]{p, p, p, p, p, p, h, h, h, h}; //player 77
        basicTable[17] = new String[]{p, p, p, p, p, h, h, h, h, h}; //player 66
        basicTable[18] = new String[]{h, h, h, p, p, h, h, h, h, h}; //player 44
        basicTable[19] = new String[]{p, p, p, p, p, p, h, h, h, h}; //player 33
        basicTable[20] = new String[]{p, p, p, p, p, p, h, h, h, h}; //player 22
    }

    public void setAltTable() {
        
    }

}
