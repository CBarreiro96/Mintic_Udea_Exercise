package abstractas.email;

public class Gmail extends Email implements ICancelShipment{

    public Gmail(String body, String subject) {
        super(body,subject);
    }

    @Override
    public boolean sendEmail(String addressee, String subject) {
        System.out.println("Send email for Gmail");
        return true;
    }

    @Override
    public boolean cancelShipment(String id) {
        System.out.println("Canceling mail delivery with id: "+ id);
        return true;
    }
}
