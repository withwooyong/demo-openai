package com.example.demoopenai.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatResponse {
    private List<Choice> choices;

    @Data
    public static class Choice {
        private int index;
        private Message message;
    }
}
