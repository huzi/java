/*
 * Copyright (c) CompuGroup Medical Software GmbH,
 * This software is the confidential and proprietary information of
 * CompuGroup Medical Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGroup Medical Software GmbH.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by thomas18 on 11.12.2015.
 */
public class Test {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "D:\\shize\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.tips.at/auth/login");
        driver.findElementByCssSelector("#email").sendKeys("thomas.lemme@systema.info");
        driver.findElementByCssSelector("#password").sendKeys("224230");
//        driver.findElementByCssSelector("#email").sendKeys("a.lang@tele2.at");
//        driver.findElementByCssSelector("#password").sendKeys("769823");
        driver.findElementByCssSelector("#loginForm button").click();

        System.out.println("start timer ...");

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    System.out.println("running " + LocalDateTime.now().toString());
                    driver.get("http://www.tips.at/advent");
                    List<WebElement> elms = driver.findElements(By.cssSelector("#adv2015"));
                    System.out.println("elms found:" + elms.size());
                    if (elms.size() > 0) {
                        WebElement elm = elms.get(0);
                        System.out.println(elm);
                        System.out.println("lala " + LocalDateTime.now().toString());
                        elm.click();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                    //driver.close();

                }
            }
        }, 5000, 30000);

    }
}
