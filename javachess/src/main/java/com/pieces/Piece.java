package com.pieces;

import java.util.Collection;

import com.engine.Position;

/**
 * Pieces interface
 * 
 * @author: Ricardo Prins
 * @version: 0.1.0
 * @since: 09-15-2020
 */
public interface Piece {

    Collection<Position> possibleMoves(int x, int y, Position origin);

}
