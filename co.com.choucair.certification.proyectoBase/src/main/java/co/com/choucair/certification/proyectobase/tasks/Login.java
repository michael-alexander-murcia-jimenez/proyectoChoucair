package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    private String strUser;
    private String strPassword;

    public static Login OnThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class,strUser,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ChoucairLoginPage.Login_button),
                Enter.theValue(strUser).into(ChoucairLoginPage.Imput_user),
                Enter.theValue(strPassword).into(ChoucairLoginPage.Imput_password),
                Click.on(ChoucairLoginPage.Enter_Button));

    }
}
