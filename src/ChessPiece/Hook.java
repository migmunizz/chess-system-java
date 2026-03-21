package ChessPiece;

import BoardGame.Board;
import Chess.ChessPiece;
import Chess.Color;

public class Hook extends ChessPiece {

    public Hook(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "R";
    }
}
