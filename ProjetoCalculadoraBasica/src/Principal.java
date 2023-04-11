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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
            
        Calculadora cal = new Calculadora();
        
        int op;
        
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("Escolha a Operação Desejada:\n"
                    + " 1 - Somar \n 2 - Subtrair \n 3 - Multiplicar\n 4 - Dividir \n 0 - Sair"));
        
            switch(op){
                case 1:
                    cal.somar();
                    break;
                case 2:
                    cal.subtrair();
                    break;
                case 3:
                    cal.multiplicar();
                    break;
                case 4:
                    cal.dividir();
                    break;
            
            }
        
        }while (op !=0);
        
        
    }
    
}