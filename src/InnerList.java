public class InnerList<T> {

    public InnerList<T> next1;

    public Node<T> current;
    public Node<T> head;
    public Node<T> next;
    public int[] depen ;
String[] Toknw;

public InnerList(String[] s , int size){
    depen = new int[size];
    Toknw = new String[s.length];
    Toknw = s;
}


    public void insert(Node<T> t) {
        Node<String> tmp;
        if (empty()) {
            current = head = t;
        } else {
            findfirst();
            while (current.next != null)
                findnext();
            current.next = t;
        }
    }
public String getHead(){
    return head.data.toString();
}


    public void remove(Node<T> t) {
        findfirst();
        while (current.next.data != t.data)
            findnext();
        current.next = t.next;
    }

    public void printToArray(){
        for(int l =0;l<Toknw.length;l++)
findfirst();
findnext();
int x =0;
while(current !=null){//&&x<Toknw.length&&x<Toknw.length
    if(((String)current.data).equals(Toknw[x])){
    depen[x] = 1;
findnext();
x=0;}
    x++;
}


for(int i =0 ;i<depen.length;i++)
if(depen[i]!=1)
depen[i]=0;



    }

    public InnerList() {
        head = current = null;
    }

    public boolean empty() {
        return head == null;
    }

    public boolean last() {
        return current.next == null;
    }

    public boolean full() {
        return false;
    }

    public void findfirst() {
        current = head;
    }

    public void findnext() {
        current = current.next;
    }

    public T retrieve() {
        return current.data;
    }

    public void update(T val) {
        current.data = val;
    }

    public void printAll() {
        findfirst();
        while (!last()) {

            System.out.println(current.data);
            findnext();
        }
        System.out.println(current.data);
    }
    public String checkForPath(String str,int g){
if(g==0){
        while(!last()){
findnext();
}
if(current.data.equals(str)){
    return g+1+"-"+(String)head.data;
}
else
 return "";}
 else {
    findfirst();
    while(!last()){
        if(current.data.equals(str))
        return g+1+(String)current.data;
    }
    return "";

 }

       
    }

}
