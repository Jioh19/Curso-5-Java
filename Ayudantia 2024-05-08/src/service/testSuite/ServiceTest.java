package service.testSuite;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectPackages({"service.Test",
				"service.Test2"})
@Suite
@SuiteDisplayName("Conjunto de pruebas")
public class ServiceTest {

}
