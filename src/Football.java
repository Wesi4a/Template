public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("Cricket game initalized");

    }

    @Override
    void startPlay() {
        System.out.println("Cricket game playing");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket game finished");
    }
}
