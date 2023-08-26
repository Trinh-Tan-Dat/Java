package practice;
public class worker extends officer{
    private String job;

    public worker(String name, int age, String gender, String address, String job) {
        super(name, age, gender, address);
        //TODO Auto-generated constructor stub
    }
    public String getJob(String job){
        return job;
    }
    public void setJob(String job){
        this.job = job;
    }

    public String toString(){
        return "worker:"+name+",job:"+job+",age:"+age+",gender:"+gender+",address:"+address;
    }
    
}