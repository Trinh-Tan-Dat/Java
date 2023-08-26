package B2;

import java.util.ArrayList;
import java.util.List;

public class MangeDocuments {
    List<Documents> documents;
    public MangeDocuments(){
        this.documents=new ArrayList<>();

    }
    public void addDocuments(Documents documents){
        this.documents.add(documents);
    }
    
}
