import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Weight_Conversion_test
{
    @Test
    void Test_for_value_output()
    {
        Weight_Conversion input = new Weight_Conversion();

        input.setOz(62);

        input.conversion();

        assertEquals(3.875, input.get_converted_value());
        assertEquals(3, input.get_lbs_value());
        assertEquals(14, input.get_Oz_value());
    }

}
