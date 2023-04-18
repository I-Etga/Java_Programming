package sundays_live_sessions.week_10.books;

public class Book {

    private String title;
    private String author;
    private String genre;
    private int chapters;
    private int numberOfPages;
    private boolean hasAMovie;

    public void read() {

    }

    // I can't use constructor with inheritance !! That's why I create void setInfo  method. (They're pretty similar. There is only little differences and functions)
    public void setInfo(String title, String author, String genre, int chapters, int numberOfPages, boolean hasAMovie) {
        setTitle(title);
        setAuthor(author);
        setGenre(genre);
        setChapters(chapters);
        setNumberOfPages(numberOfPages);
        setHasAMovie(hasAMovie);
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isHasAMovie() {
        return hasAMovie;
    }

    public void setHasAMovie(boolean hasAMovie) {
        this.hasAMovie = hasAMovie;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", chapters=" + chapters +
                ", numberOfPages=" + numberOfPages +
                ", hasAMovie=" + hasAMovie +
                '}';
    }
}