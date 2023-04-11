import javax.swing.JOptionPane;

public class Vendedor {
    
    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private double salarioBase;
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    private double novoSalario;
    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }

    private double valorVendido;

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public Vendedor() {
        this ("string",0.0,0.0,0.0);
    }
    
    public Vendedor(String nome, double salarioBase, double novoSalario, double valorVendido) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.novoSalario = novoSalario;
        this.valorVendido = valorVendido;
    }

 
    public void entrarNome(){
        setNome(JOptionPane.showInputDialog("Digite o nome"));

    }

    public void entrarSalario(){
        setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Salário Base")));

    }

    public void entrarVenda(){
        setValorVendido(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor vendido")));

    }

    public Double calculoComissao(){
        this.setNovoSalario(((getValorVendido()*10)/100)+this.getSalarioBase());

        return this.getNovoSalario();
  
    }

    

}