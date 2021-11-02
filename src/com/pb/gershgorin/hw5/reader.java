package com.pb.gershgorin.hw5;

public class reader {

    String fio;
    int libcard;
    String faculty;
    String birthday;
    int phone;

    public void takeBook (String fio, int count)
    {System.out.println(fio + " взял " + count + " книги.");}

    public void takeBook (String fio, String title, String title2, String title3)
    {System.out.println(fio + " взял книги: " + title + ", " + title2 + ", " + title3 + ".");}

    public void takeBook (String fio, String title, String author1, String year1,
                          String title2,  String author2, String year2,
                          String title3, String author3, String year3)
    {System.out.println(fio + " взял книги: " + title + " ("+ author1 + " "+ year1 + "), "
                        + title2 +" (" + author2 + " "+ year2 + "), "
                        + title3 + " ("+ author3 + " "+ year3 + ").");}

    public void returnBook (String fio, int count)
    {System.out.println(fio + " вернул " + count + " книги.");}

    public void returnBook (String fio, String title, String title2, String title3)
    {System.out.println(fio + " вернул книги: " + title + ", " + title2 + ", " + title3 + ".");}

    public void returnBook (String fio, String title, String author1, String year1,
                          String title2,  String author2, String year2,
                          String title3, String author3, String year3)
    {System.out.println(fio + " вернул книги: " + title + " ("+ author1 + " "+ year1 + "), "
            + title2 +" (" + author2 + " "+ year2 + "), "
            + title3 + " ("+ author3 + " "+ year3 + ").");}
}
