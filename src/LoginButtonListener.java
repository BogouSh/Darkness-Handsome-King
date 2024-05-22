import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.*;
public class LoginButtonListener implements ActionListener {
    private String sql=null;
    private PreparedStatement ppStmt=null;
    private ResultSet rs=null;
    private String username=null;
    private String password=null;
    private JTextField txtUsername=null;
    private JTextField txtPassword=null;
    LoginButtonListener(String sql,JTextField txtUsername,
                        JTextField txtPassword) {
        this.sql=sql;
        this.txtUsername=txtUsername;
        this.txtPassword=txtPassword;
    }
    @Override
//    public void actionPerformed(ActionEvent e) {
//        //单击登录按钮触发的此事件内容
//        this.username=txtUsername.getText().trim();
//        this.password=txtPassword.getText().trim();
//        DBConnection dbConnection=DBConnection.getInstance();
//        Connection conn=dbConnection.getConnection();
//        try {
//            ppStmt=conn.prepareStatement(sql);
//            rs=ppStmt.executeQuery();
//            while(rs.next()) {
//                int id=rs.getInt("id");
//                String pswd=rs.getString("pswd");
//                String role=rs.getString("role");
//                if(username.equals(id+"")&&pswd.equals(password)) {
//                    System.out.println("Dear "+role+", Login Success");
//                }
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }finally {
//            try{
//                if(rs!=null)rs.close();
//                if(ppStmt!=null)ppStmt.close();
//                if(conn!=null)conn.close();
//            }catch (SQLException exc)
//            {
//                exc.printStackTrace();
//            }
//        }
//
//
//    }
//}
