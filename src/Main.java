

import com.iphonesimulator.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== iPhone Simulator ===");

        // Música
        Music musica = new Music();
        musica.tocar("Shape of You");
        musica.pausar();

        // Chamadas
        Call chamada = new Call();
        chamada.fazerChamada("1234-5678");
        chamada.encerrarChamada();

        // Internet
        Internet internet = new Internet();
        internet.conectar();
        internet.acessarSite("https://www.google.com");
        internet.desconectar();

        // Mensagens
        Message mensagem = new Message();
        mensagem.enviarMensagem("1234-5678", "Olá!");
        mensagem.receberMensagem("1234-5678", "Oi, tudo bem?");
        mensagem.mostrarHistorico();

        // Câmera
        Camera camera = new Camera();
        camera.tirarFoto();
        camera.gravarVideo();
        camera.mostrarGaleria();

        // Aplicativos
        StoreApps loja = new StoreApps();
        loja.instalarApp("Instagram");
        loja.abrirApp("Instagram");

        // Bateria
        Battery bateria = new Battery();
        bateria.mostrarNivelBateria();
        bateria.usar(10);
        bateria.carregar(20);

        // Face ID
        FaceID faceID = new FaceID();
        faceID.cadastrarRosto();
        faceID.desbloquear();

        // Siri
        Siri siri = new Siri();
        siri.ouvirComando("Abrir calendário");
        siri.responder("Qual é o clima de hoje?");

        // Notificações
        Notification notificacao = new Notification();
        notificacao.adicionarNotificacao("Nova mensagem do WhatsApp");
        notificacao.mostrarNotificacoes();
        notificacao.limparNotificacoes();

        // Relógio e Alarme
        Clock relogio = new Clock();
        relogio.definirAlarme(7, 30);
        relogio.mostrarHoraAtual();
        relogio.verificarAlarme();

        // Calendário
        Calendar calendario = new Calendar();
        calendario.adicionarEvento(LocalDate.now(), "Reunião de equipe");
        calendario.mostrarEventos();
    }
}
