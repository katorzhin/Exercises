package patternMVC;

public class Main {
    public static void main(String[] args) {
        Employee model = new Employee();
        model.setName("Tom");
        model.setId("1");
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeName("new Name");
        controller.updateView();
    }
}
