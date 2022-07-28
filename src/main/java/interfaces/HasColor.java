package interfaces;

public interface HasColor {
    String getColor();
}

interface Box extends HasColor {
    int getHeight();
}
