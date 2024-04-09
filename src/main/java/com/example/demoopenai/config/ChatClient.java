//package com.example.demoopenai.config;
//
//import org.springframework.ai.openai.api.OpenAiApi;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import reactor.core.publisher.Flux;
//
//@Component
//public class ChatClient {
//
//    @Value("${openai.api.key}")
//    private static String openaiApiKey;
//
//    public OpenAiApi getOpenAiApi() {
//        return new OpenAiApi(openaiApiKey);
//    }
//
//    public OpenAiApi.ChatCompletionMessage getChatCompletionMessage() {
//        return new OpenAiApi.ChatCompletionMessage("Hello world", OpenAiApi.ChatCompletionMessage.Role.USER);
//    }
//
//    // Sync request
//    public ResponseEntity<OpenAiApi.ChatCompletion> chatCompletionEntity(OpenAiApi.ChatCompletionRequest chatCompletionRequest) {
//        // new OpenAiApi.ChatCompletionRequest(List.of(chatCompletionMessage), "gpt-3.5-turbo", 0.8f, false));
//        return getOpenAiApi().chatCompletionEntity(chatCompletionRequest);
//    }
//
//    // Streaming request
//    public Flux<OpenAiApi.ChatCompletionChunk> streamResponse(OpenAiApi.ChatCompletionRequest chatCompletionRequest) {
//        // new OpenAiApi.ChatCompletionRequest(List.of(getChatCompletionMessage()), "gpt-3.5-turbo", 0.8f, true)
//        return getOpenAiApi().chatCompletionStream(chatCompletionRequest);
//    }
//}
