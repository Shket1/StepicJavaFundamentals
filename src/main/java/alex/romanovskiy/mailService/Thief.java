package alex.romanovskiy.mailService;

public class Thief implements MailService{
    private static int StolenValue;
    private static int MinValue;

    public Thief(int m) {

    }

    public int getStolenValue() {
        return 0;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        return null;
    }
}
