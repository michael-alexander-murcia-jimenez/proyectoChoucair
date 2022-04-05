package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target Login_button =
            Target.the("button that shows us the form to login")
                    .located(By.id("yui_3_17_2_1_1649172350734_21"));

    //div[@class='d-none d-lg-block'//strong[contains(text(),'Ingresar')]"
    //*[@id="yui_3_17_2_1_1649172350734_21"]

    public static final Target Imput_user =
            Target.the("where do we write the user").located(By.id("username"));


    public static final Target Imput_password =
            Target.the("where do we write the password").located(By.id("password"));

    public static final Target Enter_Button =
            Target.the("Button to confir login")
                    .located(By.xpath("//*[@id=\"yui_3_17_2_1_1649172350734_29\"]/div[2]/div[2]/form/div[3]/button"));

    //button[contains(@class, 'btn btn-primary')]
    //*[@id="yui_3_17_2_1_1649172350734_29"]/div[2]/div[2]/form/div[3]/button
}
