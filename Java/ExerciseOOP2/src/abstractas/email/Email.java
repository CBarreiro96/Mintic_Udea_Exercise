package abstractas.email;

public abstract class Email {
    private String subject;
    private String body;

    public abstract boolean senEmail(String addressee, String subject);
}
