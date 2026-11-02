import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class java_switch {

    public static void main(String[] args) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "Ulthoor123"
            );

            System.out.println("connected to mysql successfully");

            System.out.println();

            Scanner sc = new Scanner(System.in);
            boolean running = true;

            while (running) {

                System.out.println("---java Mysql Menu---");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Search Student");
                System.out.println("4. Update Student");
                System.out.println("5. Delete Student");
                System.out.println("6. Exit");

                System.out.println("Choose the menu");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        // add students

                        System.out.println("enter the number of rows");
                        int rows = sc.nextInt();
                        sc.nextLine();

                        for (int i = 0; i < rows; i++) {

                            System.out.println("enter the name: ");
                            String name = sc.nextLine();

                            System.out.println("enter the age: ");
                            int age = sc.nextInt();
                            sc.nextLine();

                            System.out.println("enter the course: ");
                            String course = sc.nextLine();

                            String insert_query =
                                "insert into students(name,age,course) values(?,?,?)";

                            ps = connection.prepareStatement(insert_query);

                            ps.setString(1, name);
                            ps.setInt(2, age);
                            ps.setString(3, course);

                            ps.executeUpdate();

                            System.out.println(
                                "inserted successfully data " + (i + 1)
                            );
                        }

                        break;


                    case 2:
                        // view the students

                        String read_query = "select * from students";

                        ps = connection.prepareStatement(read_query);
                        rs = ps.executeQuery();

                        while (rs.next()) {

                            int id = rs.getInt("id");
                            String name = rs.getString("name");
                            int age = rs.getInt("age");
                            String course = rs.getString("course");

                            System.out.println(
                                id + "|" + name + "|" + age + "|" + course
                            );
                        }

                        break;


                    case 3:
                        // search the student

                        System.out.println(
                            "enter the id to get the name of the student"
                        );

                        int search_id = sc.nextInt();
                        sc.nextLine();

                        String search_query =
                            "select name from students where id=?";

                        ps = connection.prepareStatement(search_query);
                        ps.setInt(1, search_id);

                        rs = ps.executeQuery();

                        boolean found = false;

                        while (rs.next()) {

                            String name = rs.getString("name");

                            System.out.println("Student Name: " + name);

                            found = true;
                        }

                        if (!found) {
                            System.out.println("student not found");
                        }

                        break;


                    case 4:
                        // update the table

                        System.out.println("enter the student id to update: ");
                        int update_id = sc.nextInt();
                        sc.nextLine();

                        System.out.println("enter the new name: ");
                        String update_name = sc.nextLine();

                        System.out.println("enter the new age: ");
                        int update_age = sc.nextInt();
                        sc.nextLine();

                        System.out.println("enter the new course: ");
                        String update_course = sc.nextLine();

                        String update_query =
                            "update students set name=?, age=?, course=? where id=?";

                        try {

                            ps = connection.prepareStatement(update_query);

                            ps.setString(1, update_name);
                            ps.setInt(2, update_age);
                            ps.setString(3, update_course);
                            ps.setInt(4, update_id);

                            int rows_updated = ps.executeUpdate();

                            if (rows_updated > 0) {

                                System.out.println(
                                    "student updated successfully"
                                );

                            } else {

                                System.out.println("student not found");
                            }

                        } catch (SQLException e) {

                            System.out.println(
                                "error in updating the values: "
                                + e.getMessage()
                            );
                        }

                        break;


                    case 5:
                        // delete code

                        System.out.println("enter the student id to delete: ");
                        int delete_id = sc.nextInt();
                        sc.nextLine();

                        String delete_query =
                            "delete from students where id=?";

                        try {

                            ps = connection.prepareStatement(delete_query);

                            ps.setInt(1, delete_id);

                            int rows_deleted = ps.executeUpdate();

                            if (rows_deleted > 0) {

                                System.out.println(
                                    "row deleted successfully"
                                );

                            } else {

                                System.out.println("student not found");
                            }

                        } catch (SQLException e) {

                            System.out.println(
                                "error: " + e.getMessage()
                            );
                        }

                        break;


                    case 6:
                        System.out.println("Program terminated");

                        running = false;

                        break;


                    default:
                        System.out.println(
                            "Invalid choice! Choose the correct option!"
                        );

                        break;
                }
            }

            // close the resources

            if (rs != null) {
                rs.close();
            }

            if (ps != null) {
                ps.close();
            }

            sc.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println("Connection failed");
            System.out.println(e.getMessage());
        }
    }
}

