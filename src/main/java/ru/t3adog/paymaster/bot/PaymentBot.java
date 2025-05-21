package ru.t3adog.paymaster.bot;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.t3adog.paymaster.infra.config.BotProperties;

@Slf4j
@Component
@RequiredArgsConstructor
public class PaymentBot extends TelegramLongPollingBot {

    private final BotProperties botProperties;
    private final CommandHandler commandHandler;

    @Override
    public void onUpdateReceived(Update update) {
        this.sendMessage(this.commandHandler.handle(update));
    }

    @Override
    public String getBotToken() {
        return  this.botProperties.getToken();
    }

    @Override
    public String getBotUsername() {
        return this.botProperties.getName();
    }

    private void sendMessage(SendMessage sendMessage) {
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            log.error(e.getMessage());
        }
    }
}
