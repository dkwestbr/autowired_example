package dkwestbr.spring.autowired.example.test;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.testng.TestNG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.spi.spring.container.servlet.SpringServlet;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;

public class SpringExampleBaseTest extends TestNG {
	
    private static JerseyTest jerseyTest;

    /**
     * Initialize JerseyTest.
     */
    @BeforeSuite()
    public void init() {
        jerseyTest = new JerseyTest(new WebAppDescriptor.Builder("dkwestbr.spring.autowired.example")
        		.contextPath("/")
        		.servletPath("./src/test/webapp")
                .contextParam("contextClass", "org.springframework.web.context.support.AnnotationConfigWebApplicationContext")
                .contextParam("contextConfigLocation", "dkwestbr.spring.autowired.example.config.AppConfig")
                .servletClass(SpringServlet.class)
                .contextListenerClass(ContextLoaderListener.class)
                .requestListenerClass(RequestContextListener.class)
                .build()) {
        };
    }

    /**
     * Resource web resource.
     *
     * @return the web resource
     */
    public WebResource resource() {
        return jerseyTest.resource();
    }

    /**
     * Client client.
     *
     * @return the client
     */
    public Client client() {
        return jerseyTest.client();
    }

    /**
     * Sets up.
     * @throws Exception the exception
     */
    @BeforeTest
    public void setUp() throws Exception {
        jerseyTest.setUp();
    }

    /**
     * Tear down.
     * @throws Exception the exception
     */
    @AfterTest
    public void tearDown() throws Exception {
        jerseyTest.tearDown();
    }
}
