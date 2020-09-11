package JDBC_VeriTabani;

import java.sql.*;

public class Baglanti {
    private String kullanici_adi = "root";
    private String parola = "";
    private String db_ismi = "demo";
    private String host = "localhost";
    private int port = 3306;
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement=null;
    public void preparedCalisanlariGetir(int id){

        String sorgu="Select * from calisanlar where id>? and ad like ?";
        try {
            preparedStatement=connection.prepareStatement(sorgu);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,"M%");
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                String ad=resultSet.getString("ad");
                String soyad=resultSet.getString("soyad");
                String email=resultSet.getString("email");
                System.out.println("ID : " + id + " Ad : " + ad + " Soyad : " + soyad + " Email : " + email);


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void preparedCalisanlariGetir(){
        try {
            statement=connection.createStatement();
            String sorgu="Select * from calisanlar where ad like 'M%'";
           ResultSet resultSet=statement.executeQuery(sorgu);
           while(resultSet.next()){
               System.out.println("Ad : "+resultSet.getString("ad"));
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void calisanSil(){
        try {
            statement=connection.createStatement();
            String sorgu="Delete from calisanlar where id>3";
            int deger=statement.executeUpdate(sorgu);
            System.out.println(deger + " kadar veri etkilendi");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void calisanGuncelle() {

        try {
            statement = connection.createStatement();
            String sorgu = "Update calisanlar set email='mustafamuratcoskun@gmail.com' where id=1";
            statement.executeUpdate(sorgu);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void calisanEkle() {
        try {
            statement = connection.createStatement();
            String ad = "Semih";
            String soyad = "Aktas";
            String email = "saktas@gmail.com";

            String sorgu = "Insert Into calisanlar (ad,soyad,email) Values (" + "'" + ad + "'" + "," + "'" + soyad + "'" + "," + "'" + email + "'" + ")";

            statement.executeUpdate(sorgu);
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

    public Baglanti() {
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
        Baglanti baglanti = new Baglanti();
        System.out.println("Eklenmeden once...");
        baglanti.calisanlariGetir();
        System.out.println("*********************");
        baglanti.calisanEkle();
        baglanti.calisanlariGetir();
        System.out.println("Guncelledikten sonra......");
        baglanti.calisanGuncelle();
        baglanti.calisanlariGetir();
        System.out.println("Silidikten sonra...........");
        baglanti.calisanSil();
        baglanti.calisanlariGetir();
        System.out.println("******************************");
        baglanti.preparedCalisanlariGetir();
        System.out.println("#################################");
        baglanti.preparedCalisanlariGetir(1);

    }

}
