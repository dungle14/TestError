

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
public class SimpleBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update){
        System.out.println(update.getMessage().getText());
    }
    @Override
    public String getBotUsername(){
        return "cybersecuritytelegram_bot";
    }
    public String getBotToken(){
        return "6213314435:AAFxcPs9gnY9gaaW9Bzwd1DEchPhaL4Xz0Q";
    }
}