package Sign_up;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Sign_in_Repository extends MongoRepository<sign_up_class, String>
{
    public List<sign_up_class> findFName(String first_name);
    public List<sign_up_class> findSName(String Surname);
    public List<sign_up_class> findPhoneNum(String phone_number);
    public List<sign_up_class> findEmail(String e_mail);
    public List<sign_up_class> findPassword(String password);
}
