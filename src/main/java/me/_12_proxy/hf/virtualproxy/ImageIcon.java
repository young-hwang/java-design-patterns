package me._12_proxy.hf.virtualproxy;

import java.awt.*;
import java.net.URL;

public class ImageIcon implements Icon {
    final URL url;
    final String title;

    public ImageIcon(URL url, String title) {
        this.url = url;
        this.title = title;
    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int x, int y) {

    }
}
