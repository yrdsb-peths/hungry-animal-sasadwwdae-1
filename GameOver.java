import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    boolean changeWorld = false;
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
        Elephant elephant = new Elephant();
        addObject(elephant,300,100);
        
        changeWorld = elephant.getEatApple();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Game Over", 80);
        addObject(label,282,190);
        label.setLocation(300,200);
        Label label2 = new Label("press 1 or 2 to restart", 40);
        addObject(label2,271,290);
        label2.setLocation(326,288);
    }
    

    public void act()
    {
        if(Greenfoot.isKeyDown("1"))
        {
            MyWorld gameWorld = new MyWorld(1);
            Greenfoot.setWorld(gameWorld);
        }else if(Greenfoot.isKeyDown("2"))
        {
            MyWorld gameWorld = new MyWorld(2);
            Greenfoot.setWorld(gameWorld);
        }
    }
}
