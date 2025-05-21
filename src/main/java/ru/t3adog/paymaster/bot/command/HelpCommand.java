package ru.t3adog.paymaster.bot.command;

import lombok.ToString;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component("help")
public class HelpCommand implements Command {

    @Override
    public SendMessage execute(Update update) {
        return new SendMessage(String.valueOf(update.getMessage().getChatId()), "UUUUU");
    }

    @Override
    public String getName() {
        return "help";
    }
}
