import com.google.common.collect.ArrayTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableTable;
import com.sun.javafx.collections.ImmutableObservableList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class tachograph_test {

    @Test
    public void Contains_element() {
        tachograph test = new tachograph();
        test.tachograph = ArrayTable.create(new ImmutableTable.Builder<Integer, String, Double>()
                .put(1,"CurrentTime",2.0)
                .put(1,"JoystickPosition",3.1)
                .put(1, "referenceSpeed",2.2)
                .build()
        );

        assert !test.tachograph.isEmpty();
    }
}
