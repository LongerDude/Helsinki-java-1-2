
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ExerciseManagementTest {

    @Test
    public void exerciseListEmptyAtBeginning() {
        ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        ExerciseManagement management = new ExerciseManagement();

        management.add("test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        ExerciseManagement management = new ExerciseManagement();

        management.add("test");
        assertTrue(management.exerciseList().contains("test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("test");
        management.markAsCompleted("test");
        assertTrue(management.isCompleted("test"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        ExerciseManagement management = new ExerciseManagement();

        management.add("test");
        management.markAsCompleted("test");
        assertFalse(management.isCompleted("test2"));
    }
}
