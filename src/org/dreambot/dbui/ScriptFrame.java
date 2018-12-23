package org.dreambot.dbui;

import org.dreambot.dbui.components.*;

import javax.imageio.ImageIO;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class ScriptFrame extends DreamFrame {

    private DreamPanel body, content;

    public ScriptFrame() throws IOException {
        super("Dreambot UI 1.0", ImageIO.read(new URL("https://i.imgur.com/6wL0R36.png")));
        DreamTabbedPane tPane = new DreamTabbedPane();
        tPane.addTab("Tab 1", body = new DreamPanel());
        tPane.addTab("Tab 2", new DreamPanel());
        tPane.addTab("Tab 3", new DreamPanel());
        setSize(500,400);
        setLocationRelativeTo(null);
        add(tPane, BorderLayout.CENTER);
        body.setBorder(new EmptyBorder(7,8,7,8));
        body.add(content = new DreamPanel(), BorderLayout.NORTH);
        GridLayout grid = new GridLayout(0,2);
        grid.setVgap(5);
        content.setLayout(grid);
        content.add(new DreamLabel("Text input:"));
        content.add(new DreamTextField());
        content.add(new DreamHintTextField("Example input"));
        content.add(new DreamHintTextField("Input hint"));
        content.add(new DreamLabel("Checkbox:"));
        content.add(new DreamCheckBox());
        content.add(new DreamLabel("Button:"));
        content.add(new DreamButton("Sample button"));
        content.add(new DreamLabel("Combobox:"));
        content.add(new DreamComboBox<>("Sample #1","Sample #2", "Sample #3", "Sample #4"));
        //content.add(new DreamLabel("List:"));
        DreamList<DreamLabel> l = new DreamList<>();
        l.add(new DreamLabel("Test label #1"));
        l.add(new DreamLabel("Test label #2"));
        l.add(new DreamLabel("Test label #3"));
        l.add(new DreamLabel("Test label #4"));
        l.add(new DreamLabel("Test label #5"));
        l.add(new DreamLabel("Test label #6"));
        l.add(new DreamLabel("Test label #1"));
        l.add(new DreamLabel("Test label #2"));
        l.add(new DreamLabel("Test label #3"));
        l.add(new DreamLabel("Test label #4"));
        l.add(new DreamLabel("Test label #5"));
        l.add(new DreamLabel("Test label #6"));
        DreamScrollPane dsp = new DreamScrollPane(l);
        body.add(dsp, BorderLayout.SOUTH);
    }

    public static void main(String... args) throws IOException {
        ScriptFrame frame = new ScriptFrame();
        frame.setVisible(true);
    }
}
