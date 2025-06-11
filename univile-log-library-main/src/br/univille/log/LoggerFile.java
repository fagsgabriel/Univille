package br.univille.log;

import java.io.FileWriter;
import java.io.IOException;

class LoggerFile implements Logger {
    private static final String FILE_NAME = "app.log";

    @Override
    public void log(Level level, String message) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write("[" + level + "] " + message + "\n");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo de log: " + e.getMessage());
        }
    }
}
