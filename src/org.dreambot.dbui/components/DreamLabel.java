package org.dreambot.dbui.components;

import org.dreambot.dbui.UIColours;

import javax.swing.*;
import java.awt.*;

public class DreamLabel extends JLabel {

    public DreamLabel() {
        this("");
    }

    public DreamLabel(String text) {
        super(text);
        setOpaque(true);
        setForeground(UIColours.TEXT_COLOR);
        setBackground(UIColours.BODY_COLOUR);
    }
}
