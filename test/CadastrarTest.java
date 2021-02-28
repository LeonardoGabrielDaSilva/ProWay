/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Leonardo Gabriel
 */

public class CadastrarTest {
    
    @Before
    public void setUp() {
        String nome = "";
        int locacao = 5;
        Cadastrar instance = new Cadastrar();
        boolean result = instance.CadastrarEspaco(nome, locacao);
        nome = "";
        int lotacao = 5;
        result = instance.CadastrarSala(nome, lotacao);
        
    }
    
    public CadastrarTest() {
    }

    /**
     * Test of CadastrarEspaco method, of class Cadastrar.
     */
    @Test
    public void testCadastrarEspaco() {
        System.out.println("CadastrarEspaco");
        String nome = "";
        int locacao = 5;
        Cadastrar instance = new Cadastrar();
        boolean expResult = true;
        boolean result = instance.CadastrarEspaco(nome, locacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of CadastrarSala method, of class Cadastrar.
     */
    @Test
    public void testCadastrarSala() {
        System.out.println("CadastrarSala");
        String nome = "";
        int lotacao = 5;
        Cadastrar instance = new Cadastrar();
        boolean expResult = true;
        boolean result = instance.CadastrarSala(nome, lotacao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of CadastrarPessoa method, of class Cadastrar.
     */
    @Test
    public void testCadastrarPessoa() {
        System.out.println("CadastrarPessoa");
        String nome = "teste";
        String sobrenome = "teste";
        Cadastrar instance = new Cadastrar();
        boolean expResult = true;
        boolean result = instance.CadastrarPessoa(nome, sobrenome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of atribuirSala method, of class Cadastrar.
     */
    @Test
    public void testAtribuirSala() {
        System.out.println("atribuirSala");
        Pessoa pessoa = new Pessoa("nome", "sobrenome");
        Cadastrar instance = new Cadastrar();
        boolean expResult = true;
        boolean result = instance.atribuirSala(pessoa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of atribuirSegundaSala method, of class Cadastrar.
     */
    @Test
    public void testAtribuirSegundaSala() {
        System.out.println("atribuirSegundaSala");
        Pessoa pessoa = null;
        Cadastrar instance = new Cadastrar();
        boolean expResult = true;
        boolean result = instance.atribuirSegundaSala(pessoa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of atribuirEspaco method, of class Cadastrar.
     */
    @Test
    public void testAtribuirEspaco() {
        System.out.println("atribuirEspaco");
        Pessoa pessoa = null;
        Cadastrar instance = new Cadastrar();
        boolean expResult = true;
        boolean result = instance.atribuirEspaco(pessoa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of redistribuirSalas method, of class Cadastrar.
     */
    @Test
    public void testRedistribuirSalas() {
        System.out.println("redistribuirSalas");
        Cadastrar instance = new Cadastrar();
        boolean expResult = true;
        boolean result = instance.redistribuirSalas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of redistribuirSala2 method, of class Cadastrar.
     */
    @Test
    public void testRedistribuirSala2() {
        System.out.println("redistribuirSala2");
        Cadastrar instance = new Cadastrar();
        boolean expResult = true;
        boolean result = instance.redistribuirSala2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of verificarEspaco method, of class Cadastrar.
     */
}
