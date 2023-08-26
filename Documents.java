package B2;

public class Documents {
    protected int id;
    protected String author;
    protected int number;
    public Documents(){}

    public Documents(int id, String author, int number){
        this.id=id;
        this.author=author;
        this.number=number;
    }
    public int getId(int id){
        return id;
    }
    public String getAuthor(String author){
        return author;
    }
    public int getNumber(int number){
        return number;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setNumber(int number){
        this.number=number;
    }

}
