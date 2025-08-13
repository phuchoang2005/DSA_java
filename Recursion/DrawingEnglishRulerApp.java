package Recursion;

class DrawingEnglishRuler {
    DrawingEnglishRuler(int nInches, int majorLength) {
        drawRuler(nInches, majorLength);
    }

    private void drawLine(int tickLength, int tickLabel) {
        for (int j = 0; j < tickLength; j++) {
            System.out.print("-");
        }
        if (tickLabel > 0) {
            System.out.println(" " + tickLabel);
        }
        System.out.println("\n");
    }

    private void drawRuler(int nInches, int majorLength) {
        drawLine(majorLength, 0);
        for (int j = 1; j <= nInches; j++) {
            drawInterval(majorLength - 1);
            drawLine(majorLength, j);
        }
    }

    private void drawInterval(int centralLength) {
        if (centralLength >= 1) {
            drawInterval(centralLength - 1);
            drawLine(centralLength);
            drawInterval(centralLength - 1);
        }
    }

    private void drawLine(int tickLength) {
        drawLine(tickLength, -1);
    }
}

public class DrawingEnglishRulerApp {
    public static void main(String[] args) {
        new DrawingEnglishRuler(5, 5);
    }
}