package FactoryMethod.exercicios;

public class EmailFactory extends NotificacaoFactory{
    private String destinatario;
    private String assunto;
    private String corpo;

    public EmailFactory(String destinatario, String assunto, String corpo) {
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.corpo = corpo;
    }

    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoEmail(this.destinatario, this.assunto, this.corpo);
    }

}
