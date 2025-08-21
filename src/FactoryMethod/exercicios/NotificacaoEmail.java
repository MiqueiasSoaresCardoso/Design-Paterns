package FactoryMethod.exercicios;

public class NotificacaoEmail implements Notificacao {
    private String destinatario;
    private String assunto;
    private String corpo;

    public NotificacaoEmail(String destinatario, String assunto, String corpo) {
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.corpo = corpo;
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("----- Preparando E-mail para envio -----");
        System.out.println("Destinatário: " + this.destinatario);
        System.out.println("Assunto: " + this.assunto);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Corpo do E-mail: " + this.corpo);
    }
}
