package kickstarter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by olexandra on 2/11/16.
 */
public class Project {
    static AtomicLong idGenerator = new AtomicLong(0);
    long id;
    String name;
    double cost = 0.00;
    List<Project> projects = new ArrayList<Project>();

    public Project(String name) {
        this.name = name;
        id = idGenerator.incrementAndGet();
    }

    public List<Project> addProject() {
        projects.add(this);
        return projects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
