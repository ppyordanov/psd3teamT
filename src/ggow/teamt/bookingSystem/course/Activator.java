package ggow.teamt.bookingSystem.course;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	private Course course;
	private Session session;
	private Location location;
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		this.course = new Course();
		this.session = new Session();
		this.location = new Location();
		System.out.println("Hello World from Course Component!!");
		
		//Add any interfaces used here
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
		
		//deactivate any interfaces here
	}

}
