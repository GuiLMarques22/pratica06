import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String dataCriacao,nomeUsuario,dataNascimento,senha;
        String dataPublicacao,textoPublicacao,linkMidia;

        dataCriacao = JOptionPane.showInputDialog("Digite a data de Criação da Rede Social ");
        nomeUsuario = JOptionPane.showInputDialog("Digite o nome do usuário ");
        dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento ");
        senha = JOptionPane.showInputDialog("Digite a senha ");
        RedeSocial redeSocial1 = new RedeSocial(dataCriacao,nomeUsuario,dataNascimento,senha);
        Publicacao publi1;
        ArrayList<Publicacao>publi = new ArrayList<>();
        for(int i=0;i<3;i++){
            dataPublicacao = JOptionPane.showInputDialog("Digite a data da Publicação");
            textoPublicacao = JOptionPane.showInputDialog("Digite o texto");
            linkMidia = JOptionPane.showInputDialog("digite o link");
            publi1 = new Publicacao(dataPublicacao,textoPublicacao,linkMidia);
            publi.add(publi1); // adiciona o objeto no arraylist
            redeSocial1.inserePublicacao(publi1);//adiciona o objeto na rede social

            redeSocial1.imprimePublicacoes();
        }


    }
}
