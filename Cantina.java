import java.util.ArrayList;

public class Cantina {
    public String nome;
    private ArrayList<Salgado> salgados;
    
    public Cantina(String nome) {
        this.nome = nome;
        this.salgados = new ArrayList<>();
    }
    
    public void addSalgado(Salgado novoSalgado) {
        salgados.add(novoSalgado);
    }
    
    public void mostrainfo() {
        System.out.println("Cantina: " + nome);
        System.out.println("Salgados disponíveis:");
        for (int i = 0; i < salgados.size(); i++) {
            System.out.println((i + 1) + ". " + salgados.get(i).nome);
        }
    }
}