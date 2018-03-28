package auctionsniper;

import javax.swing.*;

public class Main {

    public static final String MAIN_WINDOW_NAME = "main window name";
    public static final String SNIPER_STATUS_NAME = "sniper_status";
    public static final String STATUS_LOST = "status_lost";
    public static final String STATUS_JOINING = "joining...";

    private MainWindow ui;

    public Main() throws Exception {
        startUserInterface();
    }

    public static void main(String... args) throws Exception {
        Main main = new Main();
    }

    private void startUserInterface() throws Exception {
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                ui = new MainWindow();
            }
        });
    }

    public class MainWindow extends JFrame {
        public MainWindow() {
            super("Auction Sniper");
            setName(MAIN_WINDOW_NAME);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            setSize(300, 400);
        }
    }
}
