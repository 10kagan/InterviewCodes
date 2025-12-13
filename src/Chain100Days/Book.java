package Chain100Days;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private double price;

    public Book (String title, double price){
        this.title = title;
        this.price = price;
    }

    @Override
    public int compareTo(Book other){
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString(){
        return title + " - $" + price;
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Java Basics", 25.99));
        books.add(new Book("Advanced Java", 40.50));
        books.add(new Book("Spring Boot", 35.00));

        Collections.sort(books);

        System.out.println(books);
    }
}

// Write a class that implements Comparable interface