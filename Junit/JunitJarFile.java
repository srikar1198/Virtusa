package Testing_Loggers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitJarFile {

	@Test
	public void display() {
		String a = "Hola Junit";
		assertEquals("Hola Junit",a);
	}

}
