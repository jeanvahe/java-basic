package dustin.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class Regex
{
    public static void match()
    {
        String line = "2016 Jul 13  16:15:47.454  [AB]  0xB193  LTE ML1 Idle Serving Cell Meas Response";
        Pattern p = Pattern.compile("^20\\d{2} ");
        Matcher m = p.matcher(line);

        out.println(m.find() );
        out.println(m.start());
        out.println(m.end()  );
        out.println(m.group());
    }
}
