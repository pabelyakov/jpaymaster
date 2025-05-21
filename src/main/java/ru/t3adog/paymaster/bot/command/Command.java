package ru.t3adog.paymaster.bot.command;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public interface Command {

    SendMessage execute(Update update);

    String getName();
}
