package org.learn.graphql.library.entity;

public class BookInput {
    private String title;
    private String author;
    private int quantity;
    private boolean available;

    public BookInput() {
    }

    public BookInput(String title, String author, int quantity, boolean available) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
