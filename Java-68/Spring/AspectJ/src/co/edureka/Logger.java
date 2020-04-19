package co.edureka;

import java.util.Date;

public class Logger {
	public void log() {
		System.out.println("LOG: Going to deposit amount");
	}
	public void done() {
		System.out.println("Done with method execution @ "+new Date());
	}
}
