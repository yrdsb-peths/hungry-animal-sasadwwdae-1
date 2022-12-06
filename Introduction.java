import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Introduction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Introduction extends World
{

    /**
     * Constructor for objects of class Introduction.
     * 
     */
    public Introduction()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("In this game you use elephant ", 50);
        addObject(label,264,54);
        label.setLocation(287,62);
        removeObject(label);
        Label label = new Label("In this game", 40);
        addObject(label,291,47);
        label.setLocation(319,35);
        Label label2 = new Label1("you will use elephant to catch the apples", 40);
        addObject(label2,271,113);
        label2.setLocation(277,125);
        label.setLocation(284,80);
        label2.setLocation(185,122);
        label.setLocation(282,70);
        removeObject(label2);
        Label label2 = new Label2("you will use your elephant", 40);
        addObject(label2,279,138);
        label2.setLocation(349,140);
        Label label3 = new Label("to catch the apple", 40);
        addObject(label3,261,186);
        label3.setLocation(333,187);
        label3.setLocation(333,187);
    }
}
