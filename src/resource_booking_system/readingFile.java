package resource_booking_system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class readingFile {

    public static void readRoom1File(String fullDirRoom1, ArrayList<String> textItems) {
        String inputLine;
        try {
            BufferedReader read = new BufferedReader(new FileReader(fullDirRoom1));
            while((inputLine=read.readLine()) != null){
                textItems.add(inputLine);
            }
            read.close();
        }
        catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
    public static void readRoom2File(String fullDirRoom2, ArrayList<String> textItems) {
        String inputLine;
        try {
            BufferedReader read = new BufferedReader(new FileReader(fullDirRoom2));
            while((inputLine=read.readLine()) != null){
                textItems.add(inputLine);
            }
            read.close();
        }
        catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
    public static void readRoom3File(String fullDirRoom3, ArrayList<String> textItems) {
        String inputLine;
        try {
            BufferedReader read = new BufferedReader(new FileReader(fullDirRoom3));
            while((inputLine=read.readLine()) != null){
                textItems.add(inputLine);
            }
            read.close();
        }
        catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
    public static void readRoom4File(String fullDirRoom4, ArrayList<String> textItems) {
        String inputLine;
        try {
            BufferedReader read = new BufferedReader(new FileReader(fullDirRoom4));
            while((inputLine=read.readLine()) != null){
                textItems.add(inputLine);
            }
            read.close();
        }
        catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
    public static void readRoom5File(String fullDirRoom5, ArrayList<String> textItems) {
        String inputLine;
        try {
            BufferedReader read = new BufferedReader(new FileReader(fullDirRoom5));
            while((inputLine=read.readLine()) != null){
                textItems.add(inputLine);
            }
            read.close();
        }
        catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
    public static void readCateringFile(String fullDirCatering, ArrayList<String> textItems) {
        String inputLine;
        try {
            BufferedReader read = new BufferedReader(new FileReader(fullDirCatering));
            while((inputLine=read.readLine()) != null){
                textItems.add(inputLine);
            }
            read.close();
        }
        catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
    public static void readEquipmentFile(String fullDirEquipment, ArrayList<String> textItems) {
        String inputLine;
        try {
            BufferedReader read = new BufferedReader(new FileReader(fullDirEquipment));
            while((inputLine=read.readLine()) != null){
                textItems.add(inputLine);
            }
            read.close();
        }
        catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
    
}
