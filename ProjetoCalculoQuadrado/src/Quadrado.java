import javax.swing.JOptionPane;

public class Quadrado {

    private double ladoA;
    private double areaQuadrado;
    private double perimetroQuadrado;

    public Quadrado() {
        this(0.0,0.0,0.0);
    }

    public Quadrado(double lado, double areaQuadrado, double perimetroQuadrado) {
        this.ladoA = lado;
        this.areaQuadrado = areaQuadrado;
        this.perimetroQuadrado = perimetroQuadrado;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLado(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getAreaQuadrado() {
        return areaQuadrado;
    }

    public void setAreaQuadrado(double areaQuadrado) {
        this.areaQuadrado = areaQuadrado;
    }

    public double getPerimetroQuadrado() {
        return perimetroQuadrado;
    }

    public void setPerimetroQuadrado(double perimetroQuadrado) {
        this.perimetroQuadrado = perimetroQuadrado;
    }

    public void inserirLado(){
            setLado(Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do lado do quadrado.")));

    }
    
    public double calcularArea(Double ladoA){
setAreaQuadrado(Math.pow(getLadoA(),2));

            
        return this.getAreaQuadrado();
    }

    public double calcularPerimetro(Double ladoA){
            setPerimetroQuadrado(4*getLadoA());
        return this.getPerimetroQuadrado();
    }

    public void mostrarValores(){

        JOptionPane.showMessageDialog(null, "O lado do Quadrado mede:"+getLadoA()+ " metros."+"\n A área deste Quadrado mede"+getAreaQuadrado()+" m²."+"\n O Perímetro deste quadrado mede:"+getPerimetroQuadrado()+" metros.");


    }
    

    
}