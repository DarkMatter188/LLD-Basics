package com.example.tictactoe.factory;

import com.example.tictactoe.models.BotDifficultyLevel;
import com.example.tictactoe.strategy.botPlayingStrategy.BotPlayingStrategy;
import com.example.tictactoe.strategy.botPlayingStrategy.EasyBotPlayingStrategy;
import com.example.tictactoe.strategy.botPlayingStrategy.HardBotPlayingStrategy;
import com.example.tictactoe.strategy.botPlayingStrategy.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficultyLevel) {
        if(difficultyLevel == BotDifficultyLevel.EASY){
            return new EasyBotPlayingStrategy();
        }
        else if(difficultyLevel == BotDifficultyLevel.MEDIUM){
            return new MediumBotPlayingStrategy();
        }
        else if(difficultyLevel == BotDifficultyLevel.HARD){
            return new HardBotPlayingStrategy();
        }
        else{
            return null;
        }

    }
}
