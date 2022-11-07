package techtalks.patternrevisited.fluency;

public class Verbose {

    public static void main(String[] args) {
        CascadeMailer mailer = new CascadeMailer();
        mailer.from("builder@agiledeveloper.com");
        mailer.to("venkats@agiledeveloper.com");
        mailer.subject("Your code sucks");
        mailer.body("...details...");
        mailer.send();
    }
}

class Mailer {
    public void from(String addr) {
        System.out.println("from...");
    }

    public void to(String addr) {
        System.out.println("to...");
    }

    public void subject(String line) {
        System.out.println("subject...");
    }

    public void body(String content) {
        System.out.println("body...");
    }

    public void send() {
        System.out.println("sending...");
    }
}
