package com.iphonesimulator;

public class FaceID {
    private boolean rostoCadastrado = false;

    public void cadastrarRosto() {
        rostoCadastrado = true;
        System.out.println("Rosto cadastrado com sucesso!");
    }

    public void desbloquear() {
        if (rostoCadastrado) {
            System.out.println("Face reconhecida. iPhone desbloqueado!");
        } else {
            System.out.println("Nenhum rosto cadastrado. Acesso negado.");
        }
    }
}
