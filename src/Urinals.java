
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class Urinals
{
     int countUrinals( String str ){
         int cnt=0;
         int n = str.length();
         if(str.charAt(0)=='0' && str.charAt(1)=='0'){
             cnt++;
             StringBuffer string = new StringBuffer(str);
             string.setCharAt(0, '1');
             str = String.valueOf(string);
         }
         {
             for(int i=1;i<n-1;i++){
                 if(str.charAt(i-1)=='0' && str.charAt(i+1)=='0'  && str.charAt(i)=='0'){
                     cnt++;
                     StringBuffer string = new StringBuffer(str);
                     string.setCharAt(i, '1');
                     str = String.valueOf(string);
                 }
             }
             if(str.charAt(n-1)=='0' && str.charAt(n-2)=='0'){
                 cnt++;
                 StringBuffer string = new StringBuffer(str);
                 string.setCharAt(n-1, '1');
                 str = String.valueOf(string);
             }
         }
         return cnt;
    }
     public int goodString( String str ) {
         int flag=0;
         int n = str.length();
         if(n>21)
             return -1;
         if(str.charAt(0) == '1' && str.charAt(1)=='1'){
             return -1;
         }
         for(int i=1;i<n-2;i++){
             if(str.charAt(i)=='0' || str.charAt(i)=='1' ){
                    if((str.charAt(i-1)==1 || str.charAt(i+1)==1) && str.charAt(i)==1 ){
                        return -1;
                    }
             }
             else{
                 return -1;
             }
         }
         if(str.charAt(n-2) == '1' && str.charAt(n-1)=='1'){
             return -1;
         }
         return 1;
    }
     public String openFile(String str) throws IOException {
         Path fileName = Path.of(str);
         File tmpDir = new File(str);
         boolean x = tmpDir.exists();
         System.out.println(x);
         if(x){
             String ans = Files.readString(fileName);
             System.out.println(ans);
             return ans;
         }
         else{
             return "No File Exist";
         }
    }

    public static void main(String[] args) throws IOException {
         Urinals url = new Urinals();
         String str = "C:\\Users\\pdave6\\IdeaProjects\\ICA8\\src\\urinal.dat";
         url.openFile(str);
         url.goodString(str);
         url.countUrinals(str);
    }
}
