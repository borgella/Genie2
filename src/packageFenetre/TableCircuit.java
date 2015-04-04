package packageFenetre;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TableCircuit extends JFrame {
	private static final long serialVersionUID = 1L;
		
	public TableCircuit() {
		CreerFenetre();
	}
	
	private void CreerFenetre(){
		setTitle("Table Circuit");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(700, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JTextArea textEntree = new JTextArea("E0");
		textEntree.setBounds(0, 0, 40, 20);
		getContentPane().add(textEntree);
		
		JTextArea textEntree1 = new JTextArea("E1");
		textEntree1.setBounds(60, 0, 40, 20);
		getContentPane().add(textEntree1);
		
		JTextArea textArea = new JTextArea("E2");
		textArea.setBounds(123, 0, 40, 20);
		getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea("E3");
		textArea_1.setBounds(193, 0, 40, 20);
		getContentPane().add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea("E4");
		textArea_2.setBounds(261, 0, 40, 20);
		getContentPane().add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea("E5");
		textArea_3.setBounds(338, 0, 40, 20);
		getContentPane().add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea("S0");
		textArea_4.setBounds(398, 0, 40, 20);
		getContentPane().add(textArea_4);
				
		setVisible(true);
		
	}
	
	public void closeTableCircuit(){
		dispose();
	}
}
