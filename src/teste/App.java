package teste;

import manipuladorDeImagens.ManipuladorImagem;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("teste");
        ManipuladorImagem imagemTeste = new ManipuladorImagem.Builder()
            .load("imagem.jpg")
            .applyGrayscaleFilter()
            .build();

        imagemTeste.saveImage("imagem_cinza_teste.jpg", "jpg");
        System.out.println("concluido");
    }
}
