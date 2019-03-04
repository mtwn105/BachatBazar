package com.example.ecommerce.Model;

public class Products {

    private String category;

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    private String date;
    private String description;
    private String image;
    private String name;
    private String pid;
    private String price;
    private String time;
    private String seller;
    private String quantity;


    public Products() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Products(String quantity,String category, String date, String description, String image, String name, String pid, String price, String time, String seller) {
        this.category = category;
        this.date = date;
        this.description = description;
        this.image = image;
        this.name = name;
        this.pid = pid;
        this.price = price;
        this.time = time;
        this.seller = seller;
        this.quantity=quantity;
    }
}
