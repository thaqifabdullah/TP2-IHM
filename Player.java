import javax.swing.*;

public class Player extends JPanel{
	static final int MIN_LARGEUR = 700;
	protected JButton playPause, previous, stop, next, listeLecteurs, equalizer;
	protected JSlider sound;
	protected JLabel infoChanson;
	protected JPanel buttonsGroup, infoGroup;

	public Player(){
		initializeButtons();
		initializeSlider();
		initializeLabel();
		initializePanel();
	}

	protected void initializeButtons(){
		playPause = new JButton("Play/Pause");
		previous = new JButton("Previous");
		stop = new JButton("Stop");
		next = new JButton("Next");
		listeLecteurs = new JButton("ListeLecteurs");
		equalizer = new JButton("Equalizer");
	}

	protected void initializeSlider(){
		sound = new JSlider(0,100);
		add(sound);
	}

	protected void initializeLabel(){
		infoChanson = new JLabel("Now Playing...");
	}

	protected void initializePanel(){
		buttonsGroup = new JPanel();
		buttonsGroup.add(playPause);
		buttonsGroup.add(previous);
		buttonsGroup.add(stop);
		buttonsGroup.add(next);
		add(buttonsGroup);

		infoGroup = new JPanel();
		infoGroup.add(infoChanson);
		infoGroup.add(equalizer);
		infoGroup.add(listeLecteurs);
		add(infoGroup);
	}
}