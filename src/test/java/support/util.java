package support;

import definitions.hooks;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class util extends hooks {

    public static WebDriverWait wait30;

    public util() {
        wait30 = new WebDriverWait(driver,30);
    }

    public void activeWindow(){
        Set<String> identifiers =driver.getWindowHandles();
        for(String identify:identifiers){
            driver.switchTo().window(identify);
        }
    }
    public void defaultWindow(){
        //driver.close();
        driver.switchTo().window("");
    }

    public static void getEvidences() throws IOException {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("ddMMyyy-HHmmssSSS");
        String path = "target/evidencias/";
        String name = formato.format(fecha)+"_evidencia.jpg";
        //Tomar screen con selenium
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //Crear evidencia
        FileUtils.copyFile(file,new File(path+name));
    }

}
