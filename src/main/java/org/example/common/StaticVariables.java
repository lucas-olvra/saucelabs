package org.example.common;

public class StaticVariables {
    static String url;

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        StaticVariables.url = url;
    }
}
