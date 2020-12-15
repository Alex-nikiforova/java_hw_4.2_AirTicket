package ru.netology.domain;

public class Offer implements Comparable<Offer> {
    private int id;
    private int price;
    private String from;
    private String to;
    private int travelTimeInMin;

    public Offer(int id, int price, String from, String to, int travelTimeInMin) {
        this.id = id;
        this.price = price;
        this.from = from;
        this.to = to;
        this.travelTimeInMin = travelTimeInMin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getTravelTimeInMin() {
        return travelTimeInMin;
    }

    public void setTravelTimeInMin(int travelTimeInMin) {
        this.travelTimeInMin = travelTimeInMin;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", price=" + price +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", travelTimeInMin=" + travelTimeInMin +
                '}';
    }

    @Override
    public int compareTo(Offer o) {
        return price - o.price;
    }
}
