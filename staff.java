package practice;

public class staff extends officer {

    private int level;

    public staff(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        // TODO Auto-generated constructor stub
        this.level = level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel(int level) {
        return level;
    }

    @Override
    public String toString(){
        return "Staff{" + 
                "level=" + level + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address;
    }

}
