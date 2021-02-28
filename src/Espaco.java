
import java.util.ArrayList;
import java.util.List;



public class Espaco {
	
    private String nome;
    private int locacao;
    private List<Pessoa> listaPessoas1 = new ArrayList<Pessoa>();

    
    public Espaco() {
		
    }
    public Espaco(String nome, int locacao) {
	setNome(nome);
        setLocacao(locacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pessoa> getListaPessoas1() {
        return listaPessoas1;
    }

    public void setListaPessoas1(List<Pessoa> lista1) {
        this.listaPessoas1 = lista1;
    }

    public int getLocacao() {
        return locacao;
    }

    public void setLocacao(int locacao) {
        this.locacao = locacao;
    }

    


    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        int x = 0;
        for(Pessoa pessoa :listaPessoas1){
            x = x+1;
            string.append(x + "." + " ");
            string.append(pessoa.getNome() + " " + pessoa.getSobrenome());
            string.append("\n");
        }
        return string.toString();
    }
    
    
}
