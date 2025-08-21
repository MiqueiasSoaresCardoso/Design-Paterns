package FactoryMethod;

import FactoryMethod.exercicios.EmailFactory;
import FactoryMethod.exercicios.Notificacao;
import FactoryMethod.exercicios.NotificacaoFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String destinatario = "miqueiassoares@gmail.com";
        String assunto = "Confirmação de Inscrição";
        String corpo = "Olá, seu cadastro foi realizado com sucesso!";
        String mensagem = "Finalizando envio do e-mail de confirmação.";

        //O cliente agora passa os dados para a fabrica
        NotificacaoFactory fabricaemail = new EmailFactory(destinatario,assunto,corpo);

        //a fabrica retorna um objeto email já pronto
        Notificacao email = fabricaemail.criarNotificacao();

        email.enviarNotificacao(mensagem);





    }
}