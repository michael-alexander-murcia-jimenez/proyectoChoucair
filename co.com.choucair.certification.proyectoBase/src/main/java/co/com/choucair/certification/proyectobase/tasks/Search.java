package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {

    private String Course;

    public Search(String course){
        this.Course = course;
    }

    public static Search the(String Course){
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SearchCoursePage.Button_UC),
                Enter.theValue(Course).into(SearchCoursePage.Imput_course),
                Click.on(SearchCoursePage.Button_GO),
                Click.on(SearchCoursePage.Select_Course));
    }
}
