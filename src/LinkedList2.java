public class LinkedList2<T>  {
    private Node<T> head2;
	private Node<T> current2;
public String toDisplay="";
	public LinkedList2 () {
		head2 = current2 = null;
	}

	public boolean empty () {
		return head2 == null;
	}

	public boolean last () {
		return current2.next == null;
	}
public void SearchForPath2(int x , String y){//R2 R1  y=R1
String firstEle = ((String)head2.data).split(" ")[((String)head2.data).split(" ").length-1];//((String)head2.data).split(" ").length-1
	Node<T> tmp;
if(x==1)
	findfirst();
String[] str ;
//int counter =1;
while(!last()){
str= new String[((String)current2.data).split(" ").length];
str =((String)current2.data).split(" ");
for(int i = 1;i<str.length;i++)
if(y.equals(str[i])&&i==str.length-1){
	int old = x;
	tmp =current2;
	if(str[i].equals(firstEle)){
toDisplay+=" "+ x+"-"+str[i-1]   ;         //System.out.println(x+"-"+str[i-1]);
SearchForPath2(++x, str[i-1]);}
else{
toDisplay+= " "+x+"-"+str[0];//System.out.println(x+"-"+str[0]);
SearchForPath2(++x, str[0]);}
//findfirst();
//findnext();
x = old;
current2 = tmp;//
}
else if(y.equals(str[i])&&i!=str.length-1){
		int old = x;
 toDisplay+= " "+x+"-"+str[0];   //System.out.println(x+"-"+str[0]);
tmp =current2;
SearchForPath2(++x, str[0]);
//findfirst();
//findnext();
x = old;
current2 = tmp;
}
	findnext();
}
//return;
/* 
str= new String[((String)current2.data).split(" ").length];//R3 R1
str =((String)current2.data).split(" ");
for(int i = 1;i<str.length;i++)
if(y.equals(str[i])&&i==str.length-1) 
System.out.println(x+"-"+str[i-1]);
else if(y.equals(str[i])&&i!=str.length-1)
System.out.println(x+"-"+str[0]);
*/

}
public void CheckForLast(){


}


    public boolean full () {
		return false;
	}
	public void findfirst () {
		current2 = head2;
	}
	public void findnext () {
		current2 = current2.next;
	}
	public T retrieve () {
		return current2.data;
	}
    public void printAlldata(){
        findfirst();
        while(!last())
        System.out.println("9+9+9+9+9+9+9+9+9+9+9+9+  "+current2.data);
    }
	public void update (T val) {
		current2.data = val;
	}
public void chco(){
	findfirst();
	while(!last()){
	System.out.println(current2.data+"9+9+9+9+9+9+9+9+9+9+9+9+");
findnext();}
	System.out.println(current2.data+"9+9+9+9+9+9+9+9+9+9+9+9+");
}


	public void insert (T val) {
		Node<T> tmp;
		if (empty()) {
			current2 = head2 = new Node<T> (val);
		}
		else {
			tmp = current2.next;
			current2.next = new Node<T> (val);
			current2 = current2.next;
			current2.next = tmp;
		}
	}

}
