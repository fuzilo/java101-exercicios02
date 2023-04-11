import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) throws Exception {
        
        Vendedor vend = new Vendedor();

        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção desejada\n"+ "1 - Nome\n 2 - Salário Base\n 3 - Valor Vendido\n 4 - Calcular Comissão\n 0 - Sair"));

            switch (op){
                case 1:
                    vend.entrarNome();
                    break;
                case 2:
                    vend.entrarSalario();
                   break;
                case 3:
                    vend.entrarVenda();
                    break;  
                case 4:
                    vend.calculoComissao();
                    JOptionPane.showMessageDialog(null,"O vendedor "+vend.getNome()+ " teve salário final "+vend.getNovoSalario());
                    break;      
                    
            }

        }while (op!=0);
        
    }
}