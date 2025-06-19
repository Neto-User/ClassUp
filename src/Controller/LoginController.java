/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import classup.View.Login;
import classup.View.Register;

/**
 *
 * @author n3to
 */
public class LoginController {

    private final Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    
    public void abrirTelaCadastro() {
        Register telaCadastro = new Register();
        telaCadastro.setVisible(true);
        view.dispose();
    }
    
    
    public void entrarNoSistema() {
        // Pegar o que o Usuário Escreve
        // Pesquisar Usuário no Banco
        // Verficar se o Usuario Existe
        // Usuario não existe exibe "Usuário ou senha Inválido"
    }
    
    
    public void executei() {
    
        this.view.exibeMensagem("mensagem");
    }
    
}
