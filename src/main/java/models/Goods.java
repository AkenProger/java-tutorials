package models;

public class Goods {
    private Long id;
    private String name;
    private double price;
    private boolean isSale;

    public Goods(Long id, String name, double price, boolean isSale) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isSale = isSale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSale() {
        return isSale;
    }

    public void setSale(boolean sale) {
        isSale = sale;
    }
}