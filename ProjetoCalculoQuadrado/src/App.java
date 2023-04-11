import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        Quadrado quad=new Quadrado();

        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("Escolha as opções:\n 1 - Inserir o comprimento do Quadrado \n 2 - Calcular a Área do Quadrado \n 3 - Calcular o perímetro do Quadrado \n 4 - Mostrar Valores \n 0 - Sair"));

            switch(op){
                case 1:
                quad.inserirLado();
                break;

                case 2:
                quad.calcularArea(null);
                JOptionPane.showMessageDialog(null,"Área Calculada");
                break;

                case 3:
                quad.calcularPerimetro(null);
                JOptionPane.showMessageDialog(null,"Perimetro Calculado");
                break;

                case 4:
                quad.mostrarValores();
                break;
            }


        }while (op!=0);


    }
}