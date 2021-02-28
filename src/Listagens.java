
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leonardo Gabriel
 */
public class Listagens {

    static ExportarImportar ex = new ExportarImportar();

    public List<Espaco> comboBoxEspaco() {

        List<Espaco> lista = new ArrayList<Espaco>();
        try {
            lista = ex.importarEspaco(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    public List<Sala> comboBoxSala() {

        List<Sala> lista = new ArrayList<Sala>();
        try {
            lista = ex.importarSala(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    public List<Pessoa> comboBoxPessoa() {

        List<Pessoa> lista = new ArrayList<Pessoa>();
        try {
            lista = ex.importarPessoa(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
    
    public String consultaEspaco(String nome){
        List<Espaco> lista = new ArrayList<Espaco>();
        try {
            lista = ex.importarEspaco(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for(Espaco espaco : lista){
            if(espaco.getNome().equals(nome)){
                return espaco.toString();
            }
        }
       
        return "nome";
    }
    
     public String consultaSala1(String nome){
        List<Sala> lista = new ArrayList<Sala>();
        try {
            lista = ex.importarSala(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for(Sala sala : lista){
            if(sala.getNome().equals(nome)){
                return sala.toString1();
            }
        }
       
        return "nome";
    }
     
      public String consultaSala2(String nome){
        List<Sala> lista = new ArrayList<Sala>();
        try {
            lista = ex.importarSala(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for(Sala sala : lista){
            if(sala.getNome().equals(nome)){
                return sala.toString2();
            }
        }
       
        return "nome";
    }
      
       public String consultaPessoa(String nome){
           
        StringBuilder string = new StringBuilder();
        List<Sala> lista = new ArrayList<Sala>();
        List<Espaco> lista1 = new ArrayList<Espaco>();
        try {
            lista = ex.importarSala(lista);
            lista1 = ex.importarEspaco(lista1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for(Sala sala : lista){
            for(Pessoa pessoa : sala.getListaPessoas1()){
                if((pessoa.getNome() + " " + pessoa.getSobrenome()).equals(nome)){
                    string.append("Sala 1ª Etapa: " + sala.getNome() + "\n");
                    break;
                }
            }
            for(Pessoa pessoa : sala.getListaPessoas2()){
                if((pessoa.getNome() + " " + pessoa.getSobrenome()).equals(nome)){
                    string.append("Sala 2ª Etapa: " + sala.getNome() + "\n");
                    break;
                }
            }
        }
        
        for(Espaco espaco : lista1){
            for(Pessoa pessoa : espaco.getListaPessoas1()){
                if((pessoa.getNome() + " " + pessoa.getSobrenome()).equals(nome)){
                    string.append("Espaço: " + espaco.getNome() + "\n");
                    break;
                }
            }
        }
       
        return string.toString();
    }

}
