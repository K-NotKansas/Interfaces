package ShortWordFilter;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class ShortWordFiltertest {
    //static wordplz worda,wordb,wordc;




    public static void main(String[] args) {
        /*
        worda = new wordplz("cow", 3);
        wordb = new wordplz("meow", 4);
        wordc = new wordplz("bones", 5);
         */

        ArrayList<String> isShortEnough = new ArrayList();

        //Declare area
        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src"); //\\personData.txt"); -was previously after src
        Scanner inFile;
        String line = "";
        JFileChooser chooser = new JFileChooser();
        ShortWordFilter m;

        //set the chooser to the project source directory
        chooser.setCurrentDirectory(file.toFile());

        try {
            //Logic for Jfilechooser
            if (chooser.showDialog(null,null) == JFileChooser.APPROVE_OPTION) {
                file = chooser.getSelectedFile().toPath();

                inFile = new Scanner(file);

                while (inFile.hasNextLine()) {
                    line = inFile.nextLine();
                    m = new ShortWordFilter(line);

                    if (m.accept(m)) {
                        System.out.println(line);
                    }

                }
                inFile.close();

            }
            else //user failed to pick file, closed chooser
            {
                System.out.println("Must select a file. Terminating.");
                System.exit(0);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found error, please try again!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
