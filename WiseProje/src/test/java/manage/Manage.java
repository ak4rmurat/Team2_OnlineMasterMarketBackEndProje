package manage;

import lombok.Data;
import lombok.Getter;

@Getter
public class Manage {

  private String US04insert_data_administrator="INSERT INTO u201212290_onlinemasterqa.administrators ( email, password, username, full_name, profile_img, role, token) \n" +
          "VALUES (?,?,?,?,?,?,?);";

  private String US04getLastUserIdAdministrator="Select user_id From u201212290_onlinemasterqa.administrators Where email=?;";
  private String US04delete_added_data_administrator="Delete From u201212290_onlinemasterqa.administrators Where user_id=?;";
  private String US5update_data_administrator="UPDATE u201212290_onlinemasterqa.administrators SET password = SHA2(?, 256) WHERE user_id = ?;";
  private String US19contact_reply_message="INSERT INTO u201212290_onlinemasterqa.contact_reply (contact_id, name, reply, created_at)\n" +
          "SELECT id AS contact_id, name, \n" +
          "       CASE\n" +
          "           WHEN message LIKE '%servis%' THEN 'Servis oluşturma hakkında size nasıl yardımcı olabiliriz?'\n" +
          "           ELSE 'Mesajınızı aldık ve en kısa sürede geri döneceğiz.'\n" +
          "       END AS reply, \n" +
          "       NOW() AS created_at\n" +
          "FROM u201212290_onlinemasterqa.contact_form_details;";

  private String US25_service_coupons_user_limit="SELECT * FROM  u201212290_onlinemasterqa.service_coupons WHERE user_limit_count >= user_limit;";

  private String US27_incomplated_data_insert_users_table="INSERT INTO u201212290_onlinemasterqa.users (mobileno, country_code, currency_code, status, usertype) VALUES (?, ?, ?,?,?);";


  private String US06_bank_account_veri_girisi  = "INSERT INTO u201212290_onlinemasterqa.bank_account (id, user_id, user_name, acc_no, bank_name, bank_addr, ifsc_code, pancard_no, paypal_account, paypal_email_id, status) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
  private String US08_inactive_kullanici_sayisi = "SELECT COUNT(*) AS inactive_count FROM bank_account WHERE status = 'inactive';";
  private String US08_kullanici_sil             = "DELETE FROM bank_account WHERE status = 'inactive';";
  private String US17_enCokMesajGonderenKisi    = "WITH MessageCounts AS (SELECT name, COUNT(*) AS message_count FROM contact_form_details GROUP BY name);";
  private String US17_enCokAtilanMesaj          = "SELECT name FROM contact_form_details GROUP BY name ORDER BY COUNT(*) DESC LIMIT 1;";


}