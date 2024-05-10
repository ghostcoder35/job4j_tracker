package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book it = new Book("Clean Code", 464);
        Book detective = new Book("Sherlock Holmes", 292);
        Book thriller = new Book("Crime and Punishment", 544);
        Book adventure = new Book("Around the World in 80 Days", 192);
        Book[] books = new Book[4];
        books[0] = it;
        books[1] = detective;
        books[2] = thriller;
        books[3] = adventure;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPage());
        }
        System.out.println("Reversing books[0] to books[3] in an array");
        Book[] temp = new Book[]{books[0]};
        books[0] = books[3];
        books[3] = temp[0];
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPage());
        }
        System.out.println("Shown only book.name equals \"Clean Code\"");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean Code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getPage());
            }
        }
    }
}
