package agentes;

import javax.swing.JTextArea;

import humanos.Human;

public class Smith extends Agents{

	public Smith(String name) {
		super(name);
	}

	@Override
	public void interceptar(Human human, JTextArea consola) {
		consola.append(name + " : Señor " + human.name + " es su ultima oportunidad \n");
	}
	
	public void replicar(JTextArea consola) {
		consola.append("Smith se replica... \n");
	}

}
