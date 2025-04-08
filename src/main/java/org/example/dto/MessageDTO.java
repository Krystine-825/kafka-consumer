package org.example.dto;

public class MessageDTO {
    private int id;
    private String content;

    public MessageDTO() {}
    public MessageDTO(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    @Override
    public String toString() {
        return "MessageDTO{id=" + id + ", content='" + content + "'}";
    }
}