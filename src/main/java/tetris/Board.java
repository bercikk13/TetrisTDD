// Copyright (c) 2008-2015  Esko Luontola <www.orfjackal.net>
// You may use and modify this source code freely for personal non-commercial use.
// This source code may NOT be used as course material without prior written agreement.

package tetris;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Board implements Grid {



    private char [][] blocks;
    public Board(int rows, int columns)
    {
        blocks = new char[rows][columns];
                for(char[] tmp : blocks )
                {
                    Arrays.fill(tmp,EMPTY);
                }

    }

    public  String toString() {
        String s = "";
        for (int row = 0; row < rows(); row++) {
            for (int col = 0; col < columns(); col++) {
                s += ".";
            }
            s += "\n";
        }
        return s;
    }

    public int rows() {
        return blocks.length;
    }

    public int columns() {
        return blocks[0].length;
    }
}
