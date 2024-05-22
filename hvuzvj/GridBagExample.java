import javax.swing.*;
import java.awt.*;

public class GridBagExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // 添加第一个按钮
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JButton("Button 1"), gbc);

        // 添加第二个按钮
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(new JButton("Button 2"), gbc);

        // 添加占位符空白行
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2; // 占据两列
        gbc.weighty = 1; // 给这个行一定的重量
        frame.add(Box.createVerticalStrut(20), gbc); // 创建一个固定高度的垂直占位符

        // 添加第三个按钮
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1; // 重置网格宽度
        gbc.weighty = 0; // 重置重量
        frame.add(new JButton("Button 3"), gbc);

        // 添加第四个按钮
        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(new JButton("Button 4"), gbc);

        frame.pack();
        frame.setVisible(true);
    }
}
