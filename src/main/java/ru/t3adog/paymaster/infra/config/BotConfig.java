package ru.t3adog.paymaster.infra.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import ru.t3adog.paymaster.bot.PaymentBot;
import ru.t3adog.paymaster.bot.command.Command;

import java.util.List;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class BotConfig {

    private final PaymentBot paymentBot;
    private final List<Command> commandList;

    // Workaround для запуска бота
    @Bean
    public TelegramBotsApi voidStart() throws TelegramApiException {
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        botsApi.registerBot(paymentBot);
        return botsApi;
    }
}
