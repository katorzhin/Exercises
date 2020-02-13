public class UserDto {

    private String firstName;
    private String lastName;
    private int age;

    private UserDto(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static BuilderName builder() {
        return firstName -> lastName -> age -> () -> new UserDto(firstName, lastName, age);
    }

    public static void usage() {
        UserDto.builder()
                .setFirstName("a")
                .setLastName("b")
                .setAge(18)
                .build();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public interface BuilderName {
        BuilderLastName setFirstName(String name);
    }

    public interface BuilderLastName {
        BuilderAge setLastName(String name);
    }

    public interface BuilderAge {
        UserBuilder setAge(int age);
    }

    public interface UserBuilder {
        UserDto build();
    }


    public static void main(String[] args) {
        UserDto build = UserDto.builder()
                .setFirstName("name")
                .setLastName("last")
                .setAge(123)
                .build();

        System.out.println(build.getAge() + build.getFirstName() + build.getLastName());


    }
}
