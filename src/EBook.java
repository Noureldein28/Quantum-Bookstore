public class EBook extends Book{
    private String fileType;

    public EBook(String ISBN, double price, String title, int yearPublish , String fileType) {
        super(ISBN, price, title, yearPublish);
        this.fileType = fileType;
    }

    @Override
    public void Buy(int quantity, String Email, String address) {
        double total = quantity * Price;
        System.out.println("Bought " + quantity +" " + title +  " for total " + total +"$");
        mailService.sendToCustomer(Email);
        System.out.println("--------------------------------------");
    }
}
