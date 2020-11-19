public class main {
    public static void main(String[] args) {
        Client Rick= new Client(new Proxy(new Service()));
        Rick.pressButton();
    }
}
