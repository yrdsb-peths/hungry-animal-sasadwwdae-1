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
        
        createAnotherApple();
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
    }
    
    public void createAnotherApple()
    {
        AnotherApple apple = new AnotherApple();
        int x = Greenfoot.getRandomNumber(600);
        int y = (0);
        addObject(apple,x,y);
    }
    
    public void act()
    {
        if(changeWorld)
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
