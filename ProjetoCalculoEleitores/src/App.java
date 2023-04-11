import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       
        Eleitores eleit = new Eleitores();

        int op;

        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("Escolha dentre as opções:\n 1 - Inserir Quantidade de Votos \n 2 - Calcular Total de Eleitores \n 3 - Calcular o Percentual de Votos \n 4 - Mostrar o Percentual de Votos \n 0 - Sair"));

            switch(op){
                case 1:
                eleit.inserirQtdVotos();
                break;
                case 2:
                eleit.calcularTotalEleitores();
                break;
                case 3:
                eleit.calcularPercentualVotos();
                break;
                case 4:
                eleit.mostrarPercentualVotos();
                break 
               ;


            }



        }while (op!=0);



    }
}