package alex.romanovskiy.mailService;

import java.util.logging.Logger;

public class Spy implements MailService {
    private final Logger logger;

    public Spy(Logger l, Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        return null;
    }
}
