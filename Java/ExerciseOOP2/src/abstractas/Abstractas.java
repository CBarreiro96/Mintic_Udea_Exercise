package abstractas;

import abstractas.email.Email;
import abstractas.email.Gmail;
import abstractas.email.Outlook;

public class Abstractas {
    public static void main(String[] args) {
        String addressee = "julinito@gmail.com";

        Gmail emailGmail1 = new Gmail("Hello friend, I'm happy to write you.", "Email welcome");
        String summary = emailGmail1.summaryEmail();
        System.out.println("Email summary: " + summary);
        emailGmail1.cancelShipment("1234");

        Email email = new Outlook("Hello friend, I'm happy to write you.", "Email welcome");
        email.sendEmail(addressee,"Hello world");



    }
}
