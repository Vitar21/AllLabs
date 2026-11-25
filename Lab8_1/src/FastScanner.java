import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class FastScanner {
    private final InputStream in;
    private final byte[] buffer = new byte[1 << 16];
    private int ptr = 0;
    private int len = 0;

    public FastScanner(InputStream in) {
        this.in = in;
    }

    private int readByte() throws IOException {
        if (ptr >= len) {
            len = in.read(buffer);
            ptr = 0;
            if (len <= 0) {
                return -1;
            }
        }
        return buffer[ptr++];
    }

    public boolean hasNext() throws IOException {
        int c = readByte();
        while (c <= ' ') {
            if (c == -1) {
                return false;
            }
            c = readByte();
        }
        ptr--;
        return true;
    }

    public int nextInt() throws IOException {
        int c = readByte();
        while (c <= ' ') {
            if (c == -1) {
                throw new NoSuchElementException();
            }
            c = readByte();
        }

        int sign = 1;
        if (c == '-') {
            sign = -1;
            c = readByte();
        }

        int res = 0;
        while (c > ' ') {
            res = res * 10 + (c - '0');
            c = readByte();
        }
        return res * sign;
    }
}