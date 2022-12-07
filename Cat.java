import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Actor
{
    
    GreenfootImage[] idleRight = new GreenfootImage[6];
    GreenfootImage[] idleLeft = new GreenfootImage[6];
    SimpleTimer animationTimer = new SimpleTimer();
    int speed = 0;
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        animateCat();
        
       setLocation(getX()+speed,getY());
       
       if(isTouching(Apple.class))
       {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.decreaseScore();
       }
       
       MyWorld world = (MyWorld) getWorld();
       if(getY() >= world.getWidth())
       {
            removeTouching(Cat.class);
            world.createCat();
       }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
    
    public Cat()
    {
        
        
        for(int i=0; i < idleRight.length; i++)
        {
            int number = 1 + i;
            idleRight[i] = new GreenfootImage ("images/cat_walk/tile0"+number+".png");
        }
        
        animationTimer.mark();
        
        setImage(idleRight[0]);
    }
    
     public void animateCat()
    {
        if(animationTimer.millisElapsed() < 230)
        {
            return;
        }
        animationTimer.mark();
    }
}
