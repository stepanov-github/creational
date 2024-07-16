import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + new SimpleDateFormat("dd.MM.YYYY HH:MM:ss ").format(new Date()) + num++ + "] " + msg);
    }
}
