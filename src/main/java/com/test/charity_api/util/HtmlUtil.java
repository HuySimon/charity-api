package com.test.charity_api.util;

import java.util.stream.Collectors;
import org.apache.commons.text.StringEscapeUtils;

public class HtmlUtil {

    public static String escapeHTML(String str) {
        return str.codePoints().mapToObj(c -> c > 127 || "\"'<>&".indexOf(c) != -1
                ? "&#" + c + ";" : new String(Character.toChars(c)))
                .collect(Collectors.joining());
    }

    public static String unescapeHTML(String str) {
        return StringEscapeUtils.unescapeHtml4(str);
    }
}