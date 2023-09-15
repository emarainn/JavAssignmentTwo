package edu.wctc;

public class Maze {

    private int numRows;
    private int numColumns;
    private int[][] grid; //2d array
    public Maze(int numRows, int numColumns){
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.grid = new int[numRows][numColumns];
    }
    public int getNumRows() {
        return numRows;
    }

    public void updateNumRows(int numRows) {
        this.numRows += numRows;
    }

    public int getNumColumns() {
        return numColumns;
    }

    public void updateNumCols(int numCols) {
        this.numColumns += numCols;
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }



}