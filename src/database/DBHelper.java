package database;
import java.sql.*;

/**
 *
 * @author Николай
 */
public class DBHelper {
    
    private Connection connection;
    private Statement statement;
    private ResultSet resSet;
    
    private static final String TABLE_NAME = "car details";
    private static final String COLUMN_ID = "id";
    public static final String COLUMN_CAR_NAME = "car name";
    private static final String COLUMN_NUMBER = "state number";
    private static final String COLUMN_MILEAGE = "mileage";
    private static final String COLUMN_CONS_S = "consumption summer";
    private static final String COLUMN_CONS_W = "consumption winter";
    private static final String COLUMN_FUELED = "fueled";
    private static final String COLUMN_COILED = "coiled";
    
    private void createConnect(){
        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:cars.s3db");
            
            System.out.println("DB connect Ok");
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Ошибка подключения!");
            e.printStackTrace();
        }
    }
    
    private void createDBTable(){
        try{
            statement = connection.createStatement();
            statement.execute("CREATE TABLE if not exists '" + TABLE_NAME 
                + "'('" + COLUMN_ID +"' INTEGER PRIMARY KEY AUTOINCREMENT, "
                +"'" + COLUMN_CAR_NAME + "' TEXT, '" + COLUMN_NUMBER 
                + "' TEXT, '" + COLUMN_MILEAGE + "' INTEGER, '" +
                COLUMN_CONS_S + "' REAL, '" + COLUMN_CONS_W + "' REAL, '"
                + COLUMN_FUELED + "' INTEGER, '" + COLUMN_COILED + "' REAL);");
        }
        catch(SQLException e){
            System.out.println("Ошибка создания таблицы!");
            e.printStackTrace();
        }
    }
    
    private void writeToTableCarData(String carName, String stateNumber, 
            int mileage, double consS, double consW){
        try{
            statement.executeUpdate("INSERT INTO '" + TABLE_NAME + "'('" + 
                    COLUMN_CAR_NAME + "', '" + COLUMN_NUMBER + "', '" +
                    COLUMN_MILEAGE + "', '" + COLUMN_CONS_S + "', '" +
                    COLUMN_CONS_W + "') "
                            
                            
                    + "VALUES ('" + carName +"', '"  + stateNumber + "', '" +
                    mileage +"', '" + consS + "', '" + consW + "'); ");
            
            System.out.println("Успешно записано!");
        }
        catch(SQLException e){
            System.out.println("Ошибка записи!");
            e.printStackTrace();
        }
    }
    
    //Выводим данные выбранного авто
    private void outSelectCar(int id){
        //Вернуть марку авто
        //Вернуть его гос номер
        //Вернуть пробег
    }
    
    public void closeConnect(){
        try{
            connection.close();
            System.out.println(getClass() + "Соединение с бд успешно закрыто!");
        }
        catch(SQLException e){
            System.out.println(getClass() + "Соединение с бд не закрыто!");
            e.printStackTrace();
            // добавить биалоговое окно
        }
    }
    
    //конструктор для ввода данных об авто
    public DBHelper(String carName, String stateNumber, int mileage,
            double consS, double consW){
        createConnect();
        createDBTable();
        writeToTableCarData(carName, stateNumber, mileage, consS, consW);
    }
    
    //конструктор для вывода данных
    public DBHelper(){
        createConnect();
        
    }
    
}
