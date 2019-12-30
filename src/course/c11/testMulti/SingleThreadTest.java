package course.c11.testMulti;

import java.io.IOException;

import java.net.Socket;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;
import static java.lang.System.out;

public class SingleThreadTest {
	public static void main(String[] args) {
		out.println("SingleThread starts at: " + new Date());
		String host = "localhost";
		for (int port = 10000; port < 10005; port++) {
			SocketBean bean = new SocketBean(host, port);
			try (Socket sock = new Socket(bean.host, bean.port);
					Scanner scanner = new Scanner(sock.getInputStream());) {
				bean.feedback = scanner.next();
				out.println("Call " + bean.host + ":" + bean.port + ", and get: " + bean.feedback + " at " + new Date());
			} catch (NoSuchElementException | IOException ex) {
				out.println("Error talking to " + host + ":" + port);
			}
		}
	}
}
