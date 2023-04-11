import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Instanciado o objeto cli, para chamar o método Cliente
        Cliente cli=new Cliente();
        // designei uma variável op para lidar com a entrada do usuário
        int op;

        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção desejada\n 1 - Cadastrar Cliente \n 2 - Listar Cliente \n 3 - Calcular limite de Crédito \n 0 - Sair"));
            switch(op){
                case 1:
                cli.cadastrarCliente();
                break;
                case 2:
                cli.listarCliente();
                break;
                case 3:
                cli.calcularLimiteCredito();
                break;
                
            }

        }while (op!=0);
     
    }
}
