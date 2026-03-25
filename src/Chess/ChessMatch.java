package Chess;

import BoardGame.Board;
import BoardGame.Piece;
import BoardGame.Position;
import ChessPiece.Hook;
import ChessPiece.King;
public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
    public ChessPiece performChessMove(ChessPositon sourcePosition,ChessPositon targetPosition){
        Position source = sourcePosition.toPosition();
        Position target = sourcePosition.toPosition();
        validateSourcePosition(source);
        Piece capturedPiece = makeMove(source,target);
        return (ChessPiece) capturedPiece;
    }
    private void validateSourcePosition(Position position){
        if (!board.thereIsAPiece(position)){
            throw new ChessException("Not exists piece");
        }
    }
    private Piece makeMove (Position source, Position target){
        Piece p = board.removePiece(source);
        Piece capturedPiece = board.removePiece(target);
        board.placePiece(p,target);
        return capturedPiece;
    }

    private void placeNewPiece(char column,int row,ChessPiece piece){
        board.placePiece(piece,new ChessPositon(column,row).toPosition());


    }
    private void initialSetup(){
        placeNewPiece('c', 1, new Hook(board, Color.White));
        placeNewPiece('c', 2, new Hook(board, Color.White));
        placeNewPiece('d', 2, new Hook(board, Color.White));
        placeNewPiece('e', 2, new Hook(board, Color.White));
        placeNewPiece('e', 1, new Hook(board, Color.White));
        placeNewPiece('d', 1, new King(board, Color.White));

        placeNewPiece('c', 7, new Hook(board, Color.Black));
        placeNewPiece('c', 8, new Hook(board, Color.Black));
        placeNewPiece('d', 7, new Hook(board, Color.Black));
        placeNewPiece('e', 7, new Hook(board, Color.Black));
        placeNewPiece('e', 8, new Hook(board, Color.Black));
        placeNewPiece('d', 8, new King(board, Color.Black));
    }
}
