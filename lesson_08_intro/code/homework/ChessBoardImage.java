package homework;

import javax.swing.*;
import java.awt.*;

public class ChessBoardImage
{
    public void main(String[] args)
    {
        JFrame frame = new JFrame("Chess Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420); // Размер окна
        Component add = frame.add(new ChessBoard());
        frame.setVisible(true);
    }

    public static class ChessBoard extends JPanel //
    {
            private Image chessBoard;

            public ChessBoard()
            {
                // Загрузка изображения
                chessBoard = new ImageIcon("C:\\Users\\podle\\Pictures\\Saved Pictures\\chessboard.png").getImage();
            }

            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                // Отображение изображения на экране
                g.drawImage(chessBoard, 0, 0, this.getWidth(), this.getHeight(), this);
            }
    }
}
