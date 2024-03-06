package ru.syn.quotes.models;

import jakarta.persistence.*;

@Entity
@Table(name = "\"Chats2\"")
public class Chat extends com.pengrad.telegrambot.model.Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "chatld", nullable = false)
    private Long chatld;

    @Column(name = "lastld", nullable = false)
    private Integer lastld;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChatld() {
        return chatld;
    }

    public void setChatld(Long chatld) {
        this.chatld = chatld;
    }

    public Integer getLastld() {
        return lastld;
    }

    public void setLastld(Integer lastld) {
        this.lastld = lastld;
    }

}