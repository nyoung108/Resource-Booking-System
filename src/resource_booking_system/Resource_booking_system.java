package resource_booking_system;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Month;

public class Resource_booking_system {

    private static ArrayList<catering> cateringJobs = new ArrayList<>();
    private static ArrayList<equipment> neededEquipment = new ArrayList<>();
    private static ArrayList<room> roomBooked = new ArrayList<>();
    private static ArrayList<String> textItems = new ArrayList<>();

    public static String fullDirCatering;
    public static String fullDirEquipment;
    public static String fullDirRoom1;
    public static String fullDirRoom2;
    public static String fullDirRoom3;
    public static String fullDirRoom4;
    public static String fullDirRoom5;

    public static void getDir() {
        fullDirCatering = System.getProperty("user.dir") + "\\Catering.txt";
        fullDirEquipment = System.getProperty("user.dir") + "\\Equipment.txt";
        fullDirRoom1 = System.getProperty("user.dir") + "\\Room1.txt";
        fullDirRoom2 = System.getProperty("user.dir") + "\\Room2.txt";
        fullDirRoom3 = System.getProperty("user.dir") + "\\Room3.txt";
        fullDirRoom4 = System.getProperty("user.dir") + "\\Room4.txt";
        fullDirRoom5 = System.getProperty("user.dir") + "\\Room5.txt";
    }

    public static void main(String[] args) throws IOException {

        boolean valid = true;
        while (valid) {
            getDir();
            valid = mainMenu(valid);

            fileHandling.writeCateringFile(fullDirCatering, cateringJobs);
            fileHandling.writeEquipmentFile(fullDirEquipment, neededEquipment);

        }
    }

    public static void saveToFile(String fileName, String text, boolean append) throws IOException {

    }

    public static boolean mainMenu(Boolean valid) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to: ");
        System.out.println("1: Book a room");
        System.out.println("2: Request refreshments");
        System.out.println("3: Request equipments");
        System.out.println("4: Print catering jobs");
        System.out.println("5: Print equipment jobs");
        System.out.println("5: Print a room bookings");
        System.out.println("0: Exit program");
        int selected = input.nextInt();
        switch (selected) {
            case 1:
                bookRoom();
                break;
            case 2:
                requestCatering();
                break;
            case 3:
                requestEquipment();
                break;
            case 4:
                fileHandling.printCateringJobs();
                break;
            case 5:
                printRoomBookings();
                break;
            case 6:
            default:
                valid = false;
                break;
        }

