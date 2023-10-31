package creational_patterns.builder;

import java.util.Map;

public class HttpRequest {
    String method;
    String url;
    Map<String, String> headers;
    String acceptString;
    
    private HttpRequest() {}

    public static class Builder {
        private HttpRequest request = new HttpRequest();

  
        public Builder method(String method) {
            request.method = method;
            return this;
        }
        
        public Builder url(String url) {
            request.url = url;
            return this;
        }

        public Builder headers(Map<String, String> headers) {
            request.headers = headers;
            return this;
        }

        public HttpRequest build() {
            return request;
        }
    }
}
