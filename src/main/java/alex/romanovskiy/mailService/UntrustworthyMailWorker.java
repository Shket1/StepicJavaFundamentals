package alex.romanovskiy.mailService;

public class UntrustworthyMailWorker implements MailService {
    private static MailService[] workers;
    private static RealMailService realWorker = new RealMailService();

    public UntrustworthyMailWorker (MailService[] w){
    }

    public MailService getRealMailService() {
        return null;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        return null;
    }
}
