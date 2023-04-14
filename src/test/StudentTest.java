import org.junit.Test;
import static org.junit.Assert.*;
public class StudentTest {
    @Test
    public void testCreatStudent(){
        Student niki = new Student(01, "niki");
        Student ryan = null;
        assertNotNull(niki);
        assertNull(ryan);
    }
    @Test
    public void testStudentFields(){
        Student niki = new Student(01, "niki");
        assertEquals(01, niki.getId());
        assertSame("niki", niki.getName());
        assertSame(0, niki.getGrades().size());
    }
    @Test
    public void testAddGrade(){
        Student niki = new Student(01, "niki");
        niki.addGrade(98);
        assertSame(98, niki.getGrades().get(0));
        niki.addGrade(80);
        assertSame(80, niki.getGrades().get(1));
    }
    @Test
    public void testAverageGrade(){
        Student niki = new Student(01, "niki");
        niki.addGrade(100);
        niki.addGrade(80);
        assertEquals(90, niki.getGradeAverage(), 0);
    }
    @Test
    public void testUpdateGrade() {
        Student niki = new Student(01, "niki");
        niki.addGrade(100);
        niki.addGrade(80);
        niki.updateGrade(0, 90);
        niki.updateGrade(1, 70);
        assertEquals(2, niki.getGrades().size());
        assertEquals(90, (int) niki.getGrades().get(0));
        assertEquals(70, (int) niki.getGrades().get(1));
    }
    @Test
    public void testDeleteGrade(){
        Student niki = new Student(01, "niki");
        niki.addGrade(100);
        niki.addGrade(80);
        niki.deleteGrade(0);
        assertEquals(1, niki.getGrades().size());
        assertEquals(80, (int) niki.getGrades().get(0));
    }
}
