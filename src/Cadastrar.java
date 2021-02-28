
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
public class Cadastrar {

    static ExportarImportar ex = new ExportarImportar();

    public boolean CadastrarPessoa(String nome, String sobrenome) {
        List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
        try {
            listaPessoa = ex.importarPessoa(listaPessoa);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Pessoa pessoa = new Pessoa(nome, sobrenome);
        listaPessoa.add(pessoa);
        if (!atribuirSala(pessoa)) {
            return false;
        }
        if (!atribuirEspaco(pessoa)) {
            return false;
        }

        try {
            ex.exportarPessoa(listaPessoa);
        } catch (IOException e) {
            e.printStackTrace();
        }
        redistribuirSala2();
        return true;
    }

    public boolean CadastrarSala(String nome, int lotacao) {
        List<Sala> lista = new ArrayList<Sala>();
        try {
            lista = ex.importarSala(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Sala sala = new Sala(nome, lotacao);
        lista.add(sala);

        try {
            ex.exportarSala(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public boolean CadastrarEspaco(String nome, int locacao) {
        List<Espaco> lista = new ArrayList<Espaco>();
        try {
            lista = ex.importarEspaco(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Espaco espaco = new Espaco(nome, locacao);
        lista.add(espaco);
        try {
            ex.exportarEspaco(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public boolean atribuirSala(Pessoa pessoa) {
        List<Sala> lista = new ArrayList<Sala>();
        List<Pessoa> lista1 = new ArrayList<Pessoa>();
        boolean adicionado = true;

        try {
            lista = ex.importarSala(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Sala sala : lista) {
            if (sala.getListaPessoas1().size() < sala.getLotacao()) {
                lista1 = sala.getListaPessoas1();
                for (Sala sala2 : lista) {
                    List<Pessoa> lista2 = sala2.getListaPessoas1();
                    if (((lista1.size()) != lista2.size()) && (lista2.size() < sala2.getLotacao())) {
                        lista2.add(pessoa);
                        sala2.setListaPessoas1(lista2);
                        adicionado = false;
                        break;
                    }
                }
                if (adicionado) {
                    lista1.add(pessoa);
                    sala.setListaPessoas1(lista1);
                    adicionado = false;
                    break;
                }
                break;
            }

        }
        if (adicionado) {
            return false;
        }

        try {
            ex.exportarSala(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public boolean atribuirSegundaSala(Pessoa pessoa) {
        List<Sala> lista = new ArrayList<Sala>();
        List<Pessoa> lista1 = new ArrayList<Pessoa>();
        boolean adicionado = true;

        try {
            lista = ex.importarSala(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Sala sala : lista) {
            if (sala.getListaPessoas2().size() < sala.getLotacao()) {
                lista1 = sala.getListaPessoas2();
                for (Sala sala2 : lista) {
                    List<Pessoa> lista2 = sala2.getListaPessoas2();
                    if (((lista1.size()) != lista2.size()) && (lista2.size() < sala2.getLotacao())) {
                        lista2.add(pessoa);
                        sala2.setListaPessoas2(lista2);
                        adicionado = false;
                        break;
                    }
                }
                if (adicionado) {
                    lista1.add(pessoa);
                    sala.setListaPessoas2(lista1);
                    adicionado = false;
                    break;
                }
                break;
            }

        }
        if (adicionado) {
            return false;
        }

        try {
            ex.exportarSala(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public boolean atribuirEspaco(Pessoa pessoa) {
        List<Espaco> lista = new ArrayList<Espaco>();
        List<Pessoa> lista1 = new ArrayList<Pessoa>();
        boolean adicionado = true;

        try {
            lista = ex.importarEspaco(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Espaco espaco : lista) {
            if (espaco.getListaPessoas1().size() < espaco.getLocacao()) {
                lista1 = espaco.getListaPessoas1();
                for (Espaco espaco2 : lista) {
                    List<Pessoa> lista2 = espaco2.getListaPessoas1();
                    if (((lista1.size()) != lista2.size()) && (lista2.size() < espaco2.getLocacao())) {
                        lista2.add(pessoa);
                        espaco2.setListaPessoas1(lista2);
                        adicionado = false;
                        break;
                    }
                }
                if (adicionado) {
                    lista1.add(pessoa);
                    espaco.setListaPessoas1(lista1);
                    adicionado = false;
                    break;
                }
                break;
            }

        }
        if (adicionado) {
            return false;
        }

        try {
            ex.exportarEspaco(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public boolean redistribuirSalas() {
        List<Sala> lista = new ArrayList<Sala>();
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

        try {
            lista = ex.importarSala(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Sala sala : lista) {
            for (Pessoa pessoa : sala.getListaPessoas1()) {
                listaPessoas.add(pessoa);
            }
            sala.setListaPessoas1(new ArrayList<Pessoa>());
        }
        try {
            ex.exportarSala(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Pessoa pessoa : listaPessoas) {
            atribuirSala(pessoa);
        }

        return true;
    }

    public boolean redistribuirSala2() {
        List<Sala> lista = new ArrayList<Sala>();
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

        try {
            lista = ex.importarSala(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Sala sala : lista) {
            for (Pessoa pessoa : sala.getListaPessoas1()) {
                listaPessoas.add(pessoa);
            }
            sala.setListaPessoas2(new ArrayList<Pessoa>());
        }
        try {
            ex.exportarSala(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.shuffle(listaPessoas);
        for (Pessoa pessoa : listaPessoas) {
            atribuirSegundaSala(pessoa);
        }

        return true;

    }

}
