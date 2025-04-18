package multithreading.imageProcessing.helpers;

import java.awt.image.BufferedImage;

public class ColorHelper {

    /**
     * Recolors a pixel at (x, y) based on whether it's a shade of gray.
     * Modifies the result image accordingly.
     */
    public static void recolorPixel(BufferedImage originalImage, BufferedImage resultImage, int x, int y) {
        int rgb = originalImage.getRGB(x, y);

        int red = getRed(rgb);
        int green = getGreen(rgb);
        int blue = getBlue(rgb);

        int newRed = red;
        int newGreen = green;
        int newBlue = blue;

        // Apply recoloring if the pixel is a shade of gray
        if (isShadeOfGray(red, green, blue)) {
            newRed = Math.min(255, red + 10);
            newGreen = Math.max(0, green - 80);
            newBlue = Math.max(0, blue - 20);
        }

        int newRGB = createRGBFromColors(newRed, newGreen, newBlue);
        setRGB(resultImage, x, y, newRGB);
    }

    /**
     * Sets the RGB value at (x, y) using the image's color model.
     */
    public static void setRGB(BufferedImage image, int x, int y, int rgb) {
        image.getRaster().setDataElements(x, y, image.getColorModel().getDataElements(rgb, null));
    }

    /**
     * Determines if the color is a shade of gray by comparing RGB values.
     */
    public static boolean isShadeOfGray(int red, int green, int blue) {
        return Math.abs(red - green) < 30 &&
               Math.abs(red - blue) < 30 &&
               Math.abs(green - blue) < 30;
    }

    /**
     * Creates a single RGB integer from separate red, green, and blue values.
     */
    public static int createRGBFromColors(int red, int green, int blue) {
        int rgb = 0xFF000000; // Set alpha channel to 255 (opaque)
        rgb |= (red << 16);
        rgb |= (green << 8);
        rgb |= blue;
        return rgb;
    }

    public static int getRed(int rgb) {
        return (rgb >> 16) & 0xFF;
    }

    public static int getGreen(int rgb) {
        return (rgb >> 8) & 0xFF;
    }

    public static int getBlue(int rgb) {
        return rgb & 0xFF;
    }
}
