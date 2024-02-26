public class Outter<T> {
    InnerList head ; 
    InnerList next1; 
    InnerList current;
    public void insert(InnerList<T> t){
		InnerList<T> tmp = t ;
        if (empty()) {
			current = head = t;
		}
		else {
            findfirst();
            while(!last())
            findnext();
			current.next1 = tmp;
		}
	}
    /*
public void remove(InnerList<T> t){
    findfirst();
    while(current.next1!=t)
    findnext();
    current.next1 = t.next1;
}
 */
    
    public Outter () {
		head = current = null;
	}

	public boolean empty () {
		return head == null;
	}

	public boolean last () {
		return current.next1 == null;
	}
    public boolean full () {
		return false;
	}
	public void findfirst () {
		current = head;
	}
	public void findnext () {
		current = current.next1;
	}

public int[] DepOfinner(){
    return current.depen;
}



public void printA(){
    findfirst();
    while(!last()){
    current.printAll();
    //System.out.println("=========================");
findnext();    
}
current.printAll();
}
	public void findPForAll(String s){
        
        findfirst();
      int c =0;
       // int s1 = 0;
      // String sr = "";
        while(current != null){
if(current.checkForPath(s,0).equalsIgnoreCase(""))
c = c;
else {
//sr +=current.checkForPath(s,0)+"*";
System.out.println(current.checkForPath(s,0));
System.out.println(current.checkForPath(current.checkForPath(s,0),1));
    c++;}
    findnext();
/*
       findnext(); }
       String[] stt = new String[s1];
       int k =0;
       while(k<s1)
       stt[k] = sr.split("*")
        if(c!=0){
        findPForAll(s, a)
        
   */      
        
        
        
        
    }


}}



    