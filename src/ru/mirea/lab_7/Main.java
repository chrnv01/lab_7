package ru.mirea.lab_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        String move;
        System.out.println("Начальные координаты для X и Y:");
        System.out.println("Координата для X:");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println("Координата для Y:\n");
        y = scanner.nextInt();
        MovableRectangle rect = new MovableRectangle(x,y);

        boolean exit = true;

        while (exit) {
            System.out.println("Задайте направление движения");
            System.out.println("up");
            System.out.println("down");
            System.out.println("left");
            System.out.println("right");
            System.out.println("exit");
            move = scanner.next().toLowerCase();
            switch (move){
                case ("up"):
                    rect.moveUp();
                    System.out.println(rect.toString());
                    break;
                case ("down"):
                    rect.moveDown();
                    System.out.println(rect.toString());
                    break;
                case ("left"):
                    rect.moveLeft();
                    System.out.println(rect.toString());
                    break;
                case ("right"):
                    rect.moveRight();
                    System.out.println(rect.toString());
                    break;
                case ("exit"):
                    System.out.println("Движение остановлено!");
                    System.out.println(rect.toString());
                    exit = false;
                    break;
                default:
                    System.out.println("Проверьте правильность данных!");
                    System.out.println("Попробуйте еще раз!");
                    break;
            }
        }
    }
}
