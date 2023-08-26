package B2;

public class NewPapers extends Documents {
    private int date;
    public NewPapers(){}
    public NewPapers(int id, String author, int number, int date){
        super(id, author, number);
        this.date=date;
    }
    public void setDate(int date){
        this.date=date;
    }
    public int getDate(int date){
        return date;
    }

    @Override
    public String toString(){
        return "NewPaper: "+ id;
    }
}
