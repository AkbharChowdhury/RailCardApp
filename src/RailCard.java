import java.text.MessageFormat;

public class RailCard {
    private final boolean IS_MALE;

    private final String NAME;
    private final int AGE;


    public RailCard(boolean isMale, String name, int age) {
        IS_MALE = isMale;
        NAME = name;
        AGE = age;
    }

    private String getTitle() {
        if (IS_MALE && AGE >= 18) {
            return "Mr. ";
        }
        if (IS_MALE) {
            return "Master ";
        }
        if (AGE >= 18) {
            return "Ms. ";
        }
        return "Miss ";

    }

    private String getPass() {
        if (AGE <= 25) {
            return "\nYou are entitled to a young person's railcard";
        }
        if (AGE >= 60) {
            return "\nYou are entitled to a freedom pass";
        }
        return "\nYou are not entitled to any pass";
    }

    @Override
    public String toString() {
        return MessageFormat.format("Hello {0} year old {1} {2} {3}",
                AGE,
                getTitle(),
                NAME,
                getPass()
        );
    }
}
