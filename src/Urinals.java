
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class Urinals
{
     int countUrinals( String str ){
        System.out.println("countUrinals");
         int cnt=0;
         int n = str.length();
//         System.out.println(n);
         if(str.charAt(0)=='0' && str.charAt(1)=='0'){
             cnt++;
             StringBuffer string = new StringBuffer(str);
             string.setCharAt(0, '1');
             str = String.valueOf(string);
//             System.out.println(str);
             // str.charAt(0)=1;
         }
         {
             for(int i=1;i<n-1;i++){
//                 System.out.println(str);
//                 System.out.println(str.charAt(i-1) + str.charAt(i) + str.charAt(i+1));
                 if(str.charAt(i-1)=='0' && str.charAt(i+1)=='0'  && str.charAt(i)=='0'){
//                    System.out.println("i="+i);
//                    System.out.println("here");
                     cnt++;
                     StringBuffer string = new StringBuffer(str);
                     string.setCharAt(i, '1');
                     str = String.valueOf(string);
//                     System.out.println(str);
                 }
             }
             if(str.charAt(n-1)=='0' && str.charAt(n-2)=='0'){
                 cnt++;
                 StringBuffer string = new StringBuffer(str);
                 string.setCharAt(n-1, '1');
                 str = String.valueOf(string);
//                System.out.println(str);
             }
         }
         return cnt;
    }
     int goodString( String str ) {
         System.out.println("Good String Check Function");
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
                 continue;
             }
         }
         if(str.charAt(n-2) == '1' && str.charAt(n-1)=='1'){
             return -1;
         }
         return 1;
    }
     String openFile() throws IOException {
         Path fileName = Path.of("C:\\Users\\pdave6\\IdeaProjects\\ICA8\\urinal.dat");

         // Now calling Files.readString() method to
         // read the file
         String str = Files.readString(fileName);

         // Printing the string
         System.out.println(str);
         return str;
    }

    public static void main(String[] args) {
        String st = "100001";
//        goodString(st);
// 		System.out.println("Hello World");
    }
}
