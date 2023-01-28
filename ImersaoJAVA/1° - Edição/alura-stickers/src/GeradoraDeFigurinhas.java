import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {
    public void cria(InputStream inputStream, String nomeArquivo) throws Exception {
        //Leitura da Imagem
        //InputStream inputStream = new FileInputStream(new File("entrada/filme.jpg"));
        //InputStream inputStream = new URL("https://imersao-java-apis.s3.amazonaws.com/TopMovies_1.jpg").openStream();
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        //Criar nova imagem em memória com trasparência e tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200; //tamanho anterior + 200px
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        //Copiar a imagem original para a nova imagem (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        // Configurar Fonte
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 32);
        graphics.setFont(fonte);
        graphics.setColor(Color.YELLOW);
        //Escrever uma frase na nova imagem
        graphics.drawString("Topzera", 100, novaAltura - 100);

        //Escrever a nova imagem em um arquivo
        if (!new File("saida/").exists()) {
            new File("saida/").mkdir();
            ImageIO.write(novaImagem, "png", new File(nomeArquivo));
        }
        else{
            ImageIO.write(novaImagem, "png", new File(nomeArquivo));
        } 
        
        
    }
}
