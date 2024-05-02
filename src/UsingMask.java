import javax.swing.*;
import java.awt.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class UsingMask extends JFrame{
    JLabel txtCpf, txtTel, txtData;
    JFormattedTextField cpf, tel, data;
    MaskFormatter maskCpf, maskTel, maskData;

    public UsingMask() {
        super("Exmplo de campos usando máscara");
        Container screen = getContentPane();
        setLayout(null);

        // Creating field titles
        txtCpf = new JLabel("CPF");
        txtTel = new JLabel("Telefone");
        txtData = new JLabel("Data");

        // Defining position and size
        txtCpf.setBounds(50, 40, 100, 20);
        txtTel.setBounds(50, 80, 100, 20);
        txtData.setBounds(50, 120, 100, 20);

        // Creating the mask
        try{
            maskCpf = new MaskFormatter("######-#####");
            maskTel = new MaskFormatter("(+##) ####-####");
            maskData = new MaskFormatter("##/##/####");

            maskCpf.setPlaceholderCharacter('_');
            maskTel.setPlaceholderCharacter('_');
            maskData.setPlaceholderCharacter('_');
        }
        catch (ParseException excp){}

        // Creating the field and applying the mask
        cpf = new JFormattedTextField(maskCpf);
        tel = new JFormattedTextField(maskTel);
        data = new JFormattedTextField(maskData);

        // Defining position and size
        cpf.setBounds(150,40,100,20);
        tel.setBounds(150,80,100,20);
        data.setBounds(150,120,100,20);

        // Adding elements in the screen
        screen.add(txtCpf);
        screen.add(txtTel);
        screen.add(txtData);

        screen.add(cpf);
        screen.add(tel);
        screen.add(data);

        // ...
        setSize(400,250);
        setVisible(true);
    }

    public static void main(String args[]) {
        UsingMask app = new UsingMask();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
