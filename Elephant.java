import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound elephantSound = new GreenfootSound("Elephant.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    
    public Elephant()
    {
        for(int i=0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage ("images/elephant_idle/idle"+i+".png");
            setImage(idle[0]);
        }
    }
    
    int imageIndex = 0;
    public void animateElephant()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-3);
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+3);
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+3,getY());
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-3,getY());
        }
        eat();
        
        animateElephant();
    }
    
    public void eat()
        {
            if(isTouching(Apple.class))
            {
                removeTouching(Apple.class);
                MyWorld world = (MyWorld) getWorld();
                world.createApple();
                world.increaseScore();
                elephantSound.play();
            }
        }   
}
