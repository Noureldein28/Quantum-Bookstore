public class PaperBook extends Book implements shippingService{
    private int Stock;

    public PaperBook(String ISBN, double price, String title, int yearPublish , int stock) {
        super(ISBN, price, title, yearPublish);
        this.Stock = stock;
    }

    @Override
    public void Buy(int quantity, String Email, String address) {
        if (Stock < quantity) {
            throw new IllegalArgumentException("Not enough stock for "+ title + " book " + "with ISBN: " + ISBN);
        }
            Stock -= quantity;
            double total = quantity * Price;
        System.out.println("Bought " + quantity +" " + title + " paper book " + " for total " + total +"$");
        shippingService.sendToCustomer(address);
        System.out.println("--------------------------------------");
    }
}
