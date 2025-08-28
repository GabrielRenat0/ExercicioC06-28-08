public class Cantina {
    public String nome;
    private Salgado[] salgados = new Salgado[10];
    private int numSalgados = 0; 
    
    public Cantina(String nome) {
        this.nome = nome;
    }
    
    public void addSalgado(Salgado novoSalgado) {
        if (numSalgados < salgados.length) {
            salgados[numSalgados] = novoSalgado;
            numSalgados++;
        } else {
            System.out.println("Não é possível adicionar mais salgados. Limite atingido.");
        }
    }
    
    public void mostrainfo() {
        System.out.println("Cantina: " + nome);
        System.out.println("Salgados disponíveis (" + numSalgados + "):");
        
        if (numSalgados == 0) {
            System.out.println("Nenhum salgado cadastrado");
        } else {
            for (int i = 0; i < numSalgados; i++) {
                System.out.println((i + 1) + ". " + salgados[i].nome);
            }
        }
    }
}