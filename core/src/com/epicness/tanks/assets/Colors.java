package com.epicness.assets;

import com.badlogic.gdx.graphics.Color;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Luchox on 31/07/2015.
 * Colors
 */
public class Colors {

    private static Colors instance = new Colors();

    private static ArrayList<Color> colors = new ArrayList<Color>();

    private Colors() {
    }

    public static Colors getInstance() {
        return instance;
    }

    public static Color darkGreen = new Color(0, 0.7f, 0, 1);
    public static Color limeGreen = new Color(0.6f, 1, 0.1f, 1);
    public static Color purple = new Color(0.7f, 0, 1, 1);

    public static void create() {
        colors.add(Color.RED);
        colors.add(Color.ORANGE);
        colors.add(Color.YELLOW);
        colors.add(limeGreen);
        colors.add(darkGreen);
        colors.add(Color.CYAN);
        colors.add(Color.BLUE);
        colors.add(purple);
        colors.add(Color.PINK);
    }

    public Color nextColor(Color color) {
        for (int i = 0; i < colors.size(); i++) {
            if (color == colors.get(i)) {
                if (i == colors.size() - 1) {
                    color = colors.get(0);
                } else {
                    color = colors.get(i + 1);
                }
                break;
            }
        }
        return color;
    }

    public Color nextUnusedColor(ArrayList<Color> usedColors) {
        Color next = colors.get(0);
        return nextUnusedColor(next, usedColors);
    }

    public Color nextUnusedColor(Color current, ArrayList<Color> usedColors) {
        while (true) {
            current = nextColor(current);
            if (!usedColors.contains(current)) {
                break;
            }
        }
        return current;
    }

    public Color randomColor() {
        Random r = new Random();
        return colors.get(r.nextInt(9));
    }
}
