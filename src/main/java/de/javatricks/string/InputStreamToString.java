package de.javatricks.string;

import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * Created with IntelliJ IDEA.
 * User: thomas18
 * Date: 02.03.15
 * Time: 12:43
 * To change this template use File | Settings | File Templates.
 */
public class InputStreamToString {

    public static void main(String[] args) throws IOException {
        String test = "99 bottles of beer\n" +
                "and some special chars: öäüß\n\n" +
                "lala";
        InputStream is = new ByteArrayInputStream(test.getBytes(Charset.forName("UTF-8")));
        String result = toStringWithApacheCommons(is);
        System.out.println(result);


        is = new ByteArrayInputStream(test.getBytes(Charset.forName("UTF-8")));
        result = toStringJavaOnly(is);
        System.out.println(result);

        is = new ByteArrayInputStream(test.getBytes(Charset.forName("UTF-8")));
        String content = CharStreams.toString(new InputStreamReader(is, Charsets.UTF_8));


        System.out.println(content);
//        CharStreams.toString()
    }

    private static String toStringJavaOnly(InputStream is) throws IOException {
        InputStreamReader isr = new InputStreamReader(is, Charset.forName("UTF-8"));
        char[] buffer = new char[1024];
        StringBuilder stringBuilder = new StringBuilder();
        int length = 0;

        while ((length = isr.read(buffer, 0, buffer.length)) >= 0) {
            stringBuilder.append(buffer, 0, length);
        }
        isr.close();

        return stringBuilder.toString();
    }

    private static String toStringWithApacheCommons(InputStream is) throws IOException {
        String result = IOUtils.toString(is, "UTF-8");
        return result;
    }

}
