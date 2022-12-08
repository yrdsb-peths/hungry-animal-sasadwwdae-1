import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    int speed = 1;

    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void setSpeed(int spd)
    {
        speed = spd;
    }

    public void act()
    {
        // Add your action code here.
        setLocation(getX(),getY()+speed);

        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            GameOver gameWorld = new GameOver();
            Greenfoot.setWorld(gameWorld);
        }
        
        MyWorldDoublePlayer worldTwo = (MyWorldDoublePlayer) getWorld();
        if(getY() >= world.getHeight())
        {
            GameOver gameWorld = new GameOver();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
