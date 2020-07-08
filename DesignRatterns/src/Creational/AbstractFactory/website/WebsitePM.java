package Creational.AbstractFactory.website;

import Creational.AbstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages Website project...");
    }
}
