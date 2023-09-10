package me._18_memento._03_java;

import java.io.*;
import java.util.Date;

public class MementoInJava {
    public static void main(String[] args) {
        // Date
        Date date = new Date();
        System.out.println(date);

        // time = memento?
        long time = date.getTime();
        date.setTime(time);

        // Serializable
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        try (FileOutputStream fileOut = new FileOutputStream("GameSave.txt");
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOut)
        ) {
            outputStream.writeObject(game);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        game.setRedTeamScore(15);
        game.setBlueTeamScore(25);

        try (FileInputStream fileIn = new FileInputStream("GameSave.txt");
             ObjectInputStream inputStream = new ObjectInputStream(fileIn)
        ) {
            Game reloadSave = (Game) inputStream.readObject();
            System.out.println(reloadSave.getRedTeamScore());
            System.out.println(reloadSave.getBlueTeamScore());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
