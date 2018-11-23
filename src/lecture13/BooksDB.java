package lecture13;

import java.sql.*;
import java.util.ArrayList;

public class BooksDB {

  private static Connection getConnection() throws SQLException {
    return DriverManager
        .getConnection("jdbc:mysql://10.20.7.47:3306/test?autoReconnect=true&useSSL=false", "root", "root");
  }

  public static ArrayList<Book> getAllBooks() {
    try {
      PreparedStatement pstmt = getConnection().prepareStatement("SELECT * FROM books");

      ArrayList<Book> results = new ArrayList<Book>();
      ResultSet rs = pstmt.executeQuery("SELECT * FROM books");

      while (rs.next()) {
        results.add(new Book(rs.getString("id"), rs.getString("name"), rs.getString("author"),
            rs.getFloat("price")));
      }
      return results;

    } catch (SQLException e) {
      System.out.println(e);
    }
    return new ArrayList<Book>();
  }

  public static void insertBook(Book book) {
    String sqlCmd = "INSERT INTO books VALUES(?,?,?,?)";

    try {
      PreparedStatement pstmt = getConnection().prepareStatement(sqlCmd);
      pstmt.setString(1, book.getIsbn());
      pstmt.setString(2, book.getTitle());
      pstmt.setString(3, book.getAuthor());
      pstmt.setFloat(4, book.getPrice());
      pstmt.executeUpdate();
    } catch (SQLException e) {
      System.out.println(e);
    }
  }

  public static Book getBook(String isbn) {
    String sqlCmd = "SELECT * FROM books WHERE id = ?";

    try {
      PreparedStatement pstmt = getConnection().prepareStatement(sqlCmd);
      pstmt.setString(1, isbn);

      ResultSet rs = pstmt.executeQuery();

      rs.next();
      Book result = new Book(rs.getString("id"), rs.getString("name"), rs.getString("author"),
          rs.getFloat("price"));
      return result;
    } catch (SQLException e) {
      System.out.println(e);
    }
    return new Book("0","0","0",0);
  }

  public static void check() {
    String sqlCmd = "INSERT INTO students VALUES ('10.20.7.80', '60070090', 'นายวิพุธ ภู่ทอง')";

    try {
      PreparedStatement pstmt = getConnection().prepareStatement(sqlCmd);

      pstmt.executeUpdate();

    } catch (SQLException e) {
      System.out.println(e);
    }
  }

  public static void main(String[] args) {
    check();
  }
}
