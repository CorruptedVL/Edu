package mg.edu.brackets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BracketsTest {
    Validator bracketValidator = new BracketsValidator();
    @Test
    public void validatorTest(){
        var brackets1 = new Brackets ("([{}])");
        var brackets2 = new Brackets("");
        var brackets3  = new Brackets("()");
        var brackets4  = new Brackets("([{}])(");
        var brackets5  = new Brackets("([{}]))");

        assertTrue (bracketValidator.isValid(brackets1.chars));
        assertFalse(bracketValidator.isValid(brackets2.chars));
        assertTrue(bracketValidator.isValid(brackets3.chars));
        assertFalse(bracketValidator.isValid(brackets4.chars));
        assertFalse(bracketValidator.isValid(brackets5.chars));

    }
}
