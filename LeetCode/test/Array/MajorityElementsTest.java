package Array;

public class MajorityElementsTest {

    @Test
    public void testFindMajorityElementWhenMajorityElementIsPresentThenReturnMajorityElement() {
        // Arrange
        int[] arr = {2, 2, 1, 1, 2, 2, 2};

        // Act
        int result = MajorityElements.findMajorityElement(arr);

        // Assert
        assertEquals(2, result);
    }

    @Test
    public void testFindMajorityElementWhenArrayIsEmptyThenReturnMinusOne() {
        // Arrange
        int[] arr = {};

        // Act
        int result = MajorityElements.findMajorityElement(arr);

        // Assert
        assertEquals(-1, result);
    }

    @Test
    public void testFindMajorityElementWhenArrayHasOneElementThenReturnElement() {
        // Arrange
        int[] arr = {1};

        // Act
        int result = MajorityElements.findMajorityElement(arr);

        // Assert
        assertEquals(1, result);
    }

    @Test
    public void testFindMajorityElementWhenArrayHasNoMajorityElementThenReturnMinusOne() {
        // Arrange
        int[] arr = {1, 2, 3, 4, 5};

        // Act
        int result = MajorityElements.findMajorityElement(arr);

        // Assert
        assertEquals(-1, result);
    }

    @Test
    public void testFindMajorityElementWhenArrayHasMultipleMajorityElementsThenReturnAnyOne() {
        // Arrange
        int[] arr = {2, 2, 2, 1, 1, 1};

        // Act
        int result = MajorityElements.findMajorityElement(arr);

        // Assert
        assertTrue(result == 2 || result == 1);
    }
}