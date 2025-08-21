package FactoryMethod.exercicios;

public class NotificacaoSMS implements Notificacao{
    @Override
    public void enviarNotificacao(String texto) {
        System.out.println("ENVIANDO O TEXTO: " + texto + "VIA SMS");
    }
}
