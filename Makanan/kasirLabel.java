import greenfoot.*;
import java.awt.*;   // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kasirLabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kasirLabel extends Actor
{
    private String text = "";
    private int lebar = 90, tinggi = 75;
    public static String intS;
    public static int int1, ok;
    public static boolean tambah = false, kurang = false, kali = false, bagi = false;
    private String[] tekanAngka = {"7","8","9","4","5","6","1","2","3","0"};
    
    public kasirLabel (String TheText){
        text = TheText;
        updateImage();
        intS = "";
        int1 = 0;
        ok = 0;
    }
    
    public void act(){
        cekMouse();
    }
    
    public void cekMouse(){
        if (Greenfoot.mouseClicked(this)){
            for (int z = 0; z < 10; z++){
                if (text == tekanAngka[z]){
                    intS = intS + text;
                }
            }
            
            if (text == "/"){
                int1 = Integer.parseInt(intS);
                    if (ok == 0){
                        ok = int1;
                    }
                    bagi = true;
                    intS = "";
            }
            
            if (text == "*"){
                int1 = Integer.parseInt(intS);
                    if (ok == 0){
                        ok = int1;
                    }
                    kali = true;
                    intS = "";
            }
            
            if (text == "+"){
                int1 = Integer.parseInt(intS);
                    if (ok == 0){
                        ok = int1;
                    }
                    tambah = true;
                    intS = "";
            }
            
            if (text == "-"){
                int1 = Integer.parseInt(intS);
                    if (ok == 0){
                        ok = int1;
                    }
                    kurang = true;
                    intS = "";
            }
            
            if (text == "="){
                hasil();
            }
            
            if (text == "C"){
                hapus();
            }
            
            if (text == "+/-"){
                if(intS != ""){
                    int1 = Integer.parseInt(intS);
                    int1 = int1 * (-1);
                    intS = Integer.toString(int1);
               }else{
                   intS = intS + "-";
               }
            }
            
            if(text == "."){
                intS = intS + ".";
            }
                        
        }
    }
    
    public void hasil(){
        if (intS != ""){
            int1 = Integer.parseInt(intS);
            
            if (bagi == true){
                int1 = ok / int1;
                bagi = false;
            }
            
            if (kali == true){
                int1 = ok * int1;
                kali = false;
            }
            
            if (tambah == true){
                int1 = ok + int1;
                tambah = false;
            }
            
            if (kurang == true){
                int1 = ok - int1;
                kurang = false;
            }
            
            ok = int1;
            intS = Integer.toString(int1);
        }
    }
    
    public void hapus(){
        Greenfoot.setWorld(new Kasir());
    }
    
    private void updateImage(){
        Font font = new Font ("Cooper",Font.BOLD,40);
        GreenfootImage image = new GreenfootImage (lebar,tinggi);
        image.setFont(font);
        image.clear();
        image.setColor(Color.BLACK);
        image.drawString(text, 2, 45);
        setImage(image);
    }
    
}
