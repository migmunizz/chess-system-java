package aplication;

import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPositon;

import java.rmi.server.UID;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        ChessMatch chessMatch = new ChessMatch();
        while (true){
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPositon source = UI.readPosition(sc);

            System.out.println();
            System.out.println("Target: ");
            ChessPositon target = UI.readPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source,target);
        }



    }}
