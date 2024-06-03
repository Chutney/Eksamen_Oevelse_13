import java.util.Random;

public class JuleGave {

    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;

    public JuleGave() {
        Random rn = new Random();

        isSoft = (rn.nextInt(0,2) == 1);
        isRectangular = (rn.nextInt(0,2) == 1);
        doesRattle = (rn.nextInt(0,2) == 1);
    }


    public boolean couldBeLego() {
        return (isRectangular && !isSoft && doesRattle);
    }


}
