/**
 * 
 */
package net.sf.taverna.t2.activities.externaltool.manager;

import net.sf.taverna.t2.workbench.ShutdownSPI;

/**
 * @author alanrw
 *
 */
public class InvocationGroupManagerShutdownHook implements ShutdownSPI {

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.workbench.ShutdownSPI#positionHint()
	 */
	@Override
	public int positionHint() {
		return 210;
	}

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.workbench.ShutdownSPI#shutdown()
	 */
	@Override
	public boolean shutdown() {
		InvocationGroupManager.getInstance().saveConfiguration();
		return true;
	}

}
