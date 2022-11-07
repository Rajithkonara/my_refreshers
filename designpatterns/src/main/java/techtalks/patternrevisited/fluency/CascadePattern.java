package techtalks.patternrevisited.fluency;

public class CascadePattern {

    public static void main(String[] args) {
        new CascadeMailer()
              .from("builder@agiledeveloper.com")
              .to("venkats@agiledeveloper.com")
              .subject("Your code sucks")
              .body("...details...")
              .send();
    }


}

class CascadeMailer {
    public CascadeMailer from(String addr) {
        System.out.println("from...");
        return this;
    }

    public CascadeMailer to(String addr) {
        System.out.println("to...");
        return this;
    }

    public CascadeMailer subject(String line) {
        System.out.println("subject...");
        return this;
    }

    public CascadeMailer body(String content) {
        System.out.println("body...");
        return this;
    }

    public void send() {
        System.out.println("sending...");
    }
}