import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * TitleScreen.
 * 
 * @author Zhu
 * @version 2023 Dec
 */
public class TitleScreen extends World
{

    Label titleLabel = new Label("Hungery Animal",60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel,300,100);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
            MyWorldDoublePlayer gameWorld = new MyWorldDoublePlayer();
            Greenfoot.setWorld(gameWorld);
        }

    
        if(Greenfoot.isKeyDown("i"))
        {
            Introduction gameWorld = new Introduction();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,485,78);
        elephant.setLocation(474,86);
        elephant.setLocation(488,173);
        Label label = new Label("press space to start the game", 40);
        addObject(label,310,297);
        label.setLocation(310,298);
        Label label2 = new Label("Press <i> to see the introcuction", 40);
        addObject(label2,290,340);
        label2.setLocation(325,347);
        Label label3 = new Label("Press D if have two player", 40);
        addObject(label3,214,259);
        label3.setLocation(326,253);
        label3.setLocation(296,254);
    }
}
