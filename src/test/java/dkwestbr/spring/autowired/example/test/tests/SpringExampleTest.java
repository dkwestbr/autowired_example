package dkwestbr.spring.autowired.example.test.tests;

import java.util.List;

import javax.ws.rs.core.NewCookie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import dkwestbr.spring.autowired.example.test.SpringExampleBaseTest;

public class SpringExampleTest extends SpringExampleBaseTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringExampleBaseTest.class);

    /**
     * Base web service test.
     */
    @Test
    public void baseWebServiceTest() {
        WebResource webResource = resource().path("/");
        LOGGER.debug("URI: " + webResource.getURI().toString());
        
        String responseMsg = webResource.path("foo/bar").get(String.class);
        System.out.println(responseMsg);
        //Assert.assertEquals(actual, expected);

        ClientResponse response = webResource.get(ClientResponse.class);
        List<NewCookie> cookies = response.getCookies();
        for (NewCookie cookie : cookies) {
            LOGGER.debug(cookie.toString());
        }
    }
}