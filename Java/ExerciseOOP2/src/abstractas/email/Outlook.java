package abstractas.email;

public class Outlook extends Email {

    public Outlook(String body, String subject) {
        super(body, subject);
    }

    @Override
    public boolean sendEmail(String addressee, String subject) {
        System.out.println("Send email for Outlook with email: " + addressee);
        return true;
    }
}
