package hw9;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;

@RunWith(MockitoJUnitRunner.class)
public class Task1Test {
    @InjectMocks
    Task1 task;

    @Mock
    Convert converterMock;
    @Mock
    CheckTurn checkTurnMock;

    @Test
    public void checkHorseTurn_nominal() {
        Mockito.when(converterMock.getCoords(any(), any())).thenReturn(new int[]{0, 1, 0, 2});
        Mockito.when(checkTurnMock.checkTurn(anyInt(), anyInt(), anyInt(), anyInt())).thenReturn(true);
        boolean result = task.checkHorseTurn("a1", "b3");
        Assert.assertTrue(result);
    }

    @Test
    public void checkHorseTurn_false_num_range() {
        Mockito.when(converterMock.getCoords(any(), any())).thenReturn(new int[]{0, 1, 0, 5});
        task = new Task1(new CheckTurn());
        boolean result = task.checkHorseTurn("a", "b");
        Assert.assertFalse(result);
    }

    @Test
    public void checkHorseTurn_false_letter_range() {
        Mockito.when(converterMock.getCoords(any(), any())).thenReturn(new int[]{0, 7, 0, 2});
        task = new Task1(new CheckTurn());
        boolean result = task.checkHorseTurn("a", "b");
        Assert.assertFalse(result);
    }

    @Test
    public void checkHorseTurn_incorrect_letter_coords() {
        Mockito.when(converterMock.getCoords(any(), any())).thenReturn(new int[]{0, -100, 0, 2});
        task = new Task1(new CheckTurn());
        boolean result = task.checkHorseTurn("a1", "b3");
        Assert.assertFalse(result);
    }

    @Test
    public void checkHorseTurn_incorrect_num_coords() {
        Mockito.when(converterMock.getCoords(any(), any())).thenReturn(new int[]{0, 1, -1, 2});
        task = new Task1(new CheckTurn());
        boolean result = task.checkHorseTurn("a1", "b3");
        Assert.assertFalse(result);
    }
}
