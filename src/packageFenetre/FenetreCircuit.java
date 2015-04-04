package packageFenetre;
import packageCommande.AjouterCircuit;
import packageCommande.AjouterPortNor;
import packageCommande.AjouterPorteNot;
import packageCommande.AjouterEntreeCircuit;
import packageCommande.AjouterPorteAnd;
import packageCommande.AjouterPorteXnor;
import packageCommande.AjouterPorteXor;
import packageCommande.AjouterSortie;
import packageCommande.ChargerCircuit;
import packageCommande.NommerEntreCircuit;
import packageCommande.NommerSortie;
import packageCommande.SupprimerCircuit;
import packageCommande.SupprimerEntreCircuit;
import inf5153emf.Circuit;
import inf5153emf.CircuitLogic;

import java.awt.EventQueue;

import packageCommande.SauvegarderCircuit;
import packageCommande.AjouterPorteOr;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class FenetreCircuit extends JFrame {
	private static final long serialVersionUID = 1L;
	private final TableCircuit table;
	private JFrame frame;
	private String nom;
	public FenetreCircuit() {
		frame = new JFrame();
		nom = null;
		creerFenetre();
		table = new TableCircuit();
	}
	
	private void messageFermeture(){
		creerJframeFermeture();
			
	}
	
	public void creerJframeFermeture(){
		frame.setTitle("Question");
		frame.setVisible(true);
		frame.setSize(256,110);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
		JTextField question = new JTextField("Voulez vous vraiment Fermer la fenetre ?");
		question.setBounds(0,0,400,20);
		question.setEditable(false);
		
		
		frame.add(question);
		JButton boutonOui = new JButton("OUI");
		boutonOui.setBounds(35,40,60,30);
		boutonOui.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				table.closeTableCircuit();
				dispose();
				frame.dispose();
			}
			
		});
		frame.add(boutonOui);
		
		JButton boutonNon = new JButton("NON");
		boutonNon.setBounds(165,40,65,30);
		boutonNon.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
			
		});
		frame.add(boutonNon);
	}
	private void setNomCircuit(){
		JFrame frame = new JFrame();
		frame.setTitle("Nom Circuit");
		frame.setSize(270,130);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		
		JTextField text = new JTextField("Donnez un nom pour le circuit");
		text.setBounds(20,20,200,30);
		frame.getContentPane().add(text);
		text.setEditable(false);
		
		JTextField textarea = new JTextField();
		textarea.setBounds(20,60,100,30);
		frame.getContentPane().add(textarea);
		textarea.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				nom = e.getActionCommand();
				AjouterEntreeCircuit entreCircuit = new AjouterEntreeCircuit(nom);
				entreCircuit.execute();
				frame.dispose();
			}			
		});
	}
	
	private void creerFenetre(){
		setTitle("Circuit");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                	messageFermeture();
            
        }
    });
		setBounds(100, 100, 1000, 562);
		getContentPane().setLayout(null);
		
		JButton sauvegarder = new JButton("Sauvegarder");
		sauvegarder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SauvegarderCircuit sauvegarde = new SauvegarderCircuit();
				sauvegarde.execute();
			}
		});
		sauvegarder.setBounds(0,0, 180, 30);
		getContentPane().add(sauvegarder);
				
		JButton ajoutEntree = new JButton("Ajouter Entrée");
		ajoutEntree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNomCircuit();
			}
		});
		ajoutEntree.setBounds(0, 30, 180, 30);
		getContentPane().add(ajoutEntree);
		
		JButton nommerEntree = new JButton("Nommer Entrée");
		nommerEntree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNomCircuit();
			}
		});
		nommerEntree.setBounds(0, 60, 180, 30);
		getContentPane().add(nommerEntree);
		
		JButton supprimerEntree = new JButton("Supprimer Entrée");
		supprimerEntree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SupprimerEntreCircuit supentre = new SupprimerEntreCircuit();
				supentre.execute();
			}
		});
		supprimerEntree.setBounds(0, 90, 180, 30);
		getContentPane().add(supprimerEntree);
		
		JButton supprSortie = new JButton("Ajouter Sortie");
		supprSortie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjouterSortie sortie = new AjouterSortie();
				sortie.execute();
			}
		});
		supprSortie.setBounds(0, 120, 180, 30);
		getContentPane().add(supprSortie);
		
		JButton nommeSortie = new JButton("Nommer Sortie");
		nommeSortie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NommerSortie nomsortie = new NommerSortie();
				nomsortie.execute();
			}
		});
		nommeSortie.setBounds(0, 150, 180, 30);
		getContentPane().add(nommeSortie);
		
		JButton supprimerSortie = new JButton("Supprimer Sortie");
		supprimerSortie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		supprimerSortie.setBounds(0, 180, 180, 30);
		getContentPane().add(supprimerSortie);
		
		JButton ajouterCircuit = new JButton("Ajouter Circuit");
		ajouterCircuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjouterCircuit ajoutCircuit = new AjouterCircuit();
				ajoutCircuit.execute();
			}
		});
		ajouterCircuit.setBounds(0, 210, 180, 30);
		getContentPane().add(ajouterCircuit);
		
		JButton chargerCircuit = new JButton("Charger Circuit");
		chargerCircuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChargerCircuit chargercircuit = new ChargerCircuit();
				chargercircuit.execute();
			}
		});
		chargerCircuit.setBounds(0, 240, 180, 30);
		getContentPane().add(chargerCircuit);
		
		JButton nommerCircuit = new JButton("Nommer Circuit");
		nommerCircuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		nommerCircuit.setBounds(0, 270, 180, 30);
		getContentPane().add(nommerCircuit);
		
		JButton supprimerCircuir = new JButton("Supprimer Circuit");
		supprimerCircuir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SupprimerCircuit supcircuit = new SupprimerCircuit();
				supcircuit.execute();
			}
		});
		supprimerCircuir.setBounds(0, 300, 180, 30);
		getContentPane().add(supprimerCircuir);
		
		JButton porteAnd = new JButton("Porte AND");
		porteAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjouterPorteAnd porteAND = new AjouterPorteAnd();
				porteAND.execute();
			}
		});
		porteAnd.setBounds(0, 330, 180, 30);
		getContentPane().add(porteAnd);
		
		JButton porteOr = new JButton("Porte OR");
		porteOr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjouterPorteOr porteOR = new AjouterPorteOr();
				porteOR.execute();
			}
		});
		porteOr.setBounds(0, 360, 180, 30);
		getContentPane().add(porteOr);
		
		JButton porteNot = new JButton("Porte NOT");
		porteNot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjouterPorteNot porteNOT = new AjouterPorteNot();
				porteNOT.execute();
			}
		});
		porteNot.setBounds(0, 390, 180, 30);
		getContentPane().add(porteNot);
		
		JButton porteNand = new JButton("Porte NAND");
		porteNand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		porteNand.setBounds(0, 420, 180, 30);
		getContentPane().add(porteNand);
		
		JButton portNor = new JButton("Porte NOR");
		portNor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjouterPortNor portenor = new AjouterPortNor();
				portenor.execute();
			}
		});
		portNor.setBounds(0, 450, 180, 30);
		getContentPane().add(portNor);
		
		JButton porteXor = new JButton("Porte XOR");
		porteXor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjouterPorteXor portexor = new AjouterPorteXor();
				portexor.execute();
			}
		});
		porteXor.setBounds(0, 480, 180, 30);
		getContentPane().add(porteXor);
		
		JButton porteXnor = new JButton("Porte XNOR");
		porteXnor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjouterPorteXnor portexnor = new AjouterPorteXnor();
				portexnor.execute();
			}
		});
		porteXnor.setBounds(0, 510, 180, 33);
		getContentPane().add(porteXnor);
		
		JTextArea textEntree = new JTextArea("Entrée");
		textEntree.setBounds(240, 26, 200, 30);
		getContentPane().add(textEntree);
		
		JTextArea textEntree1 = new JTextArea("Entrée");
		textEntree1.setBounds(240, 90, 200, 30);
		getContentPane().add(textEntree1);
		
		JTextArea textEntree2 = new JTextArea("Entrée");
		textEntree2.setBounds(240, 158, 200, 30);
		getContentPane().add(textEntree2);
		
		JTextArea textEntree3 = new JTextArea("Entrée");
		textEntree3.setBounds(240, 220, 200, 30);
		getContentPane().add(textEntree3);
		
		JTextArea textEntree4 = new JTextArea("Entrée");
		textEntree4.setBounds(240, 280, 200, 30);
		getContentPane().add(textEntree4);
		
		JTextArea textePorte = new JTextArea("Porte");
		textePorte.setBounds(495, 30, 200, 30);
		getContentPane().add(textePorte);
		
		JTextArea textePorte1 = new JTextArea("Porte");
		textePorte1.setBounds(495, 90, 200, 30);
		getContentPane().add(textePorte1);
		
		JTextArea textePorte2 = new JTextArea("Porte");
		textePorte2.setBounds(495, 158, 200, 30);
		getContentPane().add(textePorte2);
		
		JTextArea textePorte3 = new JTextArea("Porte");
		textePorte3.setBounds(495, 220, 200, 35);
		getContentPane().add(textePorte3);
		
		JTextArea textePorte4 = new JTextArea("Porte");
		textePorte4.setBounds(495, 280, 200, 30);
		getContentPane().add(textePorte4);
		
		JTextArea texteSortie = new JTextArea("Sortie");
		texteSortie.setBounds(763, 30, 200, 30);
		getContentPane().add(texteSortie);
		
		JTextArea texteSortie1 = new JTextArea("Sortie");
		texteSortie1.setBounds(763, 150, 200, 30);
		getContentPane().add(texteSortie1);
		
		JTextArea texteSortie2 = new JTextArea("Sortie");
		texteSortie2.setBounds(763, 218, 200, 30);
		getContentPane().add(texteSortie2);
		
		JTextArea texteSortie3 = new JTextArea("Sortie");
		texteSortie3.setBounds(763, 278, 200, 30);
		getContentPane().add(texteSortie3);
		
		JTextArea texteSortie4 = new JTextArea("Sortie");
		texteSortie4.setBounds(763, 90, 200, 30);
		getContentPane().add(texteSortie4);
				
	  }
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreCircuit frame = new FenetreCircuit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
