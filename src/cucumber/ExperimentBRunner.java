package cucumber;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.cucumber.listener.ExtentCucumberFormatter"},
					 features = {"src/cucumber"},
					 glue = {"cucumber.steps"},
					 tags = {"@dev"}
				)

public class ExperimentBRunner {

@BeforeClass
public static void setup() {
	
	String dateNow = new SimpleDateFormat("ddMMyy").format(new GregorianCalendar().getTime());
	String timeNow = new SimpleDateFormat("hhmmss").format(new GregorianCalendar().getTime());
	
	String fileName = String.format("C:/seleniumTraining/DS_Project/report/%s/report_%s.html", dateNow, timeNow);
	
	
	ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File(fileName));

	ExtentCucumberFormatter.loadConfig(new File("src/cucumber/resource/extent-config.xml"));


	ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
	ExtentCucumberFormatter.addSystemInfo("Browser version", "v2.27");
	ExtentCucumberFormatter.addSystemInfo("Selenium version", "v3.0.1");

	// Also you can add system information using a hash map
//	Map systemInfo = new HashMap();
//	systemInfo.put("Cucumber version", "v1.2.3");
//	systemInfo.put("Extent Cucumber Reporter version", "v1.1.1");
//	ExtentCucumberFormatter.addSystemInfo(systemInfo);
}

}