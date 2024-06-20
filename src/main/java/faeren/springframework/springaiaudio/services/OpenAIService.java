package faeren.springframework.springaiaudio.services;


import faeren.springframework.springaiaudio.model.Question;

public interface OpenAIService {


    byte[] getSpeech(Question question);
}

