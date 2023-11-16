package zad3;

class Book {

    private String title;
    private String author;
    private int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        if (numberOfPages < 0) {
            this.numberOfPages = 1;
        } else {
            this.numberOfPages = numberOfPages;
        }
        if (title == null || title.isEmpty()) {
            this.title = "";
        } else {
            this.title = title;
        }
        if (author == null || author.isEmpty()) {
            this.author = "";
        } else {
            this.author = author;
        }
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + ", Pages: " + numberOfPages + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return numberOfPages == book.numberOfPages &&
                title.equals(book.title) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + numberOfPages;
        return result;
    }
}
