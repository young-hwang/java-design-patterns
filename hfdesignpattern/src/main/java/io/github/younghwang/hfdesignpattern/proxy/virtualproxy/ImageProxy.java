package io.github.younghwang.hfdesignpattern.proxy.virtualproxy;

import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    volatile ImageIcon imageIcon;

    final URL imageUrl;
    Thread retreivalThread;
    boolean retrieving = false;

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return this.imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return this.imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    @Override
    public void paintIcon(final Component component, Graphics graphics, int x, int y) {
        if (this.imageIcon != null) {
            this.imageIcon.paintIcon(component, graphics, x, y);
        } else {
            graphics.drawString("Loading CD Cover, please wait...", x + 300, y + 190);
            if (!retrieving) {
                retrieving = true;
                // image 로드가 synchronous 할 경우 ImageIcon 생성자가 리턴하기 전까지
                // 스크린은 업데이트 되지 않고 Loading 메세지도 나타나지 않는다.
                // 따라서 asynchronous 하게 작성한다.
                retreivalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            setImageIcon(new ImageIcon(imageUrl, "CD Cover"));
                            component.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retreivalThread.start();
            }
        }
    }
}
