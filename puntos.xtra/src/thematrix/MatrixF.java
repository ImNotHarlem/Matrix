package thematrix;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import agentes.Agents;
import agentes.Smith;
import humanos.Human;
import humanos.Morpheo;
import humanos.Neo;

public class MatrixF extends JFrame {

	private JTextArea consola;
	private JButton correBtn;
	private Human neo;
	private Human morpheo;
	private Agents smith;
	
	MatrixF() {
		
		setTitle("Matrix simulador");
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		consola = new JTextArea();
		consola.setBackground(Color.BLACK);
		consola.setForeground(Color.GREEN);
		consola.setFont(new Font("Monospaced", Font.PLAIN, 16));
		consola.setEditable(false);
		
		correBtn = new JButton("Correr simulacion");
		correBtn.addActionListener(e->correrSimulacion());
		
		add(new JScrollPane(consola), BorderLayout.CENTER);
		add(correBtn, BorderLayout.SOUTH);
		
		iniciarSimulacion();
		
		PanelLluvia panelll = new PanelLluvia(getWidth(), getHeight());
		setGlassPane(panelll);
		panelll.setVisible(true);
		
		setVisible(true);
	}
	
	void iniciarSimulacion() {
		neo = new Neo("Thomas Anderson", false);
		morpheo = new Morpheo("Morpheus", true);
		smith = new Smith("Smith");
		print("Bienvenido a la Matrix \n");
	}
	
	void correrSimulacion() {
		print("\n----- CORRIENDO SIMULACION -----\n");
		morpheo.speak(consola, "te mostrare el camino...");
		((Morpheo)morpheo).levantar(neo, consola);
		neo.speak(consola, "Ahora puedo creer...");
		
		((Neo)neo).desbloqueaPoder(consola);
		((Smith)smith).interceptar(neo, consola);
		((Neo)neo).seSacrifica(consola);
		
		print("La Matrix se reinicia... \n");
	}
	
	void print(String mensaje) {
		consola.append(mensaje + "\n");
	}
}

