package FactoryMethod.exercicios;

public class Login {
    private Notificacao notificacao;

    public Login(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void recuperarLogin(String texto) {
        notificacao.enviarNotificacao(texto);
    }
}
