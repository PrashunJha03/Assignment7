package arrayList;
import java.util.ArrayList;
import java.util.Scanner;

class Book
{
	int bookId;
	String title;
	String author;
	double price;
	
}


public class BookManagementSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList <Book> books = new ArrayList<>();
		int choice;
		do {
			System.out.println("----------Book Management System-------------");
			System.out.println("1. Add Book");
			System.out.println("2. Display all Books");
			System.out.println("3. Search Book by Id");
			System.out.println("4. Update Book");
			System.out.println("5. Delete Book");
			System.out.println("6. EXIT");
			
			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();
			
			switch (choice)
			{
			case 1:
				Book b = new Book();
				System.out.println("Enter Book Id : ");
				b.bookId = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Title : ");
				b.title = sc.nextLine();
				
				System.out.println("Enter Author : ");
				b.author = sc.nextLine();
				
				System.out.println("Enter Book Price : ");
				b.price = sc.nextDouble();
				
				books.add(b);
				
				System.out.println("Book Added Successfully.");
				
				break;
				
			case 2:
				if (books.size() == 0)
				{
					System.out.println("No Books Available");
				}
				else 
				{
					System.out.println("----All Books------");
					
					for (int i = 0; i< books.size(); i++)
					{
						Book book = books.get(i);
						
						System.out.println("Book Id : "+book.bookId);
						System.out.println("Title : "+book.title);
						System.out.println("Author : "+book.author);
						System.out.println("Book Price : "+book.price);
						
					}
				}
				break;
				
			case 3:
				System.out.println("Enter Book Id to Search : ");
				int searchId = sc.nextInt();
				boolean found = false;
				
				for(int i = 0; i < books.size(); i++)
				{
					Book book = books.get(i);
					
					if(book.bookId == searchId)
					{
						System.out.println("\n Book Found ");
						System.out.println("Book Id : "+ book.bookId);
						System.out.println("Title : "+ book.title);
						System.out.println("Author : "+ book.author);
						System.out.println("Price : "+ book.price);
						
						found = true;
						break;
					}
				}
				
				if (found == false)
				{
					System.out.println("Book Not Found");
				}
				break;
				
				
			case 4:
				System.out.println("Enter Book Id to Update : ");
				int updateId = sc.nextInt();
				
				boolean updated = false;
				
				for (int i = 0; i < books.size(); i++)
				{
					Book book = books.get(i);
					
					if(book.bookId == updateId)
					{
						sc.nextLine();
						
						System.out.println("Enter New Title : ");
						book.title = sc.nextLine();
						
						System.out.println("Enter New Author : ");
						book.author = sc.nextLine();
						
						System.out.println("Enter New Book Price : ");
						book.price = sc.nextDouble();
						
						books.set(i, book);
						updated = true;
						System.out.println("Book Updated Successfully.");
						
						break;
					}
				}
				
				if(updated == false)
				{
					System.out.println("Book Not Found");
				}
				break;
				
			case 5:
				System.out.println("Enter Book Id To Delete : ");
				int deleteId = sc.nextInt();
				
				boolean deleted = false;
				
				for(int i = 0; i < books.size(); i++)
				{
					Book book = books.get(i);
					
					if(book.bookId == deleteId)
					{
						books.remove(i);
						deleted = true;
						System.out.println("Book deleted Successfully.");
						break;
					}
				}
				
				if(deleted == false)
				{
					System.out.println("Book Not Found");
				}
				break;
				
			case 6:
				System.out.println("Program Closed...");
				
				break;
				
				default:
					System.out.println("Invalid Choice");
		}
	} while (choice != 6);
		sc.close();

}
}
