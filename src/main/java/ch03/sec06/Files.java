/*
 * Chapter 3 Comparison and Bounds
 * Section 6 Multiple bounds
 */
package ch03.sec06;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

/**
 *
 * @author emaphis
 */
public class Files {

    public static <S extends Readable & Closeable,
                   T extends Appendable & Closeable>
    void copy(S src, T trg, int size) throws IOException {

        try {
            CharBuffer buf = CharBuffer.allocate(size);
            int i = src.read(buf);
            while (i >= 0) {
                buf.flip();  // prepare buffer for writting
                trg.append(buf);
                buf.clear();
                i = src.read(buf);
            }
        } finally {
            src.close();
            trg.close();
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int size = 32;
        FileReader r = new FileReader("file.in");
        FileWriter w = new FileWriter("file.out");
        copy(r,w,size);
    }
}
