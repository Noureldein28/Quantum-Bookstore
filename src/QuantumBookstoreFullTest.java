
public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        InventorySystem store = new InventorySystem();

        store.addBook(new PaperBook("111a",50 ,"Head First Design Patterns" ,2015,5));
        store.addBook(new PaperBook("123s",50 ,"Grokking Algorithm" ,2015,5));
        store.addBook(new EBook("00a",30,"Head First Object-Oriented Analysis and Design" , 2006,"PDF"));
        store.addBook(new ShowcaseBook("000",0,"Introduction to Operating Systems" , 1990));

        System.out.println("--------------------------------------");

        store.buyBook("111a" , 6 ,"noureldein2808@gmail.com","Cairo"  );
        store.buyBook("123s" , 2 ,"noureldein2808@gmail.com","Cairo"  );
        store.buyBook("00a" , 2 , "noureldein2808@gmail.com" , "");
        store.buyBook("000" , 1 ,"noureldein2808@gmail.com" , "");

        store.removeOutdatedBooks(5,2025);
    }
}