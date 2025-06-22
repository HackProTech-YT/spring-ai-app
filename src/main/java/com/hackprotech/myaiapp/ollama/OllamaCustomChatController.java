package com.hackprotech.myaiapp.ollama;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaApi;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OllamaCustomChatController {


    @GetMapping("/custom/chat")
    public String getChatMessage(@RequestParam("query") String query) {
        OllamaApi ollamaApi = OllamaApi.builder().build();
        OllamaChatModel ollamaChatModel = OllamaChatModel.builder()
                .ollamaApi(ollamaApi)
                .defaultOptions(
                        OllamaOptions.builder().model("gemma3:latest").build()
                ).build();
        return ollamaChatModel.call(query);
    }


}



