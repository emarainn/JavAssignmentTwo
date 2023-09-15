package edu.wctc;
public class Rooms implements Exit{

    private final String[] roomNames = {"Kitchen", "Living Room", "Bedroom", "Bathroom"};
    private final String[] roomDescription = {"Kitchen Description", "Living Room Description", "Bathroom Description", "Bathroom Dis"};
    public void Kitchen(){
        System.out.print("\nYou have entered the: " + roomNames[0] + "... " + roomDescription[0]);
    }
    public void LivingRoom(){
        System.out.print("\nYou have entered the: " + roomNames[1] + "... " + roomDescription[1]);
    }

    public void Bedroom(){
        System.out.print("\nYou have entered the: " + roomNames[2] + "... " + roomDescription[2]);
    }

    public void Bathroom(){
        System.out.print("\nYou have entered the: " + roomNames[3] + "... " + roomDescription[3]);
    }

    public void Exit(boolean input){
        if(input){
            System.out.println(exit());
            System.exit(1);
        }else{
            System.out.println("Must reach Living Room to escape...");
        }
    }

    @Override
    public String exit() {
        return "exits";
    }
}
