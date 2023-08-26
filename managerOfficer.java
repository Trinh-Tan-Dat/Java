package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class managerOfficer {
    private List<officer> officers;
    public managerOfficer(){
        this.officers = new ArrayList<>();
    }

    public void addOfficer(officer officers){
        this.officers.add(officers);
    }

    public List<officer> searchOfficerByName(String name) {
        
        return null;
    }

    public void showListInforOfficer(){
        this.officers.forEach(o -> System.out.println(o.toString()));
    }
    
}
