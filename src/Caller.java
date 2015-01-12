public class Caller {
    private String name;
    private int id;
    static int nextid;
    
    public Caller(String nm){
    name=nm;
    nextid++;
    id=nextid;
    }
    
    public String toString(){
        return "ID: "+ id + "\tName: " +name;
    }
    
}
