package com.mwema.springshell.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class HelloCommands {

    @ShellMethod(key = "hello", value = "I will say Hello")
    public String hello(@ShellOption(defaultValue = "world") String name) {
        return "Hello " + name + "!";
    }

    @ShellMethod(key = "goodbye", value = "I will say goodbye")
    public String goodbye(@ShellOption(defaultValue = "world") String name) {
        return "goodbye " + name + "!";
    }
}
