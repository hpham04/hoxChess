/**
 *  Copyright 2014 Huy Phan <huyphan@playxiangqi.com>
 * 
 *  This file is part of HOXChess.
 * 
 *  HOXChess is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  HOXChess is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with HOXChess.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.playxiangqi.hoxchess;

/**
 * A table
 */
public class Enums {
    public enum ColorEnum {
        
        COLOR_UNKNOWN,
                // This type indicates the absence of color or role.
                // For example, it is used to indicate the player is not even
                // at the table.

        COLOR_RED,   // RED color.
        COLOR_BLACK, // BLACK color.

        COLOR_NONE
            // NOTE: This type actually does not make sense for 'Piece',
            //       only for "Player". It is used to indicate the role of a player
            //       who is currently only observing the game, not playing.
    }
    
    public enum TableType {
        
        TABLE_TYPE_LOCAL,
                // A local board in which the local player plays with AI or with another local player.
                // or with another local player.

        TABLE_TYPE_NETWORK  
                // This is a network (only) table
    }
    
    public enum GameStatus {
        GAME_STATUS_UNKNOWN,

        GAME_STATUS_IN_PROGRESS,
        GAME_STATUS_RED_WIN,        // Game Over. Red wins
        GAME_STATUS_BLACK_WIN,      // Game Over. Black wins
        GAME_STATUS_DRAWN           // Game Over. Drawn.
    }
    
}
