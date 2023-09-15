package edu.wctc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Maze maze = new Maze(0, 0);
        Rooms room = new Rooms();
        Check check = new Check(room);
        Player player = new Player(maze, check, room);

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter movement(U, D, L, R, E): ");
            String move = scanner.nextLine();

            player.Move(move);
        }
    }




}
