/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accessibility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author beedo
 */
public abstract class FileHandler {
    
    public static void writeData(String fileName, Object obj) throws FileNotFoundException, IOException{
        File file = new File(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(obj);
        oos.close();
    }
    
    public static Object readData(String fileName) throws IOException, ClassNotFoundException{
        File file = new File(fileName);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }
}
