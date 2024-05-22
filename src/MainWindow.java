import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

 class MainWindow {
    private static final MainWindow instance=new MainWindow();
    private JFrame jf;
    private MainWindow()
    {
        jf=new JFrame();
        jf.setSize(200,150);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);

        JLabel jLabel=new JLabel("账号: ");
        JLabel jLabel1=new JLabel("密码: ");
        JTextField jTextField=new JTextField();
        JTextField jTextField1=new JTextField();
        JButton jButton=new JButton("登录");
        JButton jButton1=new JButton("注册");

        GridBagLayout gridBagLayout=new GridBagLayout();
        jf.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints=new GridBagConstraints();
        gridBagConstraints.fill=GridBagConstraints.BOTH;

        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=0;
        gridBagLayout.setConstraints(jLabel,gridBagConstraints);

        gridBagConstraints.gridx=1;
        gridBagConstraints.gridy=0;
        gridBagConstraints.gridwidth=2;
        gridBagConstraints.gridheight=1;
        gridBagLayout.setConstraints(jTextField,gridBagConstraints);
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=1;
        gridBagConstraints.gridwidth=1;
        gridBagConstraints.gridheight=1;
        gridBagLayout.setConstraints(jLabel1,gridBagConstraints);
        gridBagConstraints.gridx=1;
        gridBagConstraints.gridy=1;
        gridBagConstraints.gridwidth=2;
        gridBagConstraints.gridheight=1;
        gridBagLayout.setConstraints(jTextField1,gridBagConstraints);
        gridBagConstraints.gridx=1;
        gridBagConstraints.gridy=2;
        gridBagConstraints.gridwidth=1;
        gridBagConstraints.gridheight=1;
        gridBagLayout.setConstraints(jButton,gridBagConstraints);
        gridBagConstraints.gridx=2;
        gridBagConstraints.gridy=2;
        gridBagLayout.setConstraints(jButton1,gridBagConstraints);

        jf.add(jLabel);
        jf.add(jLabel1);
        jf.add(jButton);
        jf.add(jButton1);
        jf.add(jTextField);
        jf.add(jTextField1);
//        jf.pack();

//        登录点击
        jButton.addActionListener(new LoginButtonListener(
                "SELECT user_id AS id, password AS pswd,\"user\" as role  FROM yg" +
                        " UNION " +
                        "SELECT admin_id AS id, password AS pswd,\"admin\" as role FROM gly"
                ,jTextField
                ,jTextField1
        ));

    }

    public static MainWindow getMainWindow()
    {
        return instance;
    }
    public  void show()
    {
        jf.setVisible(true);
    }

}
