package com.example.demo.entity;

public class History {

    private String bookName;
    private String publish;
    private String author;
    private int userId;
    private String username;
    private String borrowTime;
    private String backTime;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(String borrowTime) {
        this.borrowTime = borrowTime;
    }

    public String getBackTime() {
        return backTime;
    }

    public void setBackTime(String backTime) {
        this.backTime = backTime;
    }

    @Override
    public String toString() {
        return "History{" +
                "bookName='" + bookName + '\'' +
                ", publish='" + publish + '\'' +
                ", author='" + author + '\'' +
                ", userId=" + userId +
                ", username='" + username + '\'' +
                ", borrowTime='" + borrowTime + '\'' +
                ", backTime='" + backTime + '\'' +
                '}';
    }
}
