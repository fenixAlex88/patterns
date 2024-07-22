package decorator2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ShuffleCaseInputSteam extends FilterInputStream {
    private boolean odd;

    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected ShuffleCaseInputSteam(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        odd = !odd;
        return c == -1 ? -1 : odd ? Character.toUpperCase(c) : Character.toLowerCase(c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int res = super.read(b, off, len);
        for (int i = off; i < off + len; i++) {
            odd = !odd;
            b[i] = (byte) (odd ? Character.toUpperCase(b[i]) : Character.toLowerCase(b[i]));
        }
        return res;
    }
}
