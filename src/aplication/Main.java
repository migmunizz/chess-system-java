package aplication;

import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessMatch;

import java.rmi.server.UID;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }}
