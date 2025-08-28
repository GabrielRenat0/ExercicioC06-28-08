public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina("Cantina do Inatel");

        Salgado salgado1 = new Salgado("Coxinha");
        Salgado salgado2 = new Salgado("Pastel");
        Salgado salgado3 = new Salgado("Empada");

        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        cantina.mostrainfo();
    }
}