        return valid;
    }

    public static void bookRoom() throws IOException {
        Scanner input = new Scanner(System.in);
        int roomNumber = roomNumber();
        LocalDateTime startTime = requestedTime(roomNumber);
        LocalDateTime finishTime = requestedTime(roomNumber);
        String email = emailCheck();
        email = emailDuplicate(email, startTime, finishTime);
                
        

        room newRoom = new room(roomNumber, email, startTime, finishTime);
        roomBooked.add(newRoom);
        if (roomNumber == 1) {
            fileHandling.writeRoom1File(fullDirRoom1, roomBooked);
        }
        if (roomNumber == 2) {
            fileHandling.writeRoom2File(fullDirRoom2, roomBooked);
        }
        if (roomNumber == 3) {
            fileHandling.writeRoom3File(fullDirRoom3, roomBooked);
        }
        if (roomNumber == 4) {
            fileHandling.writeRoom4File(fullDirRoom4, roomBooked);
        }
        if (roomNumber == 5) {
            fileHandling.writeRoom5File(fullDirRoom5, roomBooked);
        }
    }

    public static void requestCatering() throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("What room needs refreshments?");
        int room = input.nextInt();
        String email = emailCheck();
        System.out.println("Your email is " + email);

        LocalDateTime requestedTime = requestedTime(room);
        System.out.println("Refreshmants needed at " + requestedTime);

        System.out.println("Would you like pastry");
        input.nextLine();
        String pastry = input.nextLine();
        System.out.println("Would you like tea");

        String tea = input.nextLine();
        System.out.println("Would you like coffee");

        String coffee = input.nextLine();
        System.out.println("Would you like sandwiches");

        String sandwiches = input.nextLine();
        System.out.println("Would you like water");

        String water = input.nextLine();

        catering newCatering = new catering(room, email, requestedTime, pastry, tea, coffee, sandwiches, water);
        cateringJobs.add(newCatering);

        System.out.println(newCatering.toString());

    }

    public static void requestEquipment() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("What room needs equipment?");
        int room = input.nextInt();
        String email = emailCheck();
        System.out.println("Your email is " + email);
        LocalDateTime requestedTime = requestedTime(room);
        System.out.println("Refreshmants needed at " + requestedTime);
        System.out.println("Would you like a whiteboard");
        input.nextLine();
        String whiteboard = input.nextLine();
        System.out.println("Would you like some pens");
        String pens = input.nextLine();
        System.out.println("Would you like a projector");
        String projector = input.nextLine();

        equipment newEquipment = new equipment(room, email, requestedTime, whiteboard, pens, projector);
        neededEquipment.add(newEquipment);
        System.out.println(newEquipment.toString());
    }

    public static void printRoomBookings() throws IOException {
        Scanner input = new Scanner(System.in);
        boolean valid = true;
        while (valid) {
            System.out.println("What room would you like to print bookings");
            int selected = input.nextInt();
            if (selected > 0 && selected < 6) {
                switch (selected) {
                    case 1:
                        fileHandling.printRoom1();
                        break;
                    case 2:
                        fileHandling.printRoom2();
                        break;
                    case 3:
                        fileHandling.printRoom3();
                        break;
                    case 4:
                        fileHandling.printRoom4();
                        break;
                    case 5:
                        fileHandling.printRoom5();
                        break;
                }
                valid = false;
                break;
            }
            else{
                System.out.println("This is not a room");
            }
        }
    }

    public static int roomNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people are you booking for");
        int people = input.nextInt();
        int[] available = new int[5];
        System.out.println("If you require disabled access enter yes");
        String disabled = input.next();
        if (!disabled.equalsIgnoreCase("yes")) {
            if (people > 2) {
                if (people > 4) {
                    if (people > 8) {
                        if (people > 15) {
                            if (people > 50) {
                                System.out.println("There are no rooms available for this size");
                                return 0;
                            }
                            System.out.println("Available room: 5");
                            available[4] = 5;
                            
                        }
                        System.out.println("Available room: 4");
                        available[3] = 4;
                        available[4] = 5;
                    }
                    System.out.println("Available room: 3");
                    available[2] = 3;
                    available[3] = 4;
                    available[4] = 5;
                }
                System.out.println("Available room: 2");
                available[1] = 2;
                available[2] = 3;
                available[3] = 4;
                available[4] = 5;
            }
            System.out.println("Available room: 1");

            available[0] = 1;
            available[1] = 2;
            available[2] = 3;
            available[3] = 4;
            available[4] = 5;
        } else {
            System.out.println("Available rooms: 4");
            available[3] = 4;
        }
        int roomNumber = 0;
        boolean valid = true;
        while (valid) {
            System.out.println("What room would you like to book");
            roomNumber = input.nextInt();
            for (int i = 0; i < available.length; i++) {                            //need to fix room 5 always bieng available 
                
                if (available[i]!=0 && available[i] == roomNumber-1) {
                    System.out.println("This room is available");
                    valid = false;
                } 
                
                else {
                    System.out.println("This room is not available");
                }
                
            }
        }
        return roomNumber;
    }

    public static String emailCheck() {
        Scanner input = new Scanner(System.in);
        boolean valid = true;
        String email = "";
        while (valid) {
            System.out.println("Please enter your email");
            email = input.next();

            if (email.contains("@")) {
                if (email.contains(".com") || email.contains(".co.uk")) {
                    System.out.println("Valid email");
                }
                valid = false;
            } else {
                System.out.println("Not a valid email, please try again");
            }
        }
        return email;
    }

    public static LocalDateTime requestedTime(int room) throws IOException {
        Scanner input = new Scanner(System.in);

        boolean valid = true;
        while (valid = true) {

            System.out.println("What month are they needed");
            int month = input.nextInt();
            System.out.println("What day are they needed");
            int day = input.nextInt();
            System.out.println("What hour are they needed");
            int hour = input.nextInt();
            System.out.println("What minute are they needed");
            int minute = input.nextInt();

            LocalDateTime requestedTime = LocalDateTime.of(2021, Month.of(month), day, hour, minute);
            for (int i = 0; i < 25; i++) {

                LocalDateTime rounding = LocalDateTime.of(2021, Month.of(month), day, i, minute);
                if (requestedTime.isBefore(rounding)) {
                    if (minute >= 30) {
                        minute = 30;
                    }
                    if (minute < 30) {
                        minute = 0;
                    }
                    requestedTime = LocalDateTime.of(2021, Month.of(month), day, i - 1, minute);
                    break;
                }
            }

            return requestedTime;
        }
        return null;
    }

    public static String emailDuplicate(String email, LocalDateTime startTime, LocalDateTime finishTime) {
        readingFile.readRoom1File(fullDirRoom1, textItems);
        readingFile.readRoom2File(fullDirRoom2, textItems);
        readingFile.readRoom3File(fullDirRoom3, textItems);
        readingFile.readRoom4File(fullDirRoom4, textItems);
        readingFile.readRoom5File(fullDirRoom5, textItems);
        for (int i = 0; i < textItems.size(); i++) {
            System.out.println(textItems.get(i));
        }
        return email;
    }
}
