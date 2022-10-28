import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {

    @Test
    void getCountUrinals() {
        System.out.println("countUrinal is called");
        Urinals url = new Urinals();
        assertTrue((url.countUrinals("10001")) == 1);
        assertTrue((url.countUrinals("10101")) == 0);
        assertTrue((url.countUrinals("00000")) == 3);
        assertTrue((url.countUrinals("10000")) == 2);
        assertTrue((url.countUrinals("010")) == 0);
        assertTrue((url.countUrinals("100010")) == 1);

    }

    @org.junit.jupiter.api.Test
    void goodString() {
        System.out.println("goodString is called");
        Urinals url = new Urinals();
        assertTrue((url.goodString("10111")) == -1);
        assertTrue((url.goodString("10101")) == 1);
        assertTrue((url.goodString("110000")) == -1);
        assertTrue((url.goodString("100001")) == 1);
        assertTrue((url.goodString("011")) == -1);
        assertTrue((url.goodString("100010101010101010101010101010100000001")) == -1);
    }

    @org.junit.jupiter.api.Test
    void openFile() {
    }
}