package edu.wctc;
public class Player {
    private Maze maze;
    private Check check;
    private Rooms room;

    public Player(Maze maze, Check check, Rooms room){
        this.maze = maze;
        this.check = check;
        this.room = room;
    }

    public void Move(String direction){

        //this is where you put the switch statements of how the player moves
        //base this off the grid

        switch (direction){
            case "U":
                maze.updateNumRows(1);
                if(!check.checkRoom((int)maze.getNumRows(), (int)maze.getNumColumns()))
                {
                    System.out.println("wall");
                    maze.updateNumRows(-1);
                }
                break;
            case "D":
                maze.updateNumRows(-1);
                if(!check.checkRoom((int)maze.getNumRows(), (int)maze.getNumColumns()))
                {
                    System.out.println("wall");
                    maze.updateNumRows(1);
                }
                break;
            case "L":
                maze.updateNumCols(-1);
                if(!check.checkRoom((int)maze.getNumRows(), (int)maze.getNumColumns()))
                {
                    System.out.println("wall");
                    maze.updateNumCols(1);
                }
                break;
            case "R":
                maze.updateNumCols(1);
                if(!check.checkRoom((int)maze.getNumRows(), (int)maze.getNumColumns()))
                {
                    System.out.println("wall");
                    maze.updateNumCols(-1);
                }
                break;
            case "E":
                room.Exit(maze.getNumRows() == 0 && maze.getNumColumns() == 1);
                break;
        }
    }
}
