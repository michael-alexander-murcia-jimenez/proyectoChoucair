package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage {

    public static final Target Button_UC =
            Target.the("Select University Choucair")
                    .located(By.xpath("//div[div@id='universidad']//strong"));

    public static final Target Imput_course =
            Target.the("Imput the course")
                    .located(By.id("coursesearhbox"));

    public static final Target Button_GO =
            Target.the("Button Search the course")
                    .located(By.id("/button[@class='btn btn-secondary']"));

    public static final Target Select_Course =
            Target.the("Select the course")
                    .located(By.xpath("//h4[contains(text(),'Recuros Automatizacion Bancolombia')]"));
}
