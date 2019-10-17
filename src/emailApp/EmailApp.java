package emailApp;

public class EmailApp {

    public static void main(String[] args){

        Email em1 = new Email("John","Smith");

        em1.setAlternateEmail("ass.poop@arse.bumhole.com");
        System.out.println(em1.getAlternateEmail());

        System.out.print(em1.showInfo());
    }

}
