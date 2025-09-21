package com.mwema.springshell.configuration;

import com.mwema.springshell.client.DadJokeClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class SpringShellAppConfiguration {
    @Bean
    public DadJokeClient getDadJokeClient() {
        WebClient webClient = WebClient.builder()
                .baseUrl("https://icanhazdadjoke.com")
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder()
                .exchangeAdapter(WebClientAdapter.create(webClient))
                .build();
        return factory.createClient(DadJokeClient.class);
    }
}
