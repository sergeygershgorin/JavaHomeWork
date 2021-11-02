package com.pb.gershgorin.hw5;



public class library {
    public static void main(String[] args) {
        book book1 = new book();
        book book2 = new book();
        book book3 = new book();
        book1.title = "'Тили'";
        book2.title = "'Мили'";
        book3.title = "'Трямдия'";
        book1.author = "Тилер Т.Т.";
        book2.author = "Милер М.М.";
        book3.author = "Трямдер Т.Т.";
        book1.year = "1901 г.";
        book2.year = "1801 г.";
        book3.year = "1701 г.";

        reader reader1 = new reader();
        reader reader2 = new reader();
        reader reader3 = new reader();
        reader1.fio = "Иванов И.И.";
        reader2.fio = "Петров П.П.";
        reader3.fio = "Сидоров С.С.";

        System.out.println("В библиотеке находятся книги: " + book1.title +", " + book1.author + ", " + book1.year + ";  "
                 + book2.title +", " + book2.author + ", " + book2.year + "; "
                 + book3.title +", " + book3.author + ", " + book3.year);

        System.out.println("Читатели библиотеки: " + reader1.fio + ", " + reader2.fio + ", " + reader3.fio);

        reader1.takeBook(reader1.fio, 3);
        reader1.takeBook(reader1.fio, book1.title, book2.title, book3.title);
        reader1.takeBook(reader1.fio, book1.title, book1.author, book1.year, book2.title, book2.author, book2.year, book3.title, book3.author, book3.year);

        reader1.returnBook("Иванов Иван Иванович", 3);
        reader1.returnBook("Иванов Иван Иванович", book3.title, book2.title, book1.title);
        reader1.returnBook("Иванов Иван Иванович", book3.title, book3.author, book3.year, book2.title, book2.author, book2.year,book1.title, book1.author, book1.year);
    }
}

