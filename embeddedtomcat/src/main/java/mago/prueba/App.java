package mago.prueba;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws LifecycleException, ServletException {
        System.out.println("Hello World!");

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

// configure the server
// configure web applications

        String contextPath = "/demo";
        String warFilePath = "./webapp/target/webapp-1.0.war";

        tomcat.getHost().setAppBase("../");
        tomcat.addWebapp(contextPath, warFilePath);

        tomcat.start();
        tomcat.getServer().await();
    }
}
