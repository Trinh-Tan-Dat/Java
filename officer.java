package practice;
public class officer{
    protected String name;
    int age;
    protected String gender;
    protected String address;

    public officer(String name, int age, String gender, String address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(int age){
        return age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(String gender){
        return gender;
    }
    public String getAddress(String address){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
}