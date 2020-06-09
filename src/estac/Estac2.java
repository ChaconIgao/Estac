package estac;

public class Estac2 {
          
     public String placa;
     public String modelo;
     public double entrada_hora;
     public double entrada_min;
     public double saida_hora;
     public double saida_min;
     public double preco;
     public double tempo;
     public double total;
      
     public String getPlaca(){
     return placa;     
    }
    
     public void setPlaca(String placa){
     this.placa=placa;     
    }
    
     public String getModelo(){
     return modelo;     
     }
    
     public void setModelo(String modelo){
     this.modelo=modelo;     
     }
    
     public double getHoraEntrada(){
     return entrada_hora;     
     }
    
     public void setHoraEntrada(double hora_entrada){
     this.entrada_hora=hora_entrada;     
     }
    
     public double getMinEntrada(){
     return entrada_min;     
     }
     
     public void setMinEntrada(double min_entrada){
     this.entrada_min=min_entrada;     
     }
    
     public double getHoraSaida(){
     return saida_hora;    
     }
    
     public void setHoraSaida(double hora_saida){
     this.saida_hora=hora_saida;   
     } 
    
     public double getMinSaida(){
     return saida_min;   
     }
    
     public void setMinSaida(double min_saida){
     this.saida_min=min_saida;    
     }
    
     public double getPreco(){
     return preco;    
     }
    
     public void setPreco(double preco){
     this.preco=preco;
     }
      public double conta(double hora_entrada, double min_entrada, double hora_saida, double c){
    double entrada = hora_entrada + min_entrada/60;
    double saida = hora_saida + hora_saida/60;
    double time = Math.ceil(saida - entrada); 
    return time;    
    }
    
    public double notaFiscal(double tempo, double preco){
    double total = tempo*preco;
    return total;
    }
   
}
