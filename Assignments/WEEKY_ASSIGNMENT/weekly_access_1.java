import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 
import java.io.BufferedReader;

class searchWordThread extends Thread
{
    String fname;
    String wordSearch;
    searchWordThread(String nm,String wd){
        fname=nm;
        wordSearch=wd;
    }
    synchronized public void run(){
        try {
            if(search())
            {System.out.println("found word '"+wordSearch+"' in "+fname);
        }
            else{
            System.out.println("'"+wordSearch+"' not found in "+fname);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
 	public boolean search() throws IOException
 	{
        String line; 
        
        // check if File exists or not 
        FileReader fr=null; 
        BufferedReader br=null;
        try
        { 
            fr = new FileReader(fname); 
            br = new BufferedReader(fr);
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found!"); 
        } 
  
        // read from FileReader till the end of file 
        String word[];
        while ((line=br.readLine())!=null) 
        {
            word=line.split(" ");
            for(String w : word)
            {
                if(w.equals(wordSearch))
                {//System.out.println("found "+w);
                    fr.close(); 
                    br.close();
                    return true;
                }

            }
        }
            
        
        // close the file 
        fr.close(); 
        br.close();
        return false;
 	}
}

class WordCountThread extends Thread
{
    String fname;
    String wordSearch;
    WordCountThread(String nm,String wd){
        fname=nm;
        wordSearch=wd;
    }
     synchronized public void run(){
        
        try {
           // Thread.sleep(10);
            System.out.println("Word frequency: "+count());
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
 	public int count() throws IOException
 	{
        String line; 
  
        FileReader fr=null; 
        BufferedReader br=null;
        try		        // check if File exists or not 
        { 
            fr = new FileReader(fname); 
            br = new BufferedReader(fr);
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found!"); 
        } 
 
        String word[];
        int count=0;
        while ((line=br.readLine())!=null) 
        {
            word=line.split(" ");
            for(String w : word)
            {
                if(w.equals(wordSearch))
                {
                    count++;
                }

            }
        }
            
        
        // close the file 
        fr.close(); 
        br.close();
        return count;
 	}
}
class weekly_access_1
{
 	public static void main(String args[])
 	{
         try {
            searchWordThread mt1 = new searchWordThread("doc1.txt","THE");
            searchWordThread mt2 = new searchWordThread("doc2.txt","abcd");
            WordCountThread mt3=new WordCountThread("doc3.txt","THE");
            WordCountThread mt4=new WordCountThread("doc3.txt","war");
            Thread t1=new Thread(mt1);
            Thread t2=new Thread(mt2);
            Thread t3=new Thread(mt3);
            Thread t4=new Thread(mt4);  
            t1.start();
            t2.start();
            t2.join();
            System.out.println("\nFor doc 3: ");
            System.out.println("WORD   |  FREQUENCY");
            System.out.println("--------------------");
            System.out.print("THE   | ");
            t3.start();
            t3.join();
            System.out.print("war    | ");
            t4.start();
           
         } catch (Exception e) {
             //TODO: handle exception
         }
        
 	}
}
