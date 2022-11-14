import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
public class Main{

    public static void menu(){
        System.out.print("Pulsa 1 para agregar una cancion\n");
        System.out.print("Pulsa 2 para eliminar una cancion\n");
        System.out.print("Pulsa 3 para pasar a la siguiente cancion\n");
        System.out.print("Pulsa 4 para pasar a la cancion anterior\n");
        System.out.print("Pulsa 5 para ver toda la lista\n");
        System.out.print("Pulsa 6 para reproducir la cancion\n");
    }
    public static void main(String [] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        JFrame musica = new Musica();
        // verything will be inside musica 
        musica.pack();
        musica.setVisible(true);
        //* Just a comment to know how the player works*/
        /* 
        while(true){
            menu();
            int opc = sc.nextInt();
            if (opc == 1){
                System.out.print("Dime el nombre de la cancion que quieres agregar\n");
                String songname = sc.next();
                list.addSong(songname);
            }
            else if (opc == 2){ 

            }
            else if (opc == 3){
                list.goNextSong();
                list.playCurrentSong();
            }
            else if (opc == 4){
                list.goPrevSong();
                list.playCurrentSong();
            }
            else if (opc == 5) list.viewList();
            else if (opc == 6){
               // clip.start();
            }
        } */
        
    }
}
