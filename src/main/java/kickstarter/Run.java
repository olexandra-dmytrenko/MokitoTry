package kickstarter;

import java.util.List;

/**
 * Created by olexandra on 2/11/16.
 */
public class Run {
    public static void main(String[] args) {
        Project project = new Project("Snowfall all of a sudden");
        addProject(project);
        System.out.println(project.getProjects().get(0));
    }

    public static List<Project> addProject(Project project) {
        List<Project> result = project.addProject();
        return result;
    }
}
