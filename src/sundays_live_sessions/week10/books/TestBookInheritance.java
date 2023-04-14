package sundays_live_sessions.week10.books;

public class TestBookInheritance {
    public static void main(String[] args) {

        EBook eBook = new EBook(2.45, true); // uniques variables of AudioBook
        eBook.setInfo("The Fault in Our Stars", "John Green", "Young adult novel, realistic fiction", 10, 320, true); // comes Parrent Class Book
        System.out.println(eBook); // I didn't create toString method in EBook class but, in Parent/super class I create, and it inherits !!

        System.out.println(eBook.getAuthor()); // John Green [so code works properly]

        AudioBook audioBook = new AudioBook("Haluk Bilginer", 24); // uniques variables of AudioBook
        audioBook.setInfo("Aşk-ı Memnu", "Halit Ziya Usakligil", "Romance, novel", 12, 520, true); // comes Parrent Class Book
        System.out.println(audioBook); // I didn't create toString method in AudioBook class but, in Parent/super class I create, and it inherits !!
    }
}
