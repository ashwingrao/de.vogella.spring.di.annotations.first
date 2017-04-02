package writer;

/**
 * Created by ashwingrao on 4/2/17.
 */
public class Main {
    public static void main(String[] args) {
        MySpringBeanWithDependency dependency = new MySpringBeanWithDependency();
        dependency.setWriter(new NiceWriter());
        dependency.run();

        dependency.setWriter(new Writer());
        dependency.run();

    }
}
