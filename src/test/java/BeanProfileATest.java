import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import static org.fest.assertions.Assertions.assertThat;

public class BeanProfileATest extends JettyTest {

    @BeforeClass
    public static void startJetty() throws Exception {
        JettyTest.startJetty("profileA");
    }

    @Test
    public void should_print_bean_profile_a() throws IOException {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new URL("http://localhost:8080").openStream()))) {
            assertThat(in.readLine()).isEqualTo("BeanProfileA");
        }
    }

}