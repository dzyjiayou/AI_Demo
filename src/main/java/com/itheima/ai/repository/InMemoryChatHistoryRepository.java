package com.itheima.ai.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class InMemoryChatHistoryRepository implements ChatHistoryRepository{

    private final Map<String, List<String>> chatHistory = new HashMap<>();

    @Override
    public void save(String type, String chatId) {
        List<String> chatIds = chatHistory.computeIfAbsent(type, k->new ArrayList<>());
        if(chatIds.contains(chatId)) return;
        chatIds.add(chatId);
//        chatHistory.put(type, chatIds);
    }

    @Override
    public List<String> getChatIds(String type) {
        return chatHistory.getOrDefault(type, new ArrayList<>());
    }
}
