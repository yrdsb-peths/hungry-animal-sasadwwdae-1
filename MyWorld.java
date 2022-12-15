import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score;
    Label scoreLabel;
    int level = 1;
    Cat cat = new Cat();
    int numberPlayer = 1;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 

        scoreLabel = new Label(0, 80);
        addObject(scoreLabel,50,50);

        createApple();
        createCat();

        if(numberPlayer == 1)
        {
            Elephant elephant = new Elephant();
            addObject(elephant,400,300);
            elephant.setSize(score);
        }
        if(numberPlayer == 2)
        {
            ElephantTwo elephantTwo = new ElephantTwo();
            addObject(elephantTwo,100,300);
            Elephant.setSize(score);

            Elephant elephant = new Elephant();
            addObject(elephant,400,300);
            elephant.setSize(score);
        }
    }

    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over:",100);
        addObject(gameOverLabel,300,200);
    }

    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = (0);
        addObject(apple,x,y);
        apple.setSpeed(level);
    }

    public void createCat()
    {
        int x = (0);
        int y = Greenfoot.getRandomNumber(400);
        addObject(cat,x,y);
        cat.setSpeed(1 + level);
    }

    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        int i = score / 5;
        if(i >= 1)
        {
            level = i + 1;
        }
        else
        {
            level = 1;
        }
    }

    public void decreaseScore(int sc)
    {
        score = score - sc;
        scoreLabel.setValue(score);
    }
}
}