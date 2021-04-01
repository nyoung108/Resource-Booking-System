package resource_booking_system;

import java.time.LocalDateTime;

public class equipment {

    private int room;
    private String email;
    private String whiteboard;
    private String pens;
    private String projector;
    private LocalDateTime date;

    public equipment(int room, String email, LocalDateTime date, String whiteboard, String pens, String projector) {
        this.room = room;
        this.email = email;
        this.date = date;
        this.whiteboard = whiteboard;
        this.pens = pens;
        this.projector = projector;
    }

    public String toString() {
        return "Room: " + room + ", Email: " + email + ", Date: " + date + ", Whiteboard: " + whiteboard + ", Pens: " + pens + ", Projector: " + projector;
    }

    public int getRoom() {
        return room;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getWhiteboard() {
        return whiteboard;
    }

    public String getPens() {
        return pens;
    }

    public String getProjector() {
        return projector;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setWhiteboard(String whiteboard) {
        this.whiteboard = whiteboard;
    }

    public void setPens(String pens) {
        this.pens = pens;
    }

    public void setProjector(String projector) {
        this.projector = projector;
    }
}
