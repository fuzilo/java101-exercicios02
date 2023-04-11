import javax.swing.JOptionPane;

public class CustoPiso {
    private Double comprimentoComodo;
    private Double larguraCOmodo;
    private Double precoporArea;
    private Double custoTotalComodo;

    public CustoPiso() {
        this(0.0,0.0,0.0,0.0);
    }

    public CustoPiso(Double comprimentoComodo, Double larguraCOmodo, Double precoporArea, Double custoTotalComodo) {
        this.comprimentoComodo = comprimentoComodo;
        this.larguraCOmodo = larguraCOmodo;
        this.precoporArea = precoporArea;
        this.custoTotalComodo = custoTotalComodo;
    }

    public Double getComprimentoComodo() {
        return comprimentoComodo;
    }

    public void setComprimentoComodo(Double comprimentoComodo) {
        this.comprimentoComodo = comprimentoComodo;
    }

    public Double getLarguraCOmodo() {
        return larguraCOmodo;
    }

    public void setLarguraCOmodo(Double larguraCOmodo) {
        this.larguraCOmodo = larguraCOmodo;
    }

    public Double getPrecoporArea() {
        return precoporArea;
    }

    public void setPrecoporArea(Double precoporArea) {
        this.precoporArea = precoporArea;
    }

    public Double getCustoTotalComodo() {
        return custoTotalComodo;
    }

    public void setCustoTotalComodo(Double custoTotalComodo) {
        this.custoTotalComodo = custoTotalComodo;
    }
    
    public void inserirValores(){

        setComprimentoComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite o Comprimento do Cômodo")));
        setLarguraCOmodo(Double.parseDouble(JOptionPane.showInputDialog("Digite a Largura do Cômodo")));
        setPrecoporArea(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço por área")));

    }

    public void calcularprecoArea(){
        this.setCustoTotalComodo(this.getComprimentoComodo()*this.getLarguraCOmodo()*this.getPrecoporArea());
        JOptionPane.showMessageDialog(null,"Cálculo Realizado");

    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null, "Comprimento:"+getComprimentoComodo()+"\n Largura:"+getLarguraCOmodo()+"\n Preço por Área:"+getPrecoporArea()+"\n Preço Total do Comodo:"+getCustoTotalComodo());
        
     
    }

    

}