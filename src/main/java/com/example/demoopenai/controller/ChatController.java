package com.example.demoopenai.controller;

import com.example.demoopenai.dto.ChatRequest;
import com.example.demoopenai.dto.ChatResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ChatController {

    private final RestTemplate restTemplate;

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String apiUrl;

    @GetMapping("/chat")
    public String chat(@RequestParam String prompt) {
        log.info("Prompt: {}", prompt);
        // create a request
        ChatRequest request = new ChatRequest(model, prompt);
        log.info("Request: {}", request);
        // call the API
        log.info("API URL: {}", apiUrl);
        ChatResponse response = restTemplate.postForObject(apiUrl, request, ChatResponse.class);
        log.info("Response: {}", response);

        if (response == null || response.getChoices() == null || response.getChoices().isEmpty()) {
            return "No response";
        }
        // return the first response
        return response.getChoices().get(0).getMessage().getContent();
    }

//    private final OpenAiChatClient chatClient;
//
//    @GetMapping("/ai/generate")
//    public Map generate(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
//        return Map.of("generation", chatClient.call(message));
//    }
//
//    @GetMapping("/ai/generateStream")
//    public Flux<ChatResponse> generateStream(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
//        Prompt prompt = new Prompt(new UserMessage(message));
//        return chatClient.stream(prompt);
//    }
}
