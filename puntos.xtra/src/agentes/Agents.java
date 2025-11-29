package agentes;

import javax.swing.JTextArea;

import humanos.Human;

public abstract class Agents {

	protected String name;
	
	public Agents(String name) {
		this.name = name;
	}
	
	public abstract void interceptar(Human human, JTextArea consola);
}
