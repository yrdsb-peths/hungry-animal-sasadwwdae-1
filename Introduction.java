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
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("use Elephant pick apple", 40);
        addObject(label,283,115);
        label.setLocation(298,109);
        Label label2 = new Label("do not touch the cat", 40);
        addObject(label2,255,176);
        label2.setLocation(324,168);
        Label label3 = new Label("try your best to get high point", 40);
        addObject(label3,278,236);
        label3.setLocation(333,224);
        Label label4 = new Label("press Space to start the game", 40);
        addObject(label4,271,280);
        label4.setLocation(337,276);
        label4.setLocation(298,301);
        label.setLocation(321,79);
        label2.setLocation(312,134);
        label3.setLocation(310,187);
        label4.setLocation(295,294);
    }
}
