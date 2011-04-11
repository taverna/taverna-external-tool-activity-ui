/**
 * 
 */
package net.sf.taverna.t2.activities.externaltool.manager.ssh;

import javax.swing.JTextField;

import de.uni_luebeck.inb.knowarc.usecases.invocation.ssh.SshNode;



/**
 * @author alanrw
 *
 */
public class ExternalToolSshNodeViewer {
	
	private JTextField hostnameField;
	private JTextField portField;

	public ExternalToolSshNodeViewer(SshNode node) {
		hostnameField = new JTextField(node.getHost(), 30);
		portField = new JTextField(Integer.toString(node.getPort()), 3);
	}

	public ExternalToolSshNodeViewer() {
		this(new SshNode());
	}

	public JTextField getHostnameField() {
		return hostnameField;
	}

	public JTextField getPortField() {
		return portField;
	}

	public String getHostname() {
		return hostnameField.getText();
	}

	public int getPort() {
		return Integer.parseInt(portField.getText());
	}

}