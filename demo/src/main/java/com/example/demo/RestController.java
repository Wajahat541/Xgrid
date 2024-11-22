@RestController
@Path(/Book)
Public class bookController{
   @Autowired
    private BookService bookService = new BookService();
    @GetMapping(value = "/getAllBooks", produces ="Appliation/json")
    public getAllbooks(){
        bookService.getAllbooks();
    }
    @GetMapping(value = "getBookById/id" , produces = "Application/json")
public getBookById(@PathVariable id){
      bookService.getBookById(id);
    }
}