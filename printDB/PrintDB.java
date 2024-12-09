package PrintDB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class PrintDB {
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);

        // JTable과 DefaultTableModel 생성
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);

        // 컬럼 추가
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Dept");

        // DB 연결 정보
        String url = "jdbc:mysql://localhost:3306/sakila?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "1234";

        try {
            // JDBC 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 데이터베이스 연결
            Connection conn = DriverManager.getConnection(url, user, password);

            // SQL 쿼리 실행
            String query = "SELECT id, name, dept FROM student";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // 결과를 JTable에 추가
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dept = rs.getString("dept");

                model.addRow(new Object[]{id, name, dept});
            }

            // 리소스 닫기
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "JDBC 드라이버를 찾을 수 없습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "DB 연결 실패: " + e.getMessage());
        }

        // JScrollPane을 추가하여 스크롤 가능하도록 설정
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        // JFrame 표시
        frame.setVisible(true);
    }
}
