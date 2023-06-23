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
private GreenfootImage[] imagenes;  // Variable para almacenar las imágenes
    private int indiceImagen;  // Variable para controlar el índice de la imagen actual
    private Timer timer;

    public Planeta() {
        timer = new Timer();
        // Inicializa la lista de imágenes y el índice
        imagenes = new GreenfootImage[6];  // Cambia el tamaño según la cantidad de imágenes que desees intercalar
        imagenes[0] = new GreenfootImage("Pixel Earth1.png");
        imagenes[1] = new GreenfootImage("Pixel Earth2.png");
        imagenes[2] = new GreenfootImage("Pixel Earth3.png");
        imagenes[3] = new GreenfootImage("Pixel Earth4.png");
        imagenes[4] = new GreenfootImage("Pixel Earth5.png");
        imagenes[5] = new GreenfootImage("Pixel Earth6.png");
        indiceImagen = 0;  // Índice inicial
        setImage(imagenes[indiceImagen]);  // Establece la primera imagen como la imagen actual
    }

    public void act() {
        try {
            Thread.sleep(400); // Espera .9 segundos (900 milisegundos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Cambia la imagen en cada iteración
        indiceImagen = (indiceImagen + 1) % imagenes.length;
        setImage(imagenes[indiceImagen]);
                  
    }
}
