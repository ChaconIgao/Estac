package estac;

import javax.swing.JOptionPane;

public class Estac {

    public static void main(String[] args) {

    Estac2 dados  = new Estac2();
    
        dados.setPlaca((JOptionPane.showInputDialog("Digite aqui a placa do carro: ")));
        dados.setModelo((JOptionPane.showInputDialog("O modelo do carro: ")));    
        dados.setHoraEntrada(Integer.parseInt(JOptionPane.showInputDialog("A hora que você entrou: ")));
        dados.setMinEntrada(Integer.parseInt(JOptionPane.showInputDialog("E os minutos: ")));
        dados.setHoraSaida(Integer.parseInt(JOptionPane.showInputDialog("Agora a hora que você saiu: ")));
        dados.setMinSaida(Integer.parseInt(JOptionPane.showInputDialog("E os minutos: ")));
        dados.setPreco(Integer.parseInt(JOptionPane.showInputDialog("Insira o preço por hora no estacionamento: ")));
  
    double total = dados.conta(dados.getHoraEntrada(),dados.getMinEntrada(),dados.getHoraSaida(),dados.getMinSaida());
    dados.notaFiscal(total, total);
    
        JOptionPane.showMessageDialog(null,"Nota Fiscal" + "\n" + "Placa: "+ dados.getPlaca() + "\n" + "Modelo: "
        + dados.getModelo() + "\n" + "Horário que entrou: " + dados.getHoraEntrada() + "h e " + dados.getMinEntrada()
        + " min." + "\n" + "Horário saida: " + dados.getHoraSaida() + "h e " + dados.getMinSaida() + " min." + "\n" 
        + "Tempo no estacionado: " + dados.tempo + "h " + "\n" + "Valor: R$ " + dados.total + "\n" 
        + "Obrigado e volte sempre");
             
    }  
}