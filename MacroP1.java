import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class MNT {
String macro_name;
int mdt_ind;

MNT(String s, int i) {
	macro_name = s;
	mdt_ind = i;
}
}

public class MacroP1 {
	 static List<MNT> mnt;
	 static List<String> mdt;
	 static int mdtc;
	 static int mntc;
	 static List<String>  ala;
	
	 static Scanner sc;
	public static void main(String[] args) throws Exception {
		MacroP1 p1=new MacroP1();
		p1.init();
		File f=new File("D:\\Netbeans Projects\\Programs\\src\\ip.asm");
		sc=new Scanner(f);
		PrintWriter op=new PrintWriter(new FileOutputStream("op.txt"));
        while(sc.hasNextLine())
        {
        	String line=sc.nextLine();
        	if(line.equalsIgnoreCase("MACRO"))
        	{
        		//definition found
        		p1.Process_Def(line);
        	}
        	else{
        	     op.println(line);
        	     op.flush();
        	}
        }//end of while
        // Display All Tables
        System.out.println("ALA:");
    	showAla(1);
    	System.out.println("\nMNT:");
    	showMnt();
    	System.out.println("\nMDT:");
    	showMdt();
    	
    	
        
	} //end of main
	static void showAla(int pass) throws Exception {
		
		for(String l : ala) {
			  System.out.println(l);
			
		}
	}

	static void showMnt() throws Exception {
		
		int i=0;
		for(MNT l : mnt) {
			System.out.println(i+" "+l.macro_name+" "+l.mdt_ind);
			i++;
			
		}
	}

	static void showMdt() throws Exception {
		
		int i=0;
		for(String l : mdt) {
			System.out.println(i+" "+l);
			i++;
		
		}
		
	}
	void Process_Def(String s)
	{
		String l=sc.nextLine();
		String tk[]=l.split(" ");
		mnt.add(new MNT(tk[0],mdtc)); //store macro name in MNT
		mntc++;
		//Process Arguments in ala
		String arg[]=tk[1].split(",");
	
		for(int i=0;i<arg.length;i++)
		    ala.add(arg[i]);
		
		mdt.add(l);
		mdtc++;
		
		while(!l.equalsIgnoreCase("MEND"))
		{ 
			//add in MDT 
			int ind,i=0;
			String OP_line=new String();
			l=sc.nextLine();
			if((ind=l.indexOf("&"))>0)
			{  //argument exists, replace by ala index
				String wrd[]=l.split(" ");
			
				String args[]=wrd[1].split(",");
				OP_line=wrd[0]+" "+args[0];
				while(i<args.length)
				{
					if(args[i].startsWith("&"))
					{  
						ind=ala.indexOf(args[i]);
						OP_line=OP_line+",#"+ind;
						
					}
					
					i++;
				}
			}
			else
				OP_line=l; //no need of index substitution
			mdt.add(OP_line);
			mdtc++;
		}
		
	}//end of process def method
   void init()
   {
	   mnt=new LinkedList<MNT>();
	   mdt=new ArrayList<String>();
	   ala=new LinkedList<String>();
	   mntc=0;
	   mdtc=0;
	 //  ala_mname_binding=new HashMap<String,Integer>();
   }
}

