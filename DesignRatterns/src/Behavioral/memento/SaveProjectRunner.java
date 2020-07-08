package Behavioral.memento;

import java.sql.SQLOutput;

public class SaveProjectRunner {

    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo github = new GithubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");
        System.out.println(project);

        github.setSave(project.save());
        System.out.println("---------------");
        Thread.sleep(5000);
        project.setVersionAndDate("Version 1.1");
        System.out.println(project);
        System.out.println("---------------");

        project.load(github.getSave());
        System.out.println(project);
    }
}
