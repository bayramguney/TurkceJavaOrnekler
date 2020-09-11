package JDBC_VeriTabani;

import java.sql.*;
import java.util.Scanner;

public class MainCommit_RollBack {

    private String kullanici_adi = "root";
    private String parola = "";
    private String db_ismi = "demo";
    private String host = "localhost";
    private int port = 3306;
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public void commitverollback() {
        Scanner scanner = new Scanner(System.in);
        try {
            connection.setAutoCommit(false);
            String sorgu1 = "Delete from calisanlar where id=1";
            String sorgu2 = "Update calisanlar set email='bg@gmail.com' where id=1";
            System.out.println("Guncellemeden once....");
            calisanlariGetir();
            statement = connection.createStatement();
            statement.executeUpdate(sorgu1);
            statement.executeUpdate(sorgu2);
            System.out.print("Islemleriniz kaydedilsin mi? (yes/no) : ");
            String cevap = scanner.nextLine();
            if (cevap.equals("yes")) {
                connection.commit();
                calisanlariGetir();
                System.out.println("Veri tabani guncellendi...");
            } else {
                connection.rollback();
                System.out.println("Veri tabani guncellenmesi iptal edildi ...");
                calisanlariGetir();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void calisanlariGetir() {
        String sorgu = "Select * From calisanlar ";
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sorgu);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String ad = resultSet.getString("ad");
                String soyad = resultSet.getString("soyad");
                String email = resultSet.getString("email");
                System.out.println("ID : " + id + " Ad : " + ad + " Soyad : " + soyad + " Email : " + email);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public MainCommit_RollBack() {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadi ...");
        }
        try {
            connection = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Baglanti Basarili...");
        } catch (SQLException e) {
            System.out.println("Baglanti basarisiz ...");
        }
    }


    public static void main(String[] args) {
            MainCommit_RollBack mainCommit_rollBack=new MainCommit_RollBack();
            mainCommit_rollBack.commitverollback();

        }
}
