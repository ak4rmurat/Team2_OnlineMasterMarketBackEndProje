package helperDB;

import com.github.javafaker.Faker;
import lombok.Getter;
import manage.Manage;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.*;

import static helperDB.JDBC_Structure_Methods.*;
import static helperDB.JDBC_Structure_Methods.resultSet;

@Getter
public class CommonData {
    public static Faker faker=new Faker();
    private String email;
    private String password;
    private String username;
    private String fullName;
    private String profileImg;
    private int role;
    private String token;
    public static int userId;
    public static int rowCount;
    public static List<String> couponNames;
    //US27
    // (mobileno, country_code, currency_code, status, usertype)
    private String mobileNo;
    private String country_code;
    private String currency_code;
    private int status;
    private int usertype;
    public static SQLException exception;



    public CommonData(){
        this.email=faker.internet().emailAddress();
        this.password=faker.internet().password();
        this.username=faker.name().username();
        this.fullName=faker.name().fullName();
        this.profileImg=faker.internet().image();
        this.role=0;
        this.token=faker.internet().uuid();
        this.mobileNo=faker.numerify("############");
        this.country_code=faker.country().currencyCode();
        this.currency_code=faker.currency().code();
        this.status=faker.random().nextInt(0,1);
        this.usertype=faker.random().nextInt(0,5);

    }
    public static int getLastInsertedUserId(String query,String email) throws SQLException {
        preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1,email);
        resultSet=preparedStatement.executeQuery();
        if(resultSet.next()){
            return resultSet.getInt("user_id");

        }else{
            throw new SQLException("Kullanıcı ID bulunamadı");
        }
    }
    public String generateNewPassword(Faker faker,String currentPassword){
        String newPassword;
        do{
            newPassword=faker.internet().password();
        }while (newPassword.equals(currentPassword));
        return newPassword;
    }

}
