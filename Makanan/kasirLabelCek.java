import greenfoot.*;
import java.math.*;
import java.awt.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kasirLabelCek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kasirLabelCek extends Actor
{
    
    public void act() 
    {
        // Add your action code here.
        textMuncul();
    }    
    
    public void textMuncul(){
        GreenfootImage Name = new GreenfootImage (kasirLabel.intS, 80, java.awt.Color.WHITE, java.awt.Color.BLACK);
        setImage(Name);
    }
}
