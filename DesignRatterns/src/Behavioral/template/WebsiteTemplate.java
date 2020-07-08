package Behavioral.template;

public abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer \n");
    }

    public abstract void showPageContent();
}
