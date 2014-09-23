package gov.epa.aqs.controller;

public class Aqs {

    private final long id;
    private final String content;

    public Aqs(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}