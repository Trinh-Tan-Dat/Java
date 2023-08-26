package B2;

public class Magazine extends Documents {
    private int numbers;
    private int month;
    public Magazine(int id, String author, int number, int numbers, int month){
        super(id, author, number);
        this.numbers=numbers;
        this.month=month;
    }
    public int getNumbers(int numbers){
        return numbers;
    }
    public int getMonth(int month){
        return month;
    }
    public void setNumbers(int numbers){
        this.numbers=numbers;
    }
    public void setMonth(int month){
        this.month=month;
    }

    @Override
    public String toString(){
        return "Magazine: "+ id;
    }
}
