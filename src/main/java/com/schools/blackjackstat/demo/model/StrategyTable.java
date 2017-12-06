package com.schools.blackjackstat.demo.model;

public class StrategyTable {
    public String[][] basicTable = new String[23][11];
    public String[][] altTable = new String[23][11];

    String s = "stand";
    String h = "hit";
    String d = "double";
    String p = "split";
    String r = "surrender";
    String n = "none";

    public void setBasicTable() {
        basicTable[0] = new String[]{"17+", s, s, s, s, s, s, s, s, s, s}; //player 17+
        basicTable[1] = new String[]{"16", s, s, s, s, s, h, h, h, h, h}; //player 16
        basicTable[2] = new String[]{"15", s, s, s, s, s, h, h, h, h, h};//player 15
        basicTable[3] = new String[]{"13,14", s, s, s, s, s, h, h, h, h, h};//player 13, 14
        basicTable[4] = new String[]{"12", h, h, s, s, s, h, h, h, h, h}; //player 12
        basicTable[5] = new String[]{"11", d, d, d, d, d, d, d, d, d, h}; //player 11
        basicTable[6] = new String[]{"10", d, d, d, d, d, d, d, d, h, h}; //player 10
        basicTable[7] = new String[]{"9", h, d, d, d, d, h, h, h, h, h}; //player 9
        basicTable[8] = new String[]{"5-8", h, h, h, h, h, h, h, h, h, h}; //player 8
        basicTable[9] = new String[]{"A8", s, s, s, s, s, s, s, s, s, s}; //player A8
        basicTable[10] = new String[]{"A7", s, d, d, d, d, s, s, h, h, h}; //player A7
        basicTable[11] = new String[]{"A6", h, d, d, d, d, h, h, h, h, h}; //player A6
        basicTable[12] = new String[]{"A5", h, h, d, d, d, h, h, h, h, h}; //player A5
        basicTable[13] = new String[]{"A4", h, h, d, d, d, h, h, h, h, h}; //player A4
        basicTable[14] = new String[]{"A3", h, h, h, d, d, h, h, h, h, h}; //player A3
        basicTable[15] = new String[]{"A2", h, h, h, d, d, h, h, h, h, h}; //player A2
        basicTable[16] = new String[]{"AA/88", p, p, p, p, p, p, p, p, p, p}; //player AA or 88
        basicTable[17] = new String[]{"99", p, p, p, p, p, s, p, p, s, s}; //player 99
        basicTable[18] = new String[]{"77", p, p, p, p, p, p, h, h, h, h}; //player 77
        basicTable[19] = new String[]{"66", p, p, p, p, p, h, h, h, h, h}; //player 66
        basicTable[20] = new String[]{"44", h, h, h, p, p, h, h, h, h, h}; //player 44
        basicTable[21] = new String[]{"33", p, p, p, p, p, p, h, h, h, h}; //player 33
        basicTable[22] = new String[]{"22", p, p, p, p, p, p, h, h, h, h}; //player 22
    }

    public void setAltTable() {
        altTable[0] = basicTable[0]; //player 17+
        altTable[1] = new String[]{"16", s, s, s, s, s, h, h, r, r, r}; //player 16
        altTable[2] = new String[]{"15", s, s, s, s, s, h, h, h, r, r}; //player 15
        altTable[3] = basicTable[3];//player 13, 14
        altTable[4] = new String[]{"12", s, s, s, s, s, h, h, h, h, h}; //player 12
        altTable[5] = new String[]{"11", d, d, d, d, d, d, d, d, d, d}; //player 11
        altTable[6] = basicTable[6]; //player 10
        altTable[7] = new String[]{"9", h, h, h, h, h, h, h, h, h, h}; //player 9
        altTable[8] = basicTable[8]; //player 5-8
        altTable[9] = new String[]{"A8", s, s, s, s, d, s, s, s, s, s}; //player A8
        altTable[10] = new String[]{"A7", s, d, d, d, d, s, h, h, h, h}; //player A7
        altTable[11] = new String[]{"A6", d, d, d, d, d, h, h, h, h, h}; //player A6
        altTable[12] = new String[]{"A5", d, d, d, d, d, h, h, h, h, h}; //player A5
        altTable[13] = new String[]{"A4", d, d, d, d, d, h, h, h, h, h}; //player A4
        altTable[14] = new String[]{"A3", d, d, d, d, d, h, h, h, h, h}; //player A3
        altTable[15] = new String[]{"A2", d, d, d, d, d, h, h, h, h, h}; //player A2
        altTable[16] = new String[]{"AA/88", p, p, p, p, p, p, p, p, h, h}; //player AA or 88
        altTable[17] = new String[]{"99", p, p, p, p, p, s, p, p, s, s}; //player 99
        altTable[18] = new String[]{"77", s, s, s, p, p, s, h, h, h, h}; //player 77
        altTable[19] = new String[]{"66", s, s, s, p, p, h, h, h, h, h}; //player 66
        altTable[20] = new String[]{"44", p, p, p, p, p, h, h, h, h, h}; //player 44
        altTable[21] = new String[]{"33", h, h, h, p, p, h, h, h, h, h}; //player 33
        altTable[22] = new String[]{"22", h, h, h, p, p, h, h, h, h, h}; //player 22
    }

}
