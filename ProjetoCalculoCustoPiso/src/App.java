import javax.swing.JOptionPane;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        CustoPiso custo=new CustoPiso();

        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n 1 - Inserir Valores do Cômodo e Material \n 2 - Calcular o Preço por Área \n 3 - Mostrar Valores \n 0 - Sair"));

            switch(op){

                case 1:
                    custo.inserirValores();
                    break;
                case 2:    
                    custo.calcularprecoArea();
                    break;
                case 3 :
                    custo.mostrarValores();
                    break;    

            }



        }while (op!=0);

   



    }
}