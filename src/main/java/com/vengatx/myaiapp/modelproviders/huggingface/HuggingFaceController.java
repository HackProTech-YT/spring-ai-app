package com.vengatx.myaiapp.modelproviders.huggingface;


import org.springframework.ai.huggingface.HuggingfaceChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HuggingFaceController {


    @Autowired
    private HuggingfaceChatModel huggingfaceChatModel;


    @GetMapping("/hugging-face/chat")
    public String getChatResponse(@RequestParam("query") String message) {
        return huggingfaceChatModel.call(message);
    }


}
