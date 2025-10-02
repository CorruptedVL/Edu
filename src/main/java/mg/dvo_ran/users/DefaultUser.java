package mg.dvo_ran.users;


public class DefaultUser implements User {

    private final String name;

    public DefaultUser(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
