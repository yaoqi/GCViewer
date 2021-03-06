package com.tagtraum.perf.gcviewer.action;

import com.tagtraum.perf.gcviewer.AboutDialog;
import com.tagtraum.perf.gcviewer.GCViewer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author <a href="mailto:hs@tagtraum.com">Hendrik Schreiber</a>
 * Date: May 20, 2005
 * Time: 1:45:11 PM
 *
 */
public class About extends AbstractAction {
    private AboutDialog aboutDialog;

    public About(final GCViewer gcViewer) {
        aboutDialog = new AboutDialog(gcViewer);
        putValue(NAME, GCViewer.localStrings.getString("main_frame_menuitem_about"));
        putValue(SHORT_DESCRIPTION, GCViewer.localStrings.getString("main_frame_menuitem_hint_about"));
        putValue(MNEMONIC_KEY, new Integer(GCViewer.localStrings.getString("main_frame_menuitem_mnemonic_about").charAt(0)));
        putValue(ACTION_COMMAND_KEY, "about");
        putValue(SMALL_ICON, new ImageIcon(Toolkit.getDefaultToolkit().getImage(gcViewer.getClass().getResource("images/about.png"))));
    }

    public void actionPerformed(final ActionEvent e) {
        aboutDialog.setVisible(true);
    }
}
