import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Calculadora {
    
    private double n1;
    private double n2;
    private double r;

    public Calculadora() {
        this(0.0,0.0,0.0);
    }

    public Calculadora(double n1, double n2, double r) {
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public void somar(){
            setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor")));
            setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o Acréscimo")));
            setR(getN1()+getN2());
            JOptionPane.showMessageDialog(null, "O resultado da Soma é: " +getR());
            
                                        
    }
    
    public void subtrair(){
            setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o Minuendo")));
            setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o Subtractivo")));
            setR(getN1()-getN2());
            JOptionPane.showMessageDialog(null, "O resultado da Subtração é: "+ getR());
        
    }
    
    public void multiplicar(){
            setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o Multiplicando")));
            setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o Fator")));
            setR(getN1()*getN2());
            JOptionPane.showMessageDialog(null, "O resultado da Multiplicação é: "+getR());
        
    }
    
    public void dividir(){
            setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o Dividendo")));
            setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o Divisor")));
            setR(getN1()/getN2());
            JOptionPane.showMessageDialog(null, "O resultado da Divisão é:" +getR());
    }
    
}