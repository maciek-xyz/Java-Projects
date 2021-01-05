package Lesson9.BoxesAndShelves;

import java.util.List;

public class BoxesAndShelvesTester {


    public static void main(String[] args) {

       Box<Toy> toyBox = new Box<>();
       toyBox.addItem(new Toy("Lalka"));

       Box<Book> bookBox = new Box<>();
       bookBox.addItem(new Book("Dziady"));
       bookBox.addItem(new Fantasy("Harry Potter"));


       Box<Item> itemBox = new Box<>();
       itemBox.addItem(new Food("Kebab"));
       itemBox.addItem(new Toy("Piłka"));
       itemBox.addItem(new Book("Kordian"));

       Box<Item> itemBox1 = new Box<>();
       itemBox1.addItem(new Food("Ryba"));
       itemBox1.addItem(new Toy("Miś"));

       Box<Fantasy> fantasyBox = new Box<>();
       fantasyBox.addItem(new Fantasy("Władcy pierścieni"));

       Shelf<Box> toyBoxShelf = new Shelf<>();
       toyBoxShelf.addItem(toyBox);

       Shelf<Box> bookBoxShelf = new Shelf<>();
       bookBoxShelf.addItem(bookBox);

       Shelf<Box> itemBoxShelf = new Shelf<>();
       itemBoxShelf.addItem(itemBox);

       System.out.println();













    }
}
