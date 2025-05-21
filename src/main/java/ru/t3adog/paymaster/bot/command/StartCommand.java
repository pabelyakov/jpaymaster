package ru.t3adog.paymaster.bot.command;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component("start")
public class StartCommand implements Command {
    @Override
    public SendMessage execute(Update update) {
        return new SendMessage(String.valueOf(update.getMessage().getChatId()), "Пососи");
    }

    @Override
    public String getName() {
        return "start";
    }
}
