package com.mwema.springshell.commands;

import com.mwema.springshell.client.DadJokeClient;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class DadJokesCommands {
    private DadJokeClient dadJokeClient;
    public DadJokesCommands(DadJokeClient dadJokeClient) {
        this.dadJokeClient = dadJokeClient;
    }

    @ShellMethod(key = "dad-joke", value = "I generate a random dad joke")
    public String dadJoke() {
        return dadJokeClient.getDadJoke()
                .joke();
    }
}
