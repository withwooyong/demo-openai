package com.example.demoopenai.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController("/api/v1")
public class ChatController {

//    private final RestTemplate restTemplate;

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String apiUrl;

    // restTemplate 사용
//    @GetMapping("/chat")
//    public String chat(@RequestParam String prompt) {
//        log.info("Prompt: {}", prompt);
//        // create a request
//        ChatRequest request = new ChatRequest(model, prompt);
//        log.info("Request: {}", request);
//        // call the API
//        log.info("API URL: {}", apiUrl);
//        ChatResponse response = restTemplate.postForObject(apiUrl, request, ChatResponse.class);
//        log.info("Response: {}", response);
//
//        if (response == null || response.getChoices() == null || response.getChoices().isEmpty()) {
//            return "No response";
//        }
//        // return the first response
//        return response.getChoices().get(0).getMessage().getContent();
//    }


}
