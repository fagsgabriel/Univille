import br.univille.log.Level;
import br.univille.log.Logger;
import br.univille.log.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        logToConsole("Mensagem no console!");
        logToFile("Mensagem no arquivo!");
    }

    private static void logToConsole(String message) {
        Logger consoleLogger = LoggerFactory.onConsole();
        consoleLogger.log(Level.WARNING, message);
    }

    private static void logToFile(String message) {
        Logger fileLogger = LoggerFactory.onFile();
        fileLogger.log(Level.ERROR, message);
    }
}
