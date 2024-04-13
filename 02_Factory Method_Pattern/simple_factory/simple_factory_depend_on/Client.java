package simple_factory.simple_factory_depend_on;

public class Client {
    public static void main(String[] args) {
        Sopt server = new Server();
        Sopt ios = new Ios();

        server.printLanguage();
        ios.printLanguage();
    }
}
