public abstract class Book {

    protected String ISBN;
    protected String title;
    protected int yearPublish;
    protected double Price;

    public Book(String ISBN, double price, String title, int yearPublish) {
        this.ISBN = ISBN;
        Price = price;
        this.title = title;
        this.yearPublish = yearPublish;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }


public abstract void Buy(int quantity,String Email,String address );

    public boolean isOutdated(int currentYear, int maxBookAge) {
        return (currentYear - yearPublish) > maxBookAge;
    }

}
