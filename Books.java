package B2;

public class Books extends Documents {
    private String name;
    private String pages;

    public Books(int id, String author, int number, String name, String pages){
        super(id, author, number);
        this.pages = pages;
        this.name=name;
    }
    public String getName(String name){
        return name;
    }
    public String getPages(String pages){
        return pages;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPages(String pages){
        this.pages=pages;
    }

    @Override
    public String toString(){
        return "Book: " + id;
    }
}
