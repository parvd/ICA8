import org.junit.jupiter.api.Test;

import java.io.IOException;

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
        System.out.println("======= getCountUrinals() function is passed =======");

    }

//    @org.junit.jupiter.api.Test
//    void goodString() {
//        assertTrue((url.goodString("10111")) == -1);
//        assertTrue((url.goodString("10101")) == 1);
//        assertTrue((url.goodString("110000")) == -1);
//        assertTrue((url.goodString("100001")) == 1);
//        assertTrue((url.goodString("011")) == -1);
//        assertTrue((url.goodString("abababa")) == -1);
//        assertTrue((url.goodString("abafi020baba")) == -1);
//        assertTrue((url.goodString("100010101010101010101010101010100000001")) == -1);
//        System.out.println("======= goodString() function is passed =======");
//    }
//
//    @org.junit.jupiter.api.Test
//    void openFile() throws IOException {
//        assertTrue((url.openFile("C:\\Users\\pdave6\\IdeaProjects\\ICA8\\src\\urinal.dat")) != "No File Exist");
//        assertTrue((url.openFile("C:\\Users\\pdave6\\IdeaProjects\\ICA8\\src\\urinal2.dat")) != "No File Exist");
//        assertTrue((url.openFile("C:\\Users\\IdeaProjects\\ICA8\\src\\urinal.dat")) == "No File Exist");
//        System.out.println("======= openFile() function is passed =======");


//    }
}