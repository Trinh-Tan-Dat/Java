package practice;

public class engineer extends officer {
    private String branch;

    public engineer(String name, int age, String gender, String address, String branch) {
        super(name, age, gender, address);
        //TODO Auto-generated constructor stub
        this.branch = branch;
    }

    public void setBranch(String branch){
        this.branch = branch;
    }
    public String getBranch(String branch){
        return branch;
    }
    @Override
    public String toString(){
        return "engineer: " + name + ", branch:" + branch+",age:"+age+",gender:"+gender+"address:"+address;
    }
}
