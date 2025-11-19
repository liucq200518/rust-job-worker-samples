package tech.powerjob.client.test;

import org.junit.jupiter.api.BeforeAll;
import tech.powerjob.client.IPowerJobClient;
import tech.powerjob.client.PowerJobClient;

/**
 * Initialize OhMyClient
 *
 * @author tjq
 * @since 1/16/21
 */
public class ClientInitializer {

    protected static IPowerJobClient powerJobClient;

    @BeforeAll
    public static void initClient() throws Exception {
        powerJobClient = new PowerJobClient("192.168.30.69:8725", "powerjob-worker-samples", "powerjob-worker-samples");
    }
}
