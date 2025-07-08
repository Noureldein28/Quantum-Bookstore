public class ShowcaseBook extends Book{
    public ShowcaseBook(String ISBN, double price, String title, int yearPublish) {
        super(ISBN, price, title, yearPublish);
    }

    @Override
    public void Buy(int quantity, String Email, String address) {
        System.out.println("Showcase books are not for sale (ISBN: " + ISBN + ")");
        System.out.println("--------------------------------------");
    }
}
