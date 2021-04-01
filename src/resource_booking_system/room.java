package resource_booking_system;

import java.time.LocalDateTime;

public class room {

    private int roomNumber;
    private String email;
    private LocalDateTime startTime;
    private LocalDateTime finishTime;

    public room(int roomNumber, String email, LocalDateTime startTime, LocalDateTime finishTime) {
        this.email = email;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.roomNumber = roomNumber;
    }

    public String toString() {
        return "Room: " + roomNumber + " |Email: " + email + " |Start Time: " + startTime + " |Finish Time: " + finishTime;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getFinishTime() {
        return finishTime;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setFinishTime(LocalDateTime finishTime) {
        this.finishTime = finishTime;
    }

}
