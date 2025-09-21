package com.mwema.springshell.client;

import com.mwema.springshell.model.DadJokeResponse;
import org.springframework.web.service.annotation.GetExchange;

public interface DadJokeClient {
    @GetExchange("/")
    DadJokeResponse getDadJoke();
}
