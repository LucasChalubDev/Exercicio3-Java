package exe03;

import javax.swing.JOptionPane;

public class Exe03 {

    public static void main(String[] args) {
        String numeroS,tabuada ="";
        int numero;
        numeroS = JOptionPane.showInputDialog("Digite um numero");
        numero = Integer.parseInt(numeroS);
        for (int i=1; i <= numero; i++){
            tabuada += i + " * " + numero + " = " +  (i * numero) + "\n";
        }
        JOptionPane.showMessageDialog(null, tabuada);
    }
}

