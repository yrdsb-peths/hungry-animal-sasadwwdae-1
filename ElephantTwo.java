import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ElephantTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElephantTwo extends Actor
{
    /**
     * Act - do whatever the ElephantTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound elephantSound = new GreenfootSound("Elephant.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];

    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    boolean eatApple = false;

    public ElephantTwo()
    {
        for(int i=0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage ("images/elephant_idle/idle"+i+".png");
            idleRight[i].scale(80,80);
        }

        for(int i=0; i < idleRight.length; i++)
        {
            idleLeft[i] = new GreenfootImage ("images/elephant_idle/idle"+i+".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(80,80);
        }

        animationTimer.mark();

        setImage(idleRight[0]);
    }

    int imageIndex = 0;
    public void animateElephant()
    {
        if(animationTimer.millisElapsed() < 230)
        {
            return;
        }
        animationTimer.mark();
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
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
            facing = "right";
        }

        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-3,getY());
            facing = "left";
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
        
        if(isTouching(Cat.class))
        {
            removeTouching(Cat.class);
            MyWorld world = (MyWorld) getWorld();
            world.createCat();
            world.decreaseScore(10);
        }
        
        if(isTouching(AnotherApple.class))
        {
            removeTouching(AnotherApple.class);
            elephantSound.play();
            eatApple = true;
        }
    }  

    int size = 80;
    public void setSize(int sz)
    {
        size = size + sz;
    }

    public boolean getEatApple()
    {
        return eatApple;
    }
}
