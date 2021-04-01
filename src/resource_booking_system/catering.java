package resource_booking_system;

import java.time.LocalDateTime;

public class catering {

    private int room;
    private String email;
    private String pastry;
    private String tea;
    private String coffee;
    private String sandwiches;
    private String water;
    private LocalDateTime date;

    public catering(int room, String email, LocalDateTime date, String pastry, String tea, String coffee, String sandwiches, String water) {
        this.room = room;
        this.email = email;
        this.date = date;
        this.pastry = pastry;
        this.tea = tea;
        this.coffee = coffee;
        this.sandwiches = sandwiches;
        this.water = water;

    }

    public String toString() {
        return "Room: " + room + ", Email: " + email + ", Time: " + date + ", Pastry: " + pastry + ", Tea: " + tea + ", Coffee: " + coffee + ", Sandwiches: " + sandwiches + ", Water: " + water;
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

    public String getPastry() {
        return pastry;
    }

    public String getTea() {
        return tea;
    }

    public String getCoffee() {
        return coffee;
    }

    public String getSandwiches() {
        return sandwiches;
    }

    public String getWater() {
        return water;
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

    public void setPastry(String pastry) {
        this.pastry = pastry;
    }

    public void setTea(String tea) {
        this.tea = tea;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public void setSandwiches(String sandwiches) {
        this.sandwiches = sandwiches;
    }

    public void setWater(String water) {
        this.water = water;
    }

}
