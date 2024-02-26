public class Node<String> {
    public String data;
   public int level ; 
    public Node<String> next ; 

    public Node(){
        next = null;
data=null;
    }
    public Node(String d){
        data = d;
next = null;

    }
    public void setLevel(int x){
        level = x;
    }
    public int getLevel(){
        return level;
    }
}

