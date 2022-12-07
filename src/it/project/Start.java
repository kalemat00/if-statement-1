package it.project;

public class Start {
    public static void main(String[] args){
        String myName = "Matteo";

        if(myName.length() % 2 == 0)
            System.out.println("the number of letter in the name " + myName + " is even.");
        else if(myName.length() % 2 == 1)
            System.out.println("the number of letter of the name " + myName + " is odd.");

    }
}
