package ru.t3adog.paymaster.bot;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import ru.t3adog.paymaster.bot.command.Command;

import java.util.Map;

@Slf4j
@Component
@RequiredArgsConstructor
public class CommandHandler {

    private final Map<String, Command> commands;

    SendMessage handle(Update update) {
        return this.commands.get("start").execute(update);
    }
}
