package com.javachess;

import java.util.Collection;

/**
 * Represents a position on the board.
 * 
 * @author: Ricardo Prins
 * @version: 0.1.0
 * @since: 09-15-2020
 */
public class Position {
    /**
     * Squares here is a 64-slots array used in the following manner: -6: Black king
     * -5: Black queen -4: Black rook -3: Black bishop -2: Black knight -1: Black
     * pawn 0: Empty square 1: White pawn 2: White knight 3: White bishop 4: White
     * rook 5: White queen 6: White king
     */
    byte[] squares;
    int moveNumber;
    boolean isWhiteAllowedCastling;
    boolean isBlackAllowedCastling;
    int enPassant1;
    int enPassant2;

    public boolean isCheckmate() {
        return false;
    }

    public boolean isStalemate() {
        return false;
    }

    public float evaluatePosition() {
        return 0;
    }

    public Collection<Position> possibleMoves() {
        return null;
    }
}
