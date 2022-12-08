import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AnotherApple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnotherApple extends Actor
{
    int speed = 1;
    /**
     * Act - do whatever the AnotherApple wants to do. This method is called whenever
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
    }
}
