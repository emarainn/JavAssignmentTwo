package edu.wctc;

public class Check {

    private Rooms room;

    public Check(Rooms room)
    {
        this.room = room;
    }
    public Boolean checkRoom(int numRows, int numColumns)
    {
        if(numRows == 0 && numColumns == 0)
        {
            room.Kitchen();
            return true;
        }
        if(numRows == 0 && numColumns == 1)
        {
            room.LivingRoom();
            return true;
        }
        if(numRows == 1 && numColumns == 1)
        {
            room.Bedroom();
            return true;
        }
        if(numRows == 1 && numColumns == 0){
            room.Bathroom();
            return true;
        }
        return false;
    }
}
