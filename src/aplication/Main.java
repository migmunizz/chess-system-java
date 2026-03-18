package aplication;

import BoardGame.Position;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        Position position = new Position(3,5);
        System.out.println(position);

    }}
