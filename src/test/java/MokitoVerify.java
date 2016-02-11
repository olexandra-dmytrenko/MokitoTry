import kickstarter.Project;
import kickstarter.Run;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

//Let's import Mockito statically so that the code looks clearer

/**
 * Created by olexandra on 2/11/16.
 */
public class MokitoVerify {

    //mock creation
    List mockedList = mock(List.class);
    List<Project> projects = new ArrayList<Project>();

    @Test
    public void checkListMocked() {
//using mock object
        mockedList.add("one");
        mockedList.clear();

        //verification
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    @Test
    public void checkListProjects() {
        Project project = new Project("Test");
        projects = project.addProject();
        //verification
        verify(projects).add(project);
        verify(projects).add(project);
        verify(project).getCost();

    }

    @Test
    public void checkProjects() {
        //given
        Project mockedProject = mock(Project.class);
        Run run = new Run();

        //when
        //List<Project> projects = mockedProject.addProject();
        run.addProject(mockedProject);


        //then
        verify(mockedProject).addProject();
        assertEquals(0, projects.size());

    }
}
