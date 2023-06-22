import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Timer;

/**
 * Write a description of class Planeta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planeta extends Actor
{
private GreenfootImage[] imagenes;  // Variable para almacenar las im�genes
    private int indiceImagen;  // Variable para controlar el �ndice de la imagen actual
    private Timer timer;

    public Planeta() {
        timer = new Timer();
        // Inicializa la lista de im�genes y el �ndice
        imagenes = new GreenfootImage[6];  // Cambia el tama�o seg�n la cantidad de im�genes que desees intercalar
        imagenes[0] = new GreenfootImage("Pixel Earth1.png");
        imagenes[1] = new GreenfootImage("Pixel Earth2.png");
        imagenes[2] = new GreenfootImage("Pixel Earth3.png");
        imagenes[3] = new GreenfootImage("Pixel Earth4.png");
        imagenes[4] = new GreenfootImage("Pixel Earth5.png");
        imagenes[5] = new GreenfootImage("Pixel Earth6.png");
        indiceImagen = 0;  // �ndice inicial
        setImage(imagenes[indiceImagen]);  // Establece la primera imagen como la imagen actual
    }

    public void act() {
        try {
            Thread.sleep(900); // Espera .9 segundos (900 milisegundos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Cambia la imagen en cada iteraci�n
        indiceImagen = (indiceImagen + 1) % imagenes.length;
        setImage(imagenes[indiceImagen]);
                  
    }
}
