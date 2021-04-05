package resource_booking_system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class fileHandling {

    public static void writeRoom1File(String fullDirRoom1, ArrayList<room> roomBooked) throws IOException {

        try {
            FileWriter writeToFile = new FileWriter(fullDirRoom1, true);
            PrintWriter printToFile = new PrintWriter(writeToFile);

            for (int i = 0; i < roomBooked.size(); i++) {

                printToFile.println("Room: " + roomBooked.get(i).getRoomNumber() + " |Email: " + roomBooked.get(i).getEmail() + " |Start Time: " + roomBooked.get(i).getStartTime()
                        + " |Finish Time: " + roomBooked.get(i).getFinishTime());
            }
            printToFile.close();
            writeToFile.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        roomBooked.clear();

    }

    public static void writeRoom2File(String fullDirRoom2, ArrayList<room> roomBooked) throws IOException {

        try {
            FileWriter writeToFile = new FileWriter(fullDirRoom2, true);
            PrintWriter printToFile = new PrintWriter(writeToFile);

            for (int i = 0; i < roomBooked.size(); i++) {

                printToFile.println("Room: " + roomBooked.get(i).getRoomNumber() + " |Email: " + roomBooked.get(i).getEmail() + " |Start Time: " + roomBooked.get(i).getStartTime()
                        + " |Finish Time: " + roomBooked.get(i).getFinishTime());
            }
            printToFile.close();
            writeToFile.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        roomBooked.clear();

    }

    public static void writeRoom3File(String fullDirRoom3, ArrayList<room> roomBooked) throws IOException {

        try {
            FileWriter writeToFile = new FileWriter(fullDirRoom3, true);
            PrintWriter printToFile = new PrintWriter(writeToFile);

            for (int i = 0; i < roomBooked.size(); i++) {

                printToFile.println("Room: " + roomBooked.get(i).getRoomNumber() + " |Email: " + roomBooked.get(i).getEmail() + " |Start Time: " + roomBooked.get(i).getStartTime()
                        + " |Finish Time: " + roomBooked.get(i).getFinishTime());
            }
            printToFile.close();
            writeToFile.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        roomBooked.clear();

    }

    public static void writeRoom4File(String fullDirRoom4, ArrayList<room> roomBooked) throws IOException {

        try {
            FileWriter writeToFile = new FileWriter(fullDirRoom4, true);
            PrintWriter printToFile = new PrintWriter(writeToFile);

            for (int i = 0; i < roomBooked.size(); i++) {

                printToFile.println("Room: " + roomBooked.get(i).getRoomNumber() + " |Email: " + roomBooked.get(i).getEmail() + "| Start Time: " + roomBooked.get(i).getStartTime()
                        + " |Finish Time: " + roomBooked.get(i).getFinishTime());
            }
            printToFile.close();
            writeToFile.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        roomBooked.clear();

    }

    public static void writeRoom5File(String fullDirRoom5, ArrayList<room> roomBooked) throws IOException {

        try {
            FileWriter writeToFile = new FileWriter(fullDirRoom5, true);
            PrintWriter printToFile = new PrintWriter(writeToFile);

            for (int i = 0; i < roomBooked.size(); i++) {

                printToFile.println("Room: " + roomBooked.get(i).getRoomNumber() + " |Email: " + roomBooked.get(i).getEmail() + " |Start Time: " + roomBooked.get(i).getStartTime()
                        + " |Finish Time: " + roomBooked.get(i).getFinishTime());
            }
            printToFile.close();
            writeToFile.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        roomBooked.clear();

    }

    public static void writeCateringFile(String fullDirCatering, ArrayList<catering> cateringJobs) {

        try {
            FileWriter writeToFile = new FileWriter(fullDirCatering, true);
            PrintWriter printToFile = new PrintWriter(writeToFile);
            for (int i = 0; i < cateringJobs.size(); i++) {

                printToFile.println("Room: " + cateringJobs.get(i).getRoom() + "|Email: " + cateringJobs.get(i).getEmail() + "|Time: " + cateringJobs.get(i).getDate()
                        + "|Pastry: " + cateringJobs.get(i).getPastry() + "|Tea: " + cateringJobs.get(i).getTea() + "|Coffee: "
                        + cateringJobs.get(i).getCoffee() + "|Sandwiches: " + cateringJobs.get(i).getSandwiches() + "|Water: " + cateringJobs.get(i).getWater());
            }
            printToFile.close();
            writeToFile.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        cateringJobs.clear();
    }

    public static void writeEquipmentFile(String fullDirEquipment, ArrayList<equipment> neededEquipment) {

        try {
            FileWriter writeToFile = new FileWriter(fullDirEquipment, true);
            PrintWriter printToFile = new PrintWriter(writeToFile);
            for (int i = 0; i < neededEquipment.size(); i++) {

                printToFile.println("Room: " + neededEquipment.get(i).getRoom() + "|Email: " + neededEquipment.get(i).getEmail() + "|Time: " + neededEquipment.get(i).getDate() + "|Whiteboard: " + neededEquipment.get(i).getWhiteboard() + "|Pens: " + neededEquipment.get(i).getPens() + "|Projector: "
                        + neededEquipment.get(i).getProjector());
            }
            printToFile.close();
            writeToFile.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        neededEquipment.clear();
    }

    public static void printRoom1() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("Room1.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void printRoom2() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("Room2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void printRoom3() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("Room3.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void printRoom4() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("Room4.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void printRoom5() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("Room5.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void printCateringJobs() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("Catering.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void printEquipmentNeeded() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("Equipment.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
