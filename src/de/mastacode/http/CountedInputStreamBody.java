package de.mastacode.http;

import java.io.InputStream;

import org.apache.http.entity.mime.content.InputStreamBody;

public class CountedInputStreamBody extends InputStreamBody {

    private long length;
    
    public CountedInputStreamBody(InputStream in, String filename, long length) {
        super(in, filename);
        this.length = length;
    }

    @Override
    public long getContentLength() {
        return length;
    }
}
