package FirstExample;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Test {  
public static void main(String[] args) {  
    Resource resource=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    Student student=(Student)factory.getBean("studentbean");  
    student.displayInfo();  
}  
}  




/**

log4j:WARN No appenders could be found for logger (org.springframework.beans.factory.xml.XmlBeanDefinitionReader).
log4j:WARN Please initialize the log4j system properly.
Exception in thread "main" org.springframework.beans.factory.BeanDefinitionStoreException: IOException parsing XML document from class path resource [applicationContext.xml]; nested exception is java.io.FileNotFoundException: class path resource [applicationContext.xml] cannot be opened because it does not exist
	at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:341)
	at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:302)
	at org.springframework.beans.factory.xml.XmlBeanFactory.<init>(XmlBeanFactory.java:73)
	at org.springframework.beans.factory.xml.XmlBeanFactory.<init>(XmlBeanFactory.java:61)
	at FirstExample.Test.main(Test.java:11)
Caused by: java.io.FileNotFoundException: class path resource [applicationContext.xml] cannot be opened because it does not exist
	at org.springframework.core.io.ClassPathResource.getInputStream(ClassPathResource.java:141)
	at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:328)
	... 4 more


*/
