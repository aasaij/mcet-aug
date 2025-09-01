import java.util.Scanner;
public class LibraryManagement {
    static Scanner in;
    public static Book getBook(){
        int id;
        String title, author;     
        System.out.println("Enter Book Id : ");
        id = in.nextInt();
        System.out.println("Enter Book Title : ");
        title = in.nextLine();
           title = in.nextLine();
        System.out.println("Enter Book Author : ");
        author = in.nextLine();
        
        return new Book(id, title, author, true);        
    }
    public static void main(String[] args) {
       in = new Scanner(System.in) ;
       int n = in.nextInt(); // 5
       Book[] books = new Book[n]; // books Array of objects
       //Getting list of books
       for (int index = 0; index<n; index++){
        books[index] = getBook();
       }
       //printing list of books
       for (int index = 0; index<n; index++){
        System.out.println(index+1 +". " + books[index].getTitle());
       }
       System.out.println("Enter Book Number to Borrow : ");
       int bookNo = in.nextInt();
       books[bookNo-1].borrowBook();
       for(Book book : books){
        System.out.println(book);
       }
        
    }
}
