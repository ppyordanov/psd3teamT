package uk.ac.glasgow.bookingSystem.components.users;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	private Admin admin;
	private Lecturer lecturer;
	private Student student;
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		this.admin = new Admin();
		this.lecturer = new Lecturer();
		this.student = new Student();
		
		System.out.println("Hello World from the users component!!");
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
	}
}
