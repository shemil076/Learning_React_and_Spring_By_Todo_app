package com.in28minutes.rest.webservices.restfulwebservices.basicAuth;

public class AuthenticationBean {
    private  String message;

    public AuthenticationBean(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
