public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina("Cantina do Inatel");
        
        // Criar 3 salgados da escolha
        Salgado salgado1 = new Salgado("Coxinha");
        Salgado salgado2 = new Salgado("Pastel");
        Salgado salgado3 = new Salgado("Empada");
        Salgado salgado4 = new Salgado("Esfiha");
        Salgado salgado5 = new Salgado("Kibe");
        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);
        cantina.addSalgado(salgado4);
        cantina.addSalgado(salgado5);

        Salgado salgadoExtra = new Salgado("Pão de Queijo");
        cantina.addSalgado(salgadoExtra);
        Salgado salgadoExtra2 = new Salgado("Bolinha de Queijo");
        cantina.addSalgado(salgadoExtra2);
        Salgado salgadoExtra3 = new Salgado("Risole");
        cantina.addSalgado(salgadoExtra3);
        Salgado salgadoExtra4 = new Salgado("Enroladinho");
        cantina.addSalgado(salgadoExtra4);
        Salgado salgadoExtra5 = new Salgado("Croissant");
        cantina.addSalgado(salgadoExtra5);
        Salgado salgadoExtra6 = new Salgado("Torta"); 
        cantina.addSalgado(salgadoExtra6);

        cantina.mostrainfo();
    }
}