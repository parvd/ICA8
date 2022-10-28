
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Urinals {
    static int xcnt = 0;

    int countUrinals(String str) {
        int cnt = 0;
        int n = str.length();
        if (str.charAt(0) == '0' && str.charAt(1) == '0') {
            cnt++;
            StringBuffer string = new StringBuffer(str);
            string.setCharAt(0, '1');
            str = String.valueOf(string);
        }
        {
            for (int i = 1; i < n - 1; i++) {
                if (str.charAt(i - 1) == '0' && str.charAt(i + 1) == '0' && str.charAt(i) == '0') {
                    cnt++;
                    StringBuffer string = new StringBuffer(str);
                    string.setCharAt(i, '1');
                    str = String.valueOf(string);
                }
            }
            if (str.charAt(n - 1) == '0' && str.charAt(n - 2) == '0') {
                cnt++;
                StringBuffer string = new StringBuffer(str);
                string.setCharAt(n - 1, '1');
                str = String.valueOf(string);
            }
        }
        return cnt;
    }

    public ArrayList<Integer> goodString(ArrayList<String> list) {
        ArrayList<Integer> output = new ArrayList<>();
        for(int j=0;j<list.size();j++){
            String str = list.get(j);
            int flag=0;
            int n = str.length();
            if (n > 21 && n<1) {
                output.add(-1);
                continue;
            }
            if (str.charAt(0) == '1' && str.charAt(1) == '1') {
                output.add(-1);
                continue;
            }
            for (int i = 1; i < n - 2; i++) {
                if (str.charAt(i) == '0' || str.charAt(i) == '1') {
                    if ((str.charAt(i - 1) == 1 || str.charAt(i + 1) == 1) && str.charAt(i) == 1) {
                        output.add(-1);
                        break;
                    }
                } else {
                    flag=1;
                    output.add(-1);
                    break;
                }
            }
            if (str.charAt(n - 2) == '1' && str.charAt(n - 1) == '1') {
                output.add(-1);
                continue;
            }
            if(flag==0)
            output.add(countUrinals(str));
        }
        return output;
    }

    boolean writeOutput(ArrayList<Integer> outputNumbers) throws IOException {
        System.out.println(outputNumbers);
        File f = new File("src/rule.txt");
        int count = 1;
        boolean flag = f.exists();
        while (f.exists()) {
            f = new File("src/rule" + count + ".txt");
            count++;
        }
        f.createNewFile();
        FileWriter writer = new FileWriter(f);
        for (int i : outputNumbers) {
            writer.write(String.valueOf(i));
            writer.write("\n");
        }
        writer.close();
        return flag;
    }


    public ArrayList<String> openFile(String fileName) throws FileNotFoundException {
        FileReader file = new FileReader(fileName);
        ArrayList<String> list = new ArrayList<>();
        Scanner line = new Scanner(file);
        while (line.hasNextLine()) {
            list.add(line.nextLine());
        }
        return list;
    }
    public static void main(String[] args) throws IOException {
        Urinals url = new Urinals();
        String str = "C:\\Users\\pdave6\\IdeaProjects\\ICA8\\src\\urinal.dat";
        ArrayList<String> ext = url.openFile(str);
        ArrayList <Integer> output  = url.goodString(ext);
//        System.out.println(outputNumbers);
        url.writeOutput(output);
        }
    }

