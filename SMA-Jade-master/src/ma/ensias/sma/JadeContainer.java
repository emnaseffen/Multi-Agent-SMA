package ma.ensias.sma;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.ContainerController;

public class JadeContainer {

	private ContainerController container;
	
	public JadeContainer() {
		// Cr�er une instance de la MV
		Runtime rt = Runtime.instance();
		// Pas de propri�t�s, ce n'et pas un main container, mais un profile !
		ProfileImpl profile = new ProfileImpl(false);
		// Le main container associ� est d�j� d�marr� sur localhost
		profile.setParameter(ProfileImpl.MAIN_HOST, "localhost");
		profile.setParameter(ProfileImpl.CONTAINER_NAME, "Market");
		container = rt.createAgentContainer(profile); // Cr�er le container
	}

	public ContainerController getContainer() { return container; }
}

