import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReqDep {
static String ss ;
static String[] fin;
    public static void main(String[] args) {
    
String pp ="";
 String rowOfmatrix ="";
//String[] a = new String[pp.split("@").length];
//a = pp.split("@");


        Outter o = new Outter<>();
        Scanner s = new Scanner(System.in);
               
        String read;
        int p = 0;
        System.out.println("Welcome to requirements traceability tool");
        System.out.println("Please choose your option: enter requirements dependencies");

        while (true) {
             read =s.nextLine() ;
		   if (read.equals("0"))
               break;
            pp+=read+"@";

            if(rowOfmatrix==null) {    	rowOfmatrix="";
            	//System.out.println("============iam here if null=========");

                           for(int i =read.split(" ").length-1;i>=0;i--) {
                       		//System.out.println(read.split(" ")[i]+"*******************");

                        	   rowOfmatrix+=read.split(" ")[i]+" ";
                           }}

else{int x=0 ;    		//System.out.println("============iam here3331 if not=========");

boolean b =true ;
           for(int i =read.split(" ").length-1;i>=0;i--){// R3 R1 start with R1
           for(int j= 0;j<rowOfmatrix.split(" ").length;j++){//Row = R1 R2 , start w R1
           if(rowOfmatrix.split(" ")[j].equalsIgnoreCase(read.split(" ")[i])){
            b = false;
break;}
if((x+1)==rowOfmatrix.split(" ").length){
                          rowOfmatrix+=read.split(" ")[i]+" ";break;}x++;}
   		//System.out.println(rowOfmatrix);
           }
   		//System.out.println("========out if else looop============"+b);
          String[] rowWithouDub = new String[rowOfmatrix.split(" ").length];
		rowWithouDub = rowOfmatrix.split(" ");
		Set<String> myset  = new HashSet<String>();
		    Collections.addAll(myset,rowWithouDub);
			String[] array = myset.toArray(new String[0]);
            fin = new String[array.length];
			fin[0] = array[array.length-1];
            int j =1;
			for(int i =0;i<array.length-1;i++)
				fin[j++] = array[i];
            System.out.print("  ");
    


/*
            String[] str = new String[read.split(" ").length];
            str = read.split(" ");
            int g = 0;
            InnerList l = new InnerList<>();
            while (g < str.length) {
                System.out.println(str[g]);
                l.insert(new Node<String>(str[g]));// add data to Node
                g++;
            }
           // System.out.println(pp);
            o.insert(l);
        */

        }
        


}

//until here is good
//========================================================================================
//for(int uu =0;uu<pp.split("@").length;uu++)
//System.out.println(pp);

String toInsertIniner[] = new String[pp.split("@").length];
toInsertIniner=pp.split("@");
LinkedList2<String> list = new LinkedList2<String>();
for(int h =0;h<toInsertIniner.length;h++)
    list.insert(toInsertIniner[h]);




list.SearchForPath2(1, "R3");
//String[] sttt = new String[list.toDisplay.split("\n").length];
//sttt = list.toDisplay.split("\n");
/* 
for (int i = 0; i < sttt.length; i++) {
    for (int j = 0; j < sttt.length; j++)
    if(sttt[j].split("-")[0].equals(j+1))
    System.out.println(sttt[j]);
}
*/
String[] sttt = new String[list.toDisplay.split(" ").length];
sttt = list.toDisplay.split(" ");
for(int i =0;i<sttt.length;i++)
System.out.println(sttt[i]);

/* 
for(int j=0;j<sttt.length;j++)
if(sttt[j].charAt(j)==j+1)
System.out.println(sttt[j]);
*/





//System.out.println(toInsertIniner[1]); = R3 R1
//int y =0;
/* 
for(int xt =0 ;xt<toInsertIniner.length;xt++);{
    
         InnerList l = new InnerList<>(fin,fin.length);
    for(int g =0;g<toInsertIniner[y].split(" ").length;g++){
        System.out.println(toInsertIniner[y].split(" ")[g]+"This what each node will take:======");
      l.insert(new Node<String>(toInsertIniner[y].split(" ")[g]));
    }
    System.out.println("======================= here each inner what have"+y);
    l.printAll();
    System.out.println("======================= here each inner what have2");
    //System.out.println("See here to know what is going to node:  ");
    //System.out.println(toInsertIniner[y++]);
   // y++;//1
    //System.out.println("yyyyyyyyyyyyyyyyyyy= "+y);
    
o.insert(l);      
}
System.out.println("our of yyyyyyyyyyyyyyyyyyy");
o.printA();*/
//for(int pmn =0;pmn<toInsertIniner.length;pmn++)
for(int pmn =0;pmn<toInsertIniner.length;pmn++){
         InnerList l = new InnerList<>(fin,fin.length);
         for(int i =0;i<toInsertIniner[pmn].split(" ").length;i++)
         l.insert(new Node<String>(toInsertIniner[pmn].split(" ")[i]));
        l.printToArray();
      //l.insert(new Node<String>(fin[pmn]));
        o.insert(l);  
//System.out.println(l.getHead()+"the head of inners/*******////******/////");
}

String ReqTotrace ;
/*
o.findfirst();
for(int pmn =0;pmn<toInsertIniner.length;pmn++){
         //InnerList l = new InnerList<>(fin,fin.length);
         //System.out.println(toInsertIniner[pmn].split(" ").length+"for loop small iterate--------------------------");
String str1 = o.current.getHead();//R1
System.out.println(str1+"head of inner +++++++++++++++++++-------------------");
          for(int g =0;g<fin.length;g++){
            String str = o.current.getHead();//R1
System.out.println(str+"head of inner +++++++++++++++++++-------------------");
            System.out.println(toInsertIniner[pmn].split(" ")[0] + " it should be r2 or r3+++++++++++++++++++++++++++++++++");
            if(toInsertIniner[pmn].split(" ")[0].equals(str))
            o.current.insert(new Node<String>(str));
        //System.out.println(toInsertIniner[pmn].split(" ")[g]+"This what each node will take:======");
      //l.insert(new Node<String>(toInsertIniner[pmn].split(" ")[g]));
      if(!o.last())
   o.findnext(); }
    //l.printAll();
      

}
       System.out.println("our of yyyyyyyyyyyyyyyyyyy");
       o.findfirst();
       while(!o.last()){
        o.current.printToArray();
        o.findnext();
       }
               o.current.printToArray();

//o.printA(); 

 */

ReqTotrace ="R1";
int indexOfReq =0;
String displayTrace = "";
String otherLevel= "";
//print matrix
//System.out.print(fin.length+"--------------------");
System.out.print("\t");
for(int i =0;i<fin.length;i++){if(fin[i].equals(ReqTotrace))indexOfReq=i;
System.out.print(fin[i]+"\t");}

//System.out.println(o.current.getHead()+"it should beee r2 -------------------"); good
o.findfirst();
System.out.println();
for(int i =0;i<fin.length;i++){
//System.out.println(o.DepOfinner().length+"---22222222222222222222222222222222222");
   //System.out.println(fin[i]+"uts "+i);
    if(o.current.getHead().equals(fin[i])){   //i==0
   System.out.print(fin[i]);
        //System.out.println("its r :---------------"+fin[i]);
    for(int j =0 ; j<o.current.depen.length;j++){
    System.out.print("\t"+o.current.depen[j]);
     //System.out.println();
         if(j==indexOfReq){otherLevel +=" "+fin[i];
            displayTrace+="  1-"+fin[i];}//
}
System.out.println();
     //if(j==indexOfReq)displayTrace+="1-"+fin[i];//
     o.findnext();

}else{
       System.out.print(fin[i]);
 for(int j =0 ; j<o.current.depen.length;j++)
    System.out.print("\t"+"0");
         System.out.println();

    //  System.out.println(fin[i]);
}

;

    /* 
if(fin[i].equals(o.current.getHead())){
    for(int k =0; k<o.DepOfinner().length;k++)
System.out.print("\t"+o.DepOfinner()[k]);
o.findnext();}
else
System.out.println("0\t0\t0\t0\t0\t0\t0\t0");
}
*/
}
System.out.println();





/////////////////////////////////////////////////////////////////
int[] ind = new int[otherLevel.split(" ").length];
for(int i =0;i<fin.length;i++)
for(int j =0;j<otherLevel.split(" ").length;j++)
if(fin[i].equals(otherLevel.split(" ")[j]))
ind[j]=i;





o.findfirst();
//System.out.println();
for(int i =0;i<fin.length;i++){
//System.out.println(o.DepOfinner().length+"---22222222222222222222222222222222222");
   //System.out.println(fin[i]+"uts "+i);
    if(o.current.getHead().equals(fin[i])){   //i==0
   //System.out.print(fin[i]);
        //System.out.println("its r :---------------"+fin[i]);
    for(int j =0 ; j<o.current.depen.length;j++){
   // System.out.print("\t"+o.current.depen[j]);
     //System.out.println();
     for(int x =0;x<ind.length;x++)
         if(j==ind[x])                            //otherLevel +=" "+fin[i];
            displayTrace+=(2)+"-"+fin[i];     //
  

}

//System.out.println();
     //if(j==indexOfReq)displayTrace+="1-"+fin[i];//
     o.findnext();

    }}

/////////////////////////////////////////////////////////////////
















/* 





        String[] rowWithouDub = new String[rowOfmatrix.split(" ").length];
		rowWithouDub = rowOfmatrix.split(" ");
		Set<String> myset  = new HashSet<String>();
		    Collections.addAll(myset,rowWithouDub);
			String[] array = myset.toArray(new String[0]);
            String[] fin = new String[array.length];
			fin[0] = array[array.length-1];
            int j =1;
			for(int i =0;i<array.length-1;i++)
				fin[j++] = array[i];
            System.out.print("  ");
    
for(int i =0;i<fin.length;i++)
System.out.print(fin[i]+" ");
System.out.println();
for(int i =0;i<fin.length;i++)
System.out.println(fin[i]);/* */

/*
String[] rowWithouDub = new String[rowOfmatrix.split(" ").length];
rowWithouDub = rowOfmatrix.split(" ");
Set<String> myset  = new HashSet<String>();
    Collections.addAll(myset,rowWithouDub);
 */




/* 

          String   disMat[] = new String[p];
         disMat = ss.split(" ");
         System.out.println("5555555555555555555555");
         
      for(int i=1;i<p+1;i++)
System.out.print(" "+disMat[i]);
         System.out.println("5555555555555555555555");

         for(int i=1;i<p+1;i++)
System.out.println(disMat[i]);
         System.out.println("5555555555555555555555");

        System.out.println("-----------");
        o.printA();
        System.out.println("-----------");
        o.findPForAll("R1");*/
    }
}
