package kreceAutomatiacija;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Domaci14 {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Stefan\\Desktop\\projekat\\automatizacija\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("https://demoqa.com/text-box");

        WebElement tekstFullName = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/label[1]"));
        System.out.println(tekstFullName.getText());
        WebElement tekstEmail = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/label[1]"));
        System.out.println(tekstEmail.getText());
        WebElement tekstAdresa = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[1]/label[1]"));
        System.out.println(tekstAdresa.getText());
        WebElement tekstStalnaAdresa = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[1]/label[1]"));
        System.out.println(tekstStalnaAdresa.getText());


        WebElement elementFullNameInput = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]"));
        elementFullNameInput.sendKeys("Jovan Petrovic");
        WebElement elementEmailInput = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[2]/input[1]"));
        elementEmailInput.sendKeys("coolemail@mail.com");
        WebElement elementAdresaInput = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/textarea[1]"));
        elementAdresaInput.sendKeys("Cara Dusana 86");
        WebElement elementStalnaAdresaInput = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[2]/textarea[1]"));
        elementStalnaAdresaInput.sendKeys("Srpskih Vladara 1");
        WebElement submitBtn = wd.findElement(By.id("submit"));
        submitBtn.click();
        Thread.sleep(3000);

        WebElement tekst1 = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[1]"));
        WebElement tekst2 = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[2]"));
        WebElement tekst3 = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[3]"));
        WebElement tekst4 = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[4]"));

        if(tekst1.getText().equals("Name:Jovan Petrovic")) {
            System.out.println("Ime je ispravno.");
        }else {
            System.out.println("Ime nije ispravno.");
        }
        if(tekst2.getText().equals("Email:coolemail@mail.com")) {
            System.out.println("Email je ispravan.");
        }else {
            System.out.println("Email nije ispravan.");
        }
        if(tekst3.getText().equals("Current Address :Cara Dusana 86")) {
            System.out.println("Adresa je ispravna.");
        }else {
            System.out.println("Adresa nije ispravna.");
        }
        if(tekst4.getText().equals("Permananet Address :Srpskih Vladara 1")) {
            System.out.println("Stalno boraviste je ispravno.");
        }else {
            System.out.println("Stalno boraviste nije ispravno.");
        }

        Thread.sleep(1000);
        wd.close();

    }

}
