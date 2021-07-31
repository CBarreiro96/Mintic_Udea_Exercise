package abstractas.email;

public abstract class Email {
    private String subject;
    private String body;

    public Email(String body, String subject) {
        this.body = body;
        this.subject = subject;
    }

    public abstract boolean sendEmail(String addressee, String subject);

    public String summaryEmail() {
        return "It is a email with subject: " + subject + " and body: " + body;
    }

    public String getSubject() {
        return subject;
    }


    public String getBody() {
        return body;
    }


}
