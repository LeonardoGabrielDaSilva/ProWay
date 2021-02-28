
import java.util.ArrayList;
import java.util.List;



public class Sala {
	
    private String nome;
    private int lotacao;       
    private List<Pessoa> listaPessoas1 = new ArrayList<Pessoa>();
    private List<Pessoa> listaPessoas2 = new ArrayList<Pessoa>();
	
    public Sala() {
    }
    
    public Sala(String nome, int lotacao) {
    	setNome(nome);
    	setLotacao(lotacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public List<Pessoa> getListaPessoas1() {
        return listaPessoas1;
    }

    public void setListaPessoas1(List<Pessoa> listaPessoas1) {
        this.listaPessoas1 = listaPessoas1;
    }

    public List<Pessoa> getListaPessoas2() {
        return listaPessoas2;
    }

    public void setListaPessoas2(List<Pessoa> listaPessoas2) {
        this.listaPessoas2 = listaPessoas2;
    }

    public String toString1() {
        StringBuilder string = new StringBuilder();
        int x = 0;
        for(Pessoa pessoa : listaPessoas1){
            x = x+1;
            string.append(x + "." + " ");
            string.append(pessoa.getNome() + " " + pessoa.getSobrenome());
            string.append("\n");
        }
        return string.toString();
    }
    
    public String toString2() {
        StringBuilder string = new StringBuilder();
        int x = 0;
        for(Pessoa pessoa : listaPessoas2){
            x = x+1;
            string.append(x + "." + " ");
            string.append(pessoa.getNome() + " " + pessoa.getSobrenome());
            string.append("\n"); 
        }
        return string.toString();
    }

   
	
    
	
	

}
