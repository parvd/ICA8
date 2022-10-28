import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {
    Urinals url = new Urinals();

    @Test
    void getCountUrinals() {
        assertTrue((url.countUrinals("10001")) == 1);
        assertTrue((url.countUrinals("10101")) == 0);
        assertTrue((url.countUrinals("00000")) == 3);
        assertTrue((url.countUrinals("10000")) == 2);
        assertTrue((url.countUrinals("100010101010101")) == 1);
        assertTrue((url.countUrinals("100010")) == 1);
        System.out.println("=======Parv Dave == 3rd getCountUrinals() function is passed =======");

    }

    @org.junit.jupiter.api.Test
    void goodString() {
        ArrayList<String> input1 = new ArrayList<String>() {
            {
                add("1000101");
                add("1100");
                add("011");
                add("1111");
                add("1010100001");
                add("abc123");
            }
        };
        ArrayList<Integer> out1 = url.goodString(input1);
        ArrayList<Integer> actualOut = new ArrayList<Integer>() {
            {
                add(1);
                add(-1);
                add(-1);
                add(-1);
                add(1);
                add(-1);
            }
        };
        assertEquals(out1, actualOut);
        System.out.println("=======Parv Dave == 2nt goodString() function is passed =======");
    }

    @org.junit.jupiter.api.Test
    void openFile() throws IOException {
        ArrayList<String> val = url.openFile("C:\\Users\\pdave6\\IdeaProjects\\ICA8\\src\\urinal.dat");
        ArrayList<String> actualInput = new ArrayList<String>() {
            {
                add("1000101");
                add("1100");
                add("011");
                add("1111");
                add("1010100001");
                add("abc123");
            }
        };
        assertEquals(val, actualInput);
        System.out.println("=======Parv Dave == 1st openFile() function is passed =======");
    }

//    void getWriteOutput(){
//        boolean val = url.writeOutput();
//    }

}