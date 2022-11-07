package techtalks.patternrevisited.fluency;

import java.util.function.Consumer;

public class FunctionalStyle {

    public static void main(String[] args) {
        ModernMailer.send(mailer ->
              mailer
                    .from("builder@agiledeveloper.com")
                    .to("venkats@agiledeveloper.com")
                    .subject("Your code sucks")
                    .body("...details..."));
    }

}

class ModernMailer {

    public static void send(Consumer<ModernMailer> block) {
        ModernMailer mailer = new ModernMailer();
        block.accept(mailer);
        System.out.println("sending...");
    }

    public ModernMailer from(String addr) {
        System.out.println("from...");
        return this;
    }

    public ModernMailer to(String addr) {
        System.out.println("to...");
        return this;
    }

    public ModernMailer subject(String line) {
        System.out.println("subject...");
        return this;
    }

    public ModernMailer body(String content) {
        System.out.println("body...");
        return this;
    }
}
