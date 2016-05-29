package br.com.blacksheep.singleton;

public final class Window {

	private static Window instance;

	private Window() {

	}

	public static synchronized Window getInstance() {
		if (instance == null) {
			instance = new Window();
		}
		return instance;
	}

	public void open() {
		System.out.println("Open the window!!");
	}

	public void close() {
		System.out.println("Close the windows!!");
	}
}
