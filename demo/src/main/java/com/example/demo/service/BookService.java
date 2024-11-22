
@Service
public class BookService {
    Book book1 = new Book(1,"english","Ali","23 june 2012")
    Book book2 = new Book(1,"urdu","Ali","23 june 2012")
    Book book3 = new Book(1,"urdu","Ali","23 june 2012")
List<Book> books = new ArrayList<>();
    books.add(book1);
    books.add(book2);
    books.add(book3);
    public getAllbooks() {
        if(books.size()>0)
            return books;
    }else{
        throw new BooksNotFoundException();
    }
    public getBookById(Long id){

              Book book =  retrun books.get(id);
              if(book==null){
                  throw new BookNotFoundException();
              }else{
                  return book;

              }    }
}