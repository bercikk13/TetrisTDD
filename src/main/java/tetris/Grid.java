// Copyright (c) 2008-2016  Esko Luontola <www.orfjackal.net>
// You may use and modify this source code freely for personal non-commercial use.
// This source code may NOT be used as course material without prior written agreement.

package tetris;

/**
 * Created by firma on 22.08.16.
 */
public interface Grid {

    char EMPTY = '.';

    int rows();

    int columns();

    //char cellAt(Point point); 
}
