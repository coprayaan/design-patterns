package creational_patterns.builder;

import java.util.Map;

public class Client {
    public static void main(String[] args) {
        HttpRequest request = new HttpRequest.Builder().method("GET")
            .url("http://www.google.com")
            .headers(Map.of("Accept", "text/html"))
            .build();
        System.out.println(request.url);
    }
}